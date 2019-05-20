package com.pgrsoft.gestionacreedores.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pgrsoft.gestionacreedores.dtos.PrestamoDTO;
import com.pgrsoft.gestionacreedores.repositories.PrestamoRepository;

@RestController
public class PruebasRepositoryController {

	@Autowired
	private PrestamoRepository prestamoRepository;
	
//	@RequestMapping("/prueba1")
//	public List<Object[]> prueba1() {
//		
//		return "ok";
//	}
	
//	@RequestMapping("/prueba2")
//	public List<PrestamoDTO> prueba2() {
//		return "ok";
//	}
	
}
