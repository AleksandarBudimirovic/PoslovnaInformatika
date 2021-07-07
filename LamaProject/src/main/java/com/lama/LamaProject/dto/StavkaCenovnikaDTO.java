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

	public StavkaCenovnikaDTO(long id, float cena, Cenovnik cenovnik, Roba roba, boolean obrisano) {
		super();
		this.id = id;
		this.cena = cena;
		this.cenovnik = cenovnik;
		this.roba = roba;
		this.obrisano = obrisano;
	}

	public StavkaCenovnikaDTO() {
		super();
	}

	public long getId() {
		return id;
	}


	public float getCena() {
		return cena;
	}

	public void setCena(float cena) {
		this.cena = cena;
	}

	public Cenovnik getCenovnik() {
		return cenovnik;
	}

	public void setCenovnik(Cenovnik cenovnik) {
		this.cenovnik = cenovnik;
	}

	public Roba getRoba() {
		return roba;
	}

	public void setRoba(Roba roba) {
		this.roba = roba;
	}

	public boolean isObrisano() {
		return obrisano;
	}

	public void setObrisano(boolean obrisano) {
		this.obrisano = obrisano;
	}
	
	
	
}
