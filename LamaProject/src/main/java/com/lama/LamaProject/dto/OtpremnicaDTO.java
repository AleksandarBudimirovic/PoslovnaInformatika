package com.lama.LamaProject.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.lama.LamaProject.main.IzlaznaFaktura;
import com.lama.LamaProject.main.PoslovnaGodina;
import com.lama.LamaProject.main.PoslovniPartner;
import com.lama.LamaProject.main.Preduzece;
import com.lama.LamaProject.main.StavkaOtpremnice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class OtpremnicaDTO {

	private long id;

	private long brojOtpremnice;

	private Date datumOtpremnice;

	private boolean tipOtpremnice;

	private double racunOtpremnice;

	private PoslovnaGodina poslovnaGodina;

	private PoslovniPartner poslovniPartner;

	private Preduzece preduzece;

	private Set<StavkaOtpremnice> stavkeOtpremnice = new HashSet<>();

	private Set<IzlaznaFaktura> fakture = new HashSet<>();

	private boolean obrisano;
}
