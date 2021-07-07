package com.lama.LamaProject.main;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor

public class Pdv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String vrstaPdv;

	@OneToMany(mappedBy = "pdv", cascade = CascadeType.ALL)
	private Set<StopaPdv> stopePdv = new HashSet<StopaPdv>();
	
	@OneToMany(cascade = { ALL }, fetch = LAZY, mappedBy = "pdv")
	private Set<GrupaRobe> grupeRobe = new HashSet<GrupaRobe>();

	private boolean obrisano;

	public Pdv(long id, String vrstaPdv, Set<StopaPdv> stopePdv, Set<GrupaRobe> grupeRobe, boolean obrisano) {
		super();
		this.id = id;
		this.vrstaPdv = vrstaPdv;
		this.stopePdv = stopePdv;
		this.grupeRobe = grupeRobe;
		this.obrisano = obrisano;
	}

	public Pdv() {
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
