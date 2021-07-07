package com.lama.LamaProject.dto;

import com.lama.LamaProject.main.Mesto;
import com.lama.LamaProject.main.PoslovniPartner.TipPoslovnogPartnera;
import com.lama.LamaProject.main.Preduzece;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PoslovniPartnerDTO {
	
	private Long id;
	
	private String PIB;

	private String nazivPoslovnogPartnera;
	
	private String adresa;
	
	private boolean obrisano;
	
	private String tekuciRacun;		

	private TipPoslovnogPartnera tipPoslovnogPartnera;	

	private Mesto mesto;		

	private Preduzece preduzece;

	public PoslovniPartnerDTO() {
		super();
	}

	public PoslovniPartnerDTO(Long id, String pIB, String nazivPoslovnogPartnera, String adresa, boolean obrisano,
			String tekuciRacun, TipPoslovnogPartnera tipPoslovnogPartnera, Mesto mesto, Preduzece preduzece) {
		super();
		this.id = id;
		PIB = pIB;
		this.nazivPoslovnogPartnera = nazivPoslovnogPartnera;
		this.adresa = adresa;
		this.obrisano = obrisano;
		this.tekuciRacun = tekuciRacun;
		this.tipPoslovnogPartnera = tipPoslovnogPartnera;
		this.mesto = mesto;
		this.preduzece = preduzece;
	}

	public String getPIB() {
		return PIB;
	}

	public void setPIB(String pIB) {
		PIB = pIB;
	}

	public String getNazivPoslovnogPartnera() {
		return nazivPoslovnogPartnera;
	}

	public void setNazivPoslovnogPartnera(String nazivPoslovnogPartnera) {
		this.nazivPoslovnogPartnera = nazivPoslovnogPartnera;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public boolean isObrisano() {
		return obrisano;
	}

	public void setObrisano(boolean obrisano) {
		this.obrisano = obrisano;
	}

	public String getTekuciRacun() {
		return tekuciRacun;
	}

	public void setTekuciRacun(String tekuciRacun) {
		this.tekuciRacun = tekuciRacun;
	}

	public TipPoslovnogPartnera getTipPoslovnogPartnera() {
		return tipPoslovnogPartnera;
	}

	public void setTipPoslovnogPartnera(TipPoslovnogPartnera tipPoslovnogPartnera) {
		this.tipPoslovnogPartnera = tipPoslovnogPartnera;
	}

	public Mesto getMesto() {
		return mesto;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

	public Preduzece getPreduzece() {
		return preduzece;
	}

	public void setPreduzece(Preduzece preduzece) {
		this.preduzece = preduzece;
	}

	public Long getId() {
		return id;
	}
	
	

}
