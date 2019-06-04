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

package software.amazon.awssdk.enhanced.dynamodb.converter.string;

import java.util.concurrent.atomic.AtomicBoolean;
import software.amazon.awssdk.enhanced.dynamodb.model.TypeToken;

public class AtomicBooleanStringConverter implements StringConverter<AtomicBoolean> {
    private static BooleanStringConverter BOOLEAN_CONVERTER = BooleanStringConverter.create();

    private AtomicBooleanStringConverter() { }

    public static AtomicBooleanStringConverter create() {
        return new AtomicBooleanStringConverter();
    }

    @Override
    public TypeToken<AtomicBoolean> type() {
        return TypeToken.from(AtomicBoolean.class);
    }

    @Override
    public String toString(AtomicBoolean object) {
        return BOOLEAN_CONVERTER.toString(object.get());
    }

    @Override
    public AtomicBoolean fromString(String string) {
        return new AtomicBoolean(BOOLEAN_CONVERTER.fromString(string));
    }
}
