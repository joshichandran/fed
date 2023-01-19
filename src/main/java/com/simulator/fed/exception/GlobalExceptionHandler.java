package com.simulator.fed.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.simulator.fed.model.ApiErrorResponse;

import lombok.extern.log4j.Log4j2;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
@Log4j2
public class GlobalExceptionHandler {

	@ExceptionHandler(ApplicationException.class)
	public ResponseEntity<ApiErrorResponse> handleSystemException(ApplicationException ex) {
		log.error("ApplicationException ", ex);
		ApiErrorResponse response = new ApiErrorResponse(ex.getCode(), ex.getMessage());
		return new ResponseEntity<>(response, HttpStatus.valueOf(400));
	}

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<ApiErrorResponse> handleSystemException(RuntimeException ex) {
		log.error("RuntimeException ", ex);
		ApiErrorResponse response = new ApiErrorResponse(500, ex.getMessage());
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiErrorResponse> handleIOException(Exception ex) {
		log.error("Exception ", ex);
		ApiErrorResponse response = new ApiErrorResponse(500, ex.getMessage());
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
