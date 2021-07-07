package com.lama.LamaProject.dto;

import com.lama.LamaProject.main.Mesto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PreduzeceDTO {

	private Long id;

	private String nazivPreduzeca;

	private String PIB;

	private String tekuciRacun;

	private String emailAdresa;

	private String adresa;

	private String telefon;

	private Mesto mesto;

}
