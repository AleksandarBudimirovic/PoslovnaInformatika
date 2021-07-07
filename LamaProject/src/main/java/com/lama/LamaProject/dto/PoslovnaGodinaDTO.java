package com.lama.LamaProject.dto;

import java.util.HashSet;
import java.util.Set;

import com.lama.LamaProject.main.IzlaznaFaktura;
import com.lama.LamaProject.main.Otpremnica;

public class PoslovnaGodinaDTO {

	private long id;
	private Integer godina;
	private Integer zakljucenaGodina;

	private Set<Otpremnica> otpremnice = new HashSet<>();

	private Set<IzlaznaFaktura> izlazneFakture = new HashSet<>();

	private boolean obrisano;
	

	public PoslovnaGodinaDTO() {
		super();
	}

	

	public PoslovnaGodinaDTO(long id, Integer godina, Integer zakljucenaGodina, Set<Otpremnica> otpremnice,
			Set<IzlaznaFaktura> izlazneFakture, boolean obrisano) {
		super();
		this.id = id;
		this.godina = godina;
		this.zakljucenaGodina = zakljucenaGodina;
		this.otpremnice = otpremnice;
		this.izlazneFakture = izlazneFakture;
		this.obrisano = obrisano;
	}



	public long getId() {
		return id;
	}

	public Integer getZakljucenaGodina() {
		return zakljucenaGodina;
	}

	public void setZakljucenaGodina(Integer zakljucenaGodina) {
		this.zakljucenaGodina = zakljucenaGodina;
	}

	public Integer getGodina() {
		return godina;
	}

	public void setGodina(Integer godina) {
		this.godina = godina;
	}



	public Set<Otpremnica> getOtpremnice() {
		return otpremnice;
	}



	public void setOtpremnice(Set<Otpremnica> otpremnice) {
		this.otpremnice = otpremnice;
	}



	public Set<IzlaznaFaktura> getIzlazneFakture() {
		return izlazneFakture;
	}



	public void setIzlazneFakture(Set<IzlaznaFaktura> izlazneFakture) {
		this.izlazneFakture = izlazneFakture;
	}



	public boolean isObrisano() {
		return obrisano;
	}



	public void setObrisano(boolean obrisano) {
		this.obrisano = obrisano;
	}



	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
	
	
}
