package com.teksystems.exchangerate.exception;

import org.springframework.http.HttpStatus;

public class ExceptionResponse {
	private String errorMessage;
	private HttpStatus status;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	

}
