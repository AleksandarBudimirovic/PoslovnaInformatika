package com.lama.LamaProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lama.LamaProject.main.Otpremnica;


@Repository
public interface OtpremnicaRepository extends JpaRepository<Otpremnica, Long> {
	
    //List<Otpremnica> findAllOtpremnice();
}