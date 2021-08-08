package com.testapp.controllers;

import java.util.List;
import java.util.stream.Collectors;

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

import com.testapp.exceptions.MobileNotFoundException;
import com.testapp.model.Mobile;
import com.testapp.service.MobileService;

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
	public List<Mobile> getAll(){
		List<Mobile> mobileList=mobileService.getAll();
		return mobileList;
		
	}
	@GetMapping("/mobiles-by-brand")
	public List<Mobile> getByBrand(@RequestParam("brand")String brand){
		List<Mobile> mobileList=mobileService.getByBrand(brand);
		if(mobileList==null) {
			return null;
		}
		if(mobileList.isEmpty()) {
			throw new MobileNotFoundException("No mobile with this brand!!!!!");
		}
	    return mobileList.stream().sorted((mob1,mob2)->mob1.getModel().compareTo(mob2.getModel())).collect(Collectors.toList());
	};
	@GetMapping("/mobiles-by-brand-model")
	public List<Mobile> getByBrandAndModel(@RequestParam("brand")String brand,@RequestParam("model")String model){
		List<Mobile> mobileList=mobileService.getByBrandAndModel(brand, model);
		if(mobileList==null) {
			return null;
		}
		
		return mobileList.stream().filter((mobile)->mobile.getPrice()<25000.0).collect(Collectors.toList());
	};
	
	@GetMapping("/mobiles-by-id")
	 public Mobile getById(@RequestParam("mobileid")Integer mobileId){
		Mobile mobile=mobileService.getById(mobileId);
		if(mobile==null) {
			return null;
		}
		return mobile;
	};
}
