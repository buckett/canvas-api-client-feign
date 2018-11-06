package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Scope;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface ApiTokenScopesApi extends ApiClient.Api {

  /**
   * List scopes
   * A list of scopes that can be applied to developer keys and access tokens.
   * @param accountId ID (required)
   * @param groupBy The attribute to group the scopes by. By default no grouping is done. (optional)
   * @return List&lt;Scope&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/scopes?group_by={groupBy}")
  @Headers({
      "Accept: application/json",
  })
  List<Scope> listScopes(@Param("accountId") String accountId, @Param("groupBy") String groupBy);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Scope&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Scope> listScopes(URI uri);
  

  /**
   * List scopes
   * A list of scopes that can be applied to developer keys and access tokens.
   * Note, this is equivalent to the other <code>listScopes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListScopesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>groupBy - The attribute to group the scopes by. By default no grouping is done. (optional)</li>
   *   </ul>
   * @return List&lt;Scope&gt;

   */
  @RequestLine("GET /v1/accounts/{accountId}/scopes?group_by={groupBy}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Scope> listScopes(@Param("accountId") String accountId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listScopes</code> method in a fluent style.
   */
  public static class ListScopesQueryParams extends HashMap<String, Object> {
    public ListScopesQueryParams groupBy(final String value) {
      put("group_by", EncodingUtils.encode(value));
      return this;
    }
  }
}
