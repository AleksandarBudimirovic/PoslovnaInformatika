package com.lama.LamaProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lama.LamaProject.main.StopaPdv;
import com.lama.LamaProject.repository.StopaPdvRepository;
import com.lama.LamaProject.service.GrupaRobeServiceS;
import com.lama.LamaProject.service.StopaPdvService;


@Service
@Transactional
public class StopaPdvImpl implements StopaPdvService {

	@Autowired
	StopaPdvRepository stopaPdvRepository;
	
	@Autowired
	private GrupaRobeServiceS grupaRobeService;
	
	@Override
	public StopaPdv findOne(Long id) {
		StopaPdv stopaPdv = stopaPdvRepository.getOne(id);
		if(stopaPdv != null) {
			return stopaPdv;
		}
		else {
			throw new RuntimeException("Nije pronadjena stopa pdv");
		}
	}

	@Override
	public List<StopaPdv> findAll() {

		return stopaPdvRepository.findAll();
	}

	@Override
	public void save(StopaPdv stopaPDV) {
		stopaPdvRepository.save(stopaPDV);
	}

	@Override
	public void izbrisiStopuPdv(StopaPdv stopaPdv) {
		stopaPdv.setObrisano(true);
		stopaPdvRepository.save(stopaPdv);
	}

}