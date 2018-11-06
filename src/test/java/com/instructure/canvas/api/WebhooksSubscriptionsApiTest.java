package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksSubscriptionsApi
 */
public class WebhooksSubscriptionsApiTest {

    private WebhooksSubscriptionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(WebhooksSubscriptionsApi.class);
    }

    /**
     * Create a Webhook Subscription
     *
     * Creates a webook subscription for the specified event type and context.
     */
    @Test
    public void createWebhookSubscriptionTest() {
        String submissionContextId = null;
        String subscriptionContextType = null;
        List<String> subscriptionEventTypes = null;
        String subscriptionFormat = null;
        Object subscriptionTransportMetadata = null;
        String subscriptionTransportType = null;
        // api.createWebhookSubscription(submissionContextId, subscriptionContextType, subscriptionEventTypes, subscriptionFormat, subscriptionTransportMetadata, subscriptionTransportType);

        // TODO: test validations
    }

    /**
     * Delete a Webhook Subscription
     *
     * 
     */
    @Test
    public void deleteWebhookSubscriptionTest() {
        String id = null;
        // api.deleteWebhookSubscription(id);

        // TODO: test validations
    }

    /**
     * List all Webhook Subscription for a tool proxy
     *
     * This endpoint returns a paginated list with a default limit of 100 items per result set. You can retrieve the next result set by setting a &#x27;StartKey&#x27; header in your next request with the value of the &#x27;EndKey&#x27; header in the response.  Example use of a &#x27;StartKey&#x27; header object:   { \&quot;Id\&quot;:\&quot;71d6dfba-0547-477d-b41d-db8cb528c6d1\&quot;,\&quot;DeveloperKey\&quot;:\&quot;10000000000001\&quot; }
     */
    @Test
    public void listAllWebhookSubscriptionForToolProxyTest() {
        // api.listAllWebhookSubscriptionForToolProxy();

        // TODO: test validations
    }

    /**
     * Show a single Webhook Subscription
     *
     * 
     */
    @Test
    public void showSingleWebhookSubscriptionTest() {
        String id = null;
        // api.showSingleWebhookSubscription(id);

        // TODO: test validations
    }

    /**
     * Update a Webhook Subscription
     *
     * This endpoint uses the same parameters as the create endpoint
     */
    @Test
    public void updateWebhookSubscriptionTest() {
        String id = null;
        // api.updateWebhookSubscription(id);

        // TODO: test validations
    }

}
