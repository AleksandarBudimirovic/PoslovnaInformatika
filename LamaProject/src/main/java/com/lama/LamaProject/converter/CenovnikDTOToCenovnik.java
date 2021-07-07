package com.lama.LamaProject.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.CenovnikDTO;
import com.lama.LamaProject.main.Cenovnik;


@Component
public class CenovnikDTOToCenovnik {

	@Autowired
	private ModelMapper modelMapper;
	
	public Cenovnik konvertujDtoToEntity(CenovnikDTO cenovnikDTO) {
		
		Cenovnik cenovnik = modelMapper.map(cenovnikDTO, Cenovnik.class);
		return cenovnik;
	}
}
