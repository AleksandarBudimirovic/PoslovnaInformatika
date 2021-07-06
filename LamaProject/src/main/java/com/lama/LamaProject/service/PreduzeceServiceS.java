package com.lama.LamaProject.service;

import java.util.List;

import com.lama.LamaProject.main.Preduzece;

public interface PreduzeceServiceS {

	List<Preduzece> findAll();
	
	Preduzece findOne(Long id);
	
	void save(Preduzece preduzece);

}
