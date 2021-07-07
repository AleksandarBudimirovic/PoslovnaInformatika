package com.lama.LamaProject.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.RobaDTO;
import com.lama.LamaProject.main.Roba;


@Component
public class RobaToRobaDTO {
	
	
	@Autowired
	private ModelMapper modelMapper;

	public RobaDTO konvertujEntityToDto(Roba roba) {

		return modelMapper.map(roba, RobaDTO.class);
	}

	public List<RobaDTO> konvertujEntityToDto(List<Roba> robaLista) {
		List<RobaDTO> listaRobe = new ArrayList<RobaDTO>();
		for (Roba roba : robaLista) {
			listaRobe.add(konvertujEntityToDto(roba));
		}
		return listaRobe;
	}

}
