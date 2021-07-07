package com.lama.LamaProject.converter;


import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.MestoDTO;
import com.lama.LamaProject.main.Mesto;


@Component
public class MestoToMestoDTO {
	
	@Autowired
	private ModelMapper modelMapper;

	public MestoDTO konvertujEntityToDto(Mesto mesto) {

		return modelMapper.map(mesto, MestoDTO.class);
	}

	public List<MestoDTO> konvertujEntityToDto(List<Mesto> mesta) {
		List<MestoDTO> listaMesta = new ArrayList<MestoDTO>();
		for (Mesto mesto : mesta) {
			listaMesta.add(konvertujEntityToDto(mesto));
		}
		return listaMesta;
	}

}
