package com.lama.LamaProject.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lama.LamaProject.main.StavkeCenovnika;
import com.lama.LamaProject.repository.StavkaCenovnikaRepository;
import com.lama.LamaProject.service.StavkaCenovnikaService;


@Service
@Transactional
public class StavkaCenovnikaImpl implements StavkaCenovnikaService {

	@Autowired
	StavkaCenovnikaRepository stavkaCenovnikaRepository;

	@Override
	public List<StavkeCenovnika> findStavkeCenovnikaByCenovnikId(long id) {
		return stavkaCenovnikaRepository.findAll().stream()
				.filter(sc -> sc.getCenovnik().getId() == id)
				.collect(Collectors.toList());
	}

	@Override
	public void save(StavkeCenovnika stavka) {
		stavkaCenovnikaRepository.save(stavka);
		
	}

	@Override
	public List<StavkeCenovnika> findStavkeCenovnikaByRobaId(long id) {
		return stavkaCenovnikaRepository.findAll().stream()
				.filter(sc -> sc.getRoba().getId() == id)
				.collect(Collectors.toList());
	}
	
	

}
