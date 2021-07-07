package com.lama.LamaProject.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lama.LamaProject.main.Cenovnik;
import com.lama.LamaProject.main.Roba;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class StavkaCenovnikaDTO {

	private long id;

	private float cena;

	@JsonIgnore
	private Cenovnik cenovnik;

	@JsonIgnore
	private Roba roba;

	private boolean obrisano;
}
