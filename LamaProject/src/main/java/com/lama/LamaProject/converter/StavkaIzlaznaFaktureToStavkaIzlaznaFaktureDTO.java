package com.lama.LamaProject.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.StavkaIzlaznaFakturaDTO;
import com.lama.LamaProject.main.StavkaIzlaznaFaktura;

@Component
public class StavkaIzlaznaFaktureToStavkaIzlaznaFaktureDTO {

	
	@Autowired
	private ModelMapper modelMapper;

	public StavkaIzlaznaFakturaDTO konvertujEntityToDto(StavkaIzlaznaFaktura stavkaIzFakture) {

		return modelMapper.map(stavkaIzFakture, StavkaIzlaznaFakturaDTO.class);
	}

	public List<StavkaIzlaznaFakturaDTO> konvertujEntityToDto(List<StavkaIzlaznaFaktura> stavkeIzFakture) {
		List<StavkaIzlaznaFakturaDTO> stavkeIzFakturaList = new ArrayList<StavkaIzlaznaFakturaDTO>();
		for (StavkaIzlaznaFaktura stavkaIzFakture : stavkeIzFakture) {
			stavkeIzFakturaList.add(konvertujEntityToDto(stavkaIzFakture));
		}
		return stavkeIzFakturaList;
	}
}
