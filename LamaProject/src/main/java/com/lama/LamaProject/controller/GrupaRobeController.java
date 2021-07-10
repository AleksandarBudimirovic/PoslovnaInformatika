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
	
	@Autowired
	private PdvService pdvService;
	
	@Autowired
	private PreduzeceServiceS preduzeceService;
	
	@Autowired 
	private PreduzeceToPreduzeceDTO preduzeceToPreduzeceDTO;
	
	@Autowired 
	private PdvToPdvDTO pdvToPdvDTO;
	
	
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
	
	@DeleteMapping("/grupaRobe/izbrisi")
	public String izbrisiGrupuRobe(Long grupaRobeIdDelete) {
		GrupaRobe grupaRobe = grupaRobeService.findOne(grupaRobeIdDelete);
		grupaRobeService.izbrisiGrupuRobe(grupaRobe);
		return "redirect:/grupaRobe";
	}
	
	@PutMapping("/grupaRobe/azuriraj")
	public String azurirajGrupuRobe(GrupaRobeDTO grupaRobeDTO) {
		grupaRobeService.save(grupaRobeDTOToGrupaRobe.konvertujDtoToEntity(grupaRobeDTO));
		return "redirect:/grupaRobe";
	}
	
	@GetMapping("/grupaRobe/kreiraj")
	public String prikaziGrupuRobe(Model model) {
		GrupaRobeDTO grupaRobeDTO = new GrupaRobeDTO();
		dodajAtributeUModel(model, grupaRobeDTO);
		return "kreirajGrupuRobe";
	}
	
	@PostMapping("/grupaRobe/kreiraj")
	public String kreirajGrupuRobe (GrupaRobeDTO grupaRobeDTO) {
		grupaRobeService.save(grupaRobeDTOToGrupaRobe.konvertujDtoToEntity(grupaRobeDTO));
		return "redirect:/grupaRobe";
	}
	
	public void dodajAtributeUModel (Model model, GrupaRobeDTO grupaRobeDTO) {
		List<Preduzece> listaPreduzeca = preduzeceService.findAll();
		List<Pdv> listaPDV = pdvService.findAll();
		model.addAttribute("grupaRobe", grupaRobeDTO);
		model.addAttribute("listaPreduzeca", preduzeceToPreduzeceDTO.konvertujEntityToDto(listaPreduzeca));
		model.addAttribute("listaPdv", pdvToPdvDTO.konvertujEntityToDto(listaPDV));
	}
}
