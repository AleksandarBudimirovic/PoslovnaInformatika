package com.lama.LamaProject.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.CenovnikDTO;
import com.lama.LamaProject.main.Cenovnik;



@Component
public class CenovnikToCenovnikDTO {
	
	@Autowired
	private ModelMapper modelMapper;

	public CenovnikDTO konvertujEntityToDto(Cenovnik cenovnik) {

		return modelMapper.map(cenovnik, CenovnikDTO.class);
	}

	public List<CenovnikDTO> konvertujEntityToDto(List<Cenovnik> cenovnici) {
		List<CenovnikDTO> listaCenovnika = new ArrayList<CenovnikDTO>();
		for (Cenovnik cenovnik : cenovnici) {
			listaCenovnika.add(konvertujEntityToDto(cenovnik));
		}
		return listaCenovnika;
	}

}
