package com.lama.LamaProject.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.StavkaIzlaznaFakturaDTO;
import com.lama.LamaProject.main.StavkaIzlaznaFaktura;


@Component
public class StavkaIzlaznaFaktureDTOToStavkaIzlaznaFakture {
	
	
	@Autowired
	private ModelMapper modelMapper;
	
	public StavkaIzlaznaFaktura konvertujDtoToEntity(StavkaIzlaznaFakturaDTO stavkaIzFaktureDTO) {
		
		StavkaIzlaznaFaktura stavkaIzFakture = modelMapper.map(stavkaIzFaktureDTO, StavkaIzlaznaFaktura.class);
		return stavkaIzFakture;
	}

}
