package com.lama.LamaProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lama.LamaProject.main.Cenovnik;
import com.lama.LamaProject.repository.CenovnikRepository;
import com.lama.LamaProject.service.CenovnikService;


@Service
@Transactional
public class CenovnikImpl implements CenovnikService{

	@Autowired
	CenovnikRepository cenovnikRepository;
	
	
	@Override
	public List<Cenovnik> findAll() {
		return cenovnikRepository.findAll();
	}

	@Override
	public Cenovnik findOne(long id) {
		return cenovnikRepository.getOne(id);
	}

	@Override
	public void save(Cenovnik cenovnik) {
		cenovnikRepository.save(cenovnik);
		
	}
	
}
