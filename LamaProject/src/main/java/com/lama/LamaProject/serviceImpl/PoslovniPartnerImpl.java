package com.lama.LamaProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lama.LamaProject.main.PoslovniPartner;
import com.lama.LamaProject.repository.PoslovniPartnerRepository;
import com.lama.LamaProject.service.PoslovniPartnerServiceS;

@Service
@Transactional
public class PoslovniPartnerImpl implements PoslovniPartnerServiceS {
	
	@Autowired
	PoslovniPartnerRepository poslovniPartnerRepository;

	@Override
	public List<PoslovniPartner> findAll() {
		return poslovniPartnerRepository.findAll();
	}

	@Override
	public PoslovniPartner findOne(Long id) {
		
	}

	@Override
	public void save(PoslovniPartner poslovniPartner) {
		poslovniPartnerRepository.save(poslovniPartner);
	}
	
	@Override
	public void izbrisiPoslovnogPartnera(PoslovniPartner poslovniPartner) {	
		
	}

	@Override
	public void izbrisiPoslovnogPartneraByMestoId(Long mestoId) {
		
	}

}
