package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Conversation;
import com.instructure.canvas.model.Progress;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConversationsApi
 */
public class ConversationsApiTest {

    private ConversationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ConversationsApi.class);
    }

    /**
     * Add a message
     *
     * Add a message to an existing conversation. Response is similar to the GET/show action, except that only includes the latest message (i.e. what we just sent)  An array of user ids. Defaults to all of the current conversation recipients. To explicitly send a message to no other recipients, this array should consist of the logged-in user id.  An array of message ids from this conversation to send to recipients of the new message. Recipients who already had a copy of included messages will not be affected.
     */
    @Test
    public void addMessageTest() {
        String id = null;
        String body = null;
        List<String> attachmentIds = null;
        String mediaCommentId = null;
        String mediaCommentType = null;
        List<String> recipients = null;
        List<String> includedMessages = null;
        Boolean userNote = null;
        // api.addMessage(id, body, attachmentIds, mediaCommentId, mediaCommentType, recipients, includedMessages, userNote);

        // TODO: test validations
    }

    /**
     * Add recipients
     *
     * Add recipients to an existing group conversation. Response is similar to the GET/show action, except that only includes the latest message (e.g. \&quot;joe was added to the conversation by bob\&quot;)
     */
    @Test
    public void addRecipientsTest() {
        String id = null;
        List<String> recipients = null;
        // api.addRecipients(id, recipients);

        // TODO: test validations
    }

    /**
     * Batch update conversations
     *
     * Perform a change on a set of conversations. Operates asynchronously; use the {api:ProgressController#show progress endpoint} to query the status of an operation.
     */
    @Test
    public void batchUpdateConversationsTest() {
        List<String> conversationIds = null;
        String event = null;
        // Progress response = api.batchUpdateConversations(conversationIds, event);

        // TODO: test validations
    }

    /**
     * Create a conversation
     *
     * Create a new conversation with one or more recipients. If there is already an existing private conversation with the given recipients, it will be reused.
     */
    @Test
    public void createConversationTest() {
        List<String> recipients = null;
        String subject = null;
        String body = null;
        Boolean groupConversation = null;
        List<String> attachmentIds = null;
        String mediaCommentId = null;
        String mediaCommentType = null;
        Boolean userNote = null;
        String mode = null;
        String scope = null;
        List<String> filter = null;
        String filterMode = null;
        String contextCode = null;
        // api.createConversation(recipients, subject, body, groupConversation, attachmentIds, mediaCommentId, mediaCommentType, userNote, mode, scope, filter, filterMode, contextCode);

        // TODO: test validations
    }

    /**
     * Delete a conversation
     *
     * Delete this conversation and its messages. Note that this only deletes this user&#x27;s view of the conversation.  Response includes same fields as UPDATE action
     */
    @Test
    public void deleteConversationTest() {
        String id = null;
        // api.deleteConversation(id);

        // TODO: test validations
    }

    /**
     * Delete a message
     *
     * Delete messages from this conversation. Note that this only affects this user&#x27;s view of the conversation. If all messages are deleted, the conversation will be as well (equivalent to DELETE)
     */
    @Test
    public void deleteMessageTest() {
        String id = null;
        List<String> remove = null;
        // api.deleteMessage(id, remove);

        // TODO: test validations
    }

    /**
     * Edit a conversation
     *
     * Updates attributes for a single conversation.
     */
    @Test
    public void editConversationTest() {
        String id = null;
        String conversationWorkflowState = null;
        Boolean conversationSubscribed = null;
        Boolean conversationStarred = null;
        String scope = null;
        List<String> filter = null;
        String filterMode = null;
        // api.editConversation(id, conversationWorkflowState, conversationSubscribed, conversationStarred, scope, filter, filterMode);

        // TODO: test validations
    }

    /**
     * Get running batches
     *
     * Returns any currently running conversation batches for the current user. Conversation batches are created when a bulk private message is sent asynchronously (see the mode argument to the {api:ConversationsController#create create API action}).
     */
    @Test
    public void getRunningBatchesTest() {
        // api.getRunningBatches();

        // TODO: test validations
    }

    /**
     * Get a single conversation
     *
     * Returns information for a single conversation for the current user. Response includes all fields that are present in the list/index action as well as messages and extended participant information.
     */
    @Test
    public void getSingleConversationTest() {
        String id = null;
        Boolean interleaveSubmissions = null;
        String scope = null;
        List<String> filter = null;
        String filterMode = null;
        Boolean autoMarkAsRead = null;
        // api.getSingleConversation(id, interleaveSubmissions, scope, filter, filterMode, autoMarkAsRead);

        // TODO: test validations
    }

    /**
     * Get a single conversation
     *
     * Returns information for a single conversation for the current user. Response includes all fields that are present in the list/index action as well as messages and extended participant information.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSingleConversationTestQueryMap() {
        String id = null;
        ConversationsApi.GetSingleConversationQueryParams queryParams = new ConversationsApi.GetSingleConversationQueryParams()
            .interleaveSubmissions(null)
            .scope(null)
            .filter(null)
            .filterMode(null)
            .autoMarkAsRead(null);
        // api.getSingleConversation(id, queryParams);

    // TODO: test validations
    }
    /**
     * List conversations
     *
     * Returns the paginated list of conversations for the current user, most recent ones first.
     */
    @Test
    public void listConversationsTest() {
        String scope = null;
        List<String> filter = null;
        String filterMode = null;
        Boolean interleaveSubmissions = null;
        Boolean includeAllConversationIds = null;
        List<String> include = null;
        // List<Conversation> response = api.listConversations(scope, filter, filterMode, interleaveSubmissions, includeAllConversationIds, include);

        // TODO: test validations
    }

    /**
     * List conversations
     *
     * Returns the paginated list of conversations for the current user, most recent ones first.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listConversationsTestQueryMap() {
        ConversationsApi.ListConversationsQueryParams queryParams = new ConversationsApi.ListConversationsQueryParams()
            .scope(null)
            .filter(null)
            .filterMode(null)
            .interleaveSubmissions(null)
            .includeAllConversationIds(null)
            .include(null);
        // List<Conversation> response = api.listConversations(queryParams);

    // TODO: test validations
    }
    /**
     * Mark all as read
     *
     * Mark all conversations as read.
     */
    @Test
    public void markAllAsReadTest() {
        // api.markAllAsRead();

        // TODO: test validations
    }

    /**
     * Unread count
     *
     * Get the number of unread conversations for the current user
     */
    @Test
    public void unreadCountTest() {
        // api.unreadCount();

        // TODO: test validations
    }

}
