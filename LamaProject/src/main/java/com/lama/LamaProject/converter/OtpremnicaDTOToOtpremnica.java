package com.lama.LamaProject.converter;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.OtpremnicaDTO;
import com.lama.LamaProject.main.Otpremnica;

@Component
public class OtpremnicaDTOToOtpremnica {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public Otpremnica konvertujDtoToEntity(OtpremnicaDTO otpremnicaDTO) {
		
		Otpremnica otpremnica = modelMapper.map(otpremnicaDTO, Otpremnica.class);
		return otpremnica;
	}

}
