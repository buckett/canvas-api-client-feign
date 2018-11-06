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
public interface BrandConfigsApi extends ApiClient.Api {

  /**
   * Get the brand config variables that should be used for this domain
   * Will redirect to a static json file that has all of the brand variables used by this account. Even though this is a redirect, do not store the redirected url since if the account makes any changes it will redirect to a new url. Needs no authentication.
   */
  @RequestLine("GET /v1/brand_variables")
  @Headers({
      "Accept: */*",
  })
  void getBrandConfigVariablesThatShouldBeUsedForThisDomain();
  
}
