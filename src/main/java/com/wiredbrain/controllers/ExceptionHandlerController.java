package com.wiredbrain.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.wiredbrain.utils.FieldErrorsMessage;

@ControllerAdvice
public class ExceptionHandlerController {
	
	@ResponseBody
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	List<FieldErrorsMessage> exceptionHandler(MethodArgumentNotValidException e) {
		List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
		List<FieldErrorsMessage> fieldErrorMessages = fieldErrors.stream()
			.map(fieldError -> new FieldErrorsMessage(fieldError.getField(), fieldError.getDefaultMessage()))
			.collect(Collectors.toList());
		return fieldErrorMessages;
	}
}
