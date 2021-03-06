package com.lama.LamaProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lama.LamaProject.main.PoslovnaGodina;


@Repository
public interface PoslovnaGodinaRepository extends JpaRepository<PoslovnaGodina, Long>{
	List<PoslovnaGodina> findByZakljucenaGodinaIsFalseAndObrisanoIsFalse();

}
