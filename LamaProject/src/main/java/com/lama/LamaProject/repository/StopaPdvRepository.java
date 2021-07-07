package com.lama.LamaProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lama.LamaProject.main.StopaPdv;


@Repository
public interface StopaPdvRepository extends JpaRepository<StopaPdv, Long>{

}
