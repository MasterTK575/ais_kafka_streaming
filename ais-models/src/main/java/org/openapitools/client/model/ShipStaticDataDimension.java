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
 * ShipStaticDataDimension
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T15:33:26.956655+01:00[Europe/Berlin]", comments = "Generator version: 7.11.0")
public class ShipStaticDataDimension {
  public static final String SERIALIZED_NAME_A = "A";
  @SerializedName(SERIALIZED_NAME_A)
  @javax.annotation.Nonnull
  private Integer A;

  public static final String SERIALIZED_NAME_B = "B";
  @SerializedName(SERIALIZED_NAME_B)
  @javax.annotation.Nonnull
  private Integer B;

  public static final String SERIALIZED_NAME_C = "C";
  @SerializedName(SERIALIZED_NAME_C)
  @javax.annotation.Nonnull
  private Integer C;

  public static final String SERIALIZED_NAME_D = "D";
  @SerializedName(SERIALIZED_NAME_D)
  @javax.annotation.Nonnull
  private Integer D;

  public ShipStaticDataDimension() {
  }

  public ShipStaticDataDimension A(@javax.annotation.Nonnull Integer A) {
    this.A = A;
    return this;
  }

  /**
   * Get A
   * @return A
   */
  @javax.annotation.Nonnull
  public Integer getA() {
    return A;
  }

  public void setA(@javax.annotation.Nonnull Integer A) {
    this.A = A;
  }


  public ShipStaticDataDimension B(@javax.annotation.Nonnull Integer B) {
    this.B = B;
    return this;
  }

  /**
   * Get B
   * @return B
   */
  @javax.annotation.Nonnull
  public Integer getB() {
    return B;
  }

  public void setB(@javax.annotation.Nonnull Integer B) {
    this.B = B;
  }


  public ShipStaticDataDimension C(@javax.annotation.Nonnull Integer C) {
    this.C = C;
    return this;
  }

  /**
   * Get C
   * @return C
   */
  @javax.annotation.Nonnull
  public Integer getC() {
    return C;
  }

  public void setC(@javax.annotation.Nonnull Integer C) {
    this.C = C;
  }


  public ShipStaticDataDimension D(@javax.annotation.Nonnull Integer D) {
    this.D = D;
    return this;
  }

  /**
   * Get D
   * @return D
   */
  @javax.annotation.Nonnull
  public Integer getD() {
    return D;
  }

  public void setD(@javax.annotation.Nonnull Integer D) {
    this.D = D;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipStaticDataDimension shipStaticDataDimension = (ShipStaticDataDimension) o;
    return Objects.equals(this.A, shipStaticDataDimension.A) &&
        Objects.equals(this.B, shipStaticDataDimension.B) &&
        Objects.equals(this.C, shipStaticDataDimension.C) &&
        Objects.equals(this.D, shipStaticDataDimension.D);
  }

  @Override
  public int hashCode() {
    return Objects.hash(A, B, C, D);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipStaticDataDimension {\n");
    sb.append("    A: ").append(toIndentedString(A)).append("\n");
    sb.append("    B: ").append(toIndentedString(B)).append("\n");
    sb.append("    C: ").append(toIndentedString(C)).append("\n");
    sb.append("    D: ").append(toIndentedString(D)).append("\n");
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
    openapiFields.add("A");
    openapiFields.add("B");
    openapiFields.add("C");
    openapiFields.add("D");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("A");
    openapiRequiredFields.add("B");
    openapiRequiredFields.add("C");
    openapiRequiredFields.add("D");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ShipStaticDataDimension
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ShipStaticDataDimension.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShipStaticDataDimension is not found in the empty JSON string", ShipStaticDataDimension.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ShipStaticDataDimension.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShipStaticDataDimension` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ShipStaticDataDimension.openapiRequiredFields) {
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
       if (!ShipStaticDataDimension.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShipStaticDataDimension' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShipStaticDataDimension> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShipStaticDataDimension.class));

       return (TypeAdapter<T>) new TypeAdapter<ShipStaticDataDimension>() {
           @Override
           public void write(JsonWriter out, ShipStaticDataDimension value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShipStaticDataDimension read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ShipStaticDataDimension given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ShipStaticDataDimension
   * @throws IOException if the JSON string is invalid with respect to ShipStaticDataDimension
   */
  public static ShipStaticDataDimension fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShipStaticDataDimension.class);
  }

  /**
   * Convert an instance of ShipStaticDataDimension to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

