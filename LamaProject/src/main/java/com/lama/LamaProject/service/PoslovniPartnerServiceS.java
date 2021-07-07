package com.lama.LamaProject.service;

import java.util.List;

import com.lama.LamaProject.main.PoslovniPartner;

public interface PoslovniPartnerServiceS {
	
	List<PoslovniPartner> findAll();

	PoslovniPartner findOne(Long id);

	void save(PoslovniPartner poslovniPartner);
	
	void izbrisiPoslovnogPartnera(PoslovniPartner poslovniPartner);
	
	void izbrisiPoslovnogPartneraByMestoId (Long mestoId);

}
