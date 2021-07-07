package com.lama.LamaProject.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.StopaPdvDTO;
import com.lama.LamaProject.main.StopaPdv;


@Component
public class StopaPdvDTOToStopaPdv {

	@Autowired
	private ModelMapper modelMapper;
	
	public StopaPdv konvertujDtoToEntity(StopaPdvDTO stopaPdvDTO) {
		
		StopaPdv stopaPdv = modelMapper.map(stopaPdvDTO, StopaPdv.class);
		return stopaPdv;
	}

}
