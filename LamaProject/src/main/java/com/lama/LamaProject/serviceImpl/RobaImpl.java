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
	//
	@Override
	public Roba findOne(Long id) {
		Roba roba = robaRepository.getOne(id);
		if(roba != null) {
			return roba;
		}
		else {
			throw new RuntimeException("Nije pronadjen  proizvod koji ste trazili!");
		}
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
		roba.setObrisano(true);
		robaRepository.save(roba);
	}

	@Override
	public void izbrisiRobuByGrupaRobeId(Long grupaRobeId) {
		List<Roba> listaRobe = robaRepository.findByGrupaRobeId(grupaRobeId);
		for (Roba roba : listaRobe) {
			roba.setObrisano(true);
			robaRepository.save(roba);
		}
	}
	
}
