package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;


import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface WebhooksSubscriptionsApi extends ApiClient.Api {

  /**
   * Create a Webhook Subscription
   * Creates a webook subscription for the specified event type and context.
   * @param submissionContextId  (optional)
   * @param subscriptionContextType  (optional)
   * @param subscriptionEventTypes  (optional)
   * @param subscriptionFormat  (optional)
   * @param subscriptionTransportMetadata  (optional)
   * @param subscriptionTransportType  (optional)
   */
  @RequestLine("POST /lti/subscriptions")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createWebhookSubscription(@Param("submissionContextId") String submissionContextId, @Param("subscriptionContextType") String subscriptionContextType, @Param("subscriptionEventTypes") List<String> subscriptionEventTypes, @Param("subscriptionFormat") String subscriptionFormat, @Param("subscriptionTransportMetadata") Object subscriptionTransportMetadata, @Param("subscriptionTransportType") String subscriptionTransportType);
  
  /**
   * Delete a Webhook Subscription
   * 
   * @param id ID (required)
   */
  @RequestLine("DELETE /lti/subscriptions/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteWebhookSubscription(@Param("id") String id);
  
  /**
   * List all Webhook Subscription for a tool proxy
   * This endpoint returns a paginated list with a default limit of 100 items per result set. You can retrieve the next result set by setting a &#x27;StartKey&#x27; header in your next request with the value of the &#x27;EndKey&#x27; header in the response.  Example use of a &#x27;StartKey&#x27; header object:   { \&quot;Id\&quot;:\&quot;71d6dfba-0547-477d-b41d-db8cb528c6d1\&quot;,\&quot;DeveloperKey\&quot;:\&quot;10000000000001\&quot; }
   */
  @RequestLine("GET /lti/subscriptions")
  @Headers({
      "Accept: */*",
  })
  void listAllWebhookSubscriptionForToolProxy();
  
  /**
   * Show a single Webhook Subscription
   * 
   * @param id ID (required)
   */
  @RequestLine("GET /lti/subscriptions/{id}")
  @Headers({
      "Accept: */*",
  })
  void showSingleWebhookSubscription(@Param("id") String id);
  
  /**
   * Update a Webhook Subscription
   * This endpoint uses the same parameters as the create endpoint
   * @param id ID (required)
   */
  @RequestLine("PUT /lti/subscriptions/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void updateWebhookSubscription(@Param("id") String id);
  
}
