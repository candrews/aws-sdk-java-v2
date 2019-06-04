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

import software.amazon.awssdk.enhanced.dynamodb.model.TypeToken;
import software.amazon.awssdk.utils.Validate;

public class CharacterStringConverter implements StringConverter<Character> {
    private CharacterStringConverter() { }

    public static CharacterStringConverter create() {
        return new CharacterStringConverter();
    }

    @Override
    public TypeToken<Character> type() {
        return TypeToken.from(Character.class);
    }

    @Override
    public Character fromString(String string) {
        Validate.isTrue(string.length() == 1, "Character string was not of length 1: %s", string);
        return string.charAt(0);
    }
}
