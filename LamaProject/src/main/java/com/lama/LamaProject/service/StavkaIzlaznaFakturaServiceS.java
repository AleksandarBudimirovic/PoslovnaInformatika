package com.lama.LamaProject.service;

import java.util.List;

import com.lama.LamaProject.main.StavkaIzlaznaFaktura;

public interface StavkaIzlaznaFakturaServiceS {
	
	List<StavkaIzlaznaFaktura> findAll();
	
	void save(StavkaIzlaznaFaktura novaStavkaIzlaznaFaktura);

}
