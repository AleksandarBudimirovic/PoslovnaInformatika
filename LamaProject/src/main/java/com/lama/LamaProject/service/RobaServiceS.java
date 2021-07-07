package com.lama.LamaProject.service;

import java.util.List;

import com.lama.LamaProject.main.Roba;

public interface RobaServiceS {
	
	List<Roba> findAll();
	
	Roba findOne(Long id);
    
    void save(Roba roba);

	void izbrisiRobu(Roba roba);
	
	void izbrisiRobuByGrupaRobeId(Long grupaRobeId);

}
