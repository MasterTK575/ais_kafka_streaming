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
 * InterrogationStation2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T15:33:26.956655+01:00[Europe/Berlin]", comments = "Generator version: 7.11.0")
public class InterrogationStation2 {
  public static final String SERIALIZED_NAME_VALID = "Valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  @javax.annotation.Nonnull
  private Boolean valid;

  public static final String SERIALIZED_NAME_SPARE1 = "Spare1";
  @SerializedName(SERIALIZED_NAME_SPARE1)
  @javax.annotation.Nonnull
  private Integer spare1;

  public static final String SERIALIZED_NAME_STATION_I_D = "StationID";
  @SerializedName(SERIALIZED_NAME_STATION_I_D)
  @javax.annotation.Nonnull
  private Integer stationID;

  public static final String SERIALIZED_NAME_MESSAGE_I_D = "MessageID";
  @SerializedName(SERIALIZED_NAME_MESSAGE_I_D)
  @javax.annotation.Nonnull
  private Integer messageID;

  public static final String SERIALIZED_NAME_SLOT_OFFSET = "SlotOffset";
  @SerializedName(SERIALIZED_NAME_SLOT_OFFSET)
  @javax.annotation.Nonnull
  private Integer slotOffset;

  public static final String SERIALIZED_NAME_SPARE2 = "Spare2";
  @SerializedName(SERIALIZED_NAME_SPARE2)
  @javax.annotation.Nonnull
  private Integer spare2;

  public InterrogationStation2() {
  }

  public InterrogationStation2 valid(@javax.annotation.Nonnull Boolean valid) {
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


  public InterrogationStation2 spare1(@javax.annotation.Nonnull Integer spare1) {
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


  public InterrogationStation2 stationID(@javax.annotation.Nonnull Integer stationID) {
    this.stationID = stationID;
    return this;
  }

  /**
   * Get stationID
   * @return stationID
   */
  @javax.annotation.Nonnull
  public Integer getStationID() {
    return stationID;
  }

  public void setStationID(@javax.annotation.Nonnull Integer stationID) {
    this.stationID = stationID;
  }


  public InterrogationStation2 messageID(@javax.annotation.Nonnull Integer messageID) {
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


  public InterrogationStation2 slotOffset(@javax.annotation.Nonnull Integer slotOffset) {
    this.slotOffset = slotOffset;
    return this;
  }

  /**
   * Get slotOffset
   * @return slotOffset
   */
  @javax.annotation.Nonnull
  public Integer getSlotOffset() {
    return slotOffset;
  }

  public void setSlotOffset(@javax.annotation.Nonnull Integer slotOffset) {
    this.slotOffset = slotOffset;
  }


  public InterrogationStation2 spare2(@javax.annotation.Nonnull Integer spare2) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterrogationStation2 interrogationStation2 = (InterrogationStation2) o;
    return Objects.equals(this.valid, interrogationStation2.valid) &&
        Objects.equals(this.spare1, interrogationStation2.spare1) &&
        Objects.equals(this.stationID, interrogationStation2.stationID) &&
        Objects.equals(this.messageID, interrogationStation2.messageID) &&
        Objects.equals(this.slotOffset, interrogationStation2.slotOffset) &&
        Objects.equals(this.spare2, interrogationStation2.spare2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, spare1, stationID, messageID, slotOffset, spare2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterrogationStation2 {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    spare1: ").append(toIndentedString(spare1)).append("\n");
    sb.append("    stationID: ").append(toIndentedString(stationID)).append("\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    slotOffset: ").append(toIndentedString(slotOffset)).append("\n");
    sb.append("    spare2: ").append(toIndentedString(spare2)).append("\n");
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
    openapiFields.add("Valid");
    openapiFields.add("Spare1");
    openapiFields.add("StationID");
    openapiFields.add("MessageID");
    openapiFields.add("SlotOffset");
    openapiFields.add("Spare2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("Spare1");
    openapiRequiredFields.add("StationID");
    openapiRequiredFields.add("MessageID");
    openapiRequiredFields.add("SlotOffset");
    openapiRequiredFields.add("Spare2");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InterrogationStation2
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InterrogationStation2.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InterrogationStation2 is not found in the empty JSON string", InterrogationStation2.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InterrogationStation2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InterrogationStation2` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InterrogationStation2.openapiRequiredFields) {
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
       if (!InterrogationStation2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InterrogationStation2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InterrogationStation2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InterrogationStation2.class));

       return (TypeAdapter<T>) new TypeAdapter<InterrogationStation2>() {
           @Override
           public void write(JsonWriter out, InterrogationStation2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InterrogationStation2 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InterrogationStation2 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InterrogationStation2
   * @throws IOException if the JSON string is invalid with respect to InterrogationStation2
   */
  public static InterrogationStation2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InterrogationStation2.class);
  }

  /**
   * Convert an instance of InterrogationStation2 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

