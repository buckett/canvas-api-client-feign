package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Conversation;
import com.instructure.canvas.model.Progress;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface ConversationsApi extends ApiClient.Api {

  /**
   * Add a message
   * Add a message to an existing conversation. Response is similar to the GET/show action, except that only includes the latest message (i.e. what we just sent)  An array of user ids. Defaults to all of the current conversation recipients. To explicitly send a message to no other recipients, this array should consist of the logged-in user id.  An array of message ids from this conversation to send to recipients of the new message. Recipients who already had a copy of included messages will not be affected.
   * @param id ID (required)
   * @param body  (optional)
   * @param attachmentIds  (optional)
   * @param mediaCommentId  (optional)
   * @param mediaCommentType  (optional)
   * @param recipients  (optional)
   * @param includedMessages  (optional)
   * @param userNote  (optional)
   */
  @RequestLine("POST /v1/conversations/{id}/add_message")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void addMessage(@Param("id") String id, @Param("body") String body, @Param("attachmentIds") List<String> attachmentIds, @Param("mediaCommentId") String mediaCommentId, @Param("mediaCommentType") String mediaCommentType, @Param("recipients") List<String> recipients, @Param("includedMessages") List<String> includedMessages, @Param("userNote") Boolean userNote);
  
  /**
   * Add recipients
   * Add recipients to an existing group conversation. Response is similar to the GET/show action, except that only includes the latest message (e.g. \&quot;joe was added to the conversation by bob\&quot;)
   * @param id ID (required)
   * @param recipients  (optional)
   */
  @RequestLine("POST /v1/conversations/{id}/add_recipients")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void addRecipients(@Param("id") String id, @Param("recipients") List<String> recipients);
  
  /**
   * Batch update conversations
   * Perform a change on a set of conversations. Operates asynchronously; use the {api:ProgressController#show progress endpoint} to query the status of an operation.
   * @param conversationIds  (optional)
   * @param event  (optional)
   * @return Progress
   */
  @RequestLine("PUT /v1/conversations")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Progress batchUpdateConversations(@Param("conversationIds") List<String> conversationIds, @Param("event") String event);
  
  /**
   * Create a conversation
   * Create a new conversation with one or more recipients. If there is already an existing private conversation with the given recipients, it will be reused.
   * @param recipients  (optional)
   * @param subject  (optional)
   * @param body  (optional)
   * @param groupConversation  (optional)
   * @param attachmentIds  (optional)
   * @param mediaCommentId  (optional)
   * @param mediaCommentType  (optional)
   * @param userNote  (optional)
   * @param mode  (optional)
   * @param scope  (optional)
   * @param filter  (optional)
   * @param filterMode  (optional)
   * @param contextCode  (optional)
   */
  @RequestLine("POST /v1/conversations")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createConversation(@Param("recipients") List<String> recipients, @Param("subject") String subject, @Param("body") String body, @Param("groupConversation") Boolean groupConversation, @Param("attachmentIds") List<String> attachmentIds, @Param("mediaCommentId") String mediaCommentId, @Param("mediaCommentType") String mediaCommentType, @Param("userNote") Boolean userNote, @Param("mode") String mode, @Param("scope") String scope, @Param("filter") List<String> filter, @Param("filterMode") String filterMode, @Param("contextCode") String contextCode);
  
  /**
   * Delete a conversation
   * Delete this conversation and its messages. Note that this only deletes this user&#x27;s view of the conversation.  Response includes same fields as UPDATE action
   * @param id ID (required)
   */
  @RequestLine("DELETE /v1/conversations/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteConversation(@Param("id") String id);
  
  /**
   * Delete a message
   * Delete messages from this conversation. Note that this only affects this user&#x27;s view of the conversation. If all messages are deleted, the conversation will be as well (equivalent to DELETE)
   * @param id ID (required)
   * @param remove  (optional)
   */
  @RequestLine("POST /v1/conversations/{id}/remove_messages")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void deleteMessage(@Param("id") String id, @Param("remove") List<String> remove);
  
  /**
   * Edit a conversation
   * Updates attributes for a single conversation.
   * @param id ID (required)
   * @param conversationWorkflowState  (optional)
   * @param conversationSubscribed  (optional)
   * @param conversationStarred  (optional)
   * @param scope  (optional)
   * @param filter  (optional)
   * @param filterMode  (optional)
   */
  @RequestLine("PUT /v1/conversations/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void editConversation(@Param("id") String id, @Param("conversationWorkflowState") String conversationWorkflowState, @Param("conversationSubscribed") Boolean conversationSubscribed, @Param("conversationStarred") Boolean conversationStarred, @Param("scope") String scope, @Param("filter") List<String> filter, @Param("filterMode") String filterMode);
  
  /**
   * Get running batches
   * Returns any currently running conversation batches for the current user. Conversation batches are created when a bulk private message is sent asynchronously (see the mode argument to the {api:ConversationsController#create create API action}).
   */
  @RequestLine("GET /v1/conversations/batches")
  @Headers({
      "Accept: */*",
  })
  void getRunningBatches();
  
  /**
   * Get a single conversation
   * Returns information for a single conversation for the current user. Response includes all fields that are present in the list/index action as well as messages and extended participant information.
   * @param id ID (required)
   * @param interleaveSubmissions (Obsolete) Submissions are no longer linked to conversations. This parameter is ignored. (optional)
   * @param scope Used when generating \&quot;visible\&quot; in the API response. See the explanation under the {api:ConversationsController#index index API action} (optional)
   * @param filter Used when generating \&quot;visible\&quot; in the API response. See the explanation under the {api:ConversationsController#index index API action} (optional)
   * @param filterMode Used when generating \&quot;visible\&quot; in the API response. See the explanation under the {api:ConversationsController#index index API action} (optional)
   * @param autoMarkAsRead Default true. If true, unread conversations will be automatically marked as read. This will default to false in a future API release, so clients should explicitly send true if that is the desired behavior. (optional)
   */
  @RequestLine("GET /v1/conversations/{id}?interleave_submissions={interleaveSubmissions}&scope={scope}&filter={filter}&filter_mode={filterMode}&auto_mark_as_read={autoMarkAsRead}")
  @Headers({
      "Accept: */*",
  })
  void getSingleConversation(@Param("id") String id, @Param("interleaveSubmissions") Boolean interleaveSubmissions, @Param("scope") String scope, @Param("filter") List<String> filter, @Param("filterMode") String filterMode, @Param("autoMarkAsRead") Boolean autoMarkAsRead);
  

  /**
   * Get a single conversation
   * Returns information for a single conversation for the current user. Response includes all fields that are present in the list/index action as well as messages and extended participant information.
   * Note, this is equivalent to the other <code>getSingleConversation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSingleConversationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>interleaveSubmissions - (Obsolete) Submissions are no longer linked to conversations. This parameter is ignored. (optional)</li>
   *   <li>scope - Used when generating \&quot;visible\&quot; in the API response. See the explanation under the {api:ConversationsController#index index API action} (optional)</li>
   *   <li>filter - Used when generating \&quot;visible\&quot; in the API response. See the explanation under the {api:ConversationsController#index index API action} (optional)</li>
   *   <li>filterMode - Used when generating \&quot;visible\&quot; in the API response. See the explanation under the {api:ConversationsController#index index API action} (optional)</li>
   *   <li>autoMarkAsRead - Default true. If true, unread conversations will be automatically marked as read. This will default to false in a future API release, so clients should explicitly send true if that is the desired behavior. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/conversations/{id}?interleave_submissions={interleaveSubmissions}&scope={scope}&filter={filter}&filter_mode={filterMode}&auto_mark_as_read={autoMarkAsRead}")
  @Headers({
      "Content-Type: */*",
  })
  void getSingleConversation(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSingleConversation</code> method in a fluent style.
   */
  public static class GetSingleConversationQueryParams extends HashMap<String, Object> {
    public GetSingleConversationQueryParams interleaveSubmissions(final Boolean value) {
      put("interleave_submissions", EncodingUtils.encode(value));
      return this;
    }
    public GetSingleConversationQueryParams scope(final String value) {
      put("scope", EncodingUtils.encode(value));
      return this;
    }
    public GetSingleConversationQueryParams filter(final List<String> value) {
      put("filter", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSingleConversationQueryParams filterMode(final String value) {
      put("filter_mode", EncodingUtils.encode(value));
      return this;
    }
    public GetSingleConversationQueryParams autoMarkAsRead(final Boolean value) {
      put("auto_mark_as_read", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List conversations
   * Returns the paginated list of conversations for the current user, most recent ones first.
   * @param scope When set, only return conversations of the specified type. For example, set to \&quot;unread\&quot; to return only conversations that haven&#x27;t been read. The default behavior is to return all non-archived conversations (i.e. read and unread). (optional)
   * @param filter When set, only return conversations for the specified courses, groups or users. The id should be prefixed with its type, e.g. \&quot;user_123\&quot; or \&quot;course_456\&quot;. Can be an array (by setting \&quot;filter[]\&quot;) or single value (by setting \&quot;filter\&quot;) (optional)
   * @param filterMode When filter[] contains multiple filters, combine them with this mode, filtering conversations that at have at least all of the contexts (\&quot;and\&quot;) or at least one of the contexts (\&quot;or\&quot;) (optional)
   * @param interleaveSubmissions (Obsolete) Submissions are no longer linked to conversations. This parameter is ignored. (optional)
   * @param includeAllConversationIds Default is false. If true, the top-level element of the response will be an object rather than an array, and will have the keys \&quot;conversations\&quot; which will contain the paged conversation data, and \&quot;conversation_ids\&quot; which will contain the ids of all conversations under this scope/filter in the same order. (optional)
   * @param include \&quot;participant_avatars\&quot;:: Optionally include an \&quot;avatar_url\&quot; key for each user participanting in the conversation (optional)
   * @return List&lt;Conversation&gt;
   */
  @RequestLine("GET /v1/conversations?scope={scope}&filter={filter}&filter_mode={filterMode}&interleave_submissions={interleaveSubmissions}&include_all_conversation_ids={includeAllConversationIds}&include={include}")
  @Headers({
      "Accept: application/json",
  })
  List<Conversation> listConversations(@Param("scope") String scope, @Param("filter") List<String> filter, @Param("filterMode") String filterMode, @Param("interleaveSubmissions") Boolean interleaveSubmissions, @Param("includeAllConversationIds") Boolean includeAllConversationIds, @Param("include") List<String> include);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Conversation&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Conversation> listConversations(URI uri);
  

  /**
   * List conversations
   * Returns the paginated list of conversations for the current user, most recent ones first.
   * Note, this is equivalent to the other <code>listConversations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListConversationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>scope - When set, only return conversations of the specified type. For example, set to \&quot;unread\&quot; to return only conversations that haven&#x27;t been read. The default behavior is to return all non-archived conversations (i.e. read and unread). (optional)</li>
   *   <li>filter - When set, only return conversations for the specified courses, groups or users. The id should be prefixed with its type, e.g. \&quot;user_123\&quot; or \&quot;course_456\&quot;. Can be an array (by setting \&quot;filter[]\&quot;) or single value (by setting \&quot;filter\&quot;) (optional)</li>
   *   <li>filterMode - When filter[] contains multiple filters, combine them with this mode, filtering conversations that at have at least all of the contexts (\&quot;and\&quot;) or at least one of the contexts (\&quot;or\&quot;) (optional)</li>
   *   <li>interleaveSubmissions - (Obsolete) Submissions are no longer linked to conversations. This parameter is ignored. (optional)</li>
   *   <li>includeAllConversationIds - Default is false. If true, the top-level element of the response will be an object rather than an array, and will have the keys \&quot;conversations\&quot; which will contain the paged conversation data, and \&quot;conversation_ids\&quot; which will contain the ids of all conversations under this scope/filter in the same order. (optional)</li>
   *   <li>include - \&quot;participant_avatars\&quot;:: Optionally include an \&quot;avatar_url\&quot; key for each user participanting in the conversation (optional)</li>
   *   </ul>
   * @return List&lt;Conversation&gt;

   */
  @RequestLine("GET /v1/conversations?scope={scope}&filter={filter}&filter_mode={filterMode}&interleave_submissions={interleaveSubmissions}&include_all_conversation_ids={includeAllConversationIds}&include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Conversation> listConversations(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listConversations</code> method in a fluent style.
   */
  public static class ListConversationsQueryParams extends HashMap<String, Object> {
    public ListConversationsQueryParams scope(final String value) {
      put("scope", EncodingUtils.encode(value));
      return this;
    }
    public ListConversationsQueryParams filter(final List<String> value) {
      put("filter", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListConversationsQueryParams filterMode(final String value) {
      put("filter_mode", EncodingUtils.encode(value));
      return this;
    }
    public ListConversationsQueryParams interleaveSubmissions(final Boolean value) {
      put("interleave_submissions", EncodingUtils.encode(value));
      return this;
    }
    public ListConversationsQueryParams includeAllConversationIds(final Boolean value) {
      put("include_all_conversation_ids", EncodingUtils.encode(value));
      return this;
    }
    public ListConversationsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Mark all as read
   * Mark all conversations as read.
   */
  @RequestLine("POST /v1/conversations/mark_all_as_read")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void markAllAsRead();
  
  /**
   * Unread count
   * Get the number of unread conversations for the current user
   */
  @RequestLine("GET /v1/conversations/unread_count")
  @Headers({
      "Accept: */*",
  })
  void unreadCount();
  
}
