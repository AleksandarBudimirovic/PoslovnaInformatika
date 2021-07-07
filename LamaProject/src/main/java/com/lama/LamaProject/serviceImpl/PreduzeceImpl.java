package com.lama.LamaProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lama.LamaProject.main.Preduzece;
import com.lama.LamaProject.repository.PreduzeceRepository;
import com.lama.LamaProject.service.PreduzeceServiceS;


@Service
@Transactional
public class PreduzeceImpl implements PreduzeceServiceS {
	
	@Autowired
	PreduzeceRepository preduzeceRepository;
	
	@Override
	public List<Preduzece> findAll() {
		return preduzeceRepository.findAll();
	}

	@Override
	public Preduzece findOne(Long id) {
		return preduzeceRepository.getOne(id);
	}

	@Override
	public void save(Preduzece preduzece) {
		preduzeceRepository.save(preduzece);
		
	}

}
