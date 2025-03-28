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
import org.openapitools.client.model.AddressedBinaryMessageApplicationID;

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
 * BinaryBroadcastMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T15:33:26.956655+01:00[Europe/Berlin]", comments = "Generator version: 7.11.0")
public class BinaryBroadcastMessage {
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

  public static final String SERIALIZED_NAME_SPARE = "Spare";
  @SerializedName(SERIALIZED_NAME_SPARE)
  @javax.annotation.Nonnull
  private Integer spare;

  public static final String SERIALIZED_NAME_APPLICATION_I_D = "ApplicationID";
  @SerializedName(SERIALIZED_NAME_APPLICATION_I_D)
  @javax.annotation.Nonnull
  private AddressedBinaryMessageApplicationID applicationID;

  public static final String SERIALIZED_NAME_BINARY_DATA = "BinaryData";
  @SerializedName(SERIALIZED_NAME_BINARY_DATA)
  @javax.annotation.Nonnull
  private String binaryData;

  public BinaryBroadcastMessage() {
  }

  public BinaryBroadcastMessage messageID(@javax.annotation.Nonnull Integer messageID) {
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


  public BinaryBroadcastMessage repeatIndicator(@javax.annotation.Nonnull Integer repeatIndicator) {
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


  public BinaryBroadcastMessage userID(@javax.annotation.Nonnull Integer userID) {
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


  public BinaryBroadcastMessage valid(@javax.annotation.Nonnull Boolean valid) {
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


  public BinaryBroadcastMessage spare(@javax.annotation.Nonnull Integer spare) {
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


  public BinaryBroadcastMessage applicationID(@javax.annotation.Nonnull AddressedBinaryMessageApplicationID applicationID) {
    this.applicationID = applicationID;
    return this;
  }

  /**
   * Get applicationID
   * @return applicationID
   */
  @javax.annotation.Nonnull
  public AddressedBinaryMessageApplicationID getApplicationID() {
    return applicationID;
  }

  public void setApplicationID(@javax.annotation.Nonnull AddressedBinaryMessageApplicationID applicationID) {
    this.applicationID = applicationID;
  }


  public BinaryBroadcastMessage binaryData(@javax.annotation.Nonnull String binaryData) {
    this.binaryData = binaryData;
    return this;
  }

  /**
   * Get binaryData
   * @return binaryData
   */
  @javax.annotation.Nonnull
  public String getBinaryData() {
    return binaryData;
  }

  public void setBinaryData(@javax.annotation.Nonnull String binaryData) {
    this.binaryData = binaryData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinaryBroadcastMessage binaryBroadcastMessage = (BinaryBroadcastMessage) o;
    return Objects.equals(this.messageID, binaryBroadcastMessage.messageID) &&
        Objects.equals(this.repeatIndicator, binaryBroadcastMessage.repeatIndicator) &&
        Objects.equals(this.userID, binaryBroadcastMessage.userID) &&
        Objects.equals(this.valid, binaryBroadcastMessage.valid) &&
        Objects.equals(this.spare, binaryBroadcastMessage.spare) &&
        Objects.equals(this.applicationID, binaryBroadcastMessage.applicationID) &&
        Objects.equals(this.binaryData, binaryBroadcastMessage.binaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageID, repeatIndicator, userID, valid, spare, applicationID, binaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinaryBroadcastMessage {\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    repeatIndicator: ").append(toIndentedString(repeatIndicator)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    spare: ").append(toIndentedString(spare)).append("\n");
    sb.append("    applicationID: ").append(toIndentedString(applicationID)).append("\n");
    sb.append("    binaryData: ").append(toIndentedString(binaryData)).append("\n");
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
    openapiFields.add("Spare");
    openapiFields.add("ApplicationID");
    openapiFields.add("BinaryData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MessageID");
    openapiRequiredFields.add("RepeatIndicator");
    openapiRequiredFields.add("UserID");
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("Spare");
    openapiRequiredFields.add("ApplicationID");
    openapiRequiredFields.add("BinaryData");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BinaryBroadcastMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BinaryBroadcastMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BinaryBroadcastMessage is not found in the empty JSON string", BinaryBroadcastMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BinaryBroadcastMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BinaryBroadcastMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BinaryBroadcastMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ApplicationID`
      AddressedBinaryMessageApplicationID.validateJsonElement(jsonObj.get("ApplicationID"));
      if (!jsonObj.get("BinaryData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BinaryData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BinaryData").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BinaryBroadcastMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BinaryBroadcastMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BinaryBroadcastMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BinaryBroadcastMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<BinaryBroadcastMessage>() {
           @Override
           public void write(JsonWriter out, BinaryBroadcastMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BinaryBroadcastMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BinaryBroadcastMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BinaryBroadcastMessage
   * @throws IOException if the JSON string is invalid with respect to BinaryBroadcastMessage
   */
  public static BinaryBroadcastMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BinaryBroadcastMessage.class);
  }

  /**
   * Convert an instance of BinaryBroadcastMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

