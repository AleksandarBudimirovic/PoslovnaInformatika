package com.lama.LamaProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lama.LamaProject.main.Roba;
import com.lama.LamaProject.repository.RobaRepository;
import com.lama.LamaProject.service.RobaServiceS;

@Service
@Transactional
public class RobaImpl implements RobaServiceS {

	@Autowired
	RobaRepository robaRepository;
	
	@Override
	public Roba findOne(Long id) {
		
	}

	@Override
	public List<Roba> findAll() {

		return robaRepository.findAll();
	}

	@Override
	public void save(Roba roba) {
		robaRepository.save(roba);
	}

	@Override
	public void izbrisiRobu(Roba roba) {	
			
	}

	@Override
	public void izbrisiRobuByGrupaRobeId(Long grupaRobeId) {
		
	}
	
}
