package com.lama.LamaProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lama.LamaProject.converter.OtpremnicaDTOToOtpremnica;
import com.lama.LamaProject.converter.OtpremnicaToOtpremnicaDTO;
import com.lama.LamaProject.converter.PoslovniPartnerToPoslovniPartnerDTO;
import com.lama.LamaProject.converter.StavkaOtpremniceDTOToStavkaOtpremnice;
import com.lama.LamaProject.converter.StavkaOtpremniceToStavkaOtpremniceDTO;
import com.lama.LamaProject.main.Otpremnica;
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

}
