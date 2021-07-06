package com.lama.LamaProject.service;

import java.util.List;

import com.lama.LamaProject.main.StavkaOtpremnice;

public interface StavkaOtpremnicaServiceS {

	List<StavkaOtpremnice> findAll();

	void save(StavkaOtpremnice stavka);

	StavkaOtpremnice findOne(long id);

	void izbrisiStavkuOtpremnice(StavkaOtpremnice stavka);


}
