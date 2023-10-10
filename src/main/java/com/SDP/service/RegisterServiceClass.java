package com.SDP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SDP.model.Register;
import com.SDP.repository.RegisterRespository;

@Service
public class RegisterServiceClass implements RegisterService{
	
	RegisterRespository rs;
	
	
	@Autowired
	public RegisterServiceClass(RegisterRespository rs) {
		super();
		this.rs = rs;
	}



	@Override
	public void registerUser(Register r) {
		rs.save(r);
		
	}

}
