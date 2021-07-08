package com.lama.LamaProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lama.LamaProject.main.Pdv;
import com.lama.LamaProject.main.StopaPdv;
import com.lama.LamaProject.repository.PdvRepository;
import com.lama.LamaProject.repository.StopaPdvRepository;
import com.lama.LamaProject.service.GrupaRobeServiceS;
import com.lama.LamaProject.service.PdvService;


@Service
@Transactional
public class PdvImpl implements PdvService{

	@Autowired
	PdvRepository pdvRepository;
	
	@Override
	public Pdv findOne(Long id) {
		Pdv pdv = pdvRepository.getOne(id);
		if(pdv != null) {
			return pdv;
		}
		else {
			throw new RuntimeException("Nije pronadjen pdv");
		}
	}

	@Override
	public List<Pdv> findAll() {

		return pdvRepository.findAll();
	}
	
}
