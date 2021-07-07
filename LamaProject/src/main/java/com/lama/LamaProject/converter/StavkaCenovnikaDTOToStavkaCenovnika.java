package com.lama.LamaProject.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.StavkaCenovnikaDTO;
import com.lama.LamaProject.main.StavkaCenovnika;


@Component
public class StavkaCenovnikaDTOToStavkaCenovnika {
	
	@Autowired	
	private ModelMapper modelMapper;
	
	public StavkaCenovnika konvertujDtoToEntity(StavkaCenovnikaDTO stavkaCenovnikaDTO) {
		
		StavkaCenovnika stavkaCenovnika = modelMapper.map(stavkaCenovnikaDTO, StavkaCenovnika.class);
		return stavkaCenovnika;
	}
}
