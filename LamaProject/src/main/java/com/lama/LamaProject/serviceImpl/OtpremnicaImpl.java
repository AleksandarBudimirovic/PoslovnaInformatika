package com.lama.LamaProject.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lama.LamaProject.converter.OtpremnicaDTOToOtpremnica;
import com.lama.LamaProject.dto.OtpremnicaDTO;
import com.lama.LamaProject.main.IzlaznaFaktura;
import com.lama.LamaProject.main.Otpremnica;
import com.lama.LamaProject.main.StavkaIzlaznaFaktura;
import com.lama.LamaProject.main.StavkaOtpremnice;
import com.lama.LamaProject.main.StopaPdv;
import com.lama.LamaProject.repository.OtpremnicaRepository;
import com.lama.LamaProject.service.CenovnikService;
import com.lama.LamaProject.service.IzlaznaFakturaService;
import com.lama.LamaProject.service.OtpremnicaServiceS;


@Service
@Transactional
public class OtpremnicaImpl implements OtpremnicaServiceS {
	
	@Autowired
	OtpremnicaRepository otpremnicaRepository;
	
	@Autowired
	CenovnikService cenovnikService;
	
	@Autowired
	IzlaznaFakturaService fakturaService;
	
	@Autowired
	OtpremnicaDTOToOtpremnica otpremnicaDTOToOtpremnica;
	
	@Override
	@Transactional(readOnly = true)
	public List<Otpremnica> findAll() {
		return otpremnicaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = false)
	public void save(Otpremnica otpremnica) {
		otpremnicaRepository.save(otpremnica);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Otpremnica getOne(long idotpremnice) {
		return otpremnicaRepository.getOne(idotpremnice);
	}

	@Override
	@Transactional
	public void update(Otpremnica otpremnica) {
          double ukupanIznos = 0;
		
		for(StavkaOtpremnice so : otpremnica.getStavkeOtpremnice()) {
			if(!so.isObrisano()) {
				ukupanIznos += so.getUkupanIznos();
			}
		}
		otpremnica.setRacunOtpremnice(ukupanIznos);
		save(otpremnica);
		
	}

	@Override
	public void kreirajFakturuOdOtpremnice(OtpremnicaDTO otpremnicaDTO, int poslednjaPoslovnaGodina) {
		// TODO Auto-generated method stub
		
	}

}
