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
public interface ErrorReportsApi extends ApiClient.Api {

  /**
   * Create Error Report
   * Create a new error report documenting an experienced problem  Performs the same action as when a user uses the \&quot;help -&gt; report a problem\&quot; dialog.
   * @param errorSubject  (optional)
   * @param errorUrl  (optional)
   * @param errorEmail  (optional)
   * @param errorComments  (optional)
   * @param errorHttpEnv  (optional)
   */
  @RequestLine("POST /v1/error_reports")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createErrorReport(@Param("errorSubject") String errorSubject, @Param("errorUrl") String errorUrl, @Param("errorEmail") String errorEmail, @Param("errorComments") String errorComments, @Param("errorHttpEnv") Object errorHttpEnv);
  
}
