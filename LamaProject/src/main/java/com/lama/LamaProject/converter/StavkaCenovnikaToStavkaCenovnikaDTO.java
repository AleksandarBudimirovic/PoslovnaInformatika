package com.lama.LamaProject.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.StavkaCenovnikaDTO;
import com.lama.LamaProject.main.StavkaCenovnika;


@Component
public class StavkaCenovnikaToStavkaCenovnikaDTO {
	
	@Autowired
	private ModelMapper modelMapper;

	public StavkaCenovnikaDTO konvertujEntityToDto(StavkaCenovnika stavkaCenovnika) {

		return modelMapper.map(stavkaCenovnika, StavkaCenovnikaDTO.class);
	}

	public List<StavkaCenovnikaDTO> konvertujEntityToDto(List<StavkaCenovnika> stavkeCenovnika) {
		List<StavkaCenovnikaDTO> listaStavki = new ArrayList<StavkaCenovnikaDTO>();
		for (StavkaCenovnika stavkaCenovnika : stavkeCenovnika) {
			listaStavki.add(konvertujEntityToDto(stavkaCenovnika));
		}
		return listaStavki;
	}
}
