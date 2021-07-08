package com.lama.LamaProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.lama.LamaProject.converter.GrupaRobeDTOToGrupaRobe;
import com.lama.LamaProject.converter.GrupaRobeToGrupaRobeDTO;
import com.lama.LamaProject.dto.GrupaRobeDTO;
import com.lama.LamaProject.main.GrupaRobe;
import com.lama.LamaProject.service.GrupaRobeServiceS;


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
	
	
	
	
	
	
	@DeleteMapping("/grupaRobe/izbrisi")
	public String izbrisiGrupuRobe(Long grupaRobeIdDelete) {
		GrupaRobe grupaRobe = grupaRobeService.findOne(grupaRobeIdDelete);
		grupaRobeService.izbrisiGrupuRobe(grupaRobe);
		return "redirect:/grupaRobe";
	}
}
