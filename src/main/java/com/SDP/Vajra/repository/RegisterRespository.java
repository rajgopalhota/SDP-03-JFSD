package com.SDP.Vajra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.SDP.Vajra.model.Register;


public interface RegisterRespository extends JpaRepository<Register, Integer> {
	
}
