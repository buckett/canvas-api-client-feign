package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.PlannerOverride;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface PlannerOverrideApi extends ApiClient.Api {

  /**
   * Create a planner override
   * Create a planner override for the current user
   * @param plannableType  (optional)
   * @param plannableId  (optional)
   * @param markedComplete  (optional)
   * @param dismissed  (optional)
   * @return PlannerOverride
   */
  @RequestLine("POST /v1/planner/overrides")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  PlannerOverride createPlannerOverride(@Param("plannableType") String plannableType, @Param("plannableId") Integer plannableId, @Param("markedComplete") Boolean markedComplete, @Param("dismissed") Boolean dismissed);
  
  /**
   * Delete a planner override
   * Delete a planner override for the current user
   * @param id ID (required)
   * @return PlannerOverride
   */
  @RequestLine("DELETE /v1/planner/overrides/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  PlannerOverride deletePlannerOverride(@Param("id") String id);
  
  /**
   * List planner overrides
   * Retrieve a planner override for the current user
   * @return List&lt;PlannerOverride&gt;
   */
  @RequestLine("GET /v1/planner/overrides")
  @Headers({
      "Accept: application/json",
  })
  List<PlannerOverride> listPlannerOverrides();

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;PlannerOverride&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<PlannerOverride> listPlannerOverrides(URI uri);
  
  /**
   * Show a planner override
   * Retrieve a planner override for the current user
   * @param id ID (required)
   * @return PlannerOverride
   */
  @RequestLine("GET /v1/planner/overrides/{id}")
  @Headers({
      "Accept: application/json",
  })
  PlannerOverride showPlannerOverride(@Param("id") String id);
  
  /**
   * Update a planner override
   * Update a planner override&#x27;s visibilty for the current user
   * @param id ID (required)
   * @param markedComplete  (optional)
   * @param dismissed  (optional)
   * @return PlannerOverride
   */
  @RequestLine("PUT /v1/planner/overrides/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  PlannerOverride updatePlannerOverride(@Param("id") String id, @Param("markedComplete") String markedComplete, @Param("dismissed") String dismissed);
  
}
