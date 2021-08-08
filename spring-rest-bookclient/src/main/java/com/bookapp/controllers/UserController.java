package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.bookapp.model.User;

@Controller
public class UserController {

	public static final String BASEURL="http://localhost:8083";
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "loginform";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute User user,ModelMap model) {
		if(user.getLoginId().equals("admin")&&user.getPassword().equals("admin1234")) {
            model.addAttribute("user",user);
			return "adminpage";
		}
		String url=BASEURL+"/User?loginId="+user.getLoginId()+"&password="+user.getPassword();
		MultiValueMap<String ,Object> paramMap=new LinkedMultiValueMap<String,Object>();
		paramMap.add("loginId",user.getLoginId());
		paramMap.add("password",user.getPassword());
		ResponseEntity<User> entity=restTemplate.getForEntity(url,User.class);
		model.addAttribute("user",entity.getBody());
		url=BASEURL+"/Books";
		ResponseEntity<?> bookEntity=restTemplate.getForEntity(url,List.class);
		model.addAttribute("bookList",bookEntity.getBody());
		return "userpage";
	     
	}
	
	@GetMapping("/signupForm")
	public String signupForm() {
		return "usersignup";
	}
	
	@PostMapping("/signup")
	public String signUp(@ModelAttribute User user,Model model) {
		String url=BASEURL+"/User";
		MultiValueMap<String,Object> paramMap=new LinkedMultiValueMap<String,Object>();
		paramMap.add("loginId",user.getLoginId());
		paramMap.add("password",user.getPassword());
		paramMap.add("userName",user.getUserName());
		paramMap.add("mobileNumber",user.getMobileNumber());
		String result=restTemplate.postForObject(url, paramMap, String.class);
		model.addAttribute("message",result);
		return "loginform";
	}
	
	
	@GetMapping("/forgottenpassword")
	public String passwordForm() {
		return "passwordform";
	}
	
	@PostMapping("/resetpassword")
	public String getById(@RequestParam("loginId")String loginId,Model model) {
		String url=BASEURL+"/user-by-id?loginId="+loginId;
        ResponseEntity<?> entity=restTemplate.getForEntity(url,User.class);
        model.addAttribute("user",entity.getBody());
        return "resetpasswordform";
	}
	
	@PostMapping("/savePassword")
	public String savePassword(@ModelAttribute User user,Model model) {
		String url=BASEURL+"/User";
		MultiValueMap<String, Object> paramMap=new LinkedMultiValueMap<String,Object>();
		paramMap.add("loginId",user.getLoginId());
		paramMap.add("password",user.getPassword());
		restTemplate.put(url, paramMap);
		model.addAttribute("message","password updated Successfully!!!!");
		return "loginform";
	}
}
