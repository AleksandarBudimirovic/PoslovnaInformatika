package com.lama.LamaProject.service;

import java.util.List;

import com.lama.LamaProject.main.Cenovnik;

public interface CenovnikService {

	List<Cenovnik> findAll();
	Cenovnik findOne(long id);
	void save(Cenovnik cenovnik);
	
}
