/*
 * Product Catalog API
 * The Product Catalog API enables customers browse Acme Pet Supplies great range of pet products and their product reviews. 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: john.smith@acme-pet-supplies.co.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.acmepetsupplies.model;

import java.util.Objects;
import java.util.Arrays;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.acmepetsupplies.client.JSON;

/**
 * contains references to the source of the error
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T02:25:23.560502Z[Europe/London]")
public class ErrorErrorsInnerSource {
  public static final String SERIALIZED_NAME_POINTER = "pointer";
  @SerializedName(SERIALIZED_NAME_POINTER)
  private String pointer;

  public static final String SERIALIZED_NAME_PARAMETER = "parameter";
  @SerializedName(SERIALIZED_NAME_PARAMETER)
  private String parameter;

  public ErrorErrorsInnerSource() {
  }

  public ErrorErrorsInnerSource pointer(String pointer) {
    
    this.pointer = pointer;
    return this;
  }

   /**
   * a JSON Pointer [RFC6901] to the associated entity in the request document
   * @return pointer
  **/
  @javax.annotation.Nullable
  public String getPointer() {
    return pointer;
  }


  public void setPointer(String pointer) {
    this.pointer = pointer;
  }


  public ErrorErrorsInnerSource parameter(String parameter) {
    
    this.parameter = parameter;
    return this;
  }

   /**
   * indicates which URI query parameter caused the error
   * @return parameter
  **/
  @javax.annotation.Nullable
  public String getParameter() {
    return parameter;
  }


  public void setParameter(String parameter) {
    this.parameter = parameter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorErrorsInnerSource errorErrorsInnerSource = (ErrorErrorsInnerSource) o;
    return Objects.equals(this.pointer, errorErrorsInnerSource.pointer) &&
        Objects.equals(this.parameter, errorErrorsInnerSource.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointer, parameter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorErrorsInnerSource {\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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
    openapiFields.add("pointer");
    openapiFields.add("parameter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ErrorErrorsInnerSource
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ErrorErrorsInnerSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ErrorErrorsInnerSource is not found in the empty JSON string", ErrorErrorsInnerSource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ErrorErrorsInnerSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ErrorErrorsInnerSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("pointer") != null && !jsonObj.get("pointer").isJsonNull()) && !jsonObj.get("pointer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pointer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pointer").toString()));
      }
      if ((jsonObj.get("parameter") != null && !jsonObj.get("parameter").isJsonNull()) && !jsonObj.get("parameter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ErrorErrorsInnerSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ErrorErrorsInnerSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ErrorErrorsInnerSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ErrorErrorsInnerSource.class));

       return (TypeAdapter<T>) new TypeAdapter<ErrorErrorsInnerSource>() {
           @Override
           public void write(JsonWriter out, ErrorErrorsInnerSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ErrorErrorsInnerSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ErrorErrorsInnerSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ErrorErrorsInnerSource
  * @throws IOException if the JSON string is invalid with respect to ErrorErrorsInnerSource
  */
  public static ErrorErrorsInnerSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ErrorErrorsInnerSource.class);
  }

 /**
  * Convert an instance of ErrorErrorsInnerSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

