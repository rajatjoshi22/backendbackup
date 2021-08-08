package com.mobapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mobapp.model.Mobile;
import com.mobapp.service.MobileService;

@RestController
public class MobileController {

	@Autowired
	MobileService mobileService;
	
	@PostMapping(value="/mobile")
	public ResponseEntity<Void> addMobile( Mobile mobile){
		System.out.println(mobile);
		HttpHeaders headers= new HttpHeaders();
		headers.add("message", "one mobile entered");
		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).build();
	}
	
	@GetMapping("/mobiles")
	public ResponseEntity<List<Mobile>> getAll(){
		List<Mobile> mobileList=mobileService.getAll();
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(mobileList);
		
	}
	@GetMapping("/mobiles-by-brand")
	public ResponseEntity<List<Mobile>> getByBrand(@RequestParam("brand")String brand){
		List<Mobile> mobileList=mobileService.getByBrand(brand);
	    return ResponseEntity.status(HttpStatus.ACCEPTED).body(mobileList);
	};
	@GetMapping("/mobiles-by-brand-model")
	public ResponseEntity<List<Mobile>> getByBrandAndModel(@RequestParam("brand")String brand,@RequestParam("model")String model){
		List<Mobile> mobileList=mobileService.getByBrandAndModel(brand, model);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(mobileList);
	};
	
	@GetMapping("/mobiles-by-id")
	ResponseEntity<Mobile> getById(@RequestParam("mobileid")Integer mobileId){
		Mobile mobile=mobileService.getById(mobileId);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(mobile);
	};
}
