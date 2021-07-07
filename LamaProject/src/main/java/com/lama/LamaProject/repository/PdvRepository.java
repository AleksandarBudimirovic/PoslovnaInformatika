package com.lama.LamaProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lama.LamaProject.main.Pdv;

@Repository
public interface PdvRepository extends JpaRepository<Pdv, Long> {

}
