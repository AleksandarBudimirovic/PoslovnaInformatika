package com.lama.LamaProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lama.LamaProject.converter.PoslovnaGodinaToPoslovnaGodinaDTO;
import com.lama.LamaProject.dto.MestoDTO;
import com.lama.LamaProject.dto.PoslovnaGodinaDTO;
import com.lama.LamaProject.main.Mesto;
import com.lama.LamaProject.main.PoslovnaGodina;
import com.lama.LamaProject.service.MestoServiceS;
import com.lama.LamaProject.service.PoslovnaGodinaService;

@Controller
public class PoslovaGodinaController {
	@Autowired
	PoslovnaGodinaService poslovnaGodinaService;
	
}
