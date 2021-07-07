package com.lama.LamaProject.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.GrupaRobeDTO;
import com.lama.LamaProject.main.GrupaRobe;

@Component
public class GrupaRobeToGrupaRobeDTO {
	
	
	@Autowired
	private ModelMapper modelMapper;

	public GrupaRobeDTO konvertujEntityToDto(GrupaRobe grupaRobe) {

		return modelMapper.map(grupaRobe, GrupaRobeDTO.class);
	}

	public List<GrupaRobeDTO> konvertujEntityToDto(List<GrupaRobe> grupaRobeLista) {
		List<GrupaRobeDTO> grupeRoba = new ArrayList<GrupaRobeDTO>();
		for (GrupaRobe grupaRobe : grupaRobeLista) {
			grupeRoba.add(konvertujEntityToDto(grupaRobe));
		}
		return grupeRoba;
	}

}
