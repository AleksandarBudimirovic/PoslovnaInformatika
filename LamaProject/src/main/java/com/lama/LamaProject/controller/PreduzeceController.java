package com.lama.LamaProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.lama.LamaProject.converter.MestoDTOToMesto;
import com.lama.LamaProject.converter.MestoToMestoDTO;
import com.lama.LamaProject.converter.PreduzeceDTOToPreduzece;
import com.lama.LamaProject.converter.PreduzeceToPreduzeceDTO;
import com.lama.LamaProject.dto.PreduzeceDTO;
import com.lama.LamaProject.main.Mesto;
import com.lama.LamaProject.main.Preduzece;
import com.lama.LamaProject.service.MestoServiceS;
import com.lama.LamaProject.service.PreduzeceServiceS;


@Controller
public class PreduzeceController {

	@Autowired
	PreduzeceServiceS preduzeceService;
	
	@Autowired
	MestoServiceS mestoService;
	
	@Autowired
	PreduzeceDTOToPreduzece preduzeceDTOToPreduzece;
	
	@Autowired
	PreduzeceToPreduzeceDTO preduzeceToPreduzeceDTO;
	
	@Autowired
	MestoDTOToMesto mestoDTOToMesto;
	
	@Autowired
	MestoToMestoDTO mestoToMestoDTO;
	
	
	@GetMapping("/")
	public String vratiPreduzeca(Model model) {
		List<Preduzece> preduzece = preduzeceService.findAll();
		List<PreduzeceDTO> preduzeceDTO = preduzeceToPreduzeceDTO.konvertujEntityToDto(preduzece);
		model.addAttribute("preduzece", preduzeceDTO);
		return "preduzece";
	}
	
	@GetMapping("/preduzece/azuriraj/{id}")
	public String vratiPreduzeca(Model model, @PathVariable Long id) {
		Preduzece preduzece = preduzeceService.findOne(id);
		PreduzeceDTO preduzeceDTO = preduzeceToPreduzeceDTO.konvertujEntityToDto(preduzece);
		List<Mesto> listaMesta = mestoService.findAll();
		model.addAttribute("listaMesta", mestoToMestoDTO.konvertujEntityToDto(listaMesta));
		model.addAttribute("preduzece", preduzeceDTO);
		return "azurirajPreduzece";
	}
	
	@PostMapping("/preduzece/azuriraj")
	public String azurirajPreduzece(PreduzeceDTO preduzeceDTO) {
		preduzeceService.save(preduzeceDTOToPreduzece.konvertujDtoToEntity(preduzeceDTO));
		return "redirect:/";
	}

}
