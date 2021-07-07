package com.lama.LamaProject.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.GrupaRobeDTO;
import com.lama.LamaProject.main.GrupaRobe;


@Component
public class GrupaRobeDTOToGrupaRobe {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public GrupaRobe konvertujDtoToEntity(GrupaRobeDTO grupaRobeDTO) {
		
		GrupaRobe grupaRobe = modelMapper.map(grupaRobeDTO, GrupaRobe.class);
		return grupaRobe;
	}

}
