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
public interface OutcomeResultsApi extends ApiClient.Api {

  /**
   * Get outcome result rollups
   * Gets the outcome rollups for the users and outcomes in the specified context.
   * @param courseId ID (required)
   * @param aggregate If specified, instead of returning one rollup for each user, all the user rollups will be combined into one rollup for the course that will contain the average (or median, see below) rollup score for each outcome. (optional)
   * @param aggregateStat If aggregate rollups requested, then this value determines what statistic is used for the aggregate. Defaults to \&quot;mean\&quot; if this value is not specified. (optional)
   * @param userIds If specified, only the users whose ids are given will be included in the results or used in an aggregate result. it is an error to specify an id for a user who is not a student in the context (optional)
   * @param outcomeIds If specified, only the outcomes whose ids are given will be included in the results. it is an error to specify an id for an outcome which is not linked to the context. (optional)
   * @param include [String, \&quot;courses\&quot;|\&quot;outcomes\&quot;|\&quot;outcomes.alignments\&quot;|\&quot;outcome_groups\&quot;|\&quot;outcome_links\&quot;|\&quot;outcome_paths\&quot;|\&quot;users\&quot;] Specify additional collections to be side loaded with the result. (optional)
   * @param exclude Specify additional values to exclude. \&quot;missing_user_rollups\&quot; excludes rollups for users without results. (optional)
   * @param sortBy If specified, sorts outcome result rollups. \&quot;student\&quot; sorting will sort by a user&#x27;s sortable name. \&quot;outcome\&quot; sorting will sort by the given outcome&#x27;s rollup score. The latter requires specifying the \&quot;sort_outcome_id\&quot; parameter. By default, the sort order is ascending. (optional)
   * @param sortOutcomeId If outcome sorting requested, then this determines which outcome to use for rollup score sorting. (optional)
   * @param sortOrder If sorting requested, then this allows changing the default sort order of ascending to descending. (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/outcome_rollups?aggregate={aggregate}&aggregate_stat={aggregateStat}&user_ids={userIds}&outcome_ids={outcomeIds}&include={include}&exclude={exclude}&sort_by={sortBy}&sort_outcome_id={sortOutcomeId}&sort_order={sortOrder}")
  @Headers({
      "Accept: */*",
  })
  void getOutcomeResultRollups(@Param("courseId") String courseId, @Param("aggregate") String aggregate, @Param("aggregateStat") String aggregateStat, @Param("userIds") List<Integer> userIds, @Param("outcomeIds") List<Integer> outcomeIds, @Param("include") List<String> include, @Param("exclude") List<String> exclude, @Param("sortBy") String sortBy, @Param("sortOutcomeId") Integer sortOutcomeId, @Param("sortOrder") String sortOrder);
  

  /**
   * Get outcome result rollups
   * Gets the outcome rollups for the users and outcomes in the specified context.
   * Note, this is equivalent to the other <code>getOutcomeResultRollups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetOutcomeResultRollupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>aggregate - If specified, instead of returning one rollup for each user, all the user rollups will be combined into one rollup for the course that will contain the average (or median, see below) rollup score for each outcome. (optional)</li>
   *   <li>aggregateStat - If aggregate rollups requested, then this value determines what statistic is used for the aggregate. Defaults to \&quot;mean\&quot; if this value is not specified. (optional)</li>
   *   <li>userIds - If specified, only the users whose ids are given will be included in the results or used in an aggregate result. it is an error to specify an id for a user who is not a student in the context (optional)</li>
   *   <li>outcomeIds - If specified, only the outcomes whose ids are given will be included in the results. it is an error to specify an id for an outcome which is not linked to the context. (optional)</li>
   *   <li>include - [String, \&quot;courses\&quot;|\&quot;outcomes\&quot;|\&quot;outcomes.alignments\&quot;|\&quot;outcome_groups\&quot;|\&quot;outcome_links\&quot;|\&quot;outcome_paths\&quot;|\&quot;users\&quot;] Specify additional collections to be side loaded with the result. (optional)</li>
   *   <li>exclude - Specify additional values to exclude. \&quot;missing_user_rollups\&quot; excludes rollups for users without results. (optional)</li>
   *   <li>sortBy - If specified, sorts outcome result rollups. \&quot;student\&quot; sorting will sort by a user&#x27;s sortable name. \&quot;outcome\&quot; sorting will sort by the given outcome&#x27;s rollup score. The latter requires specifying the \&quot;sort_outcome_id\&quot; parameter. By default, the sort order is ascending. (optional)</li>
   *   <li>sortOutcomeId - If outcome sorting requested, then this determines which outcome to use for rollup score sorting. (optional)</li>
   *   <li>sortOrder - If sorting requested, then this allows changing the default sort order of ascending to descending. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/outcome_rollups?aggregate={aggregate}&aggregate_stat={aggregateStat}&user_ids={userIds}&outcome_ids={outcomeIds}&include={include}&exclude={exclude}&sort_by={sortBy}&sort_outcome_id={sortOutcomeId}&sort_order={sortOrder}")
  @Headers({
      "Content-Type: */*",
  })
  void getOutcomeResultRollups(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getOutcomeResultRollups</code> method in a fluent style.
   */
  public static class GetOutcomeResultRollupsQueryParams extends HashMap<String, Object> {
    public GetOutcomeResultRollupsQueryParams aggregate(final String value) {
      put("aggregate", EncodingUtils.encode(value));
      return this;
    }
    public GetOutcomeResultRollupsQueryParams aggregateStat(final String value) {
      put("aggregate_stat", EncodingUtils.encode(value));
      return this;
    }
    public GetOutcomeResultRollupsQueryParams userIds(final List<Integer> value) {
      put("user_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetOutcomeResultRollupsQueryParams outcomeIds(final List<Integer> value) {
      put("outcome_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetOutcomeResultRollupsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetOutcomeResultRollupsQueryParams exclude(final List<String> value) {
      put("exclude", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetOutcomeResultRollupsQueryParams sortBy(final String value) {
      put("sort_by", EncodingUtils.encode(value));
      return this;
    }
    public GetOutcomeResultRollupsQueryParams sortOutcomeId(final Integer value) {
      put("sort_outcome_id", EncodingUtils.encode(value));
      return this;
    }
    public GetOutcomeResultRollupsQueryParams sortOrder(final String value) {
      put("sort_order", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get outcome results
   * Gets the outcome results for users and outcomes in the specified context.
   * @param courseId ID (required)
   * @param userIds If specified, only the users whose ids are given will be included in the results. SIS ids can be used, prefixed by \&quot;sis_user_id:\&quot;. It is an error to specify an id for a user who is not a student in the context. (optional)
   * @param outcomeIds If specified, only the outcomes whose ids are given will be included in the results. it is an error to specify an id for an outcome which is not linked to the context. (optional)
   * @param include [String, \&quot;alignments\&quot;|\&quot;outcomes\&quot;|\&quot;outcomes.alignments\&quot;|\&quot;outcome_groups\&quot;|\&quot;outcome_links\&quot;|\&quot;outcome_paths\&quot;|\&quot;users\&quot;] Specify additional collections to be side loaded with the result. \&quot;alignments\&quot; includes only the alignments referenced by the returned results. \&quot;outcomes.alignments\&quot; includes all alignments referenced by outcomes in the context. (optional)
   * @param includeHidden If true, results that are hidden from the learning mastery gradebook and student rollup scores will be included (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/outcome_results?user_ids={userIds}&outcome_ids={outcomeIds}&include={include}&include_hidden={includeHidden}")
  @Headers({
      "Accept: */*",
  })
  void getOutcomeResults(@Param("courseId") String courseId, @Param("userIds") List<Integer> userIds, @Param("outcomeIds") List<Integer> outcomeIds, @Param("include") List<String> include, @Param("includeHidden") Boolean includeHidden);
  

  /**
   * Get outcome results
   * Gets the outcome results for users and outcomes in the specified context.
   * Note, this is equivalent to the other <code>getOutcomeResults</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetOutcomeResultsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>userIds - If specified, only the users whose ids are given will be included in the results. SIS ids can be used, prefixed by \&quot;sis_user_id:\&quot;. It is an error to specify an id for a user who is not a student in the context. (optional)</li>
   *   <li>outcomeIds - If specified, only the outcomes whose ids are given will be included in the results. it is an error to specify an id for an outcome which is not linked to the context. (optional)</li>
   *   <li>include - [String, \&quot;alignments\&quot;|\&quot;outcomes\&quot;|\&quot;outcomes.alignments\&quot;|\&quot;outcome_groups\&quot;|\&quot;outcome_links\&quot;|\&quot;outcome_paths\&quot;|\&quot;users\&quot;] Specify additional collections to be side loaded with the result. \&quot;alignments\&quot; includes only the alignments referenced by the returned results. \&quot;outcomes.alignments\&quot; includes all alignments referenced by outcomes in the context. (optional)</li>
   *   <li>includeHidden - If true, results that are hidden from the learning mastery gradebook and student rollup scores will be included (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/outcome_results?user_ids={userIds}&outcome_ids={outcomeIds}&include={include}&include_hidden={includeHidden}")
  @Headers({
      "Content-Type: */*",
  })
  void getOutcomeResults(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getOutcomeResults</code> method in a fluent style.
   */
  public static class GetOutcomeResultsQueryParams extends HashMap<String, Object> {
    public GetOutcomeResultsQueryParams userIds(final List<Integer> value) {
      put("user_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetOutcomeResultsQueryParams outcomeIds(final List<Integer> value) {
      put("outcome_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetOutcomeResultsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetOutcomeResultsQueryParams includeHidden(final Boolean value) {
      put("include_hidden", EncodingUtils.encode(value));
      return this;
    }
  }
}
