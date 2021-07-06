package com.lama.LamaProject.dto;

import com.lama.LamaProject.main.Mesto;
import com.lama.LamaProject.main.Preduzece;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PoslovniPartnerDTO {
	
	private Long id;
	
	private String PIB;

	private String nazivPoslovnogPartnera;
	
	private String adresa;
	
	private boolean obrisano;
	
	private String tekuciRacun;		

	//private TipPoslovnogPartnera tipPoslovnogPartnera;	

	private Mesto mesto;		

	private Preduzece preduzece;

}
