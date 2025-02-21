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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AisMessageTypes;

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
 * SubscriptionMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T15:33:26.956655+01:00[Europe/Berlin]", comments = "Generator version: 7.11.0")
public class SubscriptionMessage {
  public static final String SERIALIZED_NAME_AP_I_KEY = "APIKey";
  @SerializedName(SERIALIZED_NAME_AP_I_KEY)
  @javax.annotation.Nonnull
  private String apIKey;

  public static final String SERIALIZED_NAME_BOUNDING_BOXES = "BoundingBoxes";
  @SerializedName(SERIALIZED_NAME_BOUNDING_BOXES)
  @javax.annotation.Nonnull
  private List<List<List<Double>>> boundingBoxes = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILTERS_SHIP_M_M_S_I = "FiltersShipMMSI";
  @SerializedName(SERIALIZED_NAME_FILTERS_SHIP_M_M_S_I)
  @javax.annotation.Nullable
  private List<String> filtersShipMMSI = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILTER_MESSAGE_TYPES = "FilterMessageTypes";
  @SerializedName(SERIALIZED_NAME_FILTER_MESSAGE_TYPES)
  @javax.annotation.Nullable
  private List<AisMessageTypes> filterMessageTypes = new ArrayList<>();

  public SubscriptionMessage() {
  }

  public SubscriptionMessage apIKey(@javax.annotation.Nonnull String apIKey) {
    this.apIKey = apIKey;
    return this;
  }

  /**
   * Get apIKey
   * @return apIKey
   */
  @javax.annotation.Nonnull
  public String getApIKey() {
    return apIKey;
  }

  public void setApIKey(@javax.annotation.Nonnull String apIKey) {
    this.apIKey = apIKey;
  }


  public SubscriptionMessage boundingBoxes(@javax.annotation.Nonnull List<List<List<Double>>> boundingBoxes) {
    this.boundingBoxes = boundingBoxes;
    return this;
  }

  public SubscriptionMessage addBoundingBoxesItem(List<List<Double>> boundingBoxesItem) {
    if (this.boundingBoxes == null) {
      this.boundingBoxes = new ArrayList<>();
    }
    this.boundingBoxes.add(boundingBoxesItem);
    return this;
  }

  /**
   * Get boundingBoxes
   * @return boundingBoxes
   */
  @javax.annotation.Nonnull
  public List<List<List<Double>>> getBoundingBoxes() {
    return boundingBoxes;
  }

  public void setBoundingBoxes(@javax.annotation.Nonnull List<List<List<Double>>> boundingBoxes) {
    this.boundingBoxes = boundingBoxes;
  }


  public SubscriptionMessage filtersShipMMSI(@javax.annotation.Nullable List<String> filtersShipMMSI) {
    this.filtersShipMMSI = filtersShipMMSI;
    return this;
  }

  public SubscriptionMessage addFiltersShipMMSIItem(String filtersShipMMSIItem) {
    if (this.filtersShipMMSI == null) {
      this.filtersShipMMSI = new ArrayList<>();
    }
    this.filtersShipMMSI.add(filtersShipMMSIItem);
    return this;
  }

  /**
   * Get filtersShipMMSI
   * @return filtersShipMMSI
   */
  @javax.annotation.Nullable
  public List<String> getFiltersShipMMSI() {
    return filtersShipMMSI;
  }

  public void setFiltersShipMMSI(@javax.annotation.Nullable List<String> filtersShipMMSI) {
    this.filtersShipMMSI = filtersShipMMSI;
  }


  public SubscriptionMessage filterMessageTypes(@javax.annotation.Nullable List<AisMessageTypes> filterMessageTypes) {
    this.filterMessageTypes = filterMessageTypes;
    return this;
  }

  public SubscriptionMessage addFilterMessageTypesItem(AisMessageTypes filterMessageTypesItem) {
    if (this.filterMessageTypes == null) {
      this.filterMessageTypes = new ArrayList<>();
    }
    this.filterMessageTypes.add(filterMessageTypesItem);
    return this;
  }

  /**
   * Get filterMessageTypes
   * @return filterMessageTypes
   */
  @javax.annotation.Nullable
  public List<AisMessageTypes> getFilterMessageTypes() {
    return filterMessageTypes;
  }

  public void setFilterMessageTypes(@javax.annotation.Nullable List<AisMessageTypes> filterMessageTypes) {
    this.filterMessageTypes = filterMessageTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionMessage subscriptionMessage = (SubscriptionMessage) o;
    return Objects.equals(this.apIKey, subscriptionMessage.apIKey) &&
        Objects.equals(this.boundingBoxes, subscriptionMessage.boundingBoxes) &&
        Objects.equals(this.filtersShipMMSI, subscriptionMessage.filtersShipMMSI) &&
        Objects.equals(this.filterMessageTypes, subscriptionMessage.filterMessageTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apIKey, boundingBoxes, filtersShipMMSI, filterMessageTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionMessage {\n");
    sb.append("    apIKey: ").append(toIndentedString(apIKey)).append("\n");
    sb.append("    boundingBoxes: ").append(toIndentedString(boundingBoxes)).append("\n");
    sb.append("    filtersShipMMSI: ").append(toIndentedString(filtersShipMMSI)).append("\n");
    sb.append("    filterMessageTypes: ").append(toIndentedString(filterMessageTypes)).append("\n");
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
    openapiFields.add("APIKey");
    openapiFields.add("BoundingBoxes");
    openapiFields.add("FiltersShipMMSI");
    openapiFields.add("FilterMessageTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("APIKey");
    openapiRequiredFields.add("BoundingBoxes");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubscriptionMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubscriptionMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionMessage is not found in the empty JSON string", SubscriptionMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubscriptionMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("APIKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `APIKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("APIKey").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("BoundingBoxes") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("BoundingBoxes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BoundingBoxes` to be an array in the JSON string but got `%s`", jsonObj.get("BoundingBoxes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("FiltersShipMMSI") != null && !jsonObj.get("FiltersShipMMSI").isJsonNull() && !jsonObj.get("FiltersShipMMSI").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `FiltersShipMMSI` to be an array in the JSON string but got `%s`", jsonObj.get("FiltersShipMMSI").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("FilterMessageTypes") != null && !jsonObj.get("FilterMessageTypes").isJsonNull() && !jsonObj.get("FilterMessageTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `FilterMessageTypes` to be an array in the JSON string but got `%s`", jsonObj.get("FilterMessageTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionMessage>() {
           @Override
           public void write(JsonWriter out, SubscriptionMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubscriptionMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubscriptionMessage
   * @throws IOException if the JSON string is invalid with respect to SubscriptionMessage
   */
  public static SubscriptionMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionMessage.class);
  }

  /**
   * Convert an instance of SubscriptionMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

