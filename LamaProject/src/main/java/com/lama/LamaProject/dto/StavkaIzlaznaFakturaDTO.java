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

}
