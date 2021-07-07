package com.lama.LamaProject.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.PdvDTO;
import com.lama.LamaProject.main.Pdv;



@Component
public class PdvDTOToPdv {

	@Autowired
	private ModelMapper modelMapper;
	
	public Pdv konvertujDtoToEntity(PdvDTO pdvDTO) {
		
		Pdv pdv = modelMapper.map(pdvDTO, Pdv.class);
		return pdv;
	}

}
