package com.SDP.Vajra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.SDP.Vajra.model.Register;
import com.SDP.Vajra.repository.RegisterRespository;

@Component
@Service
public class RegisterServiceClass implements RegisterService{
	
	RegisterRespository rs;
	public RegisterServiceClass() {}
	@Autowired
	public RegisterServiceClass(RegisterRespository rs) {
		this.rs = rs;
	}

	@Override
	public Register registerUser(Register r) {
		return rs.save(r);
	}
}
