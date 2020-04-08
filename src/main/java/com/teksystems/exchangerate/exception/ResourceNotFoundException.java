package com.teksystems.exchangerate.exception;

public class ResourceNotFoundException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String message;
	private String code;

	public ResourceNotFoundException() {
		super();
	}

	public ResourceNotFoundException(final String message) {
		super(message);
	}

	public ResourceNotFoundException(String message, String code) {
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	

}
