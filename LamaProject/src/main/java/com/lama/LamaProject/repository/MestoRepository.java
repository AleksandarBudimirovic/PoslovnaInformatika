package com.lama.LamaProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lama.LamaProject.main.Mesto;


@Repository
public interface MestoRepository extends JpaRepository<Mesto, Long> {

}