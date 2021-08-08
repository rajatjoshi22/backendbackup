package com.studentapp.model;

import java.time.LocalDateTime;
public class ApiErrors {
private LocalDateTime timestamp;
private Integer status;
private String error;
private String message;
public LocalDateTime getTimestamp() {
	return timestamp;
}
public void setStatus(Integer status) {
	this.status = status;
}


public Integer getStatus() {
	return status;
}
public void setTimestamp(LocalDateTime timestamp) {
	this.timestamp = timestamp;
}
public ApiErrors(LocalDateTime timestamp, Integer status, String error, String message) {
	super();
	this.timestamp = timestamp;
	this.status = status;
	this.error = error;
	this.message = message;
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
public ApiErrors() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "ApiErrors [timestamp=" + timestamp + ", status=" + status + ", error=" + error + ", message=" + message
			+ "]";
}

}
