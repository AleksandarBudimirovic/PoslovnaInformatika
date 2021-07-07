package com.lama.LamaProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lama.LamaProject.main.StavkaIzlaznaFaktura;
import com.lama.LamaProject.repository.StavkaIzlaznaFakturaRepository;
import com.lama.LamaProject.service.StavkaIzlaznaFakturaServiceS;

@Service
@Transactional
public class StavkaIzlaznaFakturaImpl implements StavkaIzlaznaFakturaServiceS {

	@Autowired
	StavkaIzlaznaFakturaRepository stavkaFaktureRepository;
	
	@Override
	public void save(StavkaIzlaznaFaktura novaStavkaFakture) {
		stavkaFaktureRepository.save(novaStavkaFakture);
		
	}

	@Override
	public List<StavkaIzlaznaFaktura> findAll() {
		return stavkaFaktureRepository.findAll();
	}
	
}
