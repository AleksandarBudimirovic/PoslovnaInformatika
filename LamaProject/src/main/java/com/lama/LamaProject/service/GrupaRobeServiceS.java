package com.lama.LamaProject.service;

import java.util.List;

import com.lama.LamaProject.main.GrupaRobe;

public interface GrupaRobeServiceS {
	
	List<GrupaRobe> findAll();
	
	GrupaRobe findOne(Long id);
    
    void save(GrupaRobe grupaRobe);

	void izbrisiGrupuRobe(GrupaRobe grupaRobe);
	
	public void izbrisiGrupuRobeByPdvId(Long stopaPdvId);

}
