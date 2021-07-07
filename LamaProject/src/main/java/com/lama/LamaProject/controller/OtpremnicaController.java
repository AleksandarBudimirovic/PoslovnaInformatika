package com.lama.LamaProject.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lama.LamaProject.converter.OtpremnicaDTOToOtpremnica;
import com.lama.LamaProject.converter.OtpremnicaToOtpremnicaDTO;
import com.lama.LamaProject.converter.PoslovniPartnerToPoslovniPartnerDTO;
import com.lama.LamaProject.converter.StavkaOtpremniceDTOToStavkaOtpremnice;
import com.lama.LamaProject.converter.StavkaOtpremniceToStavkaOtpremniceDTO;
import com.lama.LamaProject.dto.OtpremnicaDTO;
import com.lama.LamaProject.main.Otpremnica;
import com.lama.LamaProject.main.PoslovnaGodina;
import com.lama.LamaProject.main.PoslovniPartner;
import com.lama.LamaProject.main.PoslovniPartner.TipPoslovnogPartnera;
import com.lama.LamaProject.service.OtpremnicaServiceS;
import com.lama.LamaProject.service.PoslovnaGodinaService;
import com.lama.LamaProject.service.PoslovniPartnerServiceS;
import com.lama.LamaProject.service.PreduzeceServiceS;
import com.lama.LamaProject.service.RobaServiceS;
import com.lama.LamaProject.service.StavkaOtpremnicaServiceS;

@Controller
public class OtpremnicaController {
	
	@Autowired
	OtpremnicaServiceS otpremnicaService;
	
	@Autowired
	StavkaOtpremnicaServiceS stavkaOtpremniceService;
	
	@Autowired
	PoslovniPartnerServiceS poslovniPartnerService;
	
	@Autowired
	PreduzeceServiceS preduzeceService;
	
	@Autowired
	PoslovnaGodinaService poslovnaGodinaService;
	
	@Autowired
	RobaServiceS robaService;
	
	@Autowired
	OtpremnicaDTOToOtpremnica otpremnicaDTOToOtpremnica;
	
	@Autowired
	OtpremnicaToOtpremnicaDTO otpremnicaToOtpremnicaDTO;
	
	@Autowired
	StavkaOtpremniceDTOToStavkaOtpremnice stavkaOtpremniceDTOToStavkaOtpremnice;
	
	@Autowired
	StavkaOtpremniceToStavkaOtpremniceDTO stavkaOtpremniceToStavkaOtpremniceDTO;
	
	@Autowired
	PoslovniPartnerToPoslovniPartnerDTO poslovniPartnerToPoslovniPartnerDTO;
	
	@GetMapping("/otpremnice")
	public String vratiOtpremnice(Model model) {
		List<Otpremnica> otpremnice = otpremnicaService.findAll();
		model.addAttribute("otpremnice", otpremnicaToOtpremnicaDTO.konvertujEntityToDto(otpremnice));
		return "otpremnice";
	}
	
	
	@GetMapping("otpremnica/dodavanje")
	public String dodajOtpremnicu(Model model) {
		List<PoslovniPartner> listaPoslovniPartneri = poslovniPartnerService.findAll().stream()
				.filter(pp -> pp.getTipPoslovnogPartnera() == TipPoslovnogPartnera.KUPAC)
				.collect(Collectors.toList());
		model.addAttribute("listaPoslovnihPartnera", poslovniPartnerToPoslovniPartnerDTO.konvertujEntityToDto(listaPoslovniPartneri));
		model.addAttribute("otpremnica", new OtpremnicaDTO());

		return "dodajOtpremnicu";
	}
	
	@GetMapping("/otpremnica/kreirajFakturu/{otpremnicaId}")
	public String kreirajFakturuOdOtpremnice(Model model, @PathVariable long otpremnicaId) {
		PoslovnaGodina poslovnaGodina = poslovnaGodinaService.findByZakljucenaGodinaIsFalseAndObrisanoIsFalse().get(0);
		int poslednjaPoslovnaGodina = poslovnaGodina.getIzlazneFakture().size();

		Otpremnica otpremnica = otpremnicaService.getOne(otpremnicaId);
		OtpremnicaDTO otpremnicaDTO = otpremnicaToOtpremnicaDTO.konvertujEntityToDto(otpremnica);
		otpremnicaService.kreirajFakturuOdOtpremnice(otpremnicaDTO, poslednjaPoslovnaGodina);
		return "redirect:/otpremnice";
	}

}
