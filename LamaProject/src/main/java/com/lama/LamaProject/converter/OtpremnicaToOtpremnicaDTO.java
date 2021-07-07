package com.lama.LamaProject.converter;


import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.OtpremnicaDTO;
import com.lama.LamaProject.main.Otpremnica;


@Component
public class OtpremnicaToOtpremnicaDTO {
	
	@Autowired
	private ModelMapper modelMapper;

	public OtpremnicaDTO konvertujEntityToDto(Otpremnica otpremnica) {

		return modelMapper.map(otpremnica, OtpremnicaDTO.class);
	}

	public List<OtpremnicaDTO> konvertujEntityToDto(List<Otpremnica> otpremnice) {
		List<OtpremnicaDTO> listaOtpremnica = new ArrayList<OtpremnicaDTO>();
		for (Otpremnica otpremnica : otpremnice) {
			listaOtpremnica.add(konvertujEntityToDto(otpremnica));
		}
		return listaOtpremnica;
	}

}
