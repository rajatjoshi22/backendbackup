package com.studentapp.exceptions;

import java.time.LocalDateTime;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.studentapp.model.ApiErrors;

@ControllerAdvice
public class GlobalExceptionHandler extends  ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		String message=ex.getMessage();
		String reason=status.getReasonPhrase();
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),status.value(),reason,message);
		 return ResponseEntity.status(status).body(errors);
		
		
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		String message=ex.getMessage();
		String reason=status.getReasonPhrase();
		HttpHeaders header=new HttpHeaders();
		header.add("error","Media type is not supported");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),status.value(),reason,message);
		 return ResponseEntity.status(status).headers(header).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		String message=ex.getMessage();
		String reason=status.getReasonPhrase();
		HttpHeaders header=new HttpHeaders();
		header.add("error","Missing Path Variable!!!");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),status.value(),reason,message);
		 return ResponseEntity.status(status).headers(header).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		String message=ex.getMessage();
		String reason=status.getReasonPhrase();
		HttpHeaders header=new HttpHeaders();
		header.add("error","Missing Request Parameter!!!");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),status.value(),reason,message);
		 return ResponseEntity.status(status).headers(header).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		String message=ex.getMessage();
		String reason=status.getReasonPhrase();
		HttpHeaders header=new HttpHeaders();
		header.add("error","Input Mismatch!!!");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),status.value(),reason,message);
		 return ResponseEntity.status(status).headers(header).body(errors);
	}
	
	@ExceptionHandler(IdNotFoundException.class)
	protected ResponseEntity<Object> handleIdNotFoundException(IdNotFoundException ex){
		String message=ex.getMessage();
		String reason=HttpStatus.BAD_REQUEST.getReasonPhrase();
		HttpHeaders headers=new HttpHeaders();
		headers.add("error","Wrong studentId");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),HttpStatus.BAD_REQUEST.value(),reason,message);
	     return ResponseEntity.status(HttpStatus.BAD_REQUEST).headers(headers).body(errors);	
	}
	
	@ExceptionHandler(CityNotFoundException.class)
	protected ResponseEntity<Object> handleCityNotFoundException(CityNotFoundException ex){
		String message=ex.getMessage();
		String reason=HttpStatus.BAD_REQUEST.getReasonPhrase();
		HttpHeaders headers=new HttpHeaders();
		headers.add("error","Invalid city name");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),HttpStatus.BAD_REQUEST.value(),reason,message);
	     return ResponseEntity.status(HttpStatus.BAD_REQUEST).headers(headers).body(errors);	
	}
	
	@ExceptionHandler(StudentNotFoundException.class)
	protected ResponseEntity<Object> handleStudentNotFoundException(StudentNotFoundException ex){
		String message=ex.getMessage();
		String reason=HttpStatus.BAD_REQUEST.getReasonPhrase();
		HttpHeaders headers=new HttpHeaders();
		headers.add("error","No Student found with this name!!!!");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),HttpStatus.BAD_REQUEST.value(),reason,message);
	     return ResponseEntity.status(HttpStatus.BAD_REQUEST).headers(headers).body(errors);	
	}

}
