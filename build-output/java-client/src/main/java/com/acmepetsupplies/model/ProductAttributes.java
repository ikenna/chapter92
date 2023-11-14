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
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

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
 * ProductAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T02:25:23.560502Z[Europe/London]")
public class ProductAttributes {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private Set<String> keywords;

  public static final String SERIALIZED_NAME_REVIEW_RATING = "reviewRating";
  @SerializedName(SERIALIZED_NAME_REVIEW_RATING)
  private Integer reviewRating;

  public static final String SERIALIZED_NAME_NUMBER_OF_REVIEWS = "numberOfReviews";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_REVIEWS)
  private Integer numberOfReviews;

  public ProductAttributes() {
  }

  public ProductAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the product.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProductAttributes description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the product.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ProductAttributes price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Price of the product.
   * minimum: 0
   * maximum: 1000000
   * @return price
  **/
  @javax.annotation.Nullable
  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public ProductAttributes keywords(Set<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public ProductAttributes addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new LinkedHashSet<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * A colleciton of words that describe the product, used for searching for it.
   * @return keywords
  **/
  @javax.annotation.Nullable
  public Set<String> getKeywords() {
    return keywords;
  }


  public void setKeywords(Set<String> keywords) {
    this.keywords = keywords;
  }


  public ProductAttributes reviewRating(Integer reviewRating) {
    
    this.reviewRating = reviewRating;
    return this;
  }

   /**
   * Average product review rating.
   * minimum: 1
   * maximum: 5
   * @return reviewRating
  **/
  @javax.annotation.Nullable
  public Integer getReviewRating() {
    return reviewRating;
  }


  public void setReviewRating(Integer reviewRating) {
    this.reviewRating = reviewRating;
  }


  public ProductAttributes numberOfReviews(Integer numberOfReviews) {
    
    this.numberOfReviews = numberOfReviews;
    return this;
  }

   /**
   * Number of product reviews.
   * @return numberOfReviews
  **/
  @javax.annotation.Nullable
  public Integer getNumberOfReviews() {
    return numberOfReviews;
  }


  public void setNumberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAttributes productAttributes = (ProductAttributes) o;
    return Objects.equals(this.name, productAttributes.name) &&
        Objects.equals(this.description, productAttributes.description) &&
        Objects.equals(this.price, productAttributes.price) &&
        Objects.equals(this.keywords, productAttributes.keywords) &&
        Objects.equals(this.reviewRating, productAttributes.reviewRating) &&
        Objects.equals(this.numberOfReviews, productAttributes.numberOfReviews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, price, keywords, reviewRating, numberOfReviews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    reviewRating: ").append(toIndentedString(reviewRating)).append("\n");
    sb.append("    numberOfReviews: ").append(toIndentedString(numberOfReviews)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("price");
    openapiFields.add("keywords");
    openapiFields.add("reviewRating");
    openapiFields.add("numberOfReviews");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductAttributes is not found in the empty JSON string", ProductAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProductAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("keywords") != null && !jsonObj.get("keywords").isJsonNull() && !jsonObj.get("keywords").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `keywords` to be an array in the JSON string but got `%s`", jsonObj.get("keywords").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductAttributes>() {
           @Override
           public void write(JsonWriter out, ProductAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductAttributes
  * @throws IOException if the JSON string is invalid with respect to ProductAttributes
  */
  public static ProductAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductAttributes.class);
  }

 /**
  * Convert an instance of ProductAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

