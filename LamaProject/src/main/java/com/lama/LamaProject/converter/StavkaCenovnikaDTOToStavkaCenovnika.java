package com.lama.LamaProject.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.StavkaCenovnikaDTO;
import com.lama.LamaProject.main.StavkeCenovnika;


@Component
public class StavkaCenovnikaDTOToStavkaCenovnika {
	
	@Autowired	
	private ModelMapper modelMapper;
	
	public StavkeCenovnika konvertujDtoToEntity(StavkaCenovnikaDTO stavkaCenovnikaDTO) {
		
		StavkeCenovnika stavkaCenovnika = modelMapper.map(stavkaCenovnikaDTO, StavkeCenovnika.class);
		return stavkaCenovnika;
	}
}
