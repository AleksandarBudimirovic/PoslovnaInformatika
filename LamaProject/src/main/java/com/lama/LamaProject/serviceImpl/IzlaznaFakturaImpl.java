package com.lama.LamaProject.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lama.LamaProject.main.IzlaznaFaktura;
import com.lama.LamaProject.main.StavkaIzlaznaFaktura;
import com.lama.LamaProject.repository.IzlaznaFakturaRepository;
import com.lama.LamaProject.service.IzlaznaFakturaService;


@Service
public class IzlaznaFakturaImpl implements IzlaznaFakturaService{

	@Autowired
	IzlaznaFakturaRepository izlaznaFakturaRepository;
	
	public void update(IzlaznaFaktura izlaznaFaktura) {
		double ukupanPdv = 0;
		double ukupanIznosZaPlacanje = 0;
		double  rabat = 0;
		double osnovica = 0;
		for(StavkaIzlaznaFaktura sf : izlaznaFaktura.getStavkeIzlazneFakture()) {}
		
		izlaznaFaktura.setOsnovica(osnovica);
		izlaznaFaktura.setUkupanPdv(ukupanPdv);
		izlaznaFaktura.setRabat(rabat);
		izlaznaFaktura.setIznosZaPlacanje(ukupanIznosZaPlacanje);
		
		save(izlaznaFaktura);
		}
	
	@Override
	public void save(IzlaznaFaktura izlaznaFaktura) {
		izlaznaFakturaRepository.save(izlaznaFaktura);
		}

	@Override
	public List<IzlaznaFaktura> findAll() {
		return izlaznaFakturaRepository.findAll();
	}
	
	@Override
	@Transactional
	public IzlaznaFaktura getOne(long idIzlazneFakture) {
		return izlaznaFakturaRepository.getOne(idIzlazneFakture);
	}

}