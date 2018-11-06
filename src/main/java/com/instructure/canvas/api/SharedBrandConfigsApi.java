package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.SharedBrandConfig;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface SharedBrandConfigsApi extends ApiClient.Api {

  /**
   * Share a BrandConfig (Theme)
   * Create a SharedBrandConfig, which will give the given brand_config a name and make it available to other users of this account.
   * @param accountId ID (required)
   * @param sharedBrandConfigName  (optional)
   * @param sharedBrandConfigBrandConfigMd5  (optional)
   * @return SharedBrandConfig
   */
  @RequestLine("POST /v1/accounts/{accountId}/shared_brand_configs")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  SharedBrandConfig shareBrandconfigTheme(@Param("accountId") String accountId, @Param("sharedBrandConfigName") String sharedBrandConfigName, @Param("sharedBrandConfigBrandConfigMd5") String sharedBrandConfigBrandConfigMd5);
  
  /**
   * Un-share a BrandConfig (Theme)
   * Delete a SharedBrandConfig, which will unshare it so you nor anyone else in your account will see it as an option to pick from.
   * @param id ID (required)
   * @return SharedBrandConfig
   */
  @RequestLine("DELETE /v1/shared_brand_configs/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  SharedBrandConfig unShareBrandconfigTheme(@Param("id") String id);
  
  /**
   * Update a shared theme
   * Update the specified shared_brand_config with a new name or to point to a new brand_config. Uses same parameters as create.
   * @param accountId ID (required)
   * @param id ID (required)
   * @return SharedBrandConfig
   */
  @RequestLine("PUT /v1/accounts/{accountId}/shared_brand_configs/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  SharedBrandConfig updateSharedTheme(@Param("accountId") String accountId, @Param("id") String id);
  
}
