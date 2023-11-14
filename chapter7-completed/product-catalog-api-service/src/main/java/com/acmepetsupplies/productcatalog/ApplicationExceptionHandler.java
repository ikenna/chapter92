package com.acmepetsupplies.productcatalog;

import com.acmepetsupplies.productcatalog.model.ApiError;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.UUID;

@RestControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(
            Exception ex, @Nullable Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ApiError apiError = new ApiError();
        apiError.setId(UUID.randomUUID());
        apiError.setStatus(status.value());
        switch (status.series().value()) {
            case 4 -> apiError.setCode("validation." + status.series().name().toLowerCase());
            case 5 -> apiError.setCode("error." + status.series().name().toLowerCase());
            default -> apiError.setCode(status.series().name().toLowerCase());
        }
        apiError.setTitle(status.getReasonPhrase());
        switch (status.value()) {
            case 400 -> apiError.setDetail("Bad request. Please check the request is valid.");
            case 404 ->
                    apiError.setDetail("Resource not found. Please check the path and resource identifier in your request");
            case 429 -> apiError.setDetail("Too many requests. Request quota exceeded in time window. Try again soon");
            default -> apiError.setDetail(status.getReasonPhrase());
        }
        return new ResponseEntity<>(apiError, headers, status);
    }


}