package com.lama.LamaProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lama.LamaProject.main.Roba;


@Repository
public interface RobaRepository extends JpaRepository<Roba, Long> {
	
	
	public List<Roba> findByGrupaRobeId(Long grupaRobeId);

}
