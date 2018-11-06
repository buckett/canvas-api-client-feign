package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import java.math.BigDecimal;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface LatePolicyApi extends ApiClient.Api {

  /**
   * Create a late policy
   * Create a late policy. If the course already has a late policy, a bad_request is returned since there can only be one late policy per course.
   * @param id ID (required)
   * @param latePolicyMissingSubmissionDeductionEnabled  (optional)
   * @param latePolicyMissingSubmissionDeduction  (optional)
   * @param latePolicyLateSubmissionDeductionEnabled  (optional)
   * @param latePolicyLateSubmissionDeduction  (optional)
   * @param latePolicyLateSubmissionInterval  (optional)
   * @param latePolicyLateSubmissionMinimumPercentEnabled  (optional)
   * @param latePolicyLateSubmissionMinimumPercent  (optional)
   */
  @RequestLine("POST /v1/courses/{id}/late_policy")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createLatePolicy(@Param("id") String id, @Param("latePolicyMissingSubmissionDeductionEnabled") Boolean latePolicyMissingSubmissionDeductionEnabled, @Param("latePolicyMissingSubmissionDeduction") BigDecimal latePolicyMissingSubmissionDeduction, @Param("latePolicyLateSubmissionDeductionEnabled") Boolean latePolicyLateSubmissionDeductionEnabled, @Param("latePolicyLateSubmissionDeduction") BigDecimal latePolicyLateSubmissionDeduction, @Param("latePolicyLateSubmissionInterval") String latePolicyLateSubmissionInterval, @Param("latePolicyLateSubmissionMinimumPercentEnabled") Boolean latePolicyLateSubmissionMinimumPercentEnabled, @Param("latePolicyLateSubmissionMinimumPercent") BigDecimal latePolicyLateSubmissionMinimumPercent);
  
  /**
   * Get a late policy
   * Returns the late policy for a course.
   * @param id ID (required)
   */
  @RequestLine("GET /v1/courses/{id}/late_policy")
  @Headers({
      "Accept: */*",
  })
  void getLatePolicy(@Param("id") String id);
  
  /**
   * Patch a late policy
   * Patch a late policy. No body is returned upon success.
   * @param id ID (required)
   * @param latePolicyMissingSubmissionDeductionEnabled  (optional)
   * @param latePolicyMissingSubmissionDeduction  (optional)
   * @param latePolicyLateSubmissionDeductionEnabled  (optional)
   * @param latePolicyLateSubmissionDeduction  (optional)
   * @param latePolicyLateSubmissionInterval  (optional)
   * @param latePolicyLateSubmissionMinimumPercentEnabled  (optional)
   * @param latePolicyLateSubmissionMinimumPercent  (optional)
   */
  @RequestLine("PATCH /v1/courses/{id}/late_policy")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void patchLatePolicy(@Param("id") String id, @Param("latePolicyMissingSubmissionDeductionEnabled") Boolean latePolicyMissingSubmissionDeductionEnabled, @Param("latePolicyMissingSubmissionDeduction") BigDecimal latePolicyMissingSubmissionDeduction, @Param("latePolicyLateSubmissionDeductionEnabled") Boolean latePolicyLateSubmissionDeductionEnabled, @Param("latePolicyLateSubmissionDeduction") BigDecimal latePolicyLateSubmissionDeduction, @Param("latePolicyLateSubmissionInterval") String latePolicyLateSubmissionInterval, @Param("latePolicyLateSubmissionMinimumPercentEnabled") Boolean latePolicyLateSubmissionMinimumPercentEnabled, @Param("latePolicyLateSubmissionMinimumPercent") BigDecimal latePolicyLateSubmissionMinimumPercent);
  
}
