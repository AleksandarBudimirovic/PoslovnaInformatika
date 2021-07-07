package com.lama.LamaProject.service;

import java.util.List;

import com.lama.LamaProject.main.Pdv;

public interface PdvService {

	Pdv findOne(Long id);
	
	List<Pdv> findAll();
	
}
