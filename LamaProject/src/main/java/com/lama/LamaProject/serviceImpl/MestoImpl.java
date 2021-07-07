package com.lama.LamaProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lama.LamaProject.main.Mesto;
import com.lama.LamaProject.repository.MestoRepository;
import com.lama.LamaProject.service.MestoServiceS;
import com.lama.LamaProject.service.PoslovniPartnerServiceS;


@Service
@Transactional
public class MestoImpl implements MestoServiceS {
	
	@Autowired
	MestoRepository mestoRepository;
	
	@Autowired
	PoslovniPartnerServiceS poslovniPartnerService;
	
	@Override
	public Mesto findOne(Long id) {
		Mesto mesto = mestoRepository.getOne(id);
		if(mesto != null) {
			return mesto;
		}
		else {
			throw new RuntimeException("Nije pronadjeno trazeno mesto");
		}
	}

	@Override
	public List<Mesto> findAll() {

		return mestoRepository.findAll();
	}

	@Override
	public void save(Mesto mesto) {
		mestoRepository.save(mesto);
		
	}

	@Override
	public void izbrisiMesto(Mesto mesto) {
		
	}

}
