package com.lama.LamaProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lama.LamaProject.main.StavkaIzlaznaFaktura;

@Repository
public interface StavkaIzlaznaFakturaRepository extends JpaRepository<StavkaIzlaznaFaktura, Long>{
 

}
