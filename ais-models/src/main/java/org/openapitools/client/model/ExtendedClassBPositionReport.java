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
import org.openapitools.client.model.ShipStaticDataDimension;

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
 * ExtendedClassBPositionReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T15:33:26.956655+01:00[Europe/Berlin]", comments = "Generator version: 7.11.0")
public class ExtendedClassBPositionReport {
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

  public static final String SERIALIZED_NAME_SPARE2 = "Spare2";
  @SerializedName(SERIALIZED_NAME_SPARE2)
  @javax.annotation.Nonnull
  private Integer spare2;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private Integer type;

  public static final String SERIALIZED_NAME_DIMENSION = "Dimension";
  @SerializedName(SERIALIZED_NAME_DIMENSION)
  @javax.annotation.Nonnull
  private ShipStaticDataDimension dimension;

  public static final String SERIALIZED_NAME_FIX_TYPE = "FixType";
  @SerializedName(SERIALIZED_NAME_FIX_TYPE)
  @javax.annotation.Nonnull
  private Integer fixType;

  public static final String SERIALIZED_NAME_RAIM = "Raim";
  @SerializedName(SERIALIZED_NAME_RAIM)
  @javax.annotation.Nonnull
  private Boolean raim;

  public static final String SERIALIZED_NAME_DTE = "Dte";
  @SerializedName(SERIALIZED_NAME_DTE)
  @javax.annotation.Nonnull
  private Boolean dte;

  public static final String SERIALIZED_NAME_ASSIGNED_MODE = "AssignedMode";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_MODE)
  @javax.annotation.Nonnull
  private Boolean assignedMode;

  public static final String SERIALIZED_NAME_SPARE3 = "Spare3";
  @SerializedName(SERIALIZED_NAME_SPARE3)
  @javax.annotation.Nonnull
  private Integer spare3;

  public ExtendedClassBPositionReport() {
  }

  public ExtendedClassBPositionReport messageID(@javax.annotation.Nonnull Integer messageID) {
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


  public ExtendedClassBPositionReport repeatIndicator(@javax.annotation.Nonnull Integer repeatIndicator) {
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


  public ExtendedClassBPositionReport userID(@javax.annotation.Nonnull Integer userID) {
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


  public ExtendedClassBPositionReport valid(@javax.annotation.Nonnull Boolean valid) {
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


  public ExtendedClassBPositionReport spare1(@javax.annotation.Nonnull Integer spare1) {
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


  public ExtendedClassBPositionReport sog(@javax.annotation.Nonnull Double sog) {
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


  public ExtendedClassBPositionReport positionAccuracy(@javax.annotation.Nonnull Boolean positionAccuracy) {
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


  public ExtendedClassBPositionReport longitude(@javax.annotation.Nonnull Double longitude) {
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


  public ExtendedClassBPositionReport latitude(@javax.annotation.Nonnull Double latitude) {
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


  public ExtendedClassBPositionReport cog(@javax.annotation.Nonnull Double cog) {
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


  public ExtendedClassBPositionReport trueHeading(@javax.annotation.Nonnull Integer trueHeading) {
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


  public ExtendedClassBPositionReport timestamp(@javax.annotation.Nonnull Integer timestamp) {
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


  public ExtendedClassBPositionReport spare2(@javax.annotation.Nonnull Integer spare2) {
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


  public ExtendedClassBPositionReport name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public ExtendedClassBPositionReport type(@javax.annotation.Nonnull Integer type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public Integer getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull Integer type) {
    this.type = type;
  }


  public ExtendedClassBPositionReport dimension(@javax.annotation.Nonnull ShipStaticDataDimension dimension) {
    this.dimension = dimension;
    return this;
  }

  /**
   * Get dimension
   * @return dimension
   */
  @javax.annotation.Nonnull
  public ShipStaticDataDimension getDimension() {
    return dimension;
  }

  public void setDimension(@javax.annotation.Nonnull ShipStaticDataDimension dimension) {
    this.dimension = dimension;
  }


  public ExtendedClassBPositionReport fixType(@javax.annotation.Nonnull Integer fixType) {
    this.fixType = fixType;
    return this;
  }

  /**
   * Get fixType
   * @return fixType
   */
  @javax.annotation.Nonnull
  public Integer getFixType() {
    return fixType;
  }

  public void setFixType(@javax.annotation.Nonnull Integer fixType) {
    this.fixType = fixType;
  }


  public ExtendedClassBPositionReport raim(@javax.annotation.Nonnull Boolean raim) {
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


  public ExtendedClassBPositionReport dte(@javax.annotation.Nonnull Boolean dte) {
    this.dte = dte;
    return this;
  }

  /**
   * Get dte
   * @return dte
   */
  @javax.annotation.Nonnull
  public Boolean getDte() {
    return dte;
  }

  public void setDte(@javax.annotation.Nonnull Boolean dte) {
    this.dte = dte;
  }


  public ExtendedClassBPositionReport assignedMode(@javax.annotation.Nonnull Boolean assignedMode) {
    this.assignedMode = assignedMode;
    return this;
  }

  /**
   * Get assignedMode
   * @return assignedMode
   */
  @javax.annotation.Nonnull
  public Boolean getAssignedMode() {
    return assignedMode;
  }

  public void setAssignedMode(@javax.annotation.Nonnull Boolean assignedMode) {
    this.assignedMode = assignedMode;
  }


  public ExtendedClassBPositionReport spare3(@javax.annotation.Nonnull Integer spare3) {
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
    ExtendedClassBPositionReport extendedClassBPositionReport = (ExtendedClassBPositionReport) o;
    return Objects.equals(this.messageID, extendedClassBPositionReport.messageID) &&
        Objects.equals(this.repeatIndicator, extendedClassBPositionReport.repeatIndicator) &&
        Objects.equals(this.userID, extendedClassBPositionReport.userID) &&
        Objects.equals(this.valid, extendedClassBPositionReport.valid) &&
        Objects.equals(this.spare1, extendedClassBPositionReport.spare1) &&
        Objects.equals(this.sog, extendedClassBPositionReport.sog) &&
        Objects.equals(this.positionAccuracy, extendedClassBPositionReport.positionAccuracy) &&
        Objects.equals(this.longitude, extendedClassBPositionReport.longitude) &&
        Objects.equals(this.latitude, extendedClassBPositionReport.latitude) &&
        Objects.equals(this.cog, extendedClassBPositionReport.cog) &&
        Objects.equals(this.trueHeading, extendedClassBPositionReport.trueHeading) &&
        Objects.equals(this.timestamp, extendedClassBPositionReport.timestamp) &&
        Objects.equals(this.spare2, extendedClassBPositionReport.spare2) &&
        Objects.equals(this.name, extendedClassBPositionReport.name) &&
        Objects.equals(this.type, extendedClassBPositionReport.type) &&
        Objects.equals(this.dimension, extendedClassBPositionReport.dimension) &&
        Objects.equals(this.fixType, extendedClassBPositionReport.fixType) &&
        Objects.equals(this.raim, extendedClassBPositionReport.raim) &&
        Objects.equals(this.dte, extendedClassBPositionReport.dte) &&
        Objects.equals(this.assignedMode, extendedClassBPositionReport.assignedMode) &&
        Objects.equals(this.spare3, extendedClassBPositionReport.spare3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageID, repeatIndicator, userID, valid, spare1, sog, positionAccuracy, longitude, latitude, cog, trueHeading, timestamp, spare2, name, type, dimension, fixType, raim, dte, assignedMode, spare3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedClassBPositionReport {\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    repeatIndicator: ").append(toIndentedString(repeatIndicator)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    spare1: ").append(toIndentedString(spare1)).append("\n");
    sb.append("    sog: ").append(toIndentedString(sog)).append("\n");
    sb.append("    positionAccuracy: ").append(toIndentedString(positionAccuracy)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    cog: ").append(toIndentedString(cog)).append("\n");
    sb.append("    trueHeading: ").append(toIndentedString(trueHeading)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    spare2: ").append(toIndentedString(spare2)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    fixType: ").append(toIndentedString(fixType)).append("\n");
    sb.append("    raim: ").append(toIndentedString(raim)).append("\n");
    sb.append("    dte: ").append(toIndentedString(dte)).append("\n");
    sb.append("    assignedMode: ").append(toIndentedString(assignedMode)).append("\n");
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
    openapiFields.add("Sog");
    openapiFields.add("PositionAccuracy");
    openapiFields.add("Longitude");
    openapiFields.add("Latitude");
    openapiFields.add("Cog");
    openapiFields.add("TrueHeading");
    openapiFields.add("Timestamp");
    openapiFields.add("Spare2");
    openapiFields.add("Name");
    openapiFields.add("Type");
    openapiFields.add("Dimension");
    openapiFields.add("FixType");
    openapiFields.add("Raim");
    openapiFields.add("Dte");
    openapiFields.add("AssignedMode");
    openapiFields.add("Spare3");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MessageID");
    openapiRequiredFields.add("RepeatIndicator");
    openapiRequiredFields.add("UserID");
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("Spare1");
    openapiRequiredFields.add("Sog");
    openapiRequiredFields.add("PositionAccuracy");
    openapiRequiredFields.add("Longitude");
    openapiRequiredFields.add("Latitude");
    openapiRequiredFields.add("Cog");
    openapiRequiredFields.add("TrueHeading");
    openapiRequiredFields.add("Timestamp");
    openapiRequiredFields.add("Spare2");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("Type");
    openapiRequiredFields.add("Dimension");
    openapiRequiredFields.add("FixType");
    openapiRequiredFields.add("Raim");
    openapiRequiredFields.add("Dte");
    openapiRequiredFields.add("AssignedMode");
    openapiRequiredFields.add("Spare3");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ExtendedClassBPositionReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExtendedClassBPositionReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExtendedClassBPositionReport is not found in the empty JSON string", ExtendedClassBPositionReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExtendedClassBPositionReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExtendedClassBPositionReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExtendedClassBPositionReport.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // validate the required field `Dimension`
      ShipStaticDataDimension.validateJsonElement(jsonObj.get("Dimension"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExtendedClassBPositionReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExtendedClassBPositionReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExtendedClassBPositionReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExtendedClassBPositionReport.class));

       return (TypeAdapter<T>) new TypeAdapter<ExtendedClassBPositionReport>() {
           @Override
           public void write(JsonWriter out, ExtendedClassBPositionReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExtendedClassBPositionReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ExtendedClassBPositionReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExtendedClassBPositionReport
   * @throws IOException if the JSON string is invalid with respect to ExtendedClassBPositionReport
   */
  public static ExtendedClassBPositionReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExtendedClassBPositionReport.class);
  }

  /**
   * Convert an instance of ExtendedClassBPositionReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

