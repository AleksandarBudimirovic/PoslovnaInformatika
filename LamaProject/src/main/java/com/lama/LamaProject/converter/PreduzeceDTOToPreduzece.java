package com.lama.LamaProject.converter;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.PreduzeceDTO;
import com.lama.LamaProject.main.Preduzece;


@Component
public class PreduzeceDTOToPreduzece {

	@Autowired
	private ModelMapper modelMapper;
	
	public Preduzece konvertujDtoToEntity(PreduzeceDTO preduzeceDTO) {
		Preduzece preduzece = modelMapper.map(preduzeceDTO, Preduzece.class);
		return preduzece;
	}
}
