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
public interface ServicesApi extends ApiClient.Api {

  /**
   * Get Kaltura config
   * Return the config information for the Kaltura plugin in json format.
   */
  @RequestLine("GET /v1/services/kaltura")
  @Headers({
      "Accept: */*",
  })
  void getKalturaConfig();
  
  /**
   * Start Kaltura session
   * Start a new Kaltura session, so that new media can be recorded and uploaded to this Canvas instance&#x27;s Kaltura instance.
   */
  @RequestLine("POST /v1/services/kaltura_session")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void startKalturaSession();
  
}
