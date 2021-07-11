package com.lama.LamaProject.main;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class IzlaznaFaktura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "broj_fakture")
	private long brojFakture;
	@Column(name = "datum_fakture")
	private Date datumFakture;
	@Column(name = "datum_valute")
	private Date datumValute;
	@Column(name = "osnovica")
	private double osnovica;
	@Column(name = "ukupan_pdv")
	private double ukupanPdv;
	@Column(name = "rabat")
	private double rabat;
	@Column(name = "iznos_za_placanje")
	private double iznosZaPlacanje;
	@Column(name = "placeno")
	private boolean placeno;
	@Column(name = "vrsta_fakture")
	private boolean vrstaFakture;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "poslovna_godina_if")
	private PoslovnaGodina poslovnaGodina;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "poslovni_partner_if")
	private PoslovniPartner poslovniPartner;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "preduzece_if")
	private Preduzece preduzece;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "otpremnica_if")
	private Otpremnica otpremnica;

	@OneToMany(mappedBy = "faktura", cascade = CascadeType.ALL)
	private Set<StavkaIzlaznaFaktura> stavkeIzlazneFakture = new HashSet<>();
	
		
	public IzlaznaFaktura() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public IzlaznaFaktura(Long id, long brojFakture, Date datumFakture, Date datumValute, double osnovica,
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
	
	
	
	
	
	
	
}