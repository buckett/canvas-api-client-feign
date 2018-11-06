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
public interface AccountDomainLookupsApi extends ApiClient.Api {

  /**
   * Search account domains
   * Returns a list of up to 5 matching account domains  Partial match on name / domain are supported
   * @param name campus name (optional)
   * @param domain no description (optional)
   * @param latitude no description (optional)
   * @param longitude no description (optional)
   */
  @RequestLine("GET /v1/accounts/search?name={name}&domain={domain}&latitude={latitude}&longitude={longitude}")
  @Headers({
      "Accept: */*",
  })
  void searchAccountDomains(@Param("name") String name, @Param("domain") String domain, @Param("latitude") BigDecimal latitude, @Param("longitude") BigDecimal longitude);
  

  /**
   * Search account domains
   * Returns a list of up to 5 matching account domains  Partial match on name / domain are supported
   * Note, this is equivalent to the other <code>searchAccountDomains</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SearchAccountDomainsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>name - campus name (optional)</li>
   *   <li>domain - no description (optional)</li>
   *   <li>latitude - no description (optional)</li>
   *   <li>longitude - no description (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/accounts/search?name={name}&domain={domain}&latitude={latitude}&longitude={longitude}")
  @Headers({
      "Content-Type: */*",
  })
  void searchAccountDomains(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>searchAccountDomains</code> method in a fluent style.
   */
  public static class SearchAccountDomainsQueryParams extends HashMap<String, Object> {
    public SearchAccountDomainsQueryParams name(final String value) {
      put("name", EncodingUtils.encode(value));
      return this;
    }
    public SearchAccountDomainsQueryParams domain(final String value) {
      put("domain", EncodingUtils.encode(value));
      return this;
    }
    public SearchAccountDomainsQueryParams latitude(final BigDecimal value) {
      put("latitude", EncodingUtils.encode(value));
      return this;
    }
    public SearchAccountDomainsQueryParams longitude(final BigDecimal value) {
      put("longitude", EncodingUtils.encode(value));
      return this;
    }
  }
}
