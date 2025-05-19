/*
 * Copyright (c) 2025-2025, fubluesky (fubluesky@foxmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.guoshiqiufeng.dify.core.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yanghq
 * @version 1.0
 * @since 2025/5/19 13:42
 */
@Getter
@AllArgsConstructor
public enum DiftClientExceptionEnum implements BaseExceptionEnum {

    /**
     * unauthorized
     */
    UNAUTHORIZED(401, "Access token is invalid"),
    /**
     * notFound
     */
    NOT_FOUND(404, "Not Found"),


    ;

    private final Integer code;

    private final String msg;
}
