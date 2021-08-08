package com.mobapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.mobapp.model.Mobile;

//@Controller
public class MobClientController {
	
	
@Autowired
RestTemplate restTemplate;
public static final String BASEURL="http://localhost:8787";

@GetMapping("/")
public String homePage(Model model) {
	String url=BASEURL+"/mobiles";
	ResponseEntity<?> entity=restTemplate.getForEntity(url, List.class);
	model.addAttribute("mobileList",entity.getBody());
	return "home";
}

@PostMapping(value="/mobiles")
public String addMobile(@ModelAttribute Mobile mobile,Model model) {
	String url=BASEURL+"/mobile";
	System.out.println(mobile);
	//for content type
	HttpHeaders headers=new HttpHeaders();
//	headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
	
	//use mutivale map for body content
	MultiValueMap<String, Object> paramMap=new LinkedMultiValueMap<String,Object>();

	paramMap.add("mobileid",mobile.getMobileid());
	paramMap.add("model",mobile.getModel());
	paramMap.add("brand",mobile.getBrand());
	paramMap.add("price",mobile.getPrice());
	
	
//	//for getting enity with headers
//	HttpEntity<MultiValueMap<String,Object>> request=new HttpEntity<>(paramMap,headers);
//	ResponseEntity<Void> entity=restTemplate.postForEntity(url, request, Void.class);
	
//	System.out.println(entity.getStatusCode());

	//for getting only body part
	restTemplate.postForObject(url,paramMap,Void.class);
	System.out.println("added");
	return "home";
}

@GetMapping("/search-by-Brand")
public String searchByBrand(@RequestParam("brand")String brand,Model model) {
	String url=BASEURL+"/mobiles-by-brand"+"?brand="+brand;
	ResponseEntity<?> entity=restTemplate.getForEntity(url, List.class);
	model.addAttribute("mobileList",entity.getBody());
	return "home";
}

@GetMapping("/search-by-BrandandModel")
public String serachByBrandModel(@RequestParam("brand")String brand,@RequestParam("model")String model,Model model1) {
	String url=BASEURL+"/mobiles-by-brand-model"+"?brand="+brand+"&"+"model="+model;
	ResponseEntity<?> entity=restTemplate.getForEntity(url,List.class);
	model1.addAttribute("mobileList",entity.getBody());
	return "home";
}
}
