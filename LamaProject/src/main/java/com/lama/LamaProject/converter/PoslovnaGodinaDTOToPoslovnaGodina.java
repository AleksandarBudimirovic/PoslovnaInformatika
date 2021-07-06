package com.lama.LamaProject.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.PoslovnaGodinaDTO;
import com.lama.LamaProject.main.PoslovnaGodina;

@Component
public class PoslovnaGodinaDTOToPoslovnaGodina {

	@Autowired
	private ModelMapper modelMapper;
	
	public PoslovnaGodina konvertujDtoToEntity(PoslovnaGodinaDTO poslovnaGodinaDTO) {
		
		PoslovnaGodina poslovnaGodina = modelMapper.map(poslovnaGodinaDTO, PoslovnaGodina.class);
		return poslovnaGodina;
	}
}
