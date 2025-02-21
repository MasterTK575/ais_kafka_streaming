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
import org.openapitools.client.model.DataLinkManagementMessageData0;

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
 * DataLinkManagementMessageData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T15:33:26.956655+01:00[Europe/Berlin]", comments = "Generator version: 7.11.0")
public class DataLinkManagementMessageData {
  public static final String SERIALIZED_NAME_0 = "0";
  @SerializedName(SERIALIZED_NAME_0)
  @javax.annotation.Nonnull
  private DataLinkManagementMessageData0 _0;

  public static final String SERIALIZED_NAME_1 = "1";
  @SerializedName(SERIALIZED_NAME_1)
  @javax.annotation.Nonnull
  private DataLinkManagementMessageData0 _1;

  public static final String SERIALIZED_NAME_2 = "2";
  @SerializedName(SERIALIZED_NAME_2)
  @javax.annotation.Nonnull
  private DataLinkManagementMessageData0 _2;

  public static final String SERIALIZED_NAME_3 = "3";
  @SerializedName(SERIALIZED_NAME_3)
  @javax.annotation.Nonnull
  private DataLinkManagementMessageData0 _3;

  public DataLinkManagementMessageData() {
  }

  public DataLinkManagementMessageData _0(@javax.annotation.Nonnull DataLinkManagementMessageData0 _0) {
    this._0 = _0;
    return this;
  }

  /**
   * Get _0
   * @return _0
   */
  @javax.annotation.Nonnull
  public DataLinkManagementMessageData0 get0() {
    return _0;
  }

  public void set0(@javax.annotation.Nonnull DataLinkManagementMessageData0 _0) {
    this._0 = _0;
  }


  public DataLinkManagementMessageData _1(@javax.annotation.Nonnull DataLinkManagementMessageData0 _1) {
    this._1 = _1;
    return this;
  }

  /**
   * Get _1
   * @return _1
   */
  @javax.annotation.Nonnull
  public DataLinkManagementMessageData0 get1() {
    return _1;
  }

  public void set1(@javax.annotation.Nonnull DataLinkManagementMessageData0 _1) {
    this._1 = _1;
  }


  public DataLinkManagementMessageData _2(@javax.annotation.Nonnull DataLinkManagementMessageData0 _2) {
    this._2 = _2;
    return this;
  }

  /**
   * Get _2
   * @return _2
   */
  @javax.annotation.Nonnull
  public DataLinkManagementMessageData0 get2() {
    return _2;
  }

  public void set2(@javax.annotation.Nonnull DataLinkManagementMessageData0 _2) {
    this._2 = _2;
  }


  public DataLinkManagementMessageData _3(@javax.annotation.Nonnull DataLinkManagementMessageData0 _3) {
    this._3 = _3;
    return this;
  }

  /**
   * Get _3
   * @return _3
   */
  @javax.annotation.Nonnull
  public DataLinkManagementMessageData0 get3() {
    return _3;
  }

  public void set3(@javax.annotation.Nonnull DataLinkManagementMessageData0 _3) {
    this._3 = _3;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataLinkManagementMessageData dataLinkManagementMessageData = (DataLinkManagementMessageData) o;
    return Objects.equals(this._0, dataLinkManagementMessageData._0) &&
        Objects.equals(this._1, dataLinkManagementMessageData._1) &&
        Objects.equals(this._2, dataLinkManagementMessageData._2) &&
        Objects.equals(this._3, dataLinkManagementMessageData._3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_0, _1, _2, _3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataLinkManagementMessageData {\n");
    sb.append("    _0: ").append(toIndentedString(_0)).append("\n");
    sb.append("    _1: ").append(toIndentedString(_1)).append("\n");
    sb.append("    _2: ").append(toIndentedString(_2)).append("\n");
    sb.append("    _3: ").append(toIndentedString(_3)).append("\n");
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
    openapiFields.add("0");
    openapiFields.add("1");
    openapiFields.add("2");
    openapiFields.add("3");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("0");
    openapiRequiredFields.add("1");
    openapiRequiredFields.add("2");
    openapiRequiredFields.add("3");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataLinkManagementMessageData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataLinkManagementMessageData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataLinkManagementMessageData is not found in the empty JSON string", DataLinkManagementMessageData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataLinkManagementMessageData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataLinkManagementMessageData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DataLinkManagementMessageData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `0`
      DataLinkManagementMessageData0.validateJsonElement(jsonObj.get("0"));
      // validate the required field `1`
      DataLinkManagementMessageData0.validateJsonElement(jsonObj.get("1"));
      // validate the required field `2`
      DataLinkManagementMessageData0.validateJsonElement(jsonObj.get("2"));
      // validate the required field `3`
      DataLinkManagementMessageData0.validateJsonElement(jsonObj.get("3"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataLinkManagementMessageData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataLinkManagementMessageData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataLinkManagementMessageData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataLinkManagementMessageData.class));

       return (TypeAdapter<T>) new TypeAdapter<DataLinkManagementMessageData>() {
           @Override
           public void write(JsonWriter out, DataLinkManagementMessageData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataLinkManagementMessageData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DataLinkManagementMessageData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DataLinkManagementMessageData
   * @throws IOException if the JSON string is invalid with respect to DataLinkManagementMessageData
   */
  public static DataLinkManagementMessageData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataLinkManagementMessageData.class);
  }

  /**
   * Convert an instance of DataLinkManagementMessageData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

