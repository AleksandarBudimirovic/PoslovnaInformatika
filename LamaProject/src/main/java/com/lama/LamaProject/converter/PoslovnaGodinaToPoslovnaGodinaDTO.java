package com.lama.LamaProject.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.PoslovnaGodinaDTO;
import com.lama.LamaProject.main.PoslovnaGodina;

@Component
public class PoslovnaGodinaToPoslovnaGodinaDTO {
	
	@Autowired
	private ModelMapper modelMapper;

	public PoslovnaGodinaDTO konvertujEntityToDto(PoslovnaGodina poslovnaGodina) {

		return modelMapper.map(poslovnaGodina, PoslovnaGodinaDTO.class);
	}

	public List<PoslovnaGodinaDTO> konvertujEntityToDto(List<PoslovnaGodina> poslovneGodine) {
		List<PoslovnaGodinaDTO> listaPoslovnihGodina = new ArrayList<PoslovnaGodinaDTO>();
		for (PoslovnaGodina poslovnaGodina : poslovneGodine) {
			listaPoslovnihGodina.add(konvertujEntityToDto(poslovnaGodina));
		}
		return listaPoslovnihGodina;
	}
}
