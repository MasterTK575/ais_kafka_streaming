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
 * AidsToNavigationReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T15:33:26.956655+01:00[Europe/Berlin]", comments = "Generator version: 7.11.0")
public class AidsToNavigationReport {
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

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private Integer type;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

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

  public static final String SERIALIZED_NAME_DIMENSION = "Dimension";
  @SerializedName(SERIALIZED_NAME_DIMENSION)
  @javax.annotation.Nonnull
  private ShipStaticDataDimension dimension;

  public static final String SERIALIZED_NAME_FIXTYPE = "Fixtype";
  @SerializedName(SERIALIZED_NAME_FIXTYPE)
  @javax.annotation.Nonnull
  private Integer fixtype;

  public static final String SERIALIZED_NAME_TIMESTAMP = "Timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  @javax.annotation.Nonnull
  private Integer timestamp;

  public static final String SERIALIZED_NAME_OFF_POSITION = "OffPosition";
  @SerializedName(SERIALIZED_NAME_OFF_POSITION)
  @javax.annotation.Nonnull
  private Boolean offPosition;

  public static final String SERIALIZED_NAME_ATO_N = "AtoN";
  @SerializedName(SERIALIZED_NAME_ATO_N)
  @javax.annotation.Nonnull
  private Integer atoN;

  public static final String SERIALIZED_NAME_RAIM = "Raim";
  @SerializedName(SERIALIZED_NAME_RAIM)
  @javax.annotation.Nonnull
  private Boolean raim;

  public static final String SERIALIZED_NAME_VIRTUAL_ATO_N = "VirtualAtoN";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_ATO_N)
  @javax.annotation.Nonnull
  private Boolean virtualAtoN;

  public static final String SERIALIZED_NAME_ASSIGNED_MODE = "AssignedMode";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_MODE)
  @javax.annotation.Nonnull
  private Boolean assignedMode;

  public static final String SERIALIZED_NAME_SPARE = "Spare";
  @SerializedName(SERIALIZED_NAME_SPARE)
  @javax.annotation.Nonnull
  private Boolean spare;

  public static final String SERIALIZED_NAME_NAME_EXTENSION = "NameExtension";
  @SerializedName(SERIALIZED_NAME_NAME_EXTENSION)
  @javax.annotation.Nonnull
  private String nameExtension;

  public AidsToNavigationReport() {
  }

  public AidsToNavigationReport messageID(@javax.annotation.Nonnull Integer messageID) {
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


  public AidsToNavigationReport repeatIndicator(@javax.annotation.Nonnull Integer repeatIndicator) {
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


  public AidsToNavigationReport userID(@javax.annotation.Nonnull Integer userID) {
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


  public AidsToNavigationReport valid(@javax.annotation.Nonnull Boolean valid) {
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


  public AidsToNavigationReport type(@javax.annotation.Nonnull Integer type) {
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


  public AidsToNavigationReport name(@javax.annotation.Nonnull String name) {
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


  public AidsToNavigationReport positionAccuracy(@javax.annotation.Nonnull Boolean positionAccuracy) {
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


  public AidsToNavigationReport longitude(@javax.annotation.Nonnull Double longitude) {
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


  public AidsToNavigationReport latitude(@javax.annotation.Nonnull Double latitude) {
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


  public AidsToNavigationReport dimension(@javax.annotation.Nonnull ShipStaticDataDimension dimension) {
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


  public AidsToNavigationReport fixtype(@javax.annotation.Nonnull Integer fixtype) {
    this.fixtype = fixtype;
    return this;
  }

  /**
   * Get fixtype
   * @return fixtype
   */
  @javax.annotation.Nonnull
  public Integer getFixtype() {
    return fixtype;
  }

  public void setFixtype(@javax.annotation.Nonnull Integer fixtype) {
    this.fixtype = fixtype;
  }


  public AidsToNavigationReport timestamp(@javax.annotation.Nonnull Integer timestamp) {
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


  public AidsToNavigationReport offPosition(@javax.annotation.Nonnull Boolean offPosition) {
    this.offPosition = offPosition;
    return this;
  }

  /**
   * Get offPosition
   * @return offPosition
   */
  @javax.annotation.Nonnull
  public Boolean getOffPosition() {
    return offPosition;
  }

  public void setOffPosition(@javax.annotation.Nonnull Boolean offPosition) {
    this.offPosition = offPosition;
  }


  public AidsToNavigationReport atoN(@javax.annotation.Nonnull Integer atoN) {
    this.atoN = atoN;
    return this;
  }

  /**
   * Get atoN
   * @return atoN
   */
  @javax.annotation.Nonnull
  public Integer getAtoN() {
    return atoN;
  }

  public void setAtoN(@javax.annotation.Nonnull Integer atoN) {
    this.atoN = atoN;
  }


  public AidsToNavigationReport raim(@javax.annotation.Nonnull Boolean raim) {
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


  public AidsToNavigationReport virtualAtoN(@javax.annotation.Nonnull Boolean virtualAtoN) {
    this.virtualAtoN = virtualAtoN;
    return this;
  }

  /**
   * Get virtualAtoN
   * @return virtualAtoN
   */
  @javax.annotation.Nonnull
  public Boolean getVirtualAtoN() {
    return virtualAtoN;
  }

  public void setVirtualAtoN(@javax.annotation.Nonnull Boolean virtualAtoN) {
    this.virtualAtoN = virtualAtoN;
  }


  public AidsToNavigationReport assignedMode(@javax.annotation.Nonnull Boolean assignedMode) {
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


  public AidsToNavigationReport spare(@javax.annotation.Nonnull Boolean spare) {
    this.spare = spare;
    return this;
  }

  /**
   * Get spare
   * @return spare
   */
  @javax.annotation.Nonnull
  public Boolean getSpare() {
    return spare;
  }

  public void setSpare(@javax.annotation.Nonnull Boolean spare) {
    this.spare = spare;
  }


  public AidsToNavigationReport nameExtension(@javax.annotation.Nonnull String nameExtension) {
    this.nameExtension = nameExtension;
    return this;
  }

  /**
   * Get nameExtension
   * @return nameExtension
   */
  @javax.annotation.Nonnull
  public String getNameExtension() {
    return nameExtension;
  }

  public void setNameExtension(@javax.annotation.Nonnull String nameExtension) {
    this.nameExtension = nameExtension;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AidsToNavigationReport aidsToNavigationReport = (AidsToNavigationReport) o;
    return Objects.equals(this.messageID, aidsToNavigationReport.messageID) &&
        Objects.equals(this.repeatIndicator, aidsToNavigationReport.repeatIndicator) &&
        Objects.equals(this.userID, aidsToNavigationReport.userID) &&
        Objects.equals(this.valid, aidsToNavigationReport.valid) &&
        Objects.equals(this.type, aidsToNavigationReport.type) &&
        Objects.equals(this.name, aidsToNavigationReport.name) &&
        Objects.equals(this.positionAccuracy, aidsToNavigationReport.positionAccuracy) &&
        Objects.equals(this.longitude, aidsToNavigationReport.longitude) &&
        Objects.equals(this.latitude, aidsToNavigationReport.latitude) &&
        Objects.equals(this.dimension, aidsToNavigationReport.dimension) &&
        Objects.equals(this.fixtype, aidsToNavigationReport.fixtype) &&
        Objects.equals(this.timestamp, aidsToNavigationReport.timestamp) &&
        Objects.equals(this.offPosition, aidsToNavigationReport.offPosition) &&
        Objects.equals(this.atoN, aidsToNavigationReport.atoN) &&
        Objects.equals(this.raim, aidsToNavigationReport.raim) &&
        Objects.equals(this.virtualAtoN, aidsToNavigationReport.virtualAtoN) &&
        Objects.equals(this.assignedMode, aidsToNavigationReport.assignedMode) &&
        Objects.equals(this.spare, aidsToNavigationReport.spare) &&
        Objects.equals(this.nameExtension, aidsToNavigationReport.nameExtension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageID, repeatIndicator, userID, valid, type, name, positionAccuracy, longitude, latitude, dimension, fixtype, timestamp, offPosition, atoN, raim, virtualAtoN, assignedMode, spare, nameExtension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AidsToNavigationReport {\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    repeatIndicator: ").append(toIndentedString(repeatIndicator)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    positionAccuracy: ").append(toIndentedString(positionAccuracy)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    fixtype: ").append(toIndentedString(fixtype)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    offPosition: ").append(toIndentedString(offPosition)).append("\n");
    sb.append("    atoN: ").append(toIndentedString(atoN)).append("\n");
    sb.append("    raim: ").append(toIndentedString(raim)).append("\n");
    sb.append("    virtualAtoN: ").append(toIndentedString(virtualAtoN)).append("\n");
    sb.append("    assignedMode: ").append(toIndentedString(assignedMode)).append("\n");
    sb.append("    spare: ").append(toIndentedString(spare)).append("\n");
    sb.append("    nameExtension: ").append(toIndentedString(nameExtension)).append("\n");
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
    openapiFields.add("Type");
    openapiFields.add("Name");
    openapiFields.add("PositionAccuracy");
    openapiFields.add("Longitude");
    openapiFields.add("Latitude");
    openapiFields.add("Dimension");
    openapiFields.add("Fixtype");
    openapiFields.add("Timestamp");
    openapiFields.add("OffPosition");
    openapiFields.add("AtoN");
    openapiFields.add("Raim");
    openapiFields.add("VirtualAtoN");
    openapiFields.add("AssignedMode");
    openapiFields.add("Spare");
    openapiFields.add("NameExtension");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MessageID");
    openapiRequiredFields.add("RepeatIndicator");
    openapiRequiredFields.add("UserID");
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("Type");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("PositionAccuracy");
    openapiRequiredFields.add("Longitude");
    openapiRequiredFields.add("Latitude");
    openapiRequiredFields.add("Dimension");
    openapiRequiredFields.add("Fixtype");
    openapiRequiredFields.add("Timestamp");
    openapiRequiredFields.add("OffPosition");
    openapiRequiredFields.add("AtoN");
    openapiRequiredFields.add("Raim");
    openapiRequiredFields.add("VirtualAtoN");
    openapiRequiredFields.add("AssignedMode");
    openapiRequiredFields.add("Spare");
    openapiRequiredFields.add("NameExtension");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AidsToNavigationReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AidsToNavigationReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AidsToNavigationReport is not found in the empty JSON string", AidsToNavigationReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AidsToNavigationReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AidsToNavigationReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AidsToNavigationReport.openapiRequiredFields) {
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
      if (!jsonObj.get("NameExtension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NameExtension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NameExtension").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AidsToNavigationReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AidsToNavigationReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AidsToNavigationReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AidsToNavigationReport.class));

       return (TypeAdapter<T>) new TypeAdapter<AidsToNavigationReport>() {
           @Override
           public void write(JsonWriter out, AidsToNavigationReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AidsToNavigationReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AidsToNavigationReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AidsToNavigationReport
   * @throws IOException if the JSON string is invalid with respect to AidsToNavigationReport
   */
  public static AidsToNavigationReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AidsToNavigationReport.class);
  }

  /**
   * Convert an instance of AidsToNavigationReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

