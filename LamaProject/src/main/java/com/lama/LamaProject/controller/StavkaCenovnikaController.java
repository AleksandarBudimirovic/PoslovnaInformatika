package com.lama.LamaProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.lama.LamaProject.service.CenovnikService;
import com.lama.LamaProject.service.RobaServiceS;
import com.lama.LamaProject.service.StavkaCenovnikaService;

@Controller
public class StavkaCenovnikaController {
	
	@Autowired
	CenovnikService cenovnikService;
	
	@Autowired
	StavkaCenovnikaService stavkaCenovnikaService;
	


}
