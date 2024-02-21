package com.tus.accounts.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.tus.accounts.dto.ErrorResponseDto;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(CustomerAlreadyExistsException.class)
	public ResponseEntity<ErrorResponseDto> handleCustomerAlreadyException(CustomerAlreadyExistsException exception, WebRequest webRequest){
		
		ErrorResponseDto errorResponseDTO = new ErrorResponseDto(
				webRequest.getDescription(false),
				HttpStatus.BAD_REQUEST,
				exception.getMessage(),
				LocalDateTime.now()
		);
		return new ResponseEntity<>(errorResponseDTO, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponseDto> handleResourceNotFoundException(ResourceNotFoundException exception, WebRequest webRequest){
		
		ErrorResponseDto errorResponseDTO = new ErrorResponseDto(
				webRequest.getDescription(false),
				HttpStatus.NOT_FOUND,
				exception.getMessage(),
				LocalDateTime.now()
		);
		return new ResponseEntity<>(errorResponseDTO, HttpStatus.NOT_FOUND);
	}

}