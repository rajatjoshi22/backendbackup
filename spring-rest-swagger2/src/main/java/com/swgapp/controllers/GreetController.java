package com.swgapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
@RestController
@Api(value="Greetings")
@RequestMapping("greetings-api")
public class GreetController {

	@GetMapping(value="/greetMessage/{name}")
	@ApiOperation(value="Greet Operation",response=String.class)
	 @ApiResponses(value= {
			    @ApiResponse(code = 200,message = "success"),
	            @ApiResponse(code = 401,message = "Message not found")
	 })
	public String greetMessage(@PathVariable("name")String name) {
		return "Have a great day "+name;
	}
	
	@RequestMapping(value="/show/{model}/{brand}",method=RequestMethod.GET)
	public String showDetails(@PathVariable("model")String model,@PathVariable("brand")String brand) {
		return "Mobile Details=>Model:"+model+"\t"+"Brand: "+brand;
	}
}
