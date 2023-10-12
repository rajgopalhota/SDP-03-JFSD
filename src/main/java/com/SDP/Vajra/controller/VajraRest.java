package com.SDP.Vajra.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.SDP.Vajra.model.Register;
import com.SDP.Vajra.service.RegisterService;

@CrossOrigin("http://localhost:3000")
@RestController
public class VajraRest {
	RegisterService rss;

	@Autowired
	public VajraRest(RegisterService rss) {
		super();
		this.rss = rss;
	}

	@PostMapping("/reg")
	public ResponseEntity<Register> registerUservajra(@RequestBody Register rg) {
		Register registeredUser = rss.registerUser(rg);
		return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
	}

}
