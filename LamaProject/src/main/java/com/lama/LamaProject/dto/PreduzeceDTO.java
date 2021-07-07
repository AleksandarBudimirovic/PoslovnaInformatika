package com.lama.LamaProject.dto;

import com.lama.LamaProject.main.Mesto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PreduzeceDTO {

	private Long id;

	private String nazivPreduzeca;

	private String PIB;

	private String tekuciRacun;

	private String emailAdresa;

	private String adresa;

	private String telefon;

	private Mesto mesto;

	public PreduzeceDTO() {
		super();
	}

	public PreduzeceDTO(Long id, String nazivPreduzeca, String pIB, String tekuciRacun, String emailAdresa,
			String adresa, String telefon, Mesto mesto) {
		super();
		this.id = id;
		this.nazivPreduzeca = nazivPreduzeca;
		PIB = pIB;
		this.tekuciRacun = tekuciRacun;
		this.emailAdresa = emailAdresa;
		this.adresa = adresa;
		this.telefon = telefon;
		this.mesto = mesto;
	}
	

	public Long getId() {
		return id;
	}

	public String getNazivPreduzeca() {
		return nazivPreduzeca;
	}

	public void setNazivPreduzeca(String nazivPreduzeca) {
		this.nazivPreduzeca = nazivPreduzeca;
	}

	public String getPIB() {
		return PIB;
	}

	public void setPIB(String pIB) {
		PIB = pIB;
	}

	public String getTekuciRacun() {
		return tekuciRacun;
	}

	public void setTekuciRacun(String tekuciRacun) {
		this.tekuciRacun = tekuciRacun;
	}

	public String getEmailAdresa() {
		return emailAdresa;
	}

	public void setEmailAdresa(String emailAdresa) {
		this.emailAdresa = emailAdresa;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Mesto getMesto() {
		return mesto;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}
	

}
