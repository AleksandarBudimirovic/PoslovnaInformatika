package com.lama.LamaProject.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lama.LamaProject.main.IzlaznaFaktura;

@Service
public interface IzlaznaFakturaImpl  {

	void save(IzlaznaFaktura izlaznaFaktura);

	void update(IzlaznaFaktura izlaznaFaktura);

	List<IzlaznaFaktura> findAll();
}
