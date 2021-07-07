package com.lama.LamaProject.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.StavkaOtpremniceDTO;
import com.lama.LamaProject.main.StavkaOtpremnice;

@Component
public class StavkaOtpremniceToStavkaOtpremniceDTO {
	
	@Autowired
	private ModelMapper modelMapper;

	public StavkaOtpremniceDTO konvertujEntityToDto(StavkaOtpremnice stavkaOtpremnice) {

		return modelMapper.map(stavkaOtpremnice, StavkaOtpremniceDTO.class);
	}

	public List<StavkaOtpremniceDTO> konvertujEntityToDto(List<StavkaOtpremnice> stavkeOtpremnice) {
		List<StavkaOtpremniceDTO> listaStavki = new ArrayList<StavkaOtpremniceDTO>();
		for (StavkaOtpremnice stavkaOtpremnice : stavkeOtpremnice) {
			listaStavki.add(konvertujEntityToDto(stavkaOtpremnice));
		}
		return listaStavki;
	}

}
