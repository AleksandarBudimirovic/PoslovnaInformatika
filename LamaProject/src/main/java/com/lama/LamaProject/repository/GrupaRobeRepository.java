package com.lama.LamaProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lama.LamaProject.main.GrupaRobe;


@Repository
public interface GrupaRobeRepository extends JpaRepository<GrupaRobe, Long>{

	public List<GrupaRobe> findByPdvId(Long pdvId);
}
