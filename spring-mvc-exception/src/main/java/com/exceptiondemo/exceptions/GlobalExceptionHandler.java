package com.exceptiondemo.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(IdNotFoundException.class)
public String handleIdException(IdNotFoundException e,Model model)
{
	model.addAttribute("message",e.getMessage());
	return "redirect:/";
}
@ExceptionHandler(Exception.class)
public String handleOtherException(Exception e,Model model)
{
	model.addAttribute("message","Exception!!!!");
	return "redirect:/";
}
}
