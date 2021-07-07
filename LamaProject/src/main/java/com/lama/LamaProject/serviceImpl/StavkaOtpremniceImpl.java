package com.lama.LamaProject.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lama.LamaProject.main.StavkaOtpremnice;
import com.lama.LamaProject.repository.StavkaOtpremniceRepository;
import com.lama.LamaProject.service.StavkaOtpremnicaServiceS;


@Service
@Transactional
public class StavkaOtpremniceImpl implements StavkaOtpremnicaServiceS {
	
	@Autowired
	StavkaOtpremniceRepository stavkaOtpremniceRepository;

	@Override
	public List<StavkaOtpremnice> findAll() {
		return stavkaOtpremniceRepository.findAllOtpremnice();
	}

	@Override
	public void save(StavkaOtpremnice stavka) {
        stavkaOtpremniceRepository.save(stavka);		
	}

	@Override
	public StavkaOtpremnice findOne(long id) {
		return stavkaOtpremniceRepository.getOne(id);
	}

	@Override
	public void izbrisiStavkuOtpremnice(StavkaOtpremnice stavka) {
		
		
	}


}
