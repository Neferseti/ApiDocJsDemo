package com.api.doc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

@RestController
@RequestMapping("/user")
public class MainController {

	@RequestMapping(method=RequestMethod.GET)
	public String getUsers(){
		JsonObject response = new JsonObject();
		response.addProperty("firstName", "Mani");
		response.addProperty("middleName", "Kumar");
		response.addProperty("lastName", "Srivastava");
		response.addProperty("age", 23);
		
		return new Gson().toJson(response);
		
		
	}
	
}
