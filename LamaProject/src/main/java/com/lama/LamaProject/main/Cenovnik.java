package com.lama.LamaProject.main;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Where;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Where(clause = "obrisano='false'")

public class Cenovnik {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(name = "pocetak_roka_trajanja")
	private Date pocetakRokaTrajanja;

	@Column(name = "kraj_roka_trajanja")
	private Date krajRokaTrajanja;

	@ManyToOne
	@JoinColumn(name = "poslovni_partner_id", nullable = true)
	private PoslovniPartner poslovniPartner;

	@ManyToOne
	@JoinColumn(name = "preduzece_id", nullable = true)
	private Preduzece preduzece;

	@OneToMany(cascade = { ALL }, fetch = LAZY, mappedBy = "cenovnik")
	private Set<StavkaCenovnika> cene = new HashSet<StavkaCenovnika>();

	private boolean obrisano;
	
}
