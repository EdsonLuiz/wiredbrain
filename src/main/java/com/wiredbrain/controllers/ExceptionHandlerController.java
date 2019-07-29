package com.wiredbrain.controllers;

import javax.validation.ValidationException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.wiredbrain.utils.ErrorMessage;

@ControllerAdvice
public class ExceptionHandlerController {
	
	@ResponseBody
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler
	ErrorMessage exceptionHandler(ValidationException e) {
		return new ErrorMessage("400", e.getMessage());
	}
}
