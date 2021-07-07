package com.lama.LamaProject.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.RobaDTO;
import com.lama.LamaProject.main.Roba;

@Component
public class RobaDTOToRoba {
	
	
	@Autowired
	private ModelMapper modelMapper;
	
	public Roba konvertujDtoToEntity(RobaDTO robaDTO) {
		
		Roba roba = modelMapper.map(robaDTO, Roba.class);
		return roba;
	}

}
