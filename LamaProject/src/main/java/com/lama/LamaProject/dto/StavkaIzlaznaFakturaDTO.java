package com.lama.LamaProject.dto;

import com.lama.LamaProject.main.IzlaznaFaktura;
import com.lama.LamaProject.main.Roba;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class StavkaIzlaznaFakturaDTO {
	
	private long id;

	private double cena;

	private long kolicina;

	private double osnovicaPDV;

	private double procenatPDV;

	private double iznosPDV;

	private double rabat;

	private double ukupanIznos;

	private Roba roba;

	private IzlaznaFaktura faktura;

	private boolean obrisano;

	public StavkaIzlaznaFakturaDTO() {
		super();
	}

	public StavkaIzlaznaFakturaDTO(long id, double cena, long kolicina, double osnovicaPDV, double procenatPDV,
			double iznosPDV, double rabat, double ukupanIznos, Roba roba, IzlaznaFaktura faktura, boolean obrisano) {
		super();
		this.id = id;
		this.cena = cena;
		this.kolicina = kolicina;
		this.osnovicaPDV = osnovicaPDV;
		this.procenatPDV = procenatPDV;
		this.iznosPDV = iznosPDV;
		this.rabat = rabat;
		this.ukupanIznos = ukupanIznos;
		this.roba = roba;
		this.faktura = faktura;
		this.obrisano = obrisano;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public long getKolicina() {
		return kolicina;
	}

	public void setKolicina(long kolicina) {
		this.kolicina = kolicina;
	}

	public double getOsnovicaPDV() {
		return osnovicaPDV;
	}

	public void setOsnovicaPDV(double osnovicaPDV) {
		this.osnovicaPDV = osnovicaPDV;
	}

	public double getProcenatPDV() {
		return procenatPDV;
	}

	public void setProcenatPDV(double procenatPDV) {
		this.procenatPDV = procenatPDV;
	}

	public double getIznosPDV() {
		return iznosPDV;
	}

	public void setIznosPDV(double iznosPDV) {
		this.iznosPDV = iznosPDV;
	}

	public double getRabat() {
		return rabat;
	}

	public void setRabat(double rabat) {
		this.rabat = rabat;
	}

	public double getUkupanIznos() {
		return ukupanIznos;
	}

	public void setUkupanIznos(double ukupanIznos) {
		this.ukupanIznos = ukupanIznos;
	}

	public Roba getRoba() {
		return roba;
	}

	public void setRoba(Roba roba) {
		this.roba = roba;
	}

	public IzlaznaFaktura getFaktura() {
		return faktura;
	}

	public void setFaktura(IzlaznaFaktura faktura) {
		this.faktura = faktura;
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
