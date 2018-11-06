package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Progress;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface ProgressApi extends ApiClient.Api {

  /**
   * Query progress
   * Return completion and status information about an asynchronous job
   * @param id ID (required)
   * @return Progress
   */
  @RequestLine("GET /v1/progress/{id}")
  @Headers({
      "Accept: application/json",
  })
  Progress queryProgress(@Param("id") String id);
  
}
