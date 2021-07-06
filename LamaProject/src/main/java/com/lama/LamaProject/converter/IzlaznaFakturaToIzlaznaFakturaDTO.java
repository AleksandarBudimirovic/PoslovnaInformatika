package com.lama.LamaProject.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.IzlaznaFakturaDTO;
import com.lama.LamaProject.main.IzlaznaFaktura;

@Component
public class IzlaznaFakturaToIzlaznaFakturaDTO {
	
	@Autowired
	IzlaznaFakturaToIzlaznaFakturaDTO izlaznaFakturaToIzlaznaFakturaDTO;
	@Autowired
	private ModelMapper modelMapper;

	public IzlaznaFakturaDTO konvertujEntityToDto(IzlaznaFaktura izlaznaFaktura) {

		return modelMapper.map(izlaznaFaktura, IzlaznaFakturaDTO.class);
	}

	public List<IzlaznaFakturaDTO> konvertujEntityToDto(List<IzlaznaFaktura> fakture) {
		List<IzlaznaFakturaDTO> listaFaktura = new ArrayList<IzlaznaFakturaDTO>();
		for (IzlaznaFaktura izlaznaFaktura: fakture) {
			listaFaktura.add(konvertujEntityToDto(izlaznaFaktura));
		}
		return listaFaktura;
	}
}