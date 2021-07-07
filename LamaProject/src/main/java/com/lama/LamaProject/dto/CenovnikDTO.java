package com.lama.LamaProject.dto;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.lama.LamaProject.main.PoslovniPartner;
import com.lama.LamaProject.main.Preduzece;
import com.lama.LamaProject.main.StavkaCenovnika;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class CenovnikDTO {
	
	private Long Id;

	private Date pocetakRokaTrajanja;

	private Date krajRokaTrajanja;

	private PoslovniPartner poslovniPartner;

	private Preduzece preduzece;

	private Set<StavkaCenovnika> cene = new HashSet<StavkaCenovnika>();

	private boolean obrisano;
	
}
