package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.JWT;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface JwTsApi extends ApiClient.Api {

  /**
   * Create JWT
   * Create a unique jwt for using with other canvas services  Generates a different JWT each time it&#x27;s called, each one expires after a short window (1 hour)
   * @return JWT
   */
  @RequestLine("POST /v1/jwts")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  JWT createJwt();
  
  /**
   * Refresh JWT
   * Refresh a JWT for use with other canvas services  Generates a different JWT each time it&#x27;s called, each one expires after a short window (1 hour).
   * @param jwt  (optional)
   * @return JWT
   */
  @RequestLine("POST /v1/jwts/refresh")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  JWT refreshJwt(@Param("jwt") String jwt);
  
}
