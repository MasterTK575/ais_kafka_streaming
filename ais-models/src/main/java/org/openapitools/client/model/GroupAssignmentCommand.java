/*
 * Ais-Stream WebsocketObjects
 * OpenAPI 3.0 definitions for the data models used by aisstream.io.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * GroupAssignmentCommand
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T15:33:26.956655+01:00[Europe/Berlin]", comments = "Generator version: 7.11.0")
public class GroupAssignmentCommand {
  public static final String SERIALIZED_NAME_MESSAGE_I_D = "MessageID";
  @SerializedName(SERIALIZED_NAME_MESSAGE_I_D)
  @javax.annotation.Nonnull
  private Integer messageID;

  public static final String SERIALIZED_NAME_REPEAT_INDICATOR = "RepeatIndicator";
  @SerializedName(SERIALIZED_NAME_REPEAT_INDICATOR)
  @javax.annotation.Nonnull
  private Integer repeatIndicator;

  public static final String SERIALIZED_NAME_USER_I_D = "UserID";
  @SerializedName(SERIALIZED_NAME_USER_I_D)
  @javax.annotation.Nonnull
  private Integer userID;

  public static final String SERIALIZED_NAME_VALID = "Valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  @javax.annotation.Nonnull
  private Boolean valid;

  public static final String SERIALIZED_NAME_SPARE1 = "Spare1";
  @SerializedName(SERIALIZED_NAME_SPARE1)
  @javax.annotation.Nonnull
  private Integer spare1;

  public static final String SERIALIZED_NAME_LONGITUDE1 = "Longitude1";
  @SerializedName(SERIALIZED_NAME_LONGITUDE1)
  @javax.annotation.Nonnull
  private Double longitude1;

  public static final String SERIALIZED_NAME_LATITUDE1 = "Latitude1";
  @SerializedName(SERIALIZED_NAME_LATITUDE1)
  @javax.annotation.Nonnull
  private Double latitude1;

  public static final String SERIALIZED_NAME_LONGITUDE2 = "Longitude2";
  @SerializedName(SERIALIZED_NAME_LONGITUDE2)
  @javax.annotation.Nonnull
  private Double longitude2;

  public static final String SERIALIZED_NAME_LATITUDE2 = "Latitude2";
  @SerializedName(SERIALIZED_NAME_LATITUDE2)
  @javax.annotation.Nonnull
  private Double latitude2;

  public static final String SERIALIZED_NAME_STATION_TYPE = "StationType";
  @SerializedName(SERIALIZED_NAME_STATION_TYPE)
  @javax.annotation.Nonnull
  private Integer stationType;

  public static final String SERIALIZED_NAME_SHIP_TYPE = "ShipType";
  @SerializedName(SERIALIZED_NAME_SHIP_TYPE)
  @javax.annotation.Nonnull
  private Integer shipType;

  public static final String SERIALIZED_NAME_SPARE2 = "Spare2";
  @SerializedName(SERIALIZED_NAME_SPARE2)
  @javax.annotation.Nonnull
  private Integer spare2;

  public static final String SERIALIZED_NAME_TX_RX_MODE = "TxRxMode";
  @SerializedName(SERIALIZED_NAME_TX_RX_MODE)
  @javax.annotation.Nonnull
  private Integer txRxMode;

  public static final String SERIALIZED_NAME_REPORTING_INTERVAL = "ReportingInterval";
  @SerializedName(SERIALIZED_NAME_REPORTING_INTERVAL)
  @javax.annotation.Nonnull
  private Integer reportingInterval;

  public static final String SERIALIZED_NAME_QUIET_TIME = "QuietTime";
  @SerializedName(SERIALIZED_NAME_QUIET_TIME)
  @javax.annotation.Nonnull
  private Integer quietTime;

  public static final String SERIALIZED_NAME_SPARE3 = "Spare3";
  @SerializedName(SERIALIZED_NAME_SPARE3)
  @javax.annotation.Nonnull
  private Integer spare3;

  public GroupAssignmentCommand() {
  }

  public GroupAssignmentCommand messageID(@javax.annotation.Nonnull Integer messageID) {
    this.messageID = messageID;
    return this;
  }

  /**
   * Get messageID
   * @return messageID
   */
  @javax.annotation.Nonnull
  public Integer getMessageID() {
    return messageID;
  }

  public void setMessageID(@javax.annotation.Nonnull Integer messageID) {
    this.messageID = messageID;
  }


  public GroupAssignmentCommand repeatIndicator(@javax.annotation.Nonnull Integer repeatIndicator) {
    this.repeatIndicator = repeatIndicator;
    return this;
  }

  /**
   * Get repeatIndicator
   * @return repeatIndicator
   */
  @javax.annotation.Nonnull
  public Integer getRepeatIndicator() {
    return repeatIndicator;
  }

  public void setRepeatIndicator(@javax.annotation.Nonnull Integer repeatIndicator) {
    this.repeatIndicator = repeatIndicator;
  }


  public GroupAssignmentCommand userID(@javax.annotation.Nonnull Integer userID) {
    this.userID = userID;
    return this;
  }

  /**
   * Get userID
   * @return userID
   */
  @javax.annotation.Nonnull
  public Integer getUserID() {
    return userID;
  }

  public void setUserID(@javax.annotation.Nonnull Integer userID) {
    this.userID = userID;
  }


  public GroupAssignmentCommand valid(@javax.annotation.Nonnull Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  @javax.annotation.Nonnull
  public Boolean getValid() {
    return valid;
  }

  public void setValid(@javax.annotation.Nonnull Boolean valid) {
    this.valid = valid;
  }


  public GroupAssignmentCommand spare1(@javax.annotation.Nonnull Integer spare1) {
    this.spare1 = spare1;
    return this;
  }

  /**
   * Get spare1
   * @return spare1
   */
  @javax.annotation.Nonnull
  public Integer getSpare1() {
    return spare1;
  }

  public void setSpare1(@javax.annotation.Nonnull Integer spare1) {
    this.spare1 = spare1;
  }


  public GroupAssignmentCommand longitude1(@javax.annotation.Nonnull Double longitude1) {
    this.longitude1 = longitude1;
    return this;
  }

  /**
   * Get longitude1
   * @return longitude1
   */
  @javax.annotation.Nonnull
  public Double getLongitude1() {
    return longitude1;
  }

  public void setLongitude1(@javax.annotation.Nonnull Double longitude1) {
    this.longitude1 = longitude1;
  }


  public GroupAssignmentCommand latitude1(@javax.annotation.Nonnull Double latitude1) {
    this.latitude1 = latitude1;
    return this;
  }

  /**
   * Get latitude1
   * @return latitude1
   */
  @javax.annotation.Nonnull
  public Double getLatitude1() {
    return latitude1;
  }

  public void setLatitude1(@javax.annotation.Nonnull Double latitude1) {
    this.latitude1 = latitude1;
  }


  public GroupAssignmentCommand longitude2(@javax.annotation.Nonnull Double longitude2) {
    this.longitude2 = longitude2;
    return this;
  }

  /**
   * Get longitude2
   * @return longitude2
   */
  @javax.annotation.Nonnull
  public Double getLongitude2() {
    return longitude2;
  }

  public void setLongitude2(@javax.annotation.Nonnull Double longitude2) {
    this.longitude2 = longitude2;
  }


  public GroupAssignmentCommand latitude2(@javax.annotation.Nonnull Double latitude2) {
    this.latitude2 = latitude2;
    return this;
  }

  /**
   * Get latitude2
   * @return latitude2
   */
  @javax.annotation.Nonnull
  public Double getLatitude2() {
    return latitude2;
  }

  public void setLatitude2(@javax.annotation.Nonnull Double latitude2) {
    this.latitude2 = latitude2;
  }


  public GroupAssignmentCommand stationType(@javax.annotation.Nonnull Integer stationType) {
    this.stationType = stationType;
    return this;
  }

  /**
   * Get stationType
   * @return stationType
   */
  @javax.annotation.Nonnull
  public Integer getStationType() {
    return stationType;
  }

  public void setStationType(@javax.annotation.Nonnull Integer stationType) {
    this.stationType = stationType;
  }


  public GroupAssignmentCommand shipType(@javax.annotation.Nonnull Integer shipType) {
    this.shipType = shipType;
    return this;
  }

  /**
   * Get shipType
   * @return shipType
   */
  @javax.annotation.Nonnull
  public Integer getShipType() {
    return shipType;
  }

  public void setShipType(@javax.annotation.Nonnull Integer shipType) {
    this.shipType = shipType;
  }


  public GroupAssignmentCommand spare2(@javax.annotation.Nonnull Integer spare2) {
    this.spare2 = spare2;
    return this;
  }

  /**
   * Get spare2
   * @return spare2
   */
  @javax.annotation.Nonnull
  public Integer getSpare2() {
    return spare2;
  }

  public void setSpare2(@javax.annotation.Nonnull Integer spare2) {
    this.spare2 = spare2;
  }


  public GroupAssignmentCommand txRxMode(@javax.annotation.Nonnull Integer txRxMode) {
    this.txRxMode = txRxMode;
    return this;
  }

  /**
   * Get txRxMode
   * @return txRxMode
   */
  @javax.annotation.Nonnull
  public Integer getTxRxMode() {
    return txRxMode;
  }

  public void setTxRxMode(@javax.annotation.Nonnull Integer txRxMode) {
    this.txRxMode = txRxMode;
  }


  public GroupAssignmentCommand reportingInterval(@javax.annotation.Nonnull Integer reportingInterval) {
    this.reportingInterval = reportingInterval;
    return this;
  }

  /**
   * Get reportingInterval
   * @return reportingInterval
   */
  @javax.annotation.Nonnull
  public Integer getReportingInterval() {
    return reportingInterval;
  }

  public void setReportingInterval(@javax.annotation.Nonnull Integer reportingInterval) {
    this.reportingInterval = reportingInterval;
  }


  public GroupAssignmentCommand quietTime(@javax.annotation.Nonnull Integer quietTime) {
    this.quietTime = quietTime;
    return this;
  }

  /**
   * Get quietTime
   * @return quietTime
   */
  @javax.annotation.Nonnull
  public Integer getQuietTime() {
    return quietTime;
  }

  public void setQuietTime(@javax.annotation.Nonnull Integer quietTime) {
    this.quietTime = quietTime;
  }


  public GroupAssignmentCommand spare3(@javax.annotation.Nonnull Integer spare3) {
    this.spare3 = spare3;
    return this;
  }

  /**
   * Get spare3
   * @return spare3
   */
  @javax.annotation.Nonnull
  public Integer getSpare3() {
    return spare3;
  }

  public void setSpare3(@javax.annotation.Nonnull Integer spare3) {
    this.spare3 = spare3;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupAssignmentCommand groupAssignmentCommand = (GroupAssignmentCommand) o;
    return Objects.equals(this.messageID, groupAssignmentCommand.messageID) &&
        Objects.equals(this.repeatIndicator, groupAssignmentCommand.repeatIndicator) &&
        Objects.equals(this.userID, groupAssignmentCommand.userID) &&
        Objects.equals(this.valid, groupAssignmentCommand.valid) &&
        Objects.equals(this.spare1, groupAssignmentCommand.spare1) &&
        Objects.equals(this.longitude1, groupAssignmentCommand.longitude1) &&
        Objects.equals(this.latitude1, groupAssignmentCommand.latitude1) &&
        Objects.equals(this.longitude2, groupAssignmentCommand.longitude2) &&
        Objects.equals(this.latitude2, groupAssignmentCommand.latitude2) &&
        Objects.equals(this.stationType, groupAssignmentCommand.stationType) &&
        Objects.equals(this.shipType, groupAssignmentCommand.shipType) &&
        Objects.equals(this.spare2, groupAssignmentCommand.spare2) &&
        Objects.equals(this.txRxMode, groupAssignmentCommand.txRxMode) &&
        Objects.equals(this.reportingInterval, groupAssignmentCommand.reportingInterval) &&
        Objects.equals(this.quietTime, groupAssignmentCommand.quietTime) &&
        Objects.equals(this.spare3, groupAssignmentCommand.spare3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageID, repeatIndicator, userID, valid, spare1, longitude1, latitude1, longitude2, latitude2, stationType, shipType, spare2, txRxMode, reportingInterval, quietTime, spare3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupAssignmentCommand {\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    repeatIndicator: ").append(toIndentedString(repeatIndicator)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    spare1: ").append(toIndentedString(spare1)).append("\n");
    sb.append("    longitude1: ").append(toIndentedString(longitude1)).append("\n");
    sb.append("    latitude1: ").append(toIndentedString(latitude1)).append("\n");
    sb.append("    longitude2: ").append(toIndentedString(longitude2)).append("\n");
    sb.append("    latitude2: ").append(toIndentedString(latitude2)).append("\n");
    sb.append("    stationType: ").append(toIndentedString(stationType)).append("\n");
    sb.append("    shipType: ").append(toIndentedString(shipType)).append("\n");
    sb.append("    spare2: ").append(toIndentedString(spare2)).append("\n");
    sb.append("    txRxMode: ").append(toIndentedString(txRxMode)).append("\n");
    sb.append("    reportingInterval: ").append(toIndentedString(reportingInterval)).append("\n");
    sb.append("    quietTime: ").append(toIndentedString(quietTime)).append("\n");
    sb.append("    spare3: ").append(toIndentedString(spare3)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("MessageID");
    openapiFields.add("RepeatIndicator");
    openapiFields.add("UserID");
    openapiFields.add("Valid");
    openapiFields.add("Spare1");
    openapiFields.add("Longitude1");
    openapiFields.add("Latitude1");
    openapiFields.add("Longitude2");
    openapiFields.add("Latitude2");
    openapiFields.add("StationType");
    openapiFields.add("ShipType");
    openapiFields.add("Spare2");
    openapiFields.add("TxRxMode");
    openapiFields.add("ReportingInterval");
    openapiFields.add("QuietTime");
    openapiFields.add("Spare3");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MessageID");
    openapiRequiredFields.add("RepeatIndicator");
    openapiRequiredFields.add("UserID");
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("Spare1");
    openapiRequiredFields.add("Longitude1");
    openapiRequiredFields.add("Latitude1");
    openapiRequiredFields.add("Longitude2");
    openapiRequiredFields.add("Latitude2");
    openapiRequiredFields.add("StationType");
    openapiRequiredFields.add("ShipType");
    openapiRequiredFields.add("Spare2");
    openapiRequiredFields.add("TxRxMode");
    openapiRequiredFields.add("ReportingInterval");
    openapiRequiredFields.add("QuietTime");
    openapiRequiredFields.add("Spare3");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GroupAssignmentCommand
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupAssignmentCommand.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupAssignmentCommand is not found in the empty JSON string", GroupAssignmentCommand.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GroupAssignmentCommand.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupAssignmentCommand` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupAssignmentCommand.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupAssignmentCommand.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupAssignmentCommand' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupAssignmentCommand> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupAssignmentCommand.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupAssignmentCommand>() {
           @Override
           public void write(JsonWriter out, GroupAssignmentCommand value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupAssignmentCommand read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GroupAssignmentCommand given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GroupAssignmentCommand
   * @throws IOException if the JSON string is invalid with respect to GroupAssignmentCommand
   */
  public static GroupAssignmentCommand fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupAssignmentCommand.class);
  }

  /**
   * Convert an instance of GroupAssignmentCommand to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

