package com.natixis.dto;

public class Message {
	
	private boolean success;
	private String cause;
	
	
	
	public Message(boolean success) {
		super();
		this.success = success;
	}
	public Message(boolean success, String cause) {
		this.success = success;
		this.cause = cause;
	}
	public Message() {
	}
	
	
	public boolean isSuccess() {
		return success;
	}
	public String getCause() {
		return cause;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	
	
	

}
