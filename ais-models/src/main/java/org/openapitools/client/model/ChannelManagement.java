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
import org.openapitools.client.model.ChannelManagementArea;
import org.openapitools.client.model.ChannelManagementUnicast;

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
 * ChannelManagement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T15:33:26.956655+01:00[Europe/Berlin]", comments = "Generator version: 7.11.0")
public class ChannelManagement {
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

  public static final String SERIALIZED_NAME_CHANNEL_A = "ChannelA";
  @SerializedName(SERIALIZED_NAME_CHANNEL_A)
  @javax.annotation.Nonnull
  private Integer channelA;

  public static final String SERIALIZED_NAME_CHANNEL_B = "ChannelB";
  @SerializedName(SERIALIZED_NAME_CHANNEL_B)
  @javax.annotation.Nonnull
  private Integer channelB;

  public static final String SERIALIZED_NAME_TX_RX_MODE = "TxRxMode";
  @SerializedName(SERIALIZED_NAME_TX_RX_MODE)
  @javax.annotation.Nonnull
  private Integer txRxMode;

  public static final String SERIALIZED_NAME_LOW_POWER = "LowPower";
  @SerializedName(SERIALIZED_NAME_LOW_POWER)
  @javax.annotation.Nonnull
  private Boolean lowPower;

  public static final String SERIALIZED_NAME_AREA = "Area";
  @SerializedName(SERIALIZED_NAME_AREA)
  @javax.annotation.Nonnull
  private ChannelManagementArea area;

  public static final String SERIALIZED_NAME_UNICAST = "Unicast";
  @SerializedName(SERIALIZED_NAME_UNICAST)
  @javax.annotation.Nonnull
  private ChannelManagementUnicast unicast;

  public static final String SERIALIZED_NAME_IS_ADDRESSED = "IsAddressed";
  @SerializedName(SERIALIZED_NAME_IS_ADDRESSED)
  @javax.annotation.Nonnull
  private Boolean isAddressed;

  public static final String SERIALIZED_NAME_BW_A = "BwA";
  @SerializedName(SERIALIZED_NAME_BW_A)
  @javax.annotation.Nonnull
  private Boolean bwA;

  public static final String SERIALIZED_NAME_BW_B = "BwB";
  @SerializedName(SERIALIZED_NAME_BW_B)
  @javax.annotation.Nonnull
  private Boolean bwB;

  public static final String SERIALIZED_NAME_TRANSITIONAL_ZONE_SIZE = "TransitionalZoneSize";
  @SerializedName(SERIALIZED_NAME_TRANSITIONAL_ZONE_SIZE)
  @javax.annotation.Nonnull
  private Integer transitionalZoneSize;

  public static final String SERIALIZED_NAME_SPARE4 = "Spare4";
  @SerializedName(SERIALIZED_NAME_SPARE4)
  @javax.annotation.Nonnull
  private Integer spare4;

  public ChannelManagement() {
  }

  public ChannelManagement messageID(@javax.annotation.Nonnull Integer messageID) {
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


  public ChannelManagement repeatIndicator(@javax.annotation.Nonnull Integer repeatIndicator) {
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


  public ChannelManagement userID(@javax.annotation.Nonnull Integer userID) {
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


  public ChannelManagement valid(@javax.annotation.Nonnull Boolean valid) {
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


  public ChannelManagement spare1(@javax.annotation.Nonnull Integer spare1) {
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


  public ChannelManagement channelA(@javax.annotation.Nonnull Integer channelA) {
    this.channelA = channelA;
    return this;
  }

  /**
   * Get channelA
   * @return channelA
   */
  @javax.annotation.Nonnull
  public Integer getChannelA() {
    return channelA;
  }

  public void setChannelA(@javax.annotation.Nonnull Integer channelA) {
    this.channelA = channelA;
  }


  public ChannelManagement channelB(@javax.annotation.Nonnull Integer channelB) {
    this.channelB = channelB;
    return this;
  }

  /**
   * Get channelB
   * @return channelB
   */
  @javax.annotation.Nonnull
  public Integer getChannelB() {
    return channelB;
  }

  public void setChannelB(@javax.annotation.Nonnull Integer channelB) {
    this.channelB = channelB;
  }


  public ChannelManagement txRxMode(@javax.annotation.Nonnull Integer txRxMode) {
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


  public ChannelManagement lowPower(@javax.annotation.Nonnull Boolean lowPower) {
    this.lowPower = lowPower;
    return this;
  }

  /**
   * Get lowPower
   * @return lowPower
   */
  @javax.annotation.Nonnull
  public Boolean getLowPower() {
    return lowPower;
  }

  public void setLowPower(@javax.annotation.Nonnull Boolean lowPower) {
    this.lowPower = lowPower;
  }


  public ChannelManagement area(@javax.annotation.Nonnull ChannelManagementArea area) {
    this.area = area;
    return this;
  }

  /**
   * Get area
   * @return area
   */
  @javax.annotation.Nonnull
  public ChannelManagementArea getArea() {
    return area;
  }

  public void setArea(@javax.annotation.Nonnull ChannelManagementArea area) {
    this.area = area;
  }


  public ChannelManagement unicast(@javax.annotation.Nonnull ChannelManagementUnicast unicast) {
    this.unicast = unicast;
    return this;
  }

  /**
   * Get unicast
   * @return unicast
   */
  @javax.annotation.Nonnull
  public ChannelManagementUnicast getUnicast() {
    return unicast;
  }

  public void setUnicast(@javax.annotation.Nonnull ChannelManagementUnicast unicast) {
    this.unicast = unicast;
  }


  public ChannelManagement isAddressed(@javax.annotation.Nonnull Boolean isAddressed) {
    this.isAddressed = isAddressed;
    return this;
  }

  /**
   * Get isAddressed
   * @return isAddressed
   */
  @javax.annotation.Nonnull
  public Boolean getIsAddressed() {
    return isAddressed;
  }

  public void setIsAddressed(@javax.annotation.Nonnull Boolean isAddressed) {
    this.isAddressed = isAddressed;
  }


  public ChannelManagement bwA(@javax.annotation.Nonnull Boolean bwA) {
    this.bwA = bwA;
    return this;
  }

  /**
   * Get bwA
   * @return bwA
   */
  @javax.annotation.Nonnull
  public Boolean getBwA() {
    return bwA;
  }

  public void setBwA(@javax.annotation.Nonnull Boolean bwA) {
    this.bwA = bwA;
  }


  public ChannelManagement bwB(@javax.annotation.Nonnull Boolean bwB) {
    this.bwB = bwB;
    return this;
  }

  /**
   * Get bwB
   * @return bwB
   */
  @javax.annotation.Nonnull
  public Boolean getBwB() {
    return bwB;
  }

  public void setBwB(@javax.annotation.Nonnull Boolean bwB) {
    this.bwB = bwB;
  }


  public ChannelManagement transitionalZoneSize(@javax.annotation.Nonnull Integer transitionalZoneSize) {
    this.transitionalZoneSize = transitionalZoneSize;
    return this;
  }

  /**
   * Get transitionalZoneSize
   * @return transitionalZoneSize
   */
  @javax.annotation.Nonnull
  public Integer getTransitionalZoneSize() {
    return transitionalZoneSize;
  }

  public void setTransitionalZoneSize(@javax.annotation.Nonnull Integer transitionalZoneSize) {
    this.transitionalZoneSize = transitionalZoneSize;
  }


  public ChannelManagement spare4(@javax.annotation.Nonnull Integer spare4) {
    this.spare4 = spare4;
    return this;
  }

  /**
   * Get spare4
   * @return spare4
   */
  @javax.annotation.Nonnull
  public Integer getSpare4() {
    return spare4;
  }

  public void setSpare4(@javax.annotation.Nonnull Integer spare4) {
    this.spare4 = spare4;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelManagement channelManagement = (ChannelManagement) o;
    return Objects.equals(this.messageID, channelManagement.messageID) &&
        Objects.equals(this.repeatIndicator, channelManagement.repeatIndicator) &&
        Objects.equals(this.userID, channelManagement.userID) &&
        Objects.equals(this.valid, channelManagement.valid) &&
        Objects.equals(this.spare1, channelManagement.spare1) &&
        Objects.equals(this.channelA, channelManagement.channelA) &&
        Objects.equals(this.channelB, channelManagement.channelB) &&
        Objects.equals(this.txRxMode, channelManagement.txRxMode) &&
        Objects.equals(this.lowPower, channelManagement.lowPower) &&
        Objects.equals(this.area, channelManagement.area) &&
        Objects.equals(this.unicast, channelManagement.unicast) &&
        Objects.equals(this.isAddressed, channelManagement.isAddressed) &&
        Objects.equals(this.bwA, channelManagement.bwA) &&
        Objects.equals(this.bwB, channelManagement.bwB) &&
        Objects.equals(this.transitionalZoneSize, channelManagement.transitionalZoneSize) &&
        Objects.equals(this.spare4, channelManagement.spare4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageID, repeatIndicator, userID, valid, spare1, channelA, channelB, txRxMode, lowPower, area, unicast, isAddressed, bwA, bwB, transitionalZoneSize, spare4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelManagement {\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    repeatIndicator: ").append(toIndentedString(repeatIndicator)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    spare1: ").append(toIndentedString(spare1)).append("\n");
    sb.append("    channelA: ").append(toIndentedString(channelA)).append("\n");
    sb.append("    channelB: ").append(toIndentedString(channelB)).append("\n");
    sb.append("    txRxMode: ").append(toIndentedString(txRxMode)).append("\n");
    sb.append("    lowPower: ").append(toIndentedString(lowPower)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    unicast: ").append(toIndentedString(unicast)).append("\n");
    sb.append("    isAddressed: ").append(toIndentedString(isAddressed)).append("\n");
    sb.append("    bwA: ").append(toIndentedString(bwA)).append("\n");
    sb.append("    bwB: ").append(toIndentedString(bwB)).append("\n");
    sb.append("    transitionalZoneSize: ").append(toIndentedString(transitionalZoneSize)).append("\n");
    sb.append("    spare4: ").append(toIndentedString(spare4)).append("\n");
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
    openapiFields.add("ChannelA");
    openapiFields.add("ChannelB");
    openapiFields.add("TxRxMode");
    openapiFields.add("LowPower");
    openapiFields.add("Area");
    openapiFields.add("Unicast");
    openapiFields.add("IsAddressed");
    openapiFields.add("BwA");
    openapiFields.add("BwB");
    openapiFields.add("TransitionalZoneSize");
    openapiFields.add("Spare4");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MessageID");
    openapiRequiredFields.add("RepeatIndicator");
    openapiRequiredFields.add("UserID");
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("Spare1");
    openapiRequiredFields.add("ChannelA");
    openapiRequiredFields.add("ChannelB");
    openapiRequiredFields.add("TxRxMode");
    openapiRequiredFields.add("LowPower");
    openapiRequiredFields.add("Area");
    openapiRequiredFields.add("Unicast");
    openapiRequiredFields.add("IsAddressed");
    openapiRequiredFields.add("BwA");
    openapiRequiredFields.add("BwB");
    openapiRequiredFields.add("TransitionalZoneSize");
    openapiRequiredFields.add("Spare4");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ChannelManagement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChannelManagement.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChannelManagement is not found in the empty JSON string", ChannelManagement.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChannelManagement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChannelManagement` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChannelManagement.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Area`
      ChannelManagementArea.validateJsonElement(jsonObj.get("Area"));
      // validate the required field `Unicast`
      ChannelManagementUnicast.validateJsonElement(jsonObj.get("Unicast"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChannelManagement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChannelManagement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChannelManagement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChannelManagement.class));

       return (TypeAdapter<T>) new TypeAdapter<ChannelManagement>() {
           @Override
           public void write(JsonWriter out, ChannelManagement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChannelManagement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ChannelManagement given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ChannelManagement
   * @throws IOException if the JSON string is invalid with respect to ChannelManagement
   */
  public static ChannelManagement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChannelManagement.class);
  }

  /**
   * Convert an instance of ChannelManagement to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

