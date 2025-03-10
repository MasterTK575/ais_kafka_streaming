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
 * MultiSlotBinaryMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T15:33:26.956655+01:00[Europe/Berlin]", comments = "Generator version: 7.11.0")
public class MultiSlotBinaryMessage {
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

  public static final String SERIALIZED_NAME_DESTINATION_I_D_VALID = "DestinationIDValid";
  @SerializedName(SERIALIZED_NAME_DESTINATION_I_D_VALID)
  @javax.annotation.Nonnull
  private Boolean destinationIDValid;

  public static final String SERIALIZED_NAME_APPLICATION_I_D_VALID = "ApplicationIDValid";
  @SerializedName(SERIALIZED_NAME_APPLICATION_I_D_VALID)
  @javax.annotation.Nonnull
  private Boolean applicationIDValid;

  public static final String SERIALIZED_NAME_DESTINATION_I_D = "DestinationID";
  @SerializedName(SERIALIZED_NAME_DESTINATION_I_D)
  @javax.annotation.Nonnull
  private Integer destinationID;

  public static final String SERIALIZED_NAME_SPARE1 = "Spare1";
  @SerializedName(SERIALIZED_NAME_SPARE1)
  @javax.annotation.Nonnull
  private Integer spare1;

  public static final String SERIALIZED_NAME_APPLICATION_I_D = "ApplicationID";
  @SerializedName(SERIALIZED_NAME_APPLICATION_I_D)
  @javax.annotation.Nonnull
  private AddressedBinaryMessageApplicationID applicationID;

  public static final String SERIALIZED_NAME_PAYLOAD = "Payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  @javax.annotation.Nonnull
  private String payload;

  public static final String SERIALIZED_NAME_SPARE2 = "Spare2";
  @SerializedName(SERIALIZED_NAME_SPARE2)
  @javax.annotation.Nonnull
  private Integer spare2;

  public static final String SERIALIZED_NAME_COMMUNICATION_STATE_IS_ITDMA = "CommunicationStateIsItdma";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION_STATE_IS_ITDMA)
  @javax.annotation.Nonnull
  private Boolean communicationStateIsItdma;

  public static final String SERIALIZED_NAME_COMMUNICATION_STATE = "CommunicationState";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION_STATE)
  @javax.annotation.Nonnull
  private Integer communicationState;

  public MultiSlotBinaryMessage() {
  }

  public MultiSlotBinaryMessage messageID(@javax.annotation.Nonnull Integer messageID) {
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


  public MultiSlotBinaryMessage repeatIndicator(@javax.annotation.Nonnull Integer repeatIndicator) {
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


  public MultiSlotBinaryMessage userID(@javax.annotation.Nonnull Integer userID) {
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


  public MultiSlotBinaryMessage valid(@javax.annotation.Nonnull Boolean valid) {
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


  public MultiSlotBinaryMessage destinationIDValid(@javax.annotation.Nonnull Boolean destinationIDValid) {
    this.destinationIDValid = destinationIDValid;
    return this;
  }

  /**
   * Get destinationIDValid
   * @return destinationIDValid
   */
  @javax.annotation.Nonnull
  public Boolean getDestinationIDValid() {
    return destinationIDValid;
  }

  public void setDestinationIDValid(@javax.annotation.Nonnull Boolean destinationIDValid) {
    this.destinationIDValid = destinationIDValid;
  }


  public MultiSlotBinaryMessage applicationIDValid(@javax.annotation.Nonnull Boolean applicationIDValid) {
    this.applicationIDValid = applicationIDValid;
    return this;
  }

  /**
   * Get applicationIDValid
   * @return applicationIDValid
   */
  @javax.annotation.Nonnull
  public Boolean getApplicationIDValid() {
    return applicationIDValid;
  }

  public void setApplicationIDValid(@javax.annotation.Nonnull Boolean applicationIDValid) {
    this.applicationIDValid = applicationIDValid;
  }


  public MultiSlotBinaryMessage destinationID(@javax.annotation.Nonnull Integer destinationID) {
    this.destinationID = destinationID;
    return this;
  }

  /**
   * Get destinationID
   * @return destinationID
   */
  @javax.annotation.Nonnull
  public Integer getDestinationID() {
    return destinationID;
  }

  public void setDestinationID(@javax.annotation.Nonnull Integer destinationID) {
    this.destinationID = destinationID;
  }


  public MultiSlotBinaryMessage spare1(@javax.annotation.Nonnull Integer spare1) {
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


  public MultiSlotBinaryMessage applicationID(@javax.annotation.Nonnull AddressedBinaryMessageApplicationID applicationID) {
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


  public MultiSlotBinaryMessage payload(@javax.annotation.Nonnull String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
   */
  @javax.annotation.Nonnull
  public String getPayload() {
    return payload;
  }

  public void setPayload(@javax.annotation.Nonnull String payload) {
    this.payload = payload;
  }


  public MultiSlotBinaryMessage spare2(@javax.annotation.Nonnull Integer spare2) {
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


  public MultiSlotBinaryMessage communicationStateIsItdma(@javax.annotation.Nonnull Boolean communicationStateIsItdma) {
    this.communicationStateIsItdma = communicationStateIsItdma;
    return this;
  }

  /**
   * Get communicationStateIsItdma
   * @return communicationStateIsItdma
   */
  @javax.annotation.Nonnull
  public Boolean getCommunicationStateIsItdma() {
    return communicationStateIsItdma;
  }

  public void setCommunicationStateIsItdma(@javax.annotation.Nonnull Boolean communicationStateIsItdma) {
    this.communicationStateIsItdma = communicationStateIsItdma;
  }


  public MultiSlotBinaryMessage communicationState(@javax.annotation.Nonnull Integer communicationState) {
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
    MultiSlotBinaryMessage multiSlotBinaryMessage = (MultiSlotBinaryMessage) o;
    return Objects.equals(this.messageID, multiSlotBinaryMessage.messageID) &&
        Objects.equals(this.repeatIndicator, multiSlotBinaryMessage.repeatIndicator) &&
        Objects.equals(this.userID, multiSlotBinaryMessage.userID) &&
        Objects.equals(this.valid, multiSlotBinaryMessage.valid) &&
        Objects.equals(this.destinationIDValid, multiSlotBinaryMessage.destinationIDValid) &&
        Objects.equals(this.applicationIDValid, multiSlotBinaryMessage.applicationIDValid) &&
        Objects.equals(this.destinationID, multiSlotBinaryMessage.destinationID) &&
        Objects.equals(this.spare1, multiSlotBinaryMessage.spare1) &&
        Objects.equals(this.applicationID, multiSlotBinaryMessage.applicationID) &&
        Objects.equals(this.payload, multiSlotBinaryMessage.payload) &&
        Objects.equals(this.spare2, multiSlotBinaryMessage.spare2) &&
        Objects.equals(this.communicationStateIsItdma, multiSlotBinaryMessage.communicationStateIsItdma) &&
        Objects.equals(this.communicationState, multiSlotBinaryMessage.communicationState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageID, repeatIndicator, userID, valid, destinationIDValid, applicationIDValid, destinationID, spare1, applicationID, payload, spare2, communicationStateIsItdma, communicationState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiSlotBinaryMessage {\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    repeatIndicator: ").append(toIndentedString(repeatIndicator)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    destinationIDValid: ").append(toIndentedString(destinationIDValid)).append("\n");
    sb.append("    applicationIDValid: ").append(toIndentedString(applicationIDValid)).append("\n");
    sb.append("    destinationID: ").append(toIndentedString(destinationID)).append("\n");
    sb.append("    spare1: ").append(toIndentedString(spare1)).append("\n");
    sb.append("    applicationID: ").append(toIndentedString(applicationID)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    spare2: ").append(toIndentedString(spare2)).append("\n");
    sb.append("    communicationStateIsItdma: ").append(toIndentedString(communicationStateIsItdma)).append("\n");
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
    openapiFields.add("DestinationIDValid");
    openapiFields.add("ApplicationIDValid");
    openapiFields.add("DestinationID");
    openapiFields.add("Spare1");
    openapiFields.add("ApplicationID");
    openapiFields.add("Payload");
    openapiFields.add("Spare2");
    openapiFields.add("CommunicationStateIsItdma");
    openapiFields.add("CommunicationState");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MessageID");
    openapiRequiredFields.add("RepeatIndicator");
    openapiRequiredFields.add("UserID");
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("DestinationIDValid");
    openapiRequiredFields.add("ApplicationIDValid");
    openapiRequiredFields.add("DestinationID");
    openapiRequiredFields.add("Spare1");
    openapiRequiredFields.add("ApplicationID");
    openapiRequiredFields.add("Payload");
    openapiRequiredFields.add("Spare2");
    openapiRequiredFields.add("CommunicationStateIsItdma");
    openapiRequiredFields.add("CommunicationState");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MultiSlotBinaryMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MultiSlotBinaryMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultiSlotBinaryMessage is not found in the empty JSON string", MultiSlotBinaryMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MultiSlotBinaryMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MultiSlotBinaryMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MultiSlotBinaryMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ApplicationID`
      AddressedBinaryMessageApplicationID.validateJsonElement(jsonObj.get("ApplicationID"));
      if (!jsonObj.get("Payload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Payload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Payload").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultiSlotBinaryMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultiSlotBinaryMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultiSlotBinaryMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultiSlotBinaryMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<MultiSlotBinaryMessage>() {
           @Override
           public void write(JsonWriter out, MultiSlotBinaryMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultiSlotBinaryMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MultiSlotBinaryMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MultiSlotBinaryMessage
   * @throws IOException if the JSON string is invalid with respect to MultiSlotBinaryMessage
   */
  public static MultiSlotBinaryMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultiSlotBinaryMessage.class);
  }

  /**
   * Convert an instance of MultiSlotBinaryMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

