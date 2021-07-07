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
	
	

	public GrupaRobeDTO(long id, String naziv, Preduzece preduzece, Pdv pdv, boolean obrisano) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.preduzece = preduzece;
		this.pdv = pdv;
		this.obrisano = obrisano;
	}

	public GrupaRobeDTO() {
		super();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Preduzece getPreduzece() {
		return preduzece;
	}

	public void setPreduzece(Preduzece preduzece) {
		this.preduzece = preduzece;
	}

	public Pdv getPdv() {
		return pdv;
	}

	public void setPdv(Pdv pdv) {
		this.pdv = pdv;
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
