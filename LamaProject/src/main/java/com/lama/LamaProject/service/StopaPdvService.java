package com.lama.LamaProject.service;

import java.util.List;

import com.lama.LamaProject.main.StopaPdv;

public interface StopaPdvService {

	List<StopaPdv> findAll();
	
    StopaPdv findOne(Long id);
    
    void save(StopaPdv stopaPDV);
    
    void izbrisiStopuPdv(StopaPdv stopaPDV);
	
}
