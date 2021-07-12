package com.lama.LamaProject.service;

import java.util.List;

import com.lama.LamaProject.main.StavkeCenovnika;

public interface StavkaCenovnikaService {

	List<StavkeCenovnika> findStavkeCenovnikaByCenovnikId(long id);

	void save(StavkeCenovnika stavka);

	List<StavkeCenovnika> findStavkeCenovnikaByRobaId(long id);
	
}
