package com.lama.LamaProject.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.lama.LamaProject.converter.CenovnikDTOToCenovnik;
import com.lama.LamaProject.converter.CenovnikToCenovnikDTO;
import com.lama.LamaProject.converter.PoslovniPartnerDTOToPoslovniPartner;
import com.lama.LamaProject.converter.PoslovniPartnerToPoslovniPartnerDTO;
import com.lama.LamaProject.converter.RobaToRobaDTO;
import com.lama.LamaProject.converter.StavkaCenovnikaDTOToStavkaCenovnika;
import com.lama.LamaProject.converter.StavkaCenovnikaToStavkaCenovnikaDTO;
import com.lama.LamaProject.dto.CenovnikDTO;
import com.lama.LamaProject.dto.StavkaCenovnikaDTO;
import com.lama.LamaProject.main.Cenovnik;
import com.lama.LamaProject.main.PoslovniPartner;
import com.lama.LamaProject.main.Preduzece;
import com.lama.LamaProject.main.StavkeCenovnika;
import com.lama.LamaProject.service.CenovnikService;
import com.lama.LamaProject.service.PoslovniPartnerServiceS;
import com.lama.LamaProject.service.PreduzeceServiceS;
import com.lama.LamaProject.service.RobaServiceS;
import com.lama.LamaProject.service.StavkaCenovnikaService;

@Controller
public class CenovnikController {

	@Autowired
	CenovnikService cenovnikService;
	
	@Autowired
	PoslovniPartnerServiceS poslovniPartnerService;
	
	@Autowired
	PreduzeceServiceS preduzeceService;
	
	@Autowired
	RobaServiceS robaService;
	
	@Autowired
	StavkaCenovnikaService stavkaCenovnikaService;
	
	@Autowired
	CenovnikToCenovnikDTO cenovnikToCenovnikDTO;
	
	@Autowired
	CenovnikDTOToCenovnik cenovnikDTOToCenovnik;
	
	@Autowired
	StavkaCenovnikaDTOToStavkaCenovnika stavkaCenovnikaDTOToStavkaCenovnika;
	
	@Autowired
	StavkaCenovnikaToStavkaCenovnikaDTO stavkaCenovnikaToStavkaCenovnikaDTO;
	
	@Autowired
	PoslovniPartnerToPoslovniPartnerDTO poslovniPartnerToPoslovniPartnerDTO;
	
	@Autowired
	PoslovniPartnerDTOToPoslovniPartner poslovniPartnerDTOToPoslovniPartner;
	
	@Autowired
	RobaToRobaDTO robaToRobaDTO;
	
	@GetMapping("cenovnici")
	public String vratiCenovnike(Model model) {
		List<Cenovnik> cenovnici = cenovnikService.findAll();
		List<CenovnikDTO> cenovniciDTO = cenovnikToCenovnikDTO.konvertujEntityToDto(cenovnici);
		model.addAttribute("cenovnici", cenovniciDTO);
		return "cenovnici";
	}
	
	@GetMapping("cenovnici/dodavanje")
	public String dodajCenovnik(Model model) {

		List<PoslovniPartner> poslovniPartneri = poslovniPartnerService.findAll();
		model.addAttribute("poslovniPartneri", poslovniPartnerToPoslovniPartnerDTO.konvertujEntityToDto(poslovniPartneri));
		model.addAttribute("cenovnik", new CenovnikDTO());
		return "dodajCenovnik";
	}
	
	@PostMapping("cenovnik/dodavanje")
	public String dodajCenovnik(CenovnikDTO cenovnikDto) {
		List<Preduzece> preduzeca = preduzeceService.findAll();
		List<Cenovnik> listaCenovnika = cenovnikService.findAll().stream()
				.filter(c -> c.getPoslovniPartner().getId() == cenovnikDto.getPoslovniPartner().getId())
				.collect(Collectors.toList());
		for(Cenovnik c: listaCenovnika) {
			c.setKrajRokaTrajanja(new Date(Calendar.getInstance().getTimeInMillis()));
			c.setObrisano(true);
			cenovnikService.save(c);
		}
		
		Cenovnik cenovnik = cenovnikDTOToCenovnik.konvertujDtoToEntity(cenovnikDto);
		cenovnik.setPreduzece(preduzeca.get(0));
		cenovnik.setObrisano(false);
		cenovnikService.save(cenovnik);

		return "redirect:/cenovnici";
	}
	
	@GetMapping("cenovnik/detalji/{idcenovnika}")
	public String detaljiCenovnika(Model model, @PathVariable long idcenovnika) {
		Cenovnik cenovnik = cenovnikService.findOne(idcenovnika);
		model.addAttribute("listRoba", robaToRobaDTO.konvertujEntityToDto(robaService.findAll()));
		model.addAttribute("cenovnik", cenovnikToCenovnikDTO.konvertujEntityToDto(cenovnik));
		List<StavkeCenovnika> stavkeCenovnika = stavkaCenovnikaService.findStavkeCenovnikaByCenovnikId(idcenovnika);
		List<StavkaCenovnikaDTO> stavkeCenovnikaDto = stavkaCenovnikaToStavkaCenovnikaDTO.konvertujEntityToDto(stavkeCenovnika);
        model.addAttribute("stavkeCenovnika", stavkeCenovnikaDto);
		return "cenovnik_detalji";
	}
		
}
