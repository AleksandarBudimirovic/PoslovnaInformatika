package com.lama.LamaProject.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Table(name = "stavke_cenovnika")
public class StavkeCenovnika {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stavka_cenovnika_id", unique = true, nullable = false)
	private long id;

	private float cena;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cenovnik_id")
	private Cenovnik cenovnik;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "roba_id")
	private Roba roba;

	private boolean obrisano;

	public StavkeCenovnika(long id, float cena, Cenovnik cenovnik, Roba roba, boolean obrisano) {
		super();
		this.id = id;
		this.cena = cena;
		this.cenovnik = cenovnik;
		this.roba = roba;
		this.obrisano = obrisano;
	}

	public StavkeCenovnika() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
