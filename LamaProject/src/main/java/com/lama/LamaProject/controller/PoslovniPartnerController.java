package com.lama.LamaProject.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lama.LamaProject.converter.MestoToMestoDTO;
import com.lama.LamaProject.converter.PoslovniPartnerDTOToPoslovniPartner;
import com.lama.LamaProject.converter.PoslovniPartnerToPoslovniPartnerDTO;
import com.lama.LamaProject.dto.PoslovniPartnerDTO;
import com.lama.LamaProject.main.Mesto;
import com.lama.LamaProject.main.PoslovniPartner;
import com.lama.LamaProject.main.PoslovniPartner.TipPoslovnogPartnera;
import com.lama.LamaProject.main.Preduzece;
import com.lama.LamaProject.service.MestoServiceS;
import com.lama.LamaProject.service.PoslovniPartnerServiceS;
import com.lama.LamaProject.service.PreduzeceServiceS;



@Controller
public class PoslovniPartnerController {

	
	@Autowired
	private PoslovniPartnerServiceS poslovniPartnerServiceInterface;

	@Autowired
	MestoServiceS mestoService;

	@Autowired
	PreduzeceServiceS preduzeceService;

	@Autowired
	private PoslovniPartnerDTOToPoslovniPartner dtoToPoslovniPartner;

	@Autowired
	private PoslovniPartnerToPoslovniPartnerDTO poslovniPartnertoDto;

	@Autowired
	MestoToMestoDTO mestoToMestoDTO;

	@GetMapping("/poslovniPartneri")
	public String getAll(@RequestParam(value = "tipPoslovnogPartnera", defaultValue = "3") int tip, Model model) {
		List<PoslovniPartner> poslovniPartneri = poslovniPartnerServiceInterface.findAll();
		tip = Integer.valueOf(tip);
		if (tip == 3) {
			List<PoslovniPartnerDTO> poslovniPartnerDTO = poslovniPartnertoDto.konvertujEntityToDto(poslovniPartneri);
			model.addAttribute("tipPoslovnogPartnera", tip);
			model.addAttribute("poslovniPartneri", poslovniPartnerDTO);

			return "poslovniPartneri";
		}

		int finalTip = tip;
		List<PoslovniPartner> poslovniPartnerFilter = poslovniPartneri.stream()
				.filter(p -> p.getTipPoslovnogPartnera() == TipPoslovnogPartnera.valueOf(finalTip))
				.collect(Collectors.toList());
		model.addAttribute("tipPoslovnogPartneraFilter", finalTip);
		model.addAttribute("poslovniPartneriFilter", poslovniPartnertoDto.konvertujEntityToDto(poslovniPartnerFilter));

		return "poslovniPartneri";

	}
	
/////////azuriranje
	
	
	
	@GetMapping("poslovniPartner/dodavanje")
	public String dodajPoslovnogPartnera(Model model) {
		List<Mesto> listaMesta = mestoService.findAll();
		model.addAttribute("listaMesta", mestoToMestoDTO.konvertujEntityToDto(listaMesta));
		model.addAttribute("poslovniPartner", new PoslovniPartnerDTO());

		return "dodajPoslovnogPartnera";
	}

	@PostMapping("poslovniPartner/dodavanje")
	public String dodajPoslovnogPartnera(PoslovniPartnerDTO poslovniPartnerDTO) {
		List<Preduzece> preduzeca = preduzeceService.findAll();
		PoslovniPartner partner = dtoToPoslovniPartner.konvertujDTOToEntity(poslovniPartnerDTO);
		partner.setPreduzece(preduzeca.get(0));
		partner.setObrisano(false);
		poslovniPartnerServiceInterface.save(partner);

		return "redirect:/poslovniPartneri";
	}
	
	
	
	@DeleteMapping("/poslovniPartner/izbrisi")
	public String izbrisiPoslovnogPartnera(Long poslovniPartnerIdDelete) {
		PoslovniPartner poslovniPartner = poslovniPartnerServiceInterface.findOne(poslovniPartnerIdDelete);
		poslovniPartnerServiceInterface.izbrisiPoslovnogPartnera(poslovniPartner);
		
		return "redirect:/poslovniPartneri";
	}
	
}
