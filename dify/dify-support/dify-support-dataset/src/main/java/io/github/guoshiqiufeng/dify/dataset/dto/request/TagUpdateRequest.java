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
package io.github.guoshiqiufeng.dify.dataset.dto.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author yanghq
 * @version 1.3.0
 * @since 2025-07-26 15:28
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TagUpdateRequest extends BaseDatasetRequest implements Serializable {
    private static final long serialVersionUID = 7786447642979142902L;

    /**
     * 标签名称，最大长度为50
     */
    private String name;

    @JsonProperty("tag_id")
    @JsonAlias("tagId")
    private String tagId;

}
