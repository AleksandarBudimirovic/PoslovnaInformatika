package com.lama.LamaProject.dto;

import java.util.HashSet;
import java.util.Set;

import com.lama.LamaProject.main.GrupaRobe;
import com.lama.LamaProject.main.StopaPdv;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PdvDTO {

	private long id;

	private String vrstaPdv;

	private Set<StopaPdv> stopePdv = new HashSet<StopaPdv>();

	private Set<GrupaRobe> grupeRobe = new HashSet<GrupaRobe>();

	private boolean obrisano;

}
