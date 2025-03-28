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
 * ShipStaticDataEta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T15:33:26.956655+01:00[Europe/Berlin]", comments = "Generator version: 7.11.0")
public class ShipStaticDataEta {
  public static final String SERIALIZED_NAME_MONTH = "Month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  @javax.annotation.Nonnull
  private Integer month;

  public static final String SERIALIZED_NAME_DAY = "Day";
  @SerializedName(SERIALIZED_NAME_DAY)
  @javax.annotation.Nonnull
  private Integer day;

  public static final String SERIALIZED_NAME_HOUR = "Hour";
  @SerializedName(SERIALIZED_NAME_HOUR)
  @javax.annotation.Nonnull
  private Integer hour;

  public static final String SERIALIZED_NAME_MINUTE = "Minute";
  @SerializedName(SERIALIZED_NAME_MINUTE)
  @javax.annotation.Nonnull
  private Integer minute;

  public ShipStaticDataEta() {
  }

  public ShipStaticDataEta month(@javax.annotation.Nonnull Integer month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
   */
  @javax.annotation.Nonnull
  public Integer getMonth() {
    return month;
  }

  public void setMonth(@javax.annotation.Nonnull Integer month) {
    this.month = month;
  }


  public ShipStaticDataEta day(@javax.annotation.Nonnull Integer day) {
    this.day = day;
    return this;
  }

  /**
   * Get day
   * @return day
   */
  @javax.annotation.Nonnull
  public Integer getDay() {
    return day;
  }

  public void setDay(@javax.annotation.Nonnull Integer day) {
    this.day = day;
  }


  public ShipStaticDataEta hour(@javax.annotation.Nonnull Integer hour) {
    this.hour = hour;
    return this;
  }

  /**
   * Get hour
   * @return hour
   */
  @javax.annotation.Nonnull
  public Integer getHour() {
    return hour;
  }

  public void setHour(@javax.annotation.Nonnull Integer hour) {
    this.hour = hour;
  }


  public ShipStaticDataEta minute(@javax.annotation.Nonnull Integer minute) {
    this.minute = minute;
    return this;
  }

  /**
   * Get minute
   * @return minute
   */
  @javax.annotation.Nonnull
  public Integer getMinute() {
    return minute;
  }

  public void setMinute(@javax.annotation.Nonnull Integer minute) {
    this.minute = minute;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipStaticDataEta shipStaticDataEta = (ShipStaticDataEta) o;
    return Objects.equals(this.month, shipStaticDataEta.month) &&
        Objects.equals(this.day, shipStaticDataEta.day) &&
        Objects.equals(this.hour, shipStaticDataEta.hour) &&
        Objects.equals(this.minute, shipStaticDataEta.minute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, day, hour, minute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipStaticDataEta {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
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
    openapiFields.add("Month");
    openapiFields.add("Day");
    openapiFields.add("Hour");
    openapiFields.add("Minute");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Month");
    openapiRequiredFields.add("Day");
    openapiRequiredFields.add("Hour");
    openapiRequiredFields.add("Minute");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ShipStaticDataEta
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ShipStaticDataEta.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShipStaticDataEta is not found in the empty JSON string", ShipStaticDataEta.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ShipStaticDataEta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShipStaticDataEta` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ShipStaticDataEta.openapiRequiredFields) {
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
       if (!ShipStaticDataEta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShipStaticDataEta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShipStaticDataEta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShipStaticDataEta.class));

       return (TypeAdapter<T>) new TypeAdapter<ShipStaticDataEta>() {
           @Override
           public void write(JsonWriter out, ShipStaticDataEta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShipStaticDataEta read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ShipStaticDataEta given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ShipStaticDataEta
   * @throws IOException if the JSON string is invalid with respect to ShipStaticDataEta
   */
  public static ShipStaticDataEta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShipStaticDataEta.class);
  }

  /**
   * Convert an instance of ShipStaticDataEta to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

