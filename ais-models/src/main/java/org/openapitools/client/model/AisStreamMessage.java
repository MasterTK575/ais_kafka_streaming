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
import org.openapitools.client.model.AisMessageTypes;
import org.openapitools.client.model.AisStreamMessageMessage;

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
 * AisStreamMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T15:33:26.956655+01:00[Europe/Berlin]", comments = "Generator version: 7.11.0")
public class AisStreamMessage {
  public static final String SERIALIZED_NAME_META_DATA = "MetaData";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  @javax.annotation.Nonnull
  private Object metaData;

  public static final String SERIALIZED_NAME_MESSAGE_TYPE = "MessageType";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TYPE)
  @javax.annotation.Nonnull
  private AisMessageTypes messageType;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nonnull
  private AisStreamMessageMessage message;

  public AisStreamMessage() {
  }

  public AisStreamMessage metaData(@javax.annotation.Nonnull Object metaData) {
    this.metaData = metaData;
    return this;
  }

  /**
   * Get metaData
   * @return metaData
   */
  @javax.annotation.Nonnull
  public Object getMetaData() {
    return metaData;
  }

  public void setMetaData(@javax.annotation.Nonnull Object metaData) {
    this.metaData = metaData;
  }


  public AisStreamMessage messageType(@javax.annotation.Nonnull AisMessageTypes messageType) {
    this.messageType = messageType;
    return this;
  }

  /**
   * Get messageType
   * @return messageType
   */
  @javax.annotation.Nonnull
  public AisMessageTypes getMessageType() {
    return messageType;
  }

  public void setMessageType(@javax.annotation.Nonnull AisMessageTypes messageType) {
    this.messageType = messageType;
  }


  public AisStreamMessage message(@javax.annotation.Nonnull AisStreamMessageMessage message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nonnull
  public AisStreamMessageMessage getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nonnull AisStreamMessageMessage message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AisStreamMessage aisStreamMessage = (AisStreamMessage) o;
    return Objects.equals(this.metaData, aisStreamMessage.metaData) &&
        Objects.equals(this.messageType, aisStreamMessage.messageType) &&
        Objects.equals(this.message, aisStreamMessage.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaData, messageType, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AisStreamMessage {\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("MetaData");
    openapiFields.add("MessageType");
    openapiFields.add("Message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MetaData");
    openapiRequiredFields.add("MessageType");
    openapiRequiredFields.add("Message");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AisStreamMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AisStreamMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AisStreamMessage is not found in the empty JSON string", AisStreamMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AisStreamMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AisStreamMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AisStreamMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `MessageType`
      AisMessageTypes.validateJsonElement(jsonObj.get("MessageType"));
      // validate the required field `Message`
      AisStreamMessageMessage.validateJsonElement(jsonObj.get("Message"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AisStreamMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AisStreamMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AisStreamMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AisStreamMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<AisStreamMessage>() {
           @Override
           public void write(JsonWriter out, AisStreamMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AisStreamMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AisStreamMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AisStreamMessage
   * @throws IOException if the JSON string is invalid with respect to AisStreamMessage
   */
  public static AisStreamMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AisStreamMessage.class);
  }

  /**
   * Convert an instance of AisStreamMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

