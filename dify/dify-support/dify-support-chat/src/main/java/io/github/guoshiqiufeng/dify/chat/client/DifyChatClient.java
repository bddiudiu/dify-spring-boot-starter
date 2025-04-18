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
package io.github.guoshiqiufeng.dify.chat.client;

import io.github.guoshiqiufeng.dify.chat.dto.request.*;
import io.github.guoshiqiufeng.dify.chat.dto.response.*;
import io.github.guoshiqiufeng.dify.core.pojo.DifyPageResult;
import io.github.guoshiqiufeng.dify.core.pojo.response.MessagesResponseVO;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * @author yanghq
 * @version 0.8.0
 * @since 2025/4/7 13:20
 */
public interface DifyChatClient {

    ChatMessageSendResponse chat(ChatMessageSendRequest chatRequest);

    Flux<ChatMessageSendCompletionResponse> streamingChat(ChatMessageSendRequest chatRequest);

    void stopMessagesStream(String apiKey, String taskId, String userId);

    MessageFeedbackResponse messageFeedback(MessageFeedbackRequest request);

    DifyPageResult<MessageConversationsResponse> conversations(MessageConversationsRequest request);

    DifyPageResult<MessagesResponseVO> messages(MessagesRequest request);

    List<String> messagesSuggested(String messageId, String apiKey, String userId);

    void deleteConversation(String conversationId, String apiKey, String userId);

    ResponseEntity<byte[]> textToAudio(TextToAudioRequest request);

    DifyTextVO audioToText(AudioToTextRequest request);

    MessageConversationsResponse renameConversation(RenameConversationRequest renameConversationRequest);

    AppParametersResponseVO parameters(String apiKey);

}
