package com.lama.LamaProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lama.LamaProject.main.GrupaRobe;
import com.lama.LamaProject.repository.GrupaRobeRepository;
import com.lama.LamaProject.service.GrupaRobeServiceS;
import com.lama.LamaProject.service.RobaServiceS;

@Service
@Transactional
public class GrupaRobeImpl implements GrupaRobeServiceS{
	
	@Autowired
	GrupaRobeRepository grupaRobeRepository;
	
	@Autowired
	private RobaServiceS robaService;
	
	@Override
	public GrupaRobe findOne(Long id) {
		GrupaRobe grupaRobe = grupaRobeRepository.getOne(id);
		if (grupaRobe != null) {
			return grupaRobe;
		} else {
			throw new RuntimeException("Nije pronadjena grupa robe!");
		}
	}
	
	
	@Override
	public List<GrupaRobe> findAll() {

		return grupaRobeRepository.findAll();
	}

	@Override
	public void save(GrupaRobe grupaRobe) {
		grupaRobeRepository.save(grupaRobe);
	}
	
	@Override
	public void izbrisiGrupuRobe(GrupaRobe grupaRobe) {
		grupaRobe.setObrisano(true);
		robaService.izbrisiRobuByGrupaRobeId(grupaRobe.getId());
		grupaRobeRepository.save(grupaRobe);
	}
	
	@Override
	public void izbrisiGrupuRobeByPdvId(Long pdvId) {	
		List<GrupaRobe> listaGrupeRobe = grupaRobeRepository.findByPdvId(pdvId);
		for (GrupaRobe grupaRobe : listaGrupeRobe) {
			izbrisiGrupuRobe(grupaRobe);
		}
		
	}

}
