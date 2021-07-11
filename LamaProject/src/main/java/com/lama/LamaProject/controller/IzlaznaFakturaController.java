package com.lama.LamaProject.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lama.LamaProject.converter.IzlaznaFakturaDTOToIzlaznaFaktura;
import com.lama.LamaProject.converter.IzlaznaFakturaToIzlaznaFakturaDTO;
import com.lama.LamaProject.converter.PoslovniPartnerDTOToPoslovniPartner;
import com.lama.LamaProject.converter.PoslovniPartnerToPoslovniPartnerDTO;
import com.lama.LamaProject.converter.StavkaIzlaznaFaktureToStavkaIzlaznaFaktureDTO;
import com.lama.LamaProject.main.IzlaznaFaktura;
import com.lama.LamaProject.service.IzlaznaFakturaService;
import com.lama.LamaProject.service.StavkaIzlaznaFakturaServiceS;

@Controller
public class IzlaznaFakturaController {

	@Autowired
	IzlaznaFakturaService izlaznaFakturaService;
	
	@Autowired
	IzlaznaFakturaToIzlaznaFakturaDTO izlaznafakturaToIzlaznaFakturaDTO;
	
	@Autowired
	StavkaIzlaznaFakturaServiceS stavkaIzlaznaFakturaService;

	@Autowired
	IzlaznaFakturaToIzlaznaFakturaDTO izlaznaFakturaToIzlaznaFakturaDTO;

	@Autowired
	IzlaznaFakturaDTOToIzlaznaFaktura izlaznaFakturaDTOToIzlaznaFaktura;

	@Autowired
	StavkaIzlaznaFaktureToStavkaIzlaznaFaktureDTO stavkaIzlaznaFaktureToStavkaIzlaznaFaktureDTO;

	@Autowired
	PoslovniPartnerToPoslovniPartnerDTO poslovniPartnerToPoslovniPartnerDTO;

	@Autowired
	PoslovniPartnerDTOToPoslovniPartner poslovniPartnerDTOToPoslovniPartner;

	
	@GetMapping("/fakture")
	public String getAll(@RequestParam(value = "tipFakture", defaultValue = "false") boolean tip, Model model) {
		List<IzlaznaFaktura> fakture = izlaznaFakturaService.findAll();
		boolean finalTip = Boolean.valueOf(tip);
		List<IzlaznaFaktura> faktureFilter = fakture.stream().filter(f -> f.isVrstaFakture() == finalTip)
			.collect(Collectors.toList());
		model.addAttribute("tipFakture", finalTip);
		model.addAttribute("fakture",  izlaznafakturaToIzlaznaFakturaDTO.konvertujEntityToDto(faktureFilter) );
		return "fakture";

	}
	
	@GetMapping("/knjigaIzlaznihFaktura")
	public String getIzlazneFakture(Model model) {
		if (!model.containsAttribute("fakture")) {
			List<IzlaznaFaktura> fakture = izlaznaFakturaService.findAll();
			List<IzlaznaFaktura> faktureFilter = fakture.stream().filter(f -> f.isVrstaFakture() == true)
					.collect(Collectors.toList());
			model.addAttribute("fakture", izlaznaFakturaToIzlaznaFakturaDTO.konvertujEntityToDto(faktureFilter));
		}
		return "knjigaIzlaznihFaktura";

	}
	
}
