package com.lama.LamaProject.main;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class PoslovnaGodina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Integer godina;
	private Integer zakljucenaGodina;
	
	@OneToMany(mappedBy = "poslovnaGodina", cascade = CascadeType.ALL)
	private Set<Otpremnica> otpremnice = new HashSet<>();

	@OneToMany(mappedBy = "poslovnaGodina", cascade = CascadeType.ALL)
	private Set<IzlaznaFaktura> izlazneFakture = new HashSet<>();

	private boolean obrisano;
	
	

	public PoslovnaGodina(long id, Integer godina, Integer zakljucenaGodina, Set<Otpremnica> otpremnice,
			Set<IzlaznaFaktura> izlazneFakture, boolean obrisano) {
		super();
		this.id = id;
		this.godina = godina;
		this.zakljucenaGodina = zakljucenaGodina;
		this.otpremnice = otpremnice;
		this.izlazneFakture = izlazneFakture;
		this.obrisano = obrisano;
	}

	public PoslovnaGodina() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Integer getZakljucenaGodina() {
		return zakljucenaGodina;
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
	
	
	
	
	
	
	
	
}
