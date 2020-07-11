package com.upgrad.quora.api.exception;

import com.upgrad.quora.api.model.ErrorResponse;
import com.upgrad.quora.service.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RestExceptionHandler {

  @ExceptionHandler(SignUpRestrictedException.class)
  public ResponseEntity<ErrorResponse> signUpRestrictionException(
      SignUpRestrictedException exception, WebRequest request) {
    return new ResponseEntity<ErrorResponse>(
        new ErrorResponse().code(exception.getCode()).message(exception.getErrorMessage()),
        HttpStatus.CONFLICT);
  }

  @ExceptionHandler(SignOutRestrictedException.class)
  public ResponseEntity<ErrorResponse> signOutRestrictedException(
      SignOutRestrictedException exception, WebRequest request) {
    return new ResponseEntity<ErrorResponse>(
        new ErrorResponse().code(exception.getCode()).message(exception.getErrorMessage()),
        HttpStatus.UNAUTHORIZED);
  }
  @ExceptionHandler(AuthenticationFailedException.class)
  public ResponseEntity<ErrorResponse> authenticationFailedException(
          AuthenticationFailedException exception, WebRequest request) {
    return new ResponseEntity<ErrorResponse>(
            new ErrorResponse().code(exception.getCode()).message(exception.getErrorMessage()),
            HttpStatus.UNAUTHORIZED);
  }
}