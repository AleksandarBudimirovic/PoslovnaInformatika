package com.lama.LamaProject.dto;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lama.LamaProject.main.GrupaRobe;
import com.lama.LamaProject.main.StavkaCenovnika;
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
	private Set<StavkaCenovnika> stavkeCenovnika = new HashSet<>();
	@JsonIgnore
	private Set<StavkaIzlaznaFaktura> stavkeFakture = new HashSet<>();

	private boolean obrisano;

	public RobaDTO() {
		super();
	}

	public RobaDTO(long id, String nazivRobe, String jedinicaMere, GrupaRobe grupaRobe,
			Set<StavkaCenovnika> stavkeCenovnika, Set<StavkaIzlaznaFaktura> stavkeFakture, boolean obrisano) {
		super();
		this.id = id;
		this.nazivRobe = nazivRobe;
		this.jedinicaMere = jedinicaMere;
		this.grupaRobe = grupaRobe;
		this.stavkeCenovnika = stavkeCenovnika;
		this.stavkeFakture = stavkeFakture;
		this.obrisano = obrisano;
	}

	public String getNazivRobe() {
		return nazivRobe;
	}

	public void setNazivRobe(String nazivRobe) {
		this.nazivRobe = nazivRobe;
	}

	public String getJedinicaMere() {
		return jedinicaMere;
	}

	public void setJedinicaMere(String jedinicaMere) {
		this.jedinicaMere = jedinicaMere;
	}

	public GrupaRobe getGrupaRobe() {
		return grupaRobe;
	}

	public void setGrupaRobe(GrupaRobe grupaRobe) {
		this.grupaRobe = grupaRobe;
	}

	public Set<StavkaCenovnika> getStavkeCenovnika() {
		return stavkeCenovnika;
	}

	public void setStavkeCenovnika(Set<StavkaCenovnika> stavkeCenovnika) {
		this.stavkeCenovnika = stavkeCenovnika;
	}

	public Set<StavkaIzlaznaFaktura> getStavkeFakture() {
		return stavkeFakture;
	}

	public void setStavkeFakture(Set<StavkaIzlaznaFaktura> stavkeFakture) {
		this.stavkeFakture = stavkeFakture;
	}

	public boolean isObrisano() {
		return obrisano;
	}

	public void setObrisano(boolean obrisano) {
		this.obrisano = obrisano;
	}

	public long getId() {
		return id;
	}
	
	
	

}
