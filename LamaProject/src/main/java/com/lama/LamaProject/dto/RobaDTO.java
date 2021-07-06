package com.lama.LamaProject.dto;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lama.LamaProject.main.GrupaRobe;
import com.lama.LamaProject.main.StavkaIzlaznaFaktura;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class RobaDTO {
	
	private long id;

	private String nazivRobe;

	private String jedinicaMere;
	@JsonIgnore
	private GrupaRobe grupaRobe;
	@JsonIgnore
	private Set<StavkeCenovnika> stavkeCenovnika = new HashSet<>();
	@JsonIgnore
	private Set<StavkaIzlaznaFaktura> stavkeFakture = new HashSet<>();

	private boolean obrisano;
	

}
