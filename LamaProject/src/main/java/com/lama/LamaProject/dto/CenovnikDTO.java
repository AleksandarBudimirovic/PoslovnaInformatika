package com.lama.LamaProject.dto;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.lama.LamaProject.main.PoslovniPartner;
import com.lama.LamaProject.main.Preduzece;
import com.lama.LamaProject.main.StavkeCenovnika;

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

	private Set<StavkeCenovnika> cene = new HashSet<StavkeCenovnika>();

	private boolean obrisano;

	public CenovnikDTO(Long id, Date pocetakRokaTrajanja, Date krajRokaTrajanja, PoslovniPartner poslovniPartner,
			Preduzece preduzece, Set<StavkeCenovnika> cene, boolean obrisano) {
		super();
		Id = id;
		this.pocetakRokaTrajanja = pocetakRokaTrajanja;
		this.krajRokaTrajanja = krajRokaTrajanja;
		this.poslovniPartner = poslovniPartner;
		this.preduzece = preduzece;
		this.cene = cene;
		this.obrisano = obrisano;
	}

	public CenovnikDTO() {
		super();
	}

	public Long getId() {
		return Id;
	}


	public Date getPocetakRokaTrajanja() {
		return pocetakRokaTrajanja;
	}

	public void setPocetakRokaTrajanja(Date pocetakRokaTrajanja) {
		this.pocetakRokaTrajanja = pocetakRokaTrajanja;
	}

	public Date getKrajRokaTrajanja() {
		return krajRokaTrajanja;
	}

	public void setKrajRokaTrajanja(Date krajRokaTrajanja) {
		this.krajRokaTrajanja = krajRokaTrajanja;
	}

	public PoslovniPartner getPoslovniPartner() {
		return poslovniPartner;
	}

	public void setPoslovniPartner(PoslovniPartner poslovniPartner) {
		this.poslovniPartner = poslovniPartner;
	}

	public Preduzece getPreduzece() {
		return preduzece;
	}

	public void setPreduzece(Preduzece preduzece) {
		this.preduzece = preduzece;
	}

	public Set<StavkeCenovnika> getCene() {
		return cene;
	}

	public void setCene(Set<StavkeCenovnika> cene) {
		this.cene = cene;
	}

	public boolean isObrisano() {
		return obrisano;
	}

	public void setObrisano(boolean obrisano) {
		this.obrisano = obrisano;
	}
	
	
	
}
