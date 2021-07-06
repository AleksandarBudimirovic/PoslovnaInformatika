package com.lama.LamaProject.main;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class GrupaRobe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String naziv;

	@OneToMany(cascade = { ALL }, fetch = LAZY, mappedBy = "grupaRobe")
	private Set<Roba> robe = new HashSet<>();

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "preduzece_id")
	private Preduzece preduzece;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdv_id")
	private Pdv pdv;

	private boolean obrisano;

}
