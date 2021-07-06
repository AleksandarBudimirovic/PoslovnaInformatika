package com.lama.LamaProject.main;

import javax.persistence.Entity;

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

	private long id;
	private Integer zakljucenaGodina;
	
	public PoslovnaGodina(long id, Integer zakljucenaGodina) {
		super();
		this.id = id;
		this.zakljucenaGodina = zakljucenaGodina;
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

	public Integer isZakljucenaGodina() {
		return zakljucenaGodina;
	}

	public void setZakljucenaGodina(Integer zakljucenaGodina) {
		this.zakljucenaGodina = zakljucenaGodina;
	}
	
	
	
	
}
