# ReviewsApi

All URIs are relative to *https://api.acme-pet-supplies.co.uk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listProductReviews**](ReviewsApi.md#listProductReviews) | **GET** /v1/catalog/products/{id}/reviews | List reviews |


<a id="listProductReviews"></a>
# **listProductReviews**
> ReviewsResponse listProductReviews(id)

List reviews

List all reviews for a product.

### Example
```java
// Import classes:
import com.acmepetsupplies.client.ApiClient;
import com.acmepetsupplies.client.ApiException;
import com.acmepetsupplies.client.Configuration;
import com.acmepetsupplies.client.auth.*;
import com.acmepetsupplies.client.models.*;
import com.acmepetsupplies.api.ReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.acme-pet-supplies.co.uk");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ReviewsApi apiInstance = new ReviewsApi(defaultClient);
    UUID id = UUID.fromString("d8ec6b7c-a5f9-16ac-76d0-7da97292c582"); // UUID | Product identifier
    try {
      ReviewsResponse result = apiInstance.listProductReviews(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewsApi#listProductReviews");
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

[**ReviewsResponse**](ReviewsResponse.md)

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
| **406** | Not Acceptable |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **415** | 415 Unsupported Media Type |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | 429 Too Many Requests |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After - If request limit exceeded, retry after this time window. <br>  |
| **500** | 500 Internal Server Error |  -  |

