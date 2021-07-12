package com.lama.LamaProject.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.StavkaCenovnikaDTO;
import com.lama.LamaProject.main.StavkeCenovnika;


@Component
public class StavkaCenovnikaToStavkaCenovnikaDTO {
	
	@Autowired
	private ModelMapper modelMapper;

	public StavkaCenovnikaDTO konvertujEntityToDto(StavkeCenovnika stavkaCenovnika) {

		return modelMapper.map(stavkaCenovnika, StavkaCenovnikaDTO.class);
	}

	public List<StavkaCenovnikaDTO> konvertujEntityToDto(List<StavkeCenovnika> stavkeCenovnika) {
		List<StavkaCenovnikaDTO> listaStavki = new ArrayList<StavkaCenovnikaDTO>();
		for (StavkeCenovnika stavkaCenovnika : stavkeCenovnika) {
			listaStavki.add(konvertujEntityToDto(stavkaCenovnika));
		}
		return listaStavki;
	}
}
