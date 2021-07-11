package com.lama.LamaProject.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.lama.LamaProject.main.Otpremnica;
import com.lama.LamaProject.main.PoslovnaGodina;
import com.lama.LamaProject.main.PoslovniPartner;
import com.lama.LamaProject.main.Preduzece;
import com.lama.LamaProject.main.StavkaIzlaznaFaktura;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class IzlaznaFakturaDTO {

	private Long id;
	private long brojFakture;
	private Date datumFakture;
	private Date datumValute;
	private double osnovica;
	private double ukupanPdv;
	private double rabat;
	private double iznosZaPlacanje;
	private boolean placeno;
	private boolean vrstaFakture;
	
	private PoslovnaGodina poslovnaGodina;
	
	private PoslovniPartner poslovniPartner;
	
	private Preduzece preduzece;

	private Otpremnica otpremnica;

	private Set<StavkaIzlaznaFaktura> stavkeIzlazneFakture = new HashSet<>();
	
	public IzlaznaFakturaDTO() {
		super();
	}

	

	public IzlaznaFakturaDTO(Long id, long brojFakture, Date datumFakture, Date datumValute, double osnovica,
			double ukupanPdv, double rabat, double iznosZaPlacanje, boolean placeno, boolean vrstaFakture,
			PoslovnaGodina poslovnaGodina, PoslovniPartner poslovniPartner, Preduzece preduzece, Otpremnica otpremnica,
			Set<StavkaIzlaznaFaktura> stavkeIzlazneFakture) {
		super();
		this.id = id;
		this.brojFakture = brojFakture;
		this.datumFakture = datumFakture;
		this.datumValute = datumValute;
		this.osnovica = osnovica;
		this.ukupanPdv = ukupanPdv;
		this.rabat = rabat;
		this.iznosZaPlacanje = iznosZaPlacanje;
		this.placeno = placeno;
		this.vrstaFakture = vrstaFakture;
		this.poslovnaGodina = poslovnaGodina;
		this.poslovniPartner = poslovniPartner;
		this.preduzece = preduzece;
		this.otpremnica = otpremnica;
		this.stavkeIzlazneFakture = stavkeIzlazneFakture;
	}



	public Long getId() {
		return id;
	}

	public long getBrojFakture() {
		return brojFakture;
	}

	public void setBrojFakture(long brojFakture) {
		this.brojFakture = brojFakture;
	}

	public Date getDatumFakture() {
		return datumFakture;
	}

	public void setDatumFakture(Date datumFakture) {
		this.datumFakture = datumFakture;
	}

	public Date getDatumValute() {
		return datumValute;
	}

	public void setDatumValute(Date datumValute) {
		this.datumValute = datumValute;
	}

	public double getOsnovica() {
		return osnovica;
	}

	public void setOsnovica(double osnovica) {
		this.osnovica = osnovica;
	}

	public double getUkupanPdv() {
		return ukupanPdv;
	}

	public void setUkupanPdv(double ukupanPdv) {
		this.ukupanPdv = ukupanPdv;
	}

	public double getRabat() {
		return rabat;
	}

	public void setRabat(double rabat) {
		this.rabat = rabat;
	}

	public double getIznosZaPlacanje() {
		return iznosZaPlacanje;
	}

	public void setIznosZaPlacanje(double iznosZaPlacanje) {
		this.iznosZaPlacanje = iznosZaPlacanje;
	}

	public boolean isPlaceno() {
		return placeno;
	}

	public void setPlaceno(boolean placeno) {
		this.placeno = placeno;
	}

	public boolean isVrstaFakture() {
		return vrstaFakture;
	}

	public void setVrstaFakture(boolean vrstaFakture) {
		this.vrstaFakture = vrstaFakture;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public PoslovnaGodina getPoslovnaGodina() {
		return poslovnaGodina;
	}



	public void setPoslovnaGodina(PoslovnaGodina poslovnaGodina) {
		this.poslovnaGodina = poslovnaGodina;
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



	public Otpremnica getOtpremnica() {
		return otpremnica;
	}



	public void setOtpremnica(Otpremnica otpremnica) {
		this.otpremnica = otpremnica;
	}



	public Set<StavkaIzlaznaFaktura> getStavkeIzlazneFakture() {
		return stavkeIzlazneFakture;
	}



	public void setStavkeIzlazneFakture(Set<StavkaIzlaznaFaktura> stavkeIzlazneFakture) {
		this.stavkeIzlazneFakture = stavkeIzlazneFakture;
	}
	
	
	
	
	
	
	
	
}
