package com.SDP.Vajra.service;

import com.SDP.Vajra.model.Register;

public interface RegisterService {
	public Register registerUser(Register r);

	public Register findById(String id);

}
