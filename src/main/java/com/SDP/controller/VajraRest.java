package com.SDP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.SDP.model.Register;
import com.SDP.service.RegisterService;


@RestController
public class VajraRest {
	RegisterService rss;

	@Autowired
	public VajraRest(RegisterService rss) {
		super();
		this.rss = rss;
	}
	
	@PostMapping("/reg")
	public void registerUser(@RequestBody Register rg) {
		rss.registerUser(rg);
	}
	
	

}
