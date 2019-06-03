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

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerStringConverter implements StringConverter<AtomicInteger> {
    private static IntegerStringConverter INTEGER_CONVERTER = IntegerStringConverter.create();

    private AtomicIntegerStringConverter() { }

    public static AtomicIntegerStringConverter create() {
        return new AtomicIntegerStringConverter();
    }

    @Override
    public String toString(AtomicInteger object) {
        return INTEGER_CONVERTER.toString(object.get());
    }

    @Override
    public AtomicInteger fromString(String string) {
        return new AtomicInteger(INTEGER_CONVERTER.fromString(string));
    }
}
