package com.lama.LamaProject.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.IzlaznaFakturaDTO;
import com.lama.LamaProject.main.IzlaznaFaktura;

@Component
public class IzlaznaFakturaDTOToIzlaznaFaktura {
	
	@Autowired
	IzlaznaFakturaDTOToIzlaznaFaktura izlaznaFakturaDTOToIzlaznaFaktura; 
	
	@Autowired
	private ModelMapper modelMapper;
	
	public IzlaznaFaktura konvertujDtoToEntity(IzlaznaFakturaDTO izlaznaFakturaDTO) {
		
		IzlaznaFaktura izlaznaFaktura = modelMapper.map(izlaznaFakturaDTO , IzlaznaFaktura.class);
		return izlaznaFaktura;
	}
}
