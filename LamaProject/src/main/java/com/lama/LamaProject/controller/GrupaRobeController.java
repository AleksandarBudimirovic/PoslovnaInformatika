package com.lama.LamaProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.lama.LamaProject.converter.GrupaRobeDTOToGrupaRobe;
import com.lama.LamaProject.converter.GrupaRobeToGrupaRobeDTO;
import com.lama.LamaProject.converter.PdvToPdvDTO;
import com.lama.LamaProject.converter.PreduzeceToPreduzeceDTO;
import com.lama.LamaProject.dto.GrupaRobeDTO;
import com.lama.LamaProject.main.GrupaRobe;
import com.lama.LamaProject.main.Pdv;
import com.lama.LamaProject.main.Preduzece;
import com.lama.LamaProject.service.GrupaRobeServiceS;
import com.lama.LamaProject.service.PdvService;
import com.lama.LamaProject.service.PreduzeceServiceS;


@Controller
public class GrupaRobeController {
	
	@Autowired
	private GrupaRobeServiceS grupaRobeService;
	
	@Autowired
	private GrupaRobeToGrupaRobeDTO grupaRobeToGrupaRobeDTO;
	
	@Autowired
	private GrupaRobeDTOToGrupaRobe grupaRobeDTOToGrupaRobe;
	
	
	@GetMapping("/grupaRobe")
	public String vratiSveGrupeRobe(Model model) {
		List<GrupaRobe> grupaRobeLista = grupaRobeService.findAll();
		List<GrupaRobeDTO> listaGrupaRobeDTO = grupaRobeToGrupaRobeDTO.konvertujEntityToDto(grupaRobeLista);
		model.addAttribute("listaGrupaRobe", listaGrupaRobeDTO);
		return "grupaRobe";
	}
	
	@GetMapping("/grupaRobe/azuriraj/{id}")
	public String vratiGrupuRobeById(Model model, @PathVariable Long id) {
		GrupaRobe grupaRobe = grupaRobeService.findOne(id);
		GrupaRobeDTO grupaRobeDTO = grupaRobeToGrupaRobeDTO.konvertujEntityToDto(grupaRobe);
		return "azurirajGrupuRobe";
	}
	
	
	
	

	
}
