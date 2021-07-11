package com.lama.LamaProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lama.LamaProject.main.PoslovnaGodina;
import com.lama.LamaProject.repository.PoslovnaGodinaRepository;
import com.lama.LamaProject.service.PoslovnaGodinaService;

public class PoslovnaGodinaImpl implements PoslovnaGodinaService {
	
	@Autowired
	PoslovnaGodinaRepository poslovnaGodinaRepository;
	
	@Override
	public List<PoslovnaGodina> findAll() {
		return poslovnaGodinaRepository.findAll();
	}
	@Override
	public List<PoslovnaGodina> findByZakljucenaGodinaIsFalseAndObrisanoIsFalse() {
		return poslovnaGodinaRepository.findByZakljucenaGodinaIsFalseAndObrisanoIsFalse();
	}

	@Override
	public PoslovnaGodina getOne(long id) {
		return poslovnaGodinaRepository.getOne(id);
	}
}
