package com.lama.LamaProject.dto;

public class PoslovnaGodinaDTO {

	private long id;
	private Integer zakljucenaGodina;
	
	public PoslovnaGodinaDTO() {
		super();
	}

	public PoslovnaGodinaDTO(long id, Integer zakljucenaGodina) {
		super();
		this.id = id;
		this.zakljucenaGodina = zakljucenaGodina;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getZakljucenaGodina() {
		return zakljucenaGodina;
	}

	public void setZakljucenaGodina(Integer zakljucenaGodina) {
		this.zakljucenaGodina = zakljucenaGodina;
	}
	
	
	
	
}
