package com.lama.LamaProject.service;

import java.util.List;

import com.lama.LamaProject.dto.OtpremnicaDTO;
import com.lama.LamaProject.main.Otpremnica;

public interface OtpremnicaServiceS {
	
	List<Otpremnica> findAll();

	void save(Otpremnica otpremnica);
	
	void update(Otpremnica otpremnica);

	Otpremnica getOne(long idotpremnice);

	void kreirajFakturuOdOtpremnice(OtpremnicaDTO otpremnicaDTO, int poslednjaPoslovnaGodina);


}
