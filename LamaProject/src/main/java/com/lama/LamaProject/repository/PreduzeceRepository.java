package com.lama.LamaProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lama.LamaProject.main.Preduzece;


@Repository
public interface PreduzeceRepository extends JpaRepository<Preduzece, Long> {

}