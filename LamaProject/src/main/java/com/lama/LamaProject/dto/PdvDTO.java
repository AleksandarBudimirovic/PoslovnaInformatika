package com.lama.LamaProject.dto;

import java.util.HashSet;
import java.util.Set;

import com.lama.LamaProject.main.GrupaRobe;
import com.lama.LamaProject.main.StopaPdv;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PdvDTO {

	private long id;

	private String vrstaPdv;

	private Set<StopaPdv> stopePdv = new HashSet<StopaPdv>();

	private Set<GrupaRobe> grupeRobe = new HashSet<GrupaRobe>();

	private boolean obrisano;

	public PdvDTO(long id, String vrstaPdv, Set<StopaPdv> stopePdv, Set<GrupaRobe> grupeRobe, boolean obrisano) {
		super();
		this.id = id;
		this.vrstaPdv = vrstaPdv;
		this.stopePdv = stopePdv;
		this.grupeRobe = grupeRobe;
		this.obrisano = obrisano;
	}

	public PdvDTO() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVrstaPdv() {
		return vrstaPdv;
	}

	public void setVrstaPdv(String vrstaPdv) {
		this.vrstaPdv = vrstaPdv;
	}

	public Set<StopaPdv> getStopePdv() {
		return stopePdv;
	}

	public void setStopePdv(Set<StopaPdv> stopePdv) {
		this.stopePdv = stopePdv;
	}

	public Set<GrupaRobe> getGrupeRobe() {
		return grupeRobe;
	}

	public void setGrupeRobe(Set<GrupaRobe> grupeRobe) {
		this.grupeRobe = grupeRobe;
	}

	public boolean isObrisano() {
		return obrisano;
	}

	public void setObrisano(boolean obrisano) {
		this.obrisano = obrisano;
	}
	
	

}
