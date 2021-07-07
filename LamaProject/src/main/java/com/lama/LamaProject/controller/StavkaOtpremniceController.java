package com.lama.LamaProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lama.LamaProject.dto.StavkaOtpremniceDTO;
import com.lama.LamaProject.main.Otpremnica;
import com.lama.LamaProject.main.Roba;
import com.lama.LamaProject.main.StavkaOtpremnice;
import com.lama.LamaProject.service.OtpremnicaServiceS;
import com.lama.LamaProject.service.RobaServiceS;
import com.lama.LamaProject.service.StavkaOtpremnicaServiceS;

@Controller
public class StavkaOtpremniceController {
	
	@Autowired
	RobaServiceS robaService;
	
	@Autowired
	OtpremnicaServiceS otpremniceService;
	
	@Autowired
	StavkaOtpremnicaServiceS stavkaOtpremniceService;

	@PostMapping("/stavkaOtpremnice")
	public void sacuvajStavkuOtpremnice(@RequestBody StavkaOtpremniceDTO stavkaOtpremnice) {
		Roba roba = robaService.findOne(stavkaOtpremnice.getRoba());
		Otpremnica otpremnica = otpremniceService.getOne(stavkaOtpremnice.getOtpremnica());
		StavkaOtpremnice stavka = new StavkaOtpremnice();
		stavka.setJedinicaMere(stavkaOtpremnice.getJedinicaMere());
		stavka.setKolicina(stavkaOtpremnice.getKolicina());
		stavka.setOpis(stavkaOtpremnice.getOpis());
		stavka.setCena(stavkaOtpremnice.getCena());
		stavka.setUkupanIznos(stavkaOtpremnice.getUkupanIznos());
		stavka.setRoba(roba);
		stavka.setOtpremnica(otpremnica);
		stavka.setObrisano(false);
		
		stavkaOtpremniceService.save(stavka);
	}
	
	@GetMapping("/stavkaOtpremnice/obrisi/{id}/{otpremnicaId}")
	public String izbrisiStavkuOtpremnice(@PathVariable long id, @PathVariable long otpremnicaId) {
		StavkaOtpremnice stavka = stavkaOtpremniceService.findOne(id);
		stavkaOtpremniceService.izbrisiStavkuOtpremnice(stavka);
		return "redirect:/otpremnica/detalji/{otpremnicaId}";
	}
	
}
