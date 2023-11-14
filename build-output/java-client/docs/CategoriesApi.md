# CategoriesApi

All URIs are relative to *https://api.acme-pet-supplies.co.uk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listCategories**](CategoriesApi.md#listCategories) | **GET** /v1/catalog/categories | List all categories |


<a id="listCategories"></a>
# **listCategories**
> CategoriesResponse listCategories()

List all categories

List all categories.

### Example
```java
// Import classes:
import com.acmepetsupplies.client.ApiClient;
import com.acmepetsupplies.client.ApiException;
import com.acmepetsupplies.client.Configuration;
import com.acmepetsupplies.client.auth.*;
import com.acmepetsupplies.client.models.*;
import com.acmepetsupplies.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.acme-pet-supplies.co.uk");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    try {
      CategoriesResponse result = apiInstance.listCategories();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#listCategories");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CategoriesResponse**](CategoriesResponse.md)

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

