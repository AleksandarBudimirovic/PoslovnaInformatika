package com.lama.LamaProject.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.StavkaOtpremniceDTO;
import com.lama.LamaProject.main.StavkaOtpremnice;

@Component

public class StavkaOtpremniceDTOToStavkaOtpremnice {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public StavkaOtpremnice konvertujDtoToEntity(StavkaOtpremniceDTO stavkaOtpremniceDTO) {
		
		StavkaOtpremnice stavkaOtpremnice = modelMapper.map(stavkaOtpremniceDTO, StavkaOtpremnice.class);
		return stavkaOtpremnice;
	}

}
