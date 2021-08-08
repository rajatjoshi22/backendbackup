package com.mobapp.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClient;

import com.mobapp.model.Mobile;

import reactor.core.publisher.Flux;

@Controller
public class MobilewebCliController {
//using create method
WebClient client=WebClient.create("http://localhost:8787");

//using BuilderApi
WebClient client1=WebClient.builder().baseUrl("http://localhost:8787").build();
@GetMapping("/")
public String homePage(Model model) {
List<Mobile> mobileList=client.get().uri("/mobiles").retrieve().bodyToFlux(Mobile.class).toStream().collect(Collectors.toList());
model.addAttribute("mobileList",mobileList);
return "home";
}

@GetMapping("/search-by-Brand")
public String searchByBrand(@RequestParam("brand")String brand,Model model) {
	List<Mobile> mobileList=client.get().uri("/mobiles-by-brand"+"?brand="+brand).retrieve().bodyToFlux(Mobile.class).toStream().collect(Collectors.toList());
	model.addAttribute("mobileList",mobileList);
	return "home";
}

@GetMapping("/search-by-BrandandModel")
public String serachByBrandModel(@RequestParam("brand")String brand,@RequestParam("model")String model,Model model1) {
	List<Mobile> mobileList=client.get().uri("/mobiles-by-brand-model"+"?brand="+brand+"&"+"model="+model).retrieve().bodyToFlux(Mobile.class).toStream().collect(Collectors.toList());
	model1.addAttribute("mobileList",mobileList);
	return "home";

}

@GetMapping("/search-by-id")
public String serachByBrandModel(@RequestParam("mobileid")Integer mobileid,Model model) {
	Mobile mobile=client.get().uri("/mobiles-by-id"+"?mobileid="+mobileid).retrieve().bodyToMono(Mobile.class).block();
	model.addAttribute("mobile",mobile);
	return "home";

}

}
