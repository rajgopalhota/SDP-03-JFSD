package com.SDP.Vajra.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
	public ResponseEntity<Register> registerUservajra(@RequestPart("imagePath") MultipartFile imagePath,
			@RequestPart("signaturePath") MultipartFile signaturePath, @RequestPart("firstName") String firstName,
			@RequestPart("lastName") String lastName, @RequestPart("email") String email,
			@RequestPart("phone") String phone, @RequestPart("password") String password,
			@RequestPart("gender") String gender, @RequestPart("aadharNumber") String aadharNumber,
			@RequestPart("panNumber") String panNumber) {
		try {
			Register register = new Register();
			register.setFirstName(firstName);
			register.setLastName(lastName);
			register.setEmail(email);
			register.setPhone(phone);
			register.setPassword(password);
			register.setGender(gender);
			register.setAadharNumber(aadharNumber);
			register.setPanNumber(panNumber);
			byte[] decodedImagePath = imagePath.getBytes();
	        byte[] decodedSignaturePath = signaturePath.getBytes();
			register.setImagePath(decodedImagePath);
			register.setSignaturePath(decodedSignaturePath);
			Register registeredUser = rss.registerUser(register);
			return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	@PostMapping("/login")
	public ResponseEntity<Register> loginUser(@RequestPart("phone") String phone, @RequestPart("password") String password) {
	    try {
	        Register user = rss.findById(phone);

	        if (user != null && user.getPassword().equals(password)) {
	        	
	            return new ResponseEntity<>(user, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	
	@GetMapping("/images/{phonenumber}/{imageType}")
    public ResponseEntity<byte[]> getImage(@PathVariable String phonenumber,@PathVariable String imageType) {
        try {
            Register user = (Register) rss.findById(phonenumber);

            if (user != null) {
                byte[] imageData = null;
                if ("photo".equals(imageType) && user.getImagePath() != null) {
                    imageData = user.getImagePath();
                } else if ("signature".equals(imageType) && user.getSignaturePath() != null) {
                    imageData = user.getSignaturePath();
                }

                if (imageData != null) {
                    return new ResponseEntity<>(imageData, HttpStatus.OK);
                }
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	
	
}
