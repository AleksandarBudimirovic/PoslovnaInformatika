package com.lama.LamaProject.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.PoslovniPartnerDTO;
import com.lama.LamaProject.main.PoslovniPartner;

@Component
public class PoslovniPartnerToPoslovniPartnerDTO {
	
	
	@Autowired
	private ModelMapper modelMapper;

	public PoslovniPartnerDTO konvertujEntityToDto(PoslovniPartner poslovniPartner) {

		return modelMapper.map(poslovniPartner, PoslovniPartnerDTO.class);
	}

	public List<PoslovniPartnerDTO> konvertujEntityToDto(List<PoslovniPartner> poslovniPartneri) {
		List<PoslovniPartnerDTO> listaPoslovnihPartneraDTO = new ArrayList<PoslovniPartnerDTO>();
		for (PoslovniPartner poslovniPartner : poslovniPartneri) {
			listaPoslovnihPartneraDTO.add(konvertujEntityToDto(poslovniPartner));
		}

		return listaPoslovnihPartneraDTO;
	}
	

}
