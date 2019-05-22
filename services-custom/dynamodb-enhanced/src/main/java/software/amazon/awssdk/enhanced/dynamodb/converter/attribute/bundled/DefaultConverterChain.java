/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.awssdk.enhanced.dynamodb.converter.attribute.bundled;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import software.amazon.awssdk.annotations.Immutable;
import software.amazon.awssdk.annotations.SdkPublicApi;
import software.amazon.awssdk.annotations.ThreadSafe;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedAsyncClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.converter.attribute.ConversionCondition;
import software.amazon.awssdk.enhanced.dynamodb.converter.attribute.ConversionContext;
import software.amazon.awssdk.enhanced.dynamodb.converter.attribute.ItemAttributeValueConverter;
import software.amazon.awssdk.enhanced.dynamodb.internal.converter.ItemAttributeValueConverterChain;
import software.amazon.awssdk.enhanced.dynamodb.model.ItemAttributeValue;
import software.amazon.awssdk.enhanced.dynamodb.model.RequestItem;
import software.amazon.awssdk.enhanced.dynamodb.model.ResponseItem;
import software.amazon.awssdk.enhanced.dynamodb.model.TypeToken;

/**
 * A {@link ItemAttributeValueConverter} that includes all of the converters built into the SDK.
 *
 * <p>
 * This is the root converter for all created {@link DynamoDbEnhancedClient}s and {@link DynamoDbEnhancedAsyncClient}s.
 *
 * <p>
 * Supported Number Types:
 * <ul>
 *     <li>{@link Instant}</li>
 *     <li>{@link Integer}</li>
 * </ul>
 *
 * <p>
 * Supported String Types:
 * <ul>
 *     <li>{@link String}</li>
 * </ul>
 *
 * <p>
 * Supported List Types:
 * <ul>
 *     <li>{@link List} (plus subtypes)</li>
 * </ul>
 *
 * <p>
 * Supported Item Types:
 * <ul>
 *     <li>{@link Map} (plus subtypes)</li>
 *     <li>{@link RequestItem} (plus subtypes)</li>
 *     <li>{@link ResponseItem} (plus subtypes)</li>
 *     <li>{@link ItemAttributeValue}</li>
 * </ul>
 *
 * <p>
 * This can be created via {@link #create()}.
 */
@SdkPublicApi
@ThreadSafe
@Immutable
public final class DefaultConverterChain implements ItemAttributeValueConverter {
    private static final ItemAttributeValueConverter CHAIN;

    static {
        CHAIN = ItemAttributeValueConverterChain.builder()
                                                // Exact InstanceOf Converters

                                                .addConverter(InstantConverter.create())
                                                .addConverter(IntegerConverter.create())
                                                .addConverter(StringAttributeConverter.create())
                                                .addConverter(IdentityConverter.create())

                                                // InstanceOf Converters
                                                // Potential optimization: allow InstanceOf converters to specify a set of
                                                // types that should be cached in an eager fashion (e.g. DefaultRequestItem)
                                                .addConverter(RequestItemConverter.create())
                                                .addConverter(ResponseItemConverter.create())
                                                .addConverter(DynamicListConverter.create())
                                                .addConverter(DynamicMapConverter.create())
                                                .build();
    }

    private DefaultConverterChain() {}

    /**
     * Create a default convert chain that contains all of the converters built into the SDK.
     *
     * <p>
     * This call should never fail with an {@link Exception}.
     */
    public static DefaultConverterChain create() {
        return new DefaultConverterChain();
    }

    @Override
    public ConversionCondition conversionCondition() {
        return CHAIN.conversionCondition();
    }

    @Override
    public ItemAttributeValue toAttributeValue(Object input, ConversionContext context) {
        return CHAIN.toAttributeValue(input, context);
    }

    @Override
    public Object fromAttributeValue(ItemAttributeValue input, TypeToken<?> desiredType, ConversionContext context) {
        return CHAIN.fromAttributeValue(input, desiredType, context);
    }
}
