package com.lama.LamaProject.service;

import java.util.List;

import com.lama.LamaProject.main.Mesto;

public interface MestoServiceS {
	
	Mesto findOne(Long id);
	
	List<Mesto> findAll();
	
	void save(Mesto mesto);
	
	void izbrisiMesto(Mesto mesto);


}
