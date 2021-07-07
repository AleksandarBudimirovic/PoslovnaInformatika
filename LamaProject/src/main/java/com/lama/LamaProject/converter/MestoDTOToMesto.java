package com.lama.LamaProject.converter;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.MestoDTO;
import com.lama.LamaProject.main.Mesto;


@Component
public class MestoDTOToMesto {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public Mesto konvertujDtoToEntity(MestoDTO mestoDTO) {
		
		Mesto mesto = modelMapper.map(mestoDTO, Mesto.class);
		return mesto;
	}

}
