package com.lama.LamaProject.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.PdvDTO;
import com.lama.LamaProject.main.Pdv;


@Component
public class PdvToPdvDTO {

	@Autowired
	private ModelMapper modelMapper;

	public PdvDTO konvertujEntityToDto(Pdv pdv) {

		return modelMapper.map(pdv, PdvDTO.class);
	}

	public List<PdvDTO> konvertujEntityToDto(List<Pdv> pdvLista) {
		List<PdvDTO> listaPdv = new ArrayList<PdvDTO>();
		for (Pdv pdv : pdvLista) {
			listaPdv.add(konvertujEntityToDto(pdv));
		}
		return listaPdv;
	}

}
