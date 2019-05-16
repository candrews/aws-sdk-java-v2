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

package software.amazon.awssdk.enhanced.dynamodb.internal.model;

import static java.util.stream.Collectors.toMap;

import java.util.Map;
import software.amazon.awssdk.annotations.SdkInternalApi;
import software.amazon.awssdk.annotations.ThreadSafe;
import software.amazon.awssdk.enhanced.dynamodb.model.ConvertableItemAttributeValue;
import software.amazon.awssdk.enhanced.dynamodb.model.ItemAttributeValue;
import software.amazon.awssdk.enhanced.dynamodb.model.ResponseItem;

/**
 * The default implementation of {@link ResponseItem}.
 */
@SdkInternalApi
@ThreadSafe
public class DefaultResponseItem extends DefaultItem<ConvertableItemAttributeValue> implements ResponseItem {
    private DefaultResponseItem(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public ConvertableItemAttributeValue toConvertable() {
        return DefaultConvertableItemAttributeValue.builder()
                                                   .conversionContext(c -> c.converter(converterChain))
                                                   .attributeValue(ItemAttributeValue.fromMap(getRawAttributes()))
                                                   .build();
    }

    private Map<String, ItemAttributeValue> getRawAttributes() {
        return attributes().entrySet().stream().collect(toMap(e -> e.getKey(), e -> e.getValue().attributeValue()));
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder
            extends DefaultItem.Builder<ConvertableItemAttributeValue, Builder>
            implements ResponseItem.Builder {
        private Builder() {}

        private Builder(DefaultResponseItem item) {
            super(item);
        }

        @Override
        public DefaultResponseItem build() {
            return new DefaultResponseItem(this);
        }
    }
}
