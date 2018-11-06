package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Proficiency;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface ProficiencyRatingsApi extends ApiClient.Api {

  /**
   * Create/update proficiency ratings
   * Create or update account-level proficiency ratings. These ratings will apply to all sub-accounts, unless they have their own account-level proficiency ratings defined.
   * @param accountId ID (required)
   * @param ratingsDescription  (optional)
   * @param ratingsPoints  (optional)
   * @param ratingsMastery  (optional)
   * @param ratingsColor  (optional)
   * @return Proficiency
   */
  @RequestLine("POST /v1/accounts/{accountId}/outcome_proficiency")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Proficiency createUpdateProficiencyRatings(@Param("accountId") String accountId, @Param("ratingsDescription") List<String> ratingsDescription, @Param("ratingsPoints") List<Integer> ratingsPoints, @Param("ratingsMastery") List<Integer> ratingsMastery, @Param("ratingsColor") List<Integer> ratingsColor);
  
  /**
   * Get proficiency ratings
   * Get account-level proficiency ratings. If not defined for this account, it will return proficiency ratings for the nearest super-account with ratings defined. Will return 404 if none found.    Examples:     curl https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/outcome_proficiency \\         -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;
   * @param accountId ID (required)
   * @return Proficiency
   */
  @RequestLine("GET /v1/accounts/{accountId}/outcome_proficiency")
  @Headers({
      "Accept: application/json",
  })
  Proficiency getProficiencyRatings(@Param("accountId") String accountId);
  
}
