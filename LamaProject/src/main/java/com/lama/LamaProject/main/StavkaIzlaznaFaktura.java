package com.lama.LamaProject.main;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class StavkaIzlaznaFaktura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private double cena;

	private long kolicina;

	@Column(name = "osnovica_pdv")
	private double osnovicaPDV;

	@Column(name = "procenat_pdv")
	private double procenatPDV;

	@Column(name = "iznos_pdv")
	private double iznosPDV;

	private double rabat;

	@Column(name = "ukupan_iznos")
	private double ukupanIznos;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "roba_id")
	private Roba roba;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "faktura_id")
	private IzlaznaFaktura faktura;

	private boolean obrisano;

	public StavkaIzlaznaFaktura() {
		super();
	}

	public StavkaIzlaznaFaktura(long id, double cena, long kolicina, double osnovicaPDV, double procenatPDV,
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	
	

}
