package com.lama.LamaProject.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lama.LamaProject.dto.PoslovniPartnerDTO;
import com.lama.LamaProject.main.PoslovniPartner;

@Component
public class PoslovniPartnerDTOToPoslovniPartner {
	
	@Autowired
	private ModelMapper modelMapper;

	public PoslovniPartner konvertujDTOToEntity(PoslovniPartnerDTO poslovniPartnerDTO) {
		PoslovniPartner poslovniPartner = modelMapper.map(poslovniPartnerDTO, PoslovniPartner.class);

		return poslovniPartner;
	}

}
