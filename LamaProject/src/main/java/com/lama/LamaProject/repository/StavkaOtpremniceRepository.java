package com.lama.LamaProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lama.LamaProject.main.StavkaOtpremnice;


@Repository
public interface StavkaOtpremniceRepository extends JpaRepository<StavkaOtpremnice, Long> {
	
	List<StavkaOtpremnice> findAllOtpremnice();
}