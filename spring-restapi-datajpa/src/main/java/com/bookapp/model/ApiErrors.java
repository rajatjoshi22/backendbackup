package com.bookapp.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiErrors {
	private LocalDateTime timestamp;
	private Integer status;
	private String error;
	private String message;
}
