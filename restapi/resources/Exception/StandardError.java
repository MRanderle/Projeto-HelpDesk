package com.gfinest.restapi.resources.Exception;

import java.io.Serializable;

public class StandardError implements Serializable{
	
 static final long serialVersionUID = 1L; 

	private Long timestarp;
	private String status;
	private String error;
	private String message;
	private String path;
	
	public StandardError() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StandardError(Long timestarp, int i, String error, String message, String path, String status) {
		super();
		this.timestarp = timestarp;
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
	}
	public Long getTimestarp() {
		return timestarp;
	}
	public void setTimestarp(Long timestarp) {
		this.timestarp = timestarp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
}
