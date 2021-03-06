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
import com.instructure.canvas.model.ConversationParticipant;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Conversation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class Conversation {

  @JsonProperty("audience")

  private List<Integer> audience = null;

  @JsonProperty("audience_contexts")

  private List<String> audienceContexts = null;

  @JsonProperty("avatar_url")

  private String avatarUrl = null;

  @JsonProperty("context_name")

  private String contextName = null;

  @JsonProperty("id")

  private Long id = null;

  @JsonProperty("last_message")

  private String lastMessage = null;

  @JsonProperty("message_count")

  private Integer messageCount = null;

  @JsonProperty("participants")

  private List<ConversationParticipant> participants = null;

  @JsonProperty("private")

  private Boolean _private = null;

  @JsonProperty("properties")

  private List<String> properties = null;

  @JsonProperty("starred")

  private Boolean starred = null;

  @JsonProperty("start_at")

  private OffsetDateTime startAt = null;

  @JsonProperty("subject")

  private String subject = null;

  @JsonProperty("subscribed")

  private Boolean subscribed = null;

  @JsonProperty("visible")

  private Boolean visible = null;

  @JsonProperty("workflow_state")

  private String workflowState = null;
  public Conversation audience(List<Integer> audience) {
    this.audience = audience;
    return this;
  }

  public Conversation addAudienceItem(Integer audienceItem) {
    if (this.audience == null) {
      this.audience = new ArrayList<Integer>();
    }
    this.audience.add(audienceItem);
    return this;
  }

  /**
  * Array of user ids who are involved in the conversation, ordered by participation level, then alphabetical. Excludes current user, unless this is a monologue.
  * @return audience
  **/
  @Schema(description = "Array of user ids who are involved in the conversation, ordered by participation level, then alphabetical. Excludes current user, unless this is a monologue.")
  public List<Integer> getAudience() {
    return audience;
  }
  public void setAudience(List<Integer> audience) {
    this.audience = audience;
  }
  public Conversation audienceContexts(List<String> audienceContexts) {
    this.audienceContexts = audienceContexts;
    return this;
  }

  public Conversation addAudienceContextsItem(String audienceContextsItem) {
    if (this.audienceContexts == null) {
      this.audienceContexts = new ArrayList<String>();
    }
    this.audienceContexts.add(audienceContextsItem);
    return this;
  }

  /**
  * Most relevant shared contexts (courses and groups) between current user and other participants. If there is only one participant, it will also include that user&#x27;s enrollment(s)/ membership type(s) in each course/group.
  * @return audienceContexts
  **/
  @Schema(description = "Most relevant shared contexts (courses and groups) between current user and other participants. If there is only one participant, it will also include that user's enrollment(s)/ membership type(s) in each course/group.")
  public List<String> getAudienceContexts() {
    return audienceContexts;
  }
  public void setAudienceContexts(List<String> audienceContexts) {
    this.audienceContexts = audienceContexts;
  }
  public Conversation avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  

  /**
  * URL to appropriate icon for this conversation (custom, individual or group avatar, depending on audience).
  * @return avatarUrl
  **/
  @Schema(example = "https://canvas.instructure.com/images/messages/avatar-group-50.png", description = "URL to appropriate icon for this conversation (custom, individual or group avatar, depending on audience).")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }
  public Conversation contextName(String contextName) {
    this.contextName = contextName;
    return this;
  }

  

  /**
  * Name of the course or group in which the conversation is occurring.
  * @return contextName
  **/
  @Schema(example = "Canvas 101", description = "Name of the course or group in which the conversation is occurring.")
  public String getContextName() {
    return contextName;
  }
  public void setContextName(String contextName) {
    this.contextName = contextName;
  }
  public Conversation id(Long id) {
    this.id = id;
    return this;
  }

  

  /**
  * the unique identifier for the conversation.
  * @return id
  **/
  @Schema(example = "2", description = "the unique identifier for the conversation.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public Conversation lastMessage(String lastMessage) {
    this.lastMessage = lastMessage;
    return this;
  }

  

  /**
  * A &lt;&#x3D;100 character preview from the most recent message.
  * @return lastMessage
  **/
  @Schema(example = "sure thing, here's the file", description = "A <=100 character preview from the most recent message.")
  public String getLastMessage() {
    return lastMessage;
  }
  public void setLastMessage(String lastMessage) {
    this.lastMessage = lastMessage;
  }
  public Conversation messageCount(Integer messageCount) {
    this.messageCount = messageCount;
    return this;
  }

  

  /**
  * the number of messages in the conversation.
  * @return messageCount
  **/
  @Schema(example = "2", description = "the number of messages in the conversation.")
  public Integer getMessageCount() {
    return messageCount;
  }
  public void setMessageCount(Integer messageCount) {
    this.messageCount = messageCount;
  }
  public Conversation participants(List<ConversationParticipant> participants) {
    this.participants = participants;
    return this;
  }

  public Conversation addParticipantsItem(ConversationParticipant participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<ConversationParticipant>();
    }
    this.participants.add(participantsItem);
    return this;
  }

  /**
  * Array of users participating in the conversation. Includes current user.
  * @return participants
  **/
  @Schema(description = "Array of users participating in the conversation. Includes current user.")
  public List<ConversationParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<ConversationParticipant> participants) {
    this.participants = participants;
  }
  public Conversation _private(Boolean _private) {
    this._private = _private;
    return this;
  }

  

  /**
  * whether the conversation is private.
  * @return _private
  **/
  @Schema(example = "true", description = "whether the conversation is private.")
  public Boolean isPrivate() {
    return _private;
  }
  public void setPrivate(Boolean _private) {
    this._private = _private;
  }
  public Conversation properties(List<String> properties) {
    this.properties = properties;
    return this;
  }

  public Conversation addPropertiesItem(String propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<String>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
  * Additional conversation flags (last_author, attachments, media_objects). Each listed property means the flag is set to true (i.e. the current user is the most recent author, there are attachments, or there are media objects)
  * @return properties
  **/
  @Schema(description = "Additional conversation flags (last_author, attachments, media_objects). Each listed property means the flag is set to true (i.e. the current user is the most recent author, there are attachments, or there are media objects)")
  public List<String> getProperties() {
    return properties;
  }
  public void setProperties(List<String> properties) {
    this.properties = properties;
  }
  public Conversation starred(Boolean starred) {
    this.starred = starred;
    return this;
  }

  

  /**
  * whether the conversation is starred.
  * @return starred
  **/
  @Schema(example = "true", description = "whether the conversation is starred.")
  public Boolean isStarred() {
    return starred;
  }
  public void setStarred(Boolean starred) {
    this.starred = starred;
  }
  public Conversation startAt(OffsetDateTime startAt) {
    this.startAt = startAt;
    return this;
  }

  

  /**
  * the date and time at which the last message was sent.
  * @return startAt
  **/
  @Schema(description = "the date and time at which the last message was sent.")
  public OffsetDateTime getStartAt() {
    return startAt;
  }
  public void setStartAt(OffsetDateTime startAt) {
    this.startAt = startAt;
  }
  public Conversation subject(String subject) {
    this.subject = subject;
    return this;
  }

  

  /**
  * the subject of the conversation.
  * @return subject
  **/
  @Schema(example = "2", description = "the subject of the conversation.")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }
  public Conversation subscribed(Boolean subscribed) {
    this.subscribed = subscribed;
    return this;
  }

  

  /**
  * whether the current user is subscribed to the conversation.
  * @return subscribed
  **/
  @Schema(example = "true", description = "whether the current user is subscribed to the conversation.")
  public Boolean isSubscribed() {
    return subscribed;
  }
  public void setSubscribed(Boolean subscribed) {
    this.subscribed = subscribed;
  }
  public Conversation visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

  

  /**
  * indicates whether the conversation is visible under the current scope and filter. This attribute is always true in the index API response, and is primarily useful in create/update responses so that you can know if the record should be displayed in the UI. The default scope is assumed, unless a scope or filter is passed to the create/update API call.
  * @return visible
  **/
  @Schema(example = "true", description = "indicates whether the conversation is visible under the current scope and filter. This attribute is always true in the index API response, and is primarily useful in create/update responses so that you can know if the record should be displayed in the UI. The default scope is assumed, unless a scope or filter is passed to the create/update API call.")
  public Boolean isVisible() {
    return visible;
  }
  public void setVisible(Boolean visible) {
    this.visible = visible;
  }
  public Conversation workflowState(String workflowState) {
    this.workflowState = workflowState;
    return this;
  }

  

  /**
  * The current state of the conversation (read, unread or archived).
  * @return workflowState
  **/
  @Schema(example = "unread", description = "The current state of the conversation (read, unread or archived).")
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
    Conversation conversation = (Conversation) o;
    return Objects.equals(this.audience, conversation.audience) &&
        Objects.equals(this.audienceContexts, conversation.audienceContexts) &&
        Objects.equals(this.avatarUrl, conversation.avatarUrl) &&
        Objects.equals(this.contextName, conversation.contextName) &&
        Objects.equals(this.id, conversation.id) &&
        Objects.equals(this.lastMessage, conversation.lastMessage) &&
        Objects.equals(this.messageCount, conversation.messageCount) &&
        Objects.equals(this.participants, conversation.participants) &&
        Objects.equals(this._private, conversation._private) &&
        Objects.equals(this.properties, conversation.properties) &&
        Objects.equals(this.starred, conversation.starred) &&
        Objects.equals(this.startAt, conversation.startAt) &&
        Objects.equals(this.subject, conversation.subject) &&
        Objects.equals(this.subscribed, conversation.subscribed) &&
        Objects.equals(this.visible, conversation.visible) &&
        Objects.equals(this.workflowState, conversation.workflowState);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(audience, audienceContexts, avatarUrl, contextName, id, lastMessage, messageCount, participants, _private, properties, starred, startAt, subject, subscribed, visible, workflowState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conversation {\n");
    
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    audienceContexts: ").append(toIndentedString(audienceContexts)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    contextName: ").append(toIndentedString(contextName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastMessage: ").append(toIndentedString(lastMessage)).append("\n");
    sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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
