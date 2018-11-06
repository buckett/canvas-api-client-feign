/*
 * canvas.instructure.com
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.instructure.canvas.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.instructure.canvas.model.CalendarLink;
import com.instructure.canvas.model.CourseProgress;
import com.instructure.canvas.model.Enrollment;
import com.instructure.canvas.model.Term;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Course
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class Course {

  @JsonProperty("access_restricted_by_date")

  private Boolean accessRestrictedByDate = null;

  @JsonProperty("account_id")

  private Integer accountId = null;

  @JsonProperty("allow_student_assignment_edits")

  private Boolean allowStudentAssignmentEdits = null;

  @JsonProperty("allow_student_forum_attachments")

  private Boolean allowStudentForumAttachments = null;

  @JsonProperty("allow_wiki_comments")

  private Boolean allowWikiComments = null;

  @JsonProperty("apply_assignment_group_weights")

  private Boolean applyAssignmentGroupWeights = null;

  @JsonProperty("blueprint")

  private Boolean blueprint = null;

  @JsonProperty("blueprint_restrictions")

  private Object blueprintRestrictions = null;

  @JsonProperty("blueprint_restrictions_by_object_type")

  private Object blueprintRestrictionsByObjectType = null;

  @JsonProperty("calendar")

  private CalendarLink calendar = null;

  @JsonProperty("course_code")

  private String courseCode = null;

  @JsonProperty("course_format")

  private String courseFormat = null;

  @JsonProperty("course_progress")

  private CourseProgress courseProgress = null;

  @JsonProperty("created_at")

  private OffsetDateTime createdAt = null;

  @JsonProperty("default_view")

  private String defaultView = null;

  @JsonProperty("end_at")

  private OffsetDateTime endAt = null;

  @JsonProperty("enrollment_term_id")

  private Integer enrollmentTermId = null;

  @JsonProperty("enrollments")

  private List<Enrollment> enrollments = null;

  @JsonProperty("grading_standard_id")

  private Integer gradingStandardId = null;

  @JsonProperty("hide_final_grades")

  private Boolean hideFinalGrades = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("integration_id")

  private String integrationId = null;

  @JsonProperty("is_public")

  private Boolean isPublic = null;

  @JsonProperty("is_public_to_auth_users")

  private Boolean isPublicToAuthUsers = null;

  @JsonProperty("license")

  private String license = null;

  @JsonProperty("locale")

  private String locale = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("needs_grading_count")

  private Integer needsGradingCount = null;

  @JsonProperty("open_enrollment")

  private Boolean openEnrollment = null;

  @JsonProperty("permissions")

  private Object permissions = null;

  @JsonProperty("public_description")

  private String publicDescription = null;

  @JsonProperty("public_syllabus")

  private Boolean publicSyllabus = null;

  @JsonProperty("public_syllabus_to_auth")

  private Boolean publicSyllabusToAuth = null;

  @JsonProperty("restrict_enrollments_to_course_dates")

  private Boolean restrictEnrollmentsToCourseDates = null;

  @JsonProperty("root_account_id")

  private Integer rootAccountId = null;

  @JsonProperty("self_enrollment")

  private Boolean selfEnrollment = null;

  @JsonProperty("sis_course_id")

  private String sisCourseId = null;

  @JsonProperty("sis_import_id")

  private Integer sisImportId = null;

  @JsonProperty("start_at")

  private OffsetDateTime startAt = null;

  @JsonProperty("storage_quota_mb")

  private Integer storageQuotaMb = null;

  @JsonProperty("storage_quota_used_mb")

  private BigDecimal storageQuotaUsedMb = null;

  @JsonProperty("syllabus_body")

  private String syllabusBody = null;

  @JsonProperty("term")

  private Term term = null;

  @JsonProperty("time_zone")

  private String timeZone = null;

  @JsonProperty("total_students")

  private Integer totalStudents = null;

  @JsonProperty("uuid")

  private String uuid = null;

  @JsonProperty("workflow_state")

  private String workflowState = null;
  public Course accessRestrictedByDate(Boolean accessRestrictedByDate) {
    this.accessRestrictedByDate = accessRestrictedByDate;
    return this;
  }

  

  /**
  * optional: this will be true if this user is currently prevented from viewing the course because of date restriction settings
  * @return accessRestrictedByDate
  **/
  @Schema(example = "false", description = "optional: this will be true if this user is currently prevented from viewing the course because of date restriction settings")
  public Boolean isAccessRestrictedByDate() {
    return accessRestrictedByDate;
  }
  public void setAccessRestrictedByDate(Boolean accessRestrictedByDate) {
    this.accessRestrictedByDate = accessRestrictedByDate;
  }
  public Course accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

  

  /**
  * the account associated with the course
  * @return accountId
  **/
  @Schema(example = "81259", description = "the account associated with the course")
  public Integer getAccountId() {
    return accountId;
  }
  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }
  public Course allowStudentAssignmentEdits(Boolean allowStudentAssignmentEdits) {
    this.allowStudentAssignmentEdits = allowStudentAssignmentEdits;
    return this;
  }

  

  /**
  * Get allowStudentAssignmentEdits
  * @return allowStudentAssignmentEdits
  **/
  @Schema(example = "false", description = "")
  public Boolean isAllowStudentAssignmentEdits() {
    return allowStudentAssignmentEdits;
  }
  public void setAllowStudentAssignmentEdits(Boolean allowStudentAssignmentEdits) {
    this.allowStudentAssignmentEdits = allowStudentAssignmentEdits;
  }
  public Course allowStudentForumAttachments(Boolean allowStudentForumAttachments) {
    this.allowStudentForumAttachments = allowStudentForumAttachments;
    return this;
  }

  

  /**
  * Get allowStudentForumAttachments
  * @return allowStudentForumAttachments
  **/
  @Schema(example = "false", description = "")
  public Boolean isAllowStudentForumAttachments() {
    return allowStudentForumAttachments;
  }
  public void setAllowStudentForumAttachments(Boolean allowStudentForumAttachments) {
    this.allowStudentForumAttachments = allowStudentForumAttachments;
  }
  public Course allowWikiComments(Boolean allowWikiComments) {
    this.allowWikiComments = allowWikiComments;
    return this;
  }

  

  /**
  * Get allowWikiComments
  * @return allowWikiComments
  **/
  @Schema(example = "false", description = "")
  public Boolean isAllowWikiComments() {
    return allowWikiComments;
  }
  public void setAllowWikiComments(Boolean allowWikiComments) {
    this.allowWikiComments = allowWikiComments;
  }
  public Course applyAssignmentGroupWeights(Boolean applyAssignmentGroupWeights) {
    this.applyAssignmentGroupWeights = applyAssignmentGroupWeights;
    return this;
  }

  

  /**
  * weight final grade based on assignment group percentages
  * @return applyAssignmentGroupWeights
  **/
  @Schema(example = "true", description = "weight final grade based on assignment group percentages")
  public Boolean isApplyAssignmentGroupWeights() {
    return applyAssignmentGroupWeights;
  }
  public void setApplyAssignmentGroupWeights(Boolean applyAssignmentGroupWeights) {
    this.applyAssignmentGroupWeights = applyAssignmentGroupWeights;
  }
  public Course blueprint(Boolean blueprint) {
    this.blueprint = blueprint;
    return this;
  }

  

  /**
  * optional: whether the course is set as a Blueprint Course (blueprint fields require the Blueprint Courses feature)
  * @return blueprint
  **/
  @Schema(example = "true", description = "optional: whether the course is set as a Blueprint Course (blueprint fields require the Blueprint Courses feature)")
  public Boolean isBlueprint() {
    return blueprint;
  }
  public void setBlueprint(Boolean blueprint) {
    this.blueprint = blueprint;
  }
  public Course blueprintRestrictions(Object blueprintRestrictions) {
    this.blueprintRestrictions = blueprintRestrictions;
    return this;
  }

  

  /**
  * optional: Set of restrictions applied to all locked course objects
  * @return blueprintRestrictions
  **/
  @Schema(example = "{\"availability_dates\":false,\"content\":true,\"due_dates\":false,\"points\":true}", description = "optional: Set of restrictions applied to all locked course objects")
  public Object getBlueprintRestrictions() {
    return blueprintRestrictions;
  }
  public void setBlueprintRestrictions(Object blueprintRestrictions) {
    this.blueprintRestrictions = blueprintRestrictions;
  }
  public Course blueprintRestrictionsByObjectType(Object blueprintRestrictionsByObjectType) {
    this.blueprintRestrictionsByObjectType = blueprintRestrictionsByObjectType;
    return this;
  }

  

  /**
  * optional: Sets of restrictions differentiated by object type applied to locked course objects
  * @return blueprintRestrictionsByObjectType
  **/
  @Schema(example = "{\"assignment\":{\"content\":true,\"points\":true},\"wiki_page\":{\"content\":true}}", description = "optional: Sets of restrictions differentiated by object type applied to locked course objects")
  public Object getBlueprintRestrictionsByObjectType() {
    return blueprintRestrictionsByObjectType;
  }
  public void setBlueprintRestrictionsByObjectType(Object blueprintRestrictionsByObjectType) {
    this.blueprintRestrictionsByObjectType = blueprintRestrictionsByObjectType;
  }
  public Course calendar(CalendarLink calendar) {
    this.calendar = calendar;
    return this;
  }

  

  /**
  * Get calendar
  * @return calendar
  **/
  @Schema(description = "")
  public CalendarLink getCalendar() {
    return calendar;
  }
  public void setCalendar(CalendarLink calendar) {
    this.calendar = calendar;
  }
  public Course courseCode(String courseCode) {
    this.courseCode = courseCode;
    return this;
  }

  

  /**
  * the course code
  * @return courseCode
  **/
  @Schema(example = "INSTCON12", description = "the course code")
  public String getCourseCode() {
    return courseCode;
  }
  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }
  public Course courseFormat(String courseFormat) {
    this.courseFormat = courseFormat;
    return this;
  }

  

  /**
  * Get courseFormat
  * @return courseFormat
  **/
  @Schema(example = "online", description = "")
  public String getCourseFormat() {
    return courseFormat;
  }
  public void setCourseFormat(String courseFormat) {
    this.courseFormat = courseFormat;
  }
  public Course courseProgress(CourseProgress courseProgress) {
    this.courseProgress = courseProgress;
    return this;
  }

  

  /**
  * Get courseProgress
  * @return courseProgress
  **/
  @Schema(description = "")
  public CourseProgress getCourseProgress() {
    return courseProgress;
  }
  public void setCourseProgress(CourseProgress courseProgress) {
    this.courseProgress = courseProgress;
  }
  public Course createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  

  /**
  * the date the course was created.
  * @return createdAt
  **/
  @Schema(description = "the date the course was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public Course defaultView(String defaultView) {
    this.defaultView = defaultView;
    return this;
  }

  

  /**
  * the type of page that users will see when they first visit the course - &#x27;feed&#x27;: Recent Activity Dashboard - &#x27;wiki&#x27;: Wiki Front Page - &#x27;modules&#x27;: Course Modules/Sections Page - &#x27;assignments&#x27;: Course Assignments List - &#x27;syllabus&#x27;: Course Syllabus Page other types may be added in the future
  * @return defaultView
  **/
  @Schema(example = "feed", description = "the type of page that users will see when they first visit the course - 'feed': Recent Activity Dashboard - 'wiki': Wiki Front Page - 'modules': Course Modules/Sections Page - 'assignments': Course Assignments List - 'syllabus': Course Syllabus Page other types may be added in the future")
  public String getDefaultView() {
    return defaultView;
  }
  public void setDefaultView(String defaultView) {
    this.defaultView = defaultView;
  }
  public Course endAt(OffsetDateTime endAt) {
    this.endAt = endAt;
    return this;
  }

  

  /**
  * the end date for the course, if applicable
  * @return endAt
  **/
  @Schema(description = "the end date for the course, if applicable")
  public OffsetDateTime getEndAt() {
    return endAt;
  }
  public void setEndAt(OffsetDateTime endAt) {
    this.endAt = endAt;
  }
  public Course enrollmentTermId(Integer enrollmentTermId) {
    this.enrollmentTermId = enrollmentTermId;
    return this;
  }

  

  /**
  * the enrollment term associated with the course
  * @return enrollmentTermId
  **/
  @Schema(example = "34", description = "the enrollment term associated with the course")
  public Integer getEnrollmentTermId() {
    return enrollmentTermId;
  }
  public void setEnrollmentTermId(Integer enrollmentTermId) {
    this.enrollmentTermId = enrollmentTermId;
  }
  public Course enrollments(List<Enrollment> enrollments) {
    this.enrollments = enrollments;
    return this;
  }

  public Course addEnrollmentsItem(Enrollment enrollmentsItem) {
    if (this.enrollments == null) {
      this.enrollments = new ArrayList<Enrollment>();
    }
    this.enrollments.add(enrollmentsItem);
    return this;
  }

  /**
  * A list of enrollments linking the current user to the course. for student enrollments, grading information may be included if include[]&#x3D;total_scores
  * @return enrollments
  **/
  @Schema(description = "A list of enrollments linking the current user to the course. for student enrollments, grading information may be included if include[]=total_scores")
  public List<Enrollment> getEnrollments() {
    return enrollments;
  }
  public void setEnrollments(List<Enrollment> enrollments) {
    this.enrollments = enrollments;
  }
  public Course gradingStandardId(Integer gradingStandardId) {
    this.gradingStandardId = gradingStandardId;
    return this;
  }

  

  /**
  * the grading standard associated with the course
  * @return gradingStandardId
  **/
  @Schema(example = "25", description = "the grading standard associated with the course")
  public Integer getGradingStandardId() {
    return gradingStandardId;
  }
  public void setGradingStandardId(Integer gradingStandardId) {
    this.gradingStandardId = gradingStandardId;
  }
  public Course hideFinalGrades(Boolean hideFinalGrades) {
    this.hideFinalGrades = hideFinalGrades;
    return this;
  }

  

  /**
  * Get hideFinalGrades
  * @return hideFinalGrades
  **/
  @Schema(example = "false", description = "")
  public Boolean isHideFinalGrades() {
    return hideFinalGrades;
  }
  public void setHideFinalGrades(Boolean hideFinalGrades) {
    this.hideFinalGrades = hideFinalGrades;
  }
  public Course id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * the unique identifier for the course
  * @return id
  **/
  @Schema(example = "370663", description = "the unique identifier for the course")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Course integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  

  /**
  * the integration identifier for the course, if defined. This field is only included if the user has permission to view SIS information.
  * @return integrationId
  **/
  @Schema(description = "the integration identifier for the course, if defined. This field is only included if the user has permission to view SIS information.")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }
  public Course isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

  

  /**
  * Get isPublic
  * @return isPublic
  **/
  @Schema(example = "true", description = "")
  public Boolean isIsPublic() {
    return isPublic;
  }
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }
  public Course isPublicToAuthUsers(Boolean isPublicToAuthUsers) {
    this.isPublicToAuthUsers = isPublicToAuthUsers;
    return this;
  }

  

  /**
  * Get isPublicToAuthUsers
  * @return isPublicToAuthUsers
  **/
  @Schema(example = "true", description = "")
  public Boolean isIsPublicToAuthUsers() {
    return isPublicToAuthUsers;
  }
  public void setIsPublicToAuthUsers(Boolean isPublicToAuthUsers) {
    this.isPublicToAuthUsers = isPublicToAuthUsers;
  }
  public Course license(String license) {
    this.license = license;
    return this;
  }

  

  /**
  * Get license
  * @return license
  **/
  @Schema(example = "Creative Commons", description = "")
  public String getLicense() {
    return license;
  }
  public void setLicense(String license) {
    this.license = license;
  }
  public Course locale(String locale) {
    this.locale = locale;
    return this;
  }

  

  /**
  * the course-set locale, if applicable
  * @return locale
  **/
  @Schema(example = "en", description = "the course-set locale, if applicable")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }
  public Course name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * the full name of the course
  * @return name
  **/
  @Schema(example = "InstructureCon 2012", description = "the full name of the course")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Course needsGradingCount(Integer needsGradingCount) {
    this.needsGradingCount = needsGradingCount;
    return this;
  }

  

  /**
  * optional: the number of submissions needing grading returned only if the current user has grading rights and include[]&#x3D;needs_grading_count
  * @return needsGradingCount
  **/
  @Schema(example = "17", description = "optional: the number of submissions needing grading returned only if the current user has grading rights and include[]=needs_grading_count")
  public Integer getNeedsGradingCount() {
    return needsGradingCount;
  }
  public void setNeedsGradingCount(Integer needsGradingCount) {
    this.needsGradingCount = needsGradingCount;
  }
  public Course openEnrollment(Boolean openEnrollment) {
    this.openEnrollment = openEnrollment;
    return this;
  }

  

  /**
  * Get openEnrollment
  * @return openEnrollment
  **/
  @Schema(example = "true", description = "")
  public Boolean isOpenEnrollment() {
    return openEnrollment;
  }
  public void setOpenEnrollment(Boolean openEnrollment) {
    this.openEnrollment = openEnrollment;
  }
  public Course permissions(Object permissions) {
    this.permissions = permissions;
    return this;
  }

  

  /**
  * optional: the permissions the user has for the course. returned only for a single course and include[]&#x3D;permissions
  * @return permissions
  **/
  @Schema(example = "{\"create_announcement\":true,\"create_discussion_topic\":true}", description = "optional: the permissions the user has for the course. returned only for a single course and include[]=permissions")
  public Object getPermissions() {
    return permissions;
  }
  public void setPermissions(Object permissions) {
    this.permissions = permissions;
  }
  public Course publicDescription(String publicDescription) {
    this.publicDescription = publicDescription;
    return this;
  }

  

  /**
  * optional: the public description of the course
  * @return publicDescription
  **/
  @Schema(example = "Come one, come all to InstructureCon 2012!", description = "optional: the public description of the course")
  public String getPublicDescription() {
    return publicDescription;
  }
  public void setPublicDescription(String publicDescription) {
    this.publicDescription = publicDescription;
  }
  public Course publicSyllabus(Boolean publicSyllabus) {
    this.publicSyllabus = publicSyllabus;
    return this;
  }

  

  /**
  * Get publicSyllabus
  * @return publicSyllabus
  **/
  @Schema(example = "true", description = "")
  public Boolean isPublicSyllabus() {
    return publicSyllabus;
  }
  public void setPublicSyllabus(Boolean publicSyllabus) {
    this.publicSyllabus = publicSyllabus;
  }
  public Course publicSyllabusToAuth(Boolean publicSyllabusToAuth) {
    this.publicSyllabusToAuth = publicSyllabusToAuth;
    return this;
  }

  

  /**
  * Get publicSyllabusToAuth
  * @return publicSyllabusToAuth
  **/
  @Schema(example = "true", description = "")
  public Boolean isPublicSyllabusToAuth() {
    return publicSyllabusToAuth;
  }
  public void setPublicSyllabusToAuth(Boolean publicSyllabusToAuth) {
    this.publicSyllabusToAuth = publicSyllabusToAuth;
  }
  public Course restrictEnrollmentsToCourseDates(Boolean restrictEnrollmentsToCourseDates) {
    this.restrictEnrollmentsToCourseDates = restrictEnrollmentsToCourseDates;
    return this;
  }

  

  /**
  * Get restrictEnrollmentsToCourseDates
  * @return restrictEnrollmentsToCourseDates
  **/
  @Schema(example = "false", description = "")
  public Boolean isRestrictEnrollmentsToCourseDates() {
    return restrictEnrollmentsToCourseDates;
  }
  public void setRestrictEnrollmentsToCourseDates(Boolean restrictEnrollmentsToCourseDates) {
    this.restrictEnrollmentsToCourseDates = restrictEnrollmentsToCourseDates;
  }
  public Course rootAccountId(Integer rootAccountId) {
    this.rootAccountId = rootAccountId;
    return this;
  }

  

  /**
  * the root account associated with the course
  * @return rootAccountId
  **/
  @Schema(example = "81259", description = "the root account associated with the course")
  public Integer getRootAccountId() {
    return rootAccountId;
  }
  public void setRootAccountId(Integer rootAccountId) {
    this.rootAccountId = rootAccountId;
  }
  public Course selfEnrollment(Boolean selfEnrollment) {
    this.selfEnrollment = selfEnrollment;
    return this;
  }

  

  /**
  * Get selfEnrollment
  * @return selfEnrollment
  **/
  @Schema(example = "false", description = "")
  public Boolean isSelfEnrollment() {
    return selfEnrollment;
  }
  public void setSelfEnrollment(Boolean selfEnrollment) {
    this.selfEnrollment = selfEnrollment;
  }
  public Course sisCourseId(String sisCourseId) {
    this.sisCourseId = sisCourseId;
    return this;
  }

  

  /**
  * the SIS identifier for the course, if defined. This field is only included if the user has permission to view SIS information.
  * @return sisCourseId
  **/
  @Schema(description = "the SIS identifier for the course, if defined. This field is only included if the user has permission to view SIS information.")
  public String getSisCourseId() {
    return sisCourseId;
  }
  public void setSisCourseId(String sisCourseId) {
    this.sisCourseId = sisCourseId;
  }
  public Course sisImportId(Integer sisImportId) {
    this.sisImportId = sisImportId;
    return this;
  }

  

  /**
  * the unique identifier for the SIS import. This field is only included if the user has permission to manage SIS information.
  * @return sisImportId
  **/
  @Schema(example = "34", description = "the unique identifier for the SIS import. This field is only included if the user has permission to manage SIS information.")
  public Integer getSisImportId() {
    return sisImportId;
  }
  public void setSisImportId(Integer sisImportId) {
    this.sisImportId = sisImportId;
  }
  public Course startAt(OffsetDateTime startAt) {
    this.startAt = startAt;
    return this;
  }

  

  /**
  * the start date for the course, if applicable
  * @return startAt
  **/
  @Schema(description = "the start date for the course, if applicable")
  public OffsetDateTime getStartAt() {
    return startAt;
  }
  public void setStartAt(OffsetDateTime startAt) {
    this.startAt = startAt;
  }
  public Course storageQuotaMb(Integer storageQuotaMb) {
    this.storageQuotaMb = storageQuotaMb;
    return this;
  }

  

  /**
  * Get storageQuotaMb
  * @return storageQuotaMb
  **/
  @Schema(example = "5", description = "")
  public Integer getStorageQuotaMb() {
    return storageQuotaMb;
  }
  public void setStorageQuotaMb(Integer storageQuotaMb) {
    this.storageQuotaMb = storageQuotaMb;
  }
  public Course storageQuotaUsedMb(BigDecimal storageQuotaUsedMb) {
    this.storageQuotaUsedMb = storageQuotaUsedMb;
    return this;
  }

  

  /**
  * Get storageQuotaUsedMb
  * @return storageQuotaUsedMb
  **/
  @Schema(example = "5.0", description = "")
  public BigDecimal getStorageQuotaUsedMb() {
    return storageQuotaUsedMb;
  }
  public void setStorageQuotaUsedMb(BigDecimal storageQuotaUsedMb) {
    this.storageQuotaUsedMb = storageQuotaUsedMb;
  }
  public Course syllabusBody(String syllabusBody) {
    this.syllabusBody = syllabusBody;
    return this;
  }

  

  /**
  * optional: user-generated HTML for the course syllabus
  * @return syllabusBody
  **/
  @Schema(example = "<p>syllabus html goes here</p>", description = "optional: user-generated HTML for the course syllabus")
  public String getSyllabusBody() {
    return syllabusBody;
  }
  public void setSyllabusBody(String syllabusBody) {
    this.syllabusBody = syllabusBody;
  }
  public Course term(Term term) {
    this.term = term;
    return this;
  }

  

  /**
  * Get term
  * @return term
  **/
  @Schema(description = "")
  public Term getTerm() {
    return term;
  }
  public void setTerm(Term term) {
    this.term = term;
  }
  public Course timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  

  /**
  * The course&#x27;s IANA time zone name.
  * @return timeZone
  **/
  @Schema(example = "America/Denver", description = "The course's IANA time zone name.")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }
  public Course totalStudents(Integer totalStudents) {
    this.totalStudents = totalStudents;
    return this;
  }

  

  /**
  * optional: the total number of active and invited students in the course
  * @return totalStudents
  **/
  @Schema(example = "32", description = "optional: the total number of active and invited students in the course")
  public Integer getTotalStudents() {
    return totalStudents;
  }
  public void setTotalStudents(Integer totalStudents) {
    this.totalStudents = totalStudents;
  }
  public Course uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  

  /**
  * the UUID of the course
  * @return uuid
  **/
  @Schema(example = "WvAHhY5FINzq5IyRIJybGeiXyFkG3SqHUPb7jZY5", description = "the UUID of the course")
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }
  public Course workflowState(String workflowState) {
    this.workflowState = workflowState;
    return this;
  }

  

  /**
  * the current state of the course one of &#x27;unpublished&#x27;, &#x27;available&#x27;, &#x27;completed&#x27;, or &#x27;deleted&#x27;
  * @return workflowState
  **/
  @Schema(example = "available", description = "the current state of the course one of 'unpublished', 'available', 'completed', or 'deleted'")
  public String getWorkflowState() {
    return workflowState;
  }
  public void setWorkflowState(String workflowState) {
    this.workflowState = workflowState;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Course course = (Course) o;
    return Objects.equals(this.accessRestrictedByDate, course.accessRestrictedByDate) &&
        Objects.equals(this.accountId, course.accountId) &&
        Objects.equals(this.allowStudentAssignmentEdits, course.allowStudentAssignmentEdits) &&
        Objects.equals(this.allowStudentForumAttachments, course.allowStudentForumAttachments) &&
        Objects.equals(this.allowWikiComments, course.allowWikiComments) &&
        Objects.equals(this.applyAssignmentGroupWeights, course.applyAssignmentGroupWeights) &&
        Objects.equals(this.blueprint, course.blueprint) &&
        Objects.equals(this.blueprintRestrictions, course.blueprintRestrictions) &&
        Objects.equals(this.blueprintRestrictionsByObjectType, course.blueprintRestrictionsByObjectType) &&
        Objects.equals(this.calendar, course.calendar) &&
        Objects.equals(this.courseCode, course.courseCode) &&
        Objects.equals(this.courseFormat, course.courseFormat) &&
        Objects.equals(this.courseProgress, course.courseProgress) &&
        Objects.equals(this.createdAt, course.createdAt) &&
        Objects.equals(this.defaultView, course.defaultView) &&
        Objects.equals(this.endAt, course.endAt) &&
        Objects.equals(this.enrollmentTermId, course.enrollmentTermId) &&
        Objects.equals(this.enrollments, course.enrollments) &&
        Objects.equals(this.gradingStandardId, course.gradingStandardId) &&
        Objects.equals(this.hideFinalGrades, course.hideFinalGrades) &&
        Objects.equals(this.id, course.id) &&
        Objects.equals(this.integrationId, course.integrationId) &&
        Objects.equals(this.isPublic, course.isPublic) &&
        Objects.equals(this.isPublicToAuthUsers, course.isPublicToAuthUsers) &&
        Objects.equals(this.license, course.license) &&
        Objects.equals(this.locale, course.locale) &&
        Objects.equals(this.name, course.name) &&
        Objects.equals(this.needsGradingCount, course.needsGradingCount) &&
        Objects.equals(this.openEnrollment, course.openEnrollment) &&
        Objects.equals(this.permissions, course.permissions) &&
        Objects.equals(this.publicDescription, course.publicDescription) &&
        Objects.equals(this.publicSyllabus, course.publicSyllabus) &&
        Objects.equals(this.publicSyllabusToAuth, course.publicSyllabusToAuth) &&
        Objects.equals(this.restrictEnrollmentsToCourseDates, course.restrictEnrollmentsToCourseDates) &&
        Objects.equals(this.rootAccountId, course.rootAccountId) &&
        Objects.equals(this.selfEnrollment, course.selfEnrollment) &&
        Objects.equals(this.sisCourseId, course.sisCourseId) &&
        Objects.equals(this.sisImportId, course.sisImportId) &&
        Objects.equals(this.startAt, course.startAt) &&
        Objects.equals(this.storageQuotaMb, course.storageQuotaMb) &&
        Objects.equals(this.storageQuotaUsedMb, course.storageQuotaUsedMb) &&
        Objects.equals(this.syllabusBody, course.syllabusBody) &&
        Objects.equals(this.term, course.term) &&
        Objects.equals(this.timeZone, course.timeZone) &&
        Objects.equals(this.totalStudents, course.totalStudents) &&
        Objects.equals(this.uuid, course.uuid) &&
        Objects.equals(this.workflowState, course.workflowState);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(accessRestrictedByDate, accountId, allowStudentAssignmentEdits, allowStudentForumAttachments, allowWikiComments, applyAssignmentGroupWeights, blueprint, blueprintRestrictions, blueprintRestrictionsByObjectType, calendar, courseCode, courseFormat, courseProgress, createdAt, defaultView, endAt, enrollmentTermId, enrollments, gradingStandardId, hideFinalGrades, id, integrationId, isPublic, isPublicToAuthUsers, license, locale, name, needsGradingCount, openEnrollment, permissions, publicDescription, publicSyllabus, publicSyllabusToAuth, restrictEnrollmentsToCourseDates, rootAccountId, selfEnrollment, sisCourseId, sisImportId, startAt, storageQuotaMb, storageQuotaUsedMb, syllabusBody, term, timeZone, totalStudents, uuid, workflowState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Course {\n");
    
    sb.append("    accessRestrictedByDate: ").append(toIndentedString(accessRestrictedByDate)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    allowStudentAssignmentEdits: ").append(toIndentedString(allowStudentAssignmentEdits)).append("\n");
    sb.append("    allowStudentForumAttachments: ").append(toIndentedString(allowStudentForumAttachments)).append("\n");
    sb.append("    allowWikiComments: ").append(toIndentedString(allowWikiComments)).append("\n");
    sb.append("    applyAssignmentGroupWeights: ").append(toIndentedString(applyAssignmentGroupWeights)).append("\n");
    sb.append("    blueprint: ").append(toIndentedString(blueprint)).append("\n");
    sb.append("    blueprintRestrictions: ").append(toIndentedString(blueprintRestrictions)).append("\n");
    sb.append("    blueprintRestrictionsByObjectType: ").append(toIndentedString(blueprintRestrictionsByObjectType)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    courseCode: ").append(toIndentedString(courseCode)).append("\n");
    sb.append("    courseFormat: ").append(toIndentedString(courseFormat)).append("\n");
    sb.append("    courseProgress: ").append(toIndentedString(courseProgress)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    defaultView: ").append(toIndentedString(defaultView)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    enrollmentTermId: ").append(toIndentedString(enrollmentTermId)).append("\n");
    sb.append("    enrollments: ").append(toIndentedString(enrollments)).append("\n");
    sb.append("    gradingStandardId: ").append(toIndentedString(gradingStandardId)).append("\n");
    sb.append("    hideFinalGrades: ").append(toIndentedString(hideFinalGrades)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    isPublicToAuthUsers: ").append(toIndentedString(isPublicToAuthUsers)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    needsGradingCount: ").append(toIndentedString(needsGradingCount)).append("\n");
    sb.append("    openEnrollment: ").append(toIndentedString(openEnrollment)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    publicDescription: ").append(toIndentedString(publicDescription)).append("\n");
    sb.append("    publicSyllabus: ").append(toIndentedString(publicSyllabus)).append("\n");
    sb.append("    publicSyllabusToAuth: ").append(toIndentedString(publicSyllabusToAuth)).append("\n");
    sb.append("    restrictEnrollmentsToCourseDates: ").append(toIndentedString(restrictEnrollmentsToCourseDates)).append("\n");
    sb.append("    rootAccountId: ").append(toIndentedString(rootAccountId)).append("\n");
    sb.append("    selfEnrollment: ").append(toIndentedString(selfEnrollment)).append("\n");
    sb.append("    sisCourseId: ").append(toIndentedString(sisCourseId)).append("\n");
    sb.append("    sisImportId: ").append(toIndentedString(sisImportId)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    storageQuotaMb: ").append(toIndentedString(storageQuotaMb)).append("\n");
    sb.append("    storageQuotaUsedMb: ").append(toIndentedString(storageQuotaUsedMb)).append("\n");
    sb.append("    syllabusBody: ").append(toIndentedString(syllabusBody)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    totalStudents: ").append(toIndentedString(totalStudents)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
