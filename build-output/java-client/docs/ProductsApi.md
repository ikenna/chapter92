# ProductsApi

All URIs are relative to *https://api.acme-pet-supplies.co.uk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listProducts**](ProductsApi.md#listProducts) | **GET** /v1/catalog/products | List all products |
| [**viewProduct**](ProductsApi.md#viewProduct) | **GET** /v1/catalog/products/{id} | View a product&#39;s details |


<a id="listProducts"></a>
# **listProducts**
> ProductsResponse listProducts(include, filterCategory)

List all products

List all products.

### Example
```java
// Import classes:
import com.acmepetsupplies.client.ApiClient;
import com.acmepetsupplies.client.ApiException;
import com.acmepetsupplies.client.Configuration;
import com.acmepetsupplies.client.auth.*;
import com.acmepetsupplies.client.models.*;
import com.acmepetsupplies.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.acme-pet-supplies.co.uk");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String include = "category"; // String | List of included related resources
    UUID filterCategory = UUID.fromString("1e32231d-b8a1-4145-b539-820301c2af64"); // UUID | Filter by category ID.
    try {
      ProductsResponse result = apiInstance.listProducts(include, filterCategory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#listProducts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **include** | **String**| List of included related resources | [optional] |
| **filterCategory** | **UUID**| Filter by category ID. | [optional] |

### Return type

[**ProductsResponse**](ProductsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Not authorized |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **403** | Forbidden |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **406** | Not Acceptable |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **415** | 415 Unsupported Media Type |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | 429 Too Many Requests |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After - If request limit exceeded, retry after this time window. <br>  |
| **500** | 500 Internal Server Error |  -  |

<a id="viewProduct"></a>
# **viewProduct**
> ViewProduct200Response viewProduct(id)

View a product&#39;s details

View a product&#39;s details.

### Example
```java
// Import classes:
import com.acmepetsupplies.client.ApiClient;
import com.acmepetsupplies.client.ApiException;
import com.acmepetsupplies.client.Configuration;
import com.acmepetsupplies.client.auth.*;
import com.acmepetsupplies.client.models.*;
import com.acmepetsupplies.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.acme-pet-supplies.co.uk");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    UUID id = UUID.fromString("d8ec6b7c-a5f9-16ac-76d0-7da97292c582"); // UUID | Product identifier
    try {
      ViewProduct200Response result = apiInstance.viewProduct(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#viewProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Product identifier | |

### Return type

[**ViewProduct200Response**](ViewProduct200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Bad Request |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Not authorized |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **403** | Forbidden |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **404** | Not Found |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **406** | Not Acceptable |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **415** | 415 Unsupported Media Type |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | 429 Too Many Requests |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After - If request limit exceeded, retry after this time window. <br>  |
| **500** | 500 Internal Server Error |  -  |

