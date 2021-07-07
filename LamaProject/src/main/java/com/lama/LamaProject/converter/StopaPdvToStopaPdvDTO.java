package com.lama.LamaProject.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.StopaPdvDTO;
import com.lama.LamaProject.main.StopaPdv;


@Component
public class StopaPdvToStopaPdvDTO {

	@Autowired
	private ModelMapper modelMapper;

	public StopaPdvDTO konvertujEntityToDto(StopaPdv stopaPdv) {

		return modelMapper.map(stopaPdv, StopaPdvDTO.class);
	}

	public List<StopaPdvDTO> konvertujEntityToDto(List<StopaPdv> stopaPdvLista) {
		List<StopaPdvDTO> stopePdv = new ArrayList<StopaPdvDTO>();
		for (StopaPdv stopaPdv : stopaPdvLista) {
			stopePdv.add(konvertujEntityToDto(stopaPdv));
		}
		return stopePdv;
	}

}
