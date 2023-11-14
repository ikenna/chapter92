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
import java.net.URI;
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
 * ReviewsResponseLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T02:25:23.560502Z[Europe/London]")
public class ReviewsResponseLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private URI first;

  public static final String SERIALIZED_NAME_PREV = "prev";
  @SerializedName(SERIALIZED_NAME_PREV)
  private URI prev;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private URI next;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  private URI last;

  public ReviewsResponseLinks() {
  }

  public ReviewsResponseLinks self(URI self) {
    
    this.self = self;
    return this;
  }

   /**
   * Relative uri cursor pointing to the current page.
   * @return self
  **/
  @javax.annotation.Nonnull
  public URI getSelf() {
    return self;
  }


  public void setSelf(URI self) {
    this.self = self;
  }


  public ReviewsResponseLinks first(URI first) {
    
    this.first = first;
    return this;
  }

   /**
   * Cursor to the first page.
   * @return first
  **/
  @javax.annotation.Nullable
  public URI getFirst() {
    return first;
  }


  public void setFirst(URI first) {
    this.first = first;
  }


  public ReviewsResponseLinks prev(URI prev) {
    
    this.prev = prev;
    return this;
  }

   /**
   * Relative uri cursor to the previous page.
   * @return prev
  **/
  @javax.annotation.Nullable
  public URI getPrev() {
    return prev;
  }


  public void setPrev(URI prev) {
    this.prev = prev;
  }


  public ReviewsResponseLinks next(URI next) {
    
    this.next = next;
    return this;
  }

   /**
   * Relative uri  cursor to the next page.
   * @return next
  **/
  @javax.annotation.Nullable
  public URI getNext() {
    return next;
  }


  public void setNext(URI next) {
    this.next = next;
  }


  public ReviewsResponseLinks last(URI last) {
    
    this.last = last;
    return this;
  }

   /**
   * Relative uri cursor to the last page.
   * @return last
  **/
  @javax.annotation.Nullable
  public URI getLast() {
    return last;
  }


  public void setLast(URI last) {
    this.last = last;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewsResponseLinks reviewsResponseLinks = (ReviewsResponseLinks) o;
    return Objects.equals(this.self, reviewsResponseLinks.self) &&
        Objects.equals(this.first, reviewsResponseLinks.first) &&
        Objects.equals(this.prev, reviewsResponseLinks.prev) &&
        Objects.equals(this.next, reviewsResponseLinks.next) &&
        Objects.equals(this.last, reviewsResponseLinks.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewsResponseLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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
    openapiFields.add("self");
    openapiFields.add("first");
    openapiFields.add("prev");
    openapiFields.add("next");
    openapiFields.add("last");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("self");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ReviewsResponseLinks
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReviewsResponseLinks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReviewsResponseLinks is not found in the empty JSON string", ReviewsResponseLinks.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReviewsResponseLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReviewsResponseLinks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReviewsResponseLinks.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("first") != null && !jsonObj.get("first").isJsonNull()) && !jsonObj.get("first").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first").toString()));
      }
      if ((jsonObj.get("prev") != null && !jsonObj.get("prev").isJsonNull()) && !jsonObj.get("prev").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prev` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prev").toString()));
      }
      if ((jsonObj.get("next") != null && !jsonObj.get("next").isJsonNull()) && !jsonObj.get("next").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next").toString()));
      }
      if ((jsonObj.get("last") != null && !jsonObj.get("last").isJsonNull()) && !jsonObj.get("last").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReviewsResponseLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReviewsResponseLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReviewsResponseLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReviewsResponseLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<ReviewsResponseLinks>() {
           @Override
           public void write(JsonWriter out, ReviewsResponseLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReviewsResponseLinks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReviewsResponseLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReviewsResponseLinks
  * @throws IOException if the JSON string is invalid with respect to ReviewsResponseLinks
  */
  public static ReviewsResponseLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReviewsResponseLinks.class);
  }

 /**
  * Convert an instance of ReviewsResponseLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

