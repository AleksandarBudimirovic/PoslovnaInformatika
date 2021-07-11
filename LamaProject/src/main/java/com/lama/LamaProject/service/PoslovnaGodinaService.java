package com.lama.LamaProject.service;

import java.util.List;

import com.lama.LamaProject.main.PoslovnaGodina;

public interface PoslovnaGodinaService {

	List<PoslovnaGodina> findAll();
	
	List<PoslovnaGodina> findByZakljucenaGodinaIsFalseAndObrisanoIsFalse();

	PoslovnaGodina getOne(long id);
}
