package com.lama.LamaProject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MestoDTO {

	private Long id;

	private String grad;
	
	private boolean obrisano;

	public MestoDTO() {
		super();
	}

	public MestoDTO(Long id, String grad, boolean obrisano) {
		super();
		this.id = id;
		this.grad = grad;
		this.obrisano = obrisano;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public boolean isObrisano() {
		return obrisano;
	}

	public void setObrisano(boolean obrisano) {
		this.obrisano = obrisano;
	}

	public Long getId() {
		return id;
	}

}
