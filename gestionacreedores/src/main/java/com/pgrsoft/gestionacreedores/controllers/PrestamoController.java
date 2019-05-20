package com.pgrsoft.gestionacreedores.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pgrsoft.gestionacreedores.model.Prestamo;
import com.pgrsoft.gestionacreedores.services.PrestamoServices;


@RestController
@RequestMapping("/api")
public class PrestamoController {

	
	@Autowired
	private PrestamoServices prestamoServices;
	
	@RequestMapping("/prestamos")
	public List<Prestamo> getPrestamos(){
		return  prestamoServices.getAll();
	}
}
