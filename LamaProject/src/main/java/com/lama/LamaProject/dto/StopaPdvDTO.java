package com.lama.LamaProject.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

import com.lama.LamaProject.main.GrupaRobe;
import com.lama.LamaProject.main.Pdv;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class StopaPdvDTO {

	public long id;

	public double procenat;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date rokVazenja;

	private Pdv pdv;
	
	private Set<GrupaRobe> grupeRobe = new HashSet<GrupaRobe>();

	private boolean obrisano;

	public StopaPdvDTO(long id, double procenat, Date rokVazenja, Pdv pdv, Set<GrupaRobe> grupeRobe, boolean obrisano) {
		super();
		this.id = id;
		this.procenat = procenat;
		this.rokVazenja = rokVazenja;
		this.pdv = pdv;
		this.grupeRobe = grupeRobe;
		this.obrisano = obrisano;
	}

	public StopaPdvDTO() {
		super();
	}

	public long getId() {
		return id;
	}


	public double getProcenat() {
		return procenat;
	}

	public void setProcenat(double procenat) {
		this.procenat = procenat;
	}

	public Date getRokVazenja() {
		return rokVazenja;
	}

	public void setRokVazenja(Date rokVazenja) {
		this.rokVazenja = rokVazenja;
	}

	public Pdv getPdv() {
		return pdv;
	}

	public void setPdv(Pdv pdv) {
		this.pdv = pdv;
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
