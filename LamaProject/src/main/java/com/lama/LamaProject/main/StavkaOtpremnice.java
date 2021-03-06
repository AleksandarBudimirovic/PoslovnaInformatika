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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "stavka_otpremnice")
public class StavkaOtpremnice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stavka_otpremnice_id", unique = true, nullable = false)
	private long id;

	@Column(name = "jedinica_mere")
	private String jedinicaMere;

	private int kolicina;

	private String opis;

	private float cena;

	@Column(name = "ukupan_iznos")
	private float ukupanIznos;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "otpremnica_id")
	private Otpremnica otpremnica;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "roba_usluga_id")
	private Roba roba;

	private boolean obrisano;

	public StavkaOtpremnice() {
		super();
	}

	public StavkaOtpremnice(long id, String jedinicaMere, int kolicina, String opis, float cena, float ukupanIznos,
			Otpremnica otpremnica, Roba roba, boolean obrisano) {
		super();
		this.id = id;
		this.jedinicaMere = jedinicaMere;
		this.kolicina = kolicina;
		this.opis = opis;
		this.cena = cena;
		this.ukupanIznos = ukupanIznos;
		this.otpremnica = otpremnica;
		this.roba = roba;
		this.obrisano = obrisano;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getJedinicaMere() {
		return jedinicaMere;
	}

	public void setJedinicaMere(String jedinicaMere) {
		this.jedinicaMere = jedinicaMere;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public float getCena() {
		return cena;
	}

	public void setCena(float cena) {
		this.cena = cena;
	}

	public float getUkupanIznos() {
		return ukupanIznos;
	}

	public void setUkupanIznos(float ukupanIznos) {
		this.ukupanIznos = ukupanIznos;
	}

	public Otpremnica getOtpremnica() {
		return otpremnica;
	}

	public void setOtpremnica(Otpremnica otpremnica) {
		this.otpremnica = otpremnica;
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
