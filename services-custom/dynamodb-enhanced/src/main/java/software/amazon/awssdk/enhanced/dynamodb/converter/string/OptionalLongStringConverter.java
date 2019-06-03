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

import java.util.OptionalInt;
import java.util.OptionalLong;

public class OptionalLongStringConverter implements StringConverter<OptionalLong> {
    private static LongStringConverter LONG_CONVERTER = LongStringConverter.create();

    private OptionalLongStringConverter() { }

    public static OptionalLongStringConverter create() {
        return new OptionalLongStringConverter();
    }

    @Override
    public String toString(OptionalLong object) {
        if (!object.isPresent()) {
            return null;
        }
        return LONG_CONVERTER.toString(object.getAsLong());
    }

    @Override
    public OptionalLong fromString(String string) {
        if (string == null) {
            return OptionalLong.empty();
        }
        return OptionalLong.of(LONG_CONVERTER.fromString(string));
    }
}
