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
 * PositionReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T15:33:26.956655+01:00[Europe/Berlin]", comments = "Generator version: 7.11.0")
public class PositionReport {
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

  public static final String SERIALIZED_NAME_NAVIGATIONAL_STATUS = "NavigationalStatus";
  @SerializedName(SERIALIZED_NAME_NAVIGATIONAL_STATUS)
  @javax.annotation.Nonnull
  private Integer navigationalStatus;

  public static final String SERIALIZED_NAME_RATE_OF_TURN = "RateOfTurn";
  @SerializedName(SERIALIZED_NAME_RATE_OF_TURN)
  @javax.annotation.Nonnull
  private Integer rateOfTurn;

  public static final String SERIALIZED_NAME_SOG = "Sog";
  @SerializedName(SERIALIZED_NAME_SOG)
  @javax.annotation.Nonnull
  private Double sog;

  public static final String SERIALIZED_NAME_POSITION_ACCURACY = "PositionAccuracy";
  @SerializedName(SERIALIZED_NAME_POSITION_ACCURACY)
  @javax.annotation.Nonnull
  private Boolean positionAccuracy;

  public static final String SERIALIZED_NAME_LONGITUDE = "Longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  @javax.annotation.Nonnull
  private Double longitude;

  public static final String SERIALIZED_NAME_LATITUDE = "Latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  @javax.annotation.Nonnull
  private Double latitude;

  public static final String SERIALIZED_NAME_COG = "Cog";
  @SerializedName(SERIALIZED_NAME_COG)
  @javax.annotation.Nonnull
  private Double cog;

  public static final String SERIALIZED_NAME_TRUE_HEADING = "TrueHeading";
  @SerializedName(SERIALIZED_NAME_TRUE_HEADING)
  @javax.annotation.Nonnull
  private Integer trueHeading;

  public static final String SERIALIZED_NAME_TIMESTAMP = "Timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  @javax.annotation.Nonnull
  private Integer timestamp;

  public static final String SERIALIZED_NAME_SPECIAL_MANOEUVRE_INDICATOR = "SpecialManoeuvreIndicator";
  @SerializedName(SERIALIZED_NAME_SPECIAL_MANOEUVRE_INDICATOR)
  @javax.annotation.Nonnull
  private Integer specialManoeuvreIndicator;

  public static final String SERIALIZED_NAME_SPARE = "Spare";
  @SerializedName(SERIALIZED_NAME_SPARE)
  @javax.annotation.Nonnull
  private Integer spare;

  public static final String SERIALIZED_NAME_RAIM = "Raim";
  @SerializedName(SERIALIZED_NAME_RAIM)
  @javax.annotation.Nonnull
  private Boolean raim;

  public static final String SERIALIZED_NAME_COMMUNICATION_STATE = "CommunicationState";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION_STATE)
  @javax.annotation.Nonnull
  private Integer communicationState;

  public PositionReport() {
  }

  public PositionReport messageID(@javax.annotation.Nonnull Integer messageID) {
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


  public PositionReport repeatIndicator(@javax.annotation.Nonnull Integer repeatIndicator) {
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


  public PositionReport userID(@javax.annotation.Nonnull Integer userID) {
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


  public PositionReport valid(@javax.annotation.Nonnull Boolean valid) {
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


  public PositionReport navigationalStatus(@javax.annotation.Nonnull Integer navigationalStatus) {
    this.navigationalStatus = navigationalStatus;
    return this;
  }

  /**
   * Get navigationalStatus
   * @return navigationalStatus
   */
  @javax.annotation.Nonnull
  public Integer getNavigationalStatus() {
    return navigationalStatus;
  }

  public void setNavigationalStatus(@javax.annotation.Nonnull Integer navigationalStatus) {
    this.navigationalStatus = navigationalStatus;
  }


  public PositionReport rateOfTurn(@javax.annotation.Nonnull Integer rateOfTurn) {
    this.rateOfTurn = rateOfTurn;
    return this;
  }

  /**
   * Get rateOfTurn
   * @return rateOfTurn
   */
  @javax.annotation.Nonnull
  public Integer getRateOfTurn() {
    return rateOfTurn;
  }

  public void setRateOfTurn(@javax.annotation.Nonnull Integer rateOfTurn) {
    this.rateOfTurn = rateOfTurn;
  }


  public PositionReport sog(@javax.annotation.Nonnull Double sog) {
    this.sog = sog;
    return this;
  }

  /**
   * Get sog
   * @return sog
   */
  @javax.annotation.Nonnull
  public Double getSog() {
    return sog;
  }

  public void setSog(@javax.annotation.Nonnull Double sog) {
    this.sog = sog;
  }


  public PositionReport positionAccuracy(@javax.annotation.Nonnull Boolean positionAccuracy) {
    this.positionAccuracy = positionAccuracy;
    return this;
  }

  /**
   * Get positionAccuracy
   * @return positionAccuracy
   */
  @javax.annotation.Nonnull
  public Boolean getPositionAccuracy() {
    return positionAccuracy;
  }

  public void setPositionAccuracy(@javax.annotation.Nonnull Boolean positionAccuracy) {
    this.positionAccuracy = positionAccuracy;
  }


  public PositionReport longitude(@javax.annotation.Nonnull Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  @javax.annotation.Nonnull
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(@javax.annotation.Nonnull Double longitude) {
    this.longitude = longitude;
  }


  public PositionReport latitude(@javax.annotation.Nonnull Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  @javax.annotation.Nonnull
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(@javax.annotation.Nonnull Double latitude) {
    this.latitude = latitude;
  }


  public PositionReport cog(@javax.annotation.Nonnull Double cog) {
    this.cog = cog;
    return this;
  }

  /**
   * Get cog
   * @return cog
   */
  @javax.annotation.Nonnull
  public Double getCog() {
    return cog;
  }

  public void setCog(@javax.annotation.Nonnull Double cog) {
    this.cog = cog;
  }


  public PositionReport trueHeading(@javax.annotation.Nonnull Integer trueHeading) {
    this.trueHeading = trueHeading;
    return this;
  }

  /**
   * Get trueHeading
   * @return trueHeading
   */
  @javax.annotation.Nonnull
  public Integer getTrueHeading() {
    return trueHeading;
  }

  public void setTrueHeading(@javax.annotation.Nonnull Integer trueHeading) {
    this.trueHeading = trueHeading;
  }


  public PositionReport timestamp(@javax.annotation.Nonnull Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   */
  @javax.annotation.Nonnull
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(@javax.annotation.Nonnull Integer timestamp) {
    this.timestamp = timestamp;
  }


  public PositionReport specialManoeuvreIndicator(@javax.annotation.Nonnull Integer specialManoeuvreIndicator) {
    this.specialManoeuvreIndicator = specialManoeuvreIndicator;
    return this;
  }

  /**
   * Get specialManoeuvreIndicator
   * @return specialManoeuvreIndicator
   */
  @javax.annotation.Nonnull
  public Integer getSpecialManoeuvreIndicator() {
    return specialManoeuvreIndicator;
  }

  public void setSpecialManoeuvreIndicator(@javax.annotation.Nonnull Integer specialManoeuvreIndicator) {
    this.specialManoeuvreIndicator = specialManoeuvreIndicator;
  }


  public PositionReport spare(@javax.annotation.Nonnull Integer spare) {
    this.spare = spare;
    return this;
  }

  /**
   * Get spare
   * @return spare
   */
  @javax.annotation.Nonnull
  public Integer getSpare() {
    return spare;
  }

  public void setSpare(@javax.annotation.Nonnull Integer spare) {
    this.spare = spare;
  }


  public PositionReport raim(@javax.annotation.Nonnull Boolean raim) {
    this.raim = raim;
    return this;
  }

  /**
   * Get raim
   * @return raim
   */
  @javax.annotation.Nonnull
  public Boolean getRaim() {
    return raim;
  }

  public void setRaim(@javax.annotation.Nonnull Boolean raim) {
    this.raim = raim;
  }


  public PositionReport communicationState(@javax.annotation.Nonnull Integer communicationState) {
    this.communicationState = communicationState;
    return this;
  }

  /**
   * Get communicationState
   * @return communicationState
   */
  @javax.annotation.Nonnull
  public Integer getCommunicationState() {
    return communicationState;
  }

  public void setCommunicationState(@javax.annotation.Nonnull Integer communicationState) {
    this.communicationState = communicationState;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionReport positionReport = (PositionReport) o;
    return Objects.equals(this.messageID, positionReport.messageID) &&
        Objects.equals(this.repeatIndicator, positionReport.repeatIndicator) &&
        Objects.equals(this.userID, positionReport.userID) &&
        Objects.equals(this.valid, positionReport.valid) &&
        Objects.equals(this.navigationalStatus, positionReport.navigationalStatus) &&
        Objects.equals(this.rateOfTurn, positionReport.rateOfTurn) &&
        Objects.equals(this.sog, positionReport.sog) &&
        Objects.equals(this.positionAccuracy, positionReport.positionAccuracy) &&
        Objects.equals(this.longitude, positionReport.longitude) &&
        Objects.equals(this.latitude, positionReport.latitude) &&
        Objects.equals(this.cog, positionReport.cog) &&
        Objects.equals(this.trueHeading, positionReport.trueHeading) &&
        Objects.equals(this.timestamp, positionReport.timestamp) &&
        Objects.equals(this.specialManoeuvreIndicator, positionReport.specialManoeuvreIndicator) &&
        Objects.equals(this.spare, positionReport.spare) &&
        Objects.equals(this.raim, positionReport.raim) &&
        Objects.equals(this.communicationState, positionReport.communicationState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageID, repeatIndicator, userID, valid, navigationalStatus, rateOfTurn, sog, positionAccuracy, longitude, latitude, cog, trueHeading, timestamp, specialManoeuvreIndicator, spare, raim, communicationState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionReport {\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    repeatIndicator: ").append(toIndentedString(repeatIndicator)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    navigationalStatus: ").append(toIndentedString(navigationalStatus)).append("\n");
    sb.append("    rateOfTurn: ").append(toIndentedString(rateOfTurn)).append("\n");
    sb.append("    sog: ").append(toIndentedString(sog)).append("\n");
    sb.append("    positionAccuracy: ").append(toIndentedString(positionAccuracy)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    cog: ").append(toIndentedString(cog)).append("\n");
    sb.append("    trueHeading: ").append(toIndentedString(trueHeading)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    specialManoeuvreIndicator: ").append(toIndentedString(specialManoeuvreIndicator)).append("\n");
    sb.append("    spare: ").append(toIndentedString(spare)).append("\n");
    sb.append("    raim: ").append(toIndentedString(raim)).append("\n");
    sb.append("    communicationState: ").append(toIndentedString(communicationState)).append("\n");
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
    openapiFields.add("NavigationalStatus");
    openapiFields.add("RateOfTurn");
    openapiFields.add("Sog");
    openapiFields.add("PositionAccuracy");
    openapiFields.add("Longitude");
    openapiFields.add("Latitude");
    openapiFields.add("Cog");
    openapiFields.add("TrueHeading");
    openapiFields.add("Timestamp");
    openapiFields.add("SpecialManoeuvreIndicator");
    openapiFields.add("Spare");
    openapiFields.add("Raim");
    openapiFields.add("CommunicationState");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MessageID");
    openapiRequiredFields.add("RepeatIndicator");
    openapiRequiredFields.add("UserID");
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("NavigationalStatus");
    openapiRequiredFields.add("RateOfTurn");
    openapiRequiredFields.add("Sog");
    openapiRequiredFields.add("PositionAccuracy");
    openapiRequiredFields.add("Longitude");
    openapiRequiredFields.add("Latitude");
    openapiRequiredFields.add("Cog");
    openapiRequiredFields.add("TrueHeading");
    openapiRequiredFields.add("Timestamp");
    openapiRequiredFields.add("SpecialManoeuvreIndicator");
    openapiRequiredFields.add("Spare");
    openapiRequiredFields.add("Raim");
    openapiRequiredFields.add("CommunicationState");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PositionReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PositionReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PositionReport is not found in the empty JSON string", PositionReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PositionReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PositionReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PositionReport.openapiRequiredFields) {
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
       if (!PositionReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PositionReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PositionReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PositionReport.class));

       return (TypeAdapter<T>) new TypeAdapter<PositionReport>() {
           @Override
           public void write(JsonWriter out, PositionReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PositionReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PositionReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PositionReport
   * @throws IOException if the JSON string is invalid with respect to PositionReport
   */
  public static PositionReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PositionReport.class);
  }

  /**
   * Convert an instance of PositionReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

