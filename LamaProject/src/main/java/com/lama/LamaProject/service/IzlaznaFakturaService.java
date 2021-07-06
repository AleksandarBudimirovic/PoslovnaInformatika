package com.lama.LamaProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lama.LamaProject.main.IzlaznaFaktura;
import com.lama.LamaProject.repository.IzlaznaFakturaRepository;
import com.lama.LamaProject.serviceImpl.IzlaznaFakturaImpl;

@Service
public class IzlaznaFakturaService implements IzlaznaFakturaImpl{

	@Autowired
	IzlaznaFakturaRepository izlaznaFakturaRepository;
	
	public void update(IzlaznaFaktura izlaznaFaktura) {
		}
	
	@Override
	public void save(IzlaznaFaktura izlaznaFaktura) {
		izlaznaFakturaRepository.save(izlaznaFaktura);
		}

	@Override
	public List<IzlaznaFaktura> findAll() {
		return izlaznaFakturaRepository.findAll();
	}
}
