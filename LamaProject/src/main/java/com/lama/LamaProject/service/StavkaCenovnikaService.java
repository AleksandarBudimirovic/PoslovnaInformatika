package com.lama.LamaProject.service;

import java.util.List;

import com.lama.LamaProject.main.StavkaCenovnika;

public interface StavkaCenovnikaService {

	List<StavkaCenovnika> findStavkeCenovnikaByCenovnikId(long id);

	void save(StavkaCenovnika stavka);

	List<StavkaCenovnika> findStavkeCenovnikaByRobaId(long id);
	
}
