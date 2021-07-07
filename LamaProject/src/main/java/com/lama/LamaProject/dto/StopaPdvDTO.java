package com.lama.LamaProject.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

import com.lama.LamaProject.main.GrupaRobe;
import com.lama.LamaProject.main.Pdv;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class StopaPdvDTO {

	public long id;

	public double procenat;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date rokVazenja;

	private Pdv pdv;
	
	private Set<GrupaRobe> grupeRobe = new HashSet<GrupaRobe>();

	private boolean obrisano;

}
