package com.lama.LamaProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lama.LamaProject.main.IzlaznaFaktura;
import com.lama.LamaProject.repository.IzlaznaFakturaRepository;
import com.lama.LamaProject.serviceImpl.IzlaznaFakturaImpl;

@Service
public interface IzlaznaFakturaService  {

	void save(IzlaznaFaktura izlaznaFaktura);

	void update(IzlaznaFaktura izlaznaFaktura);

	List<IzlaznaFaktura> findAll();
	
	IzlaznaFaktura getOne(long idIzlazneFakture);
}
