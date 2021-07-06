package com.lama.LamaProject.dto;

import com.lama.LamaProject.main.Pdv;
import com.lama.LamaProject.main.Preduzece;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor

public class GrupaRobeDTO {
	
	private long id;

	private String naziv;

	private Preduzece preduzece;

	private Pdv pdv;

	private boolean obrisano;

}
