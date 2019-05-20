package com.pgrsoft.springhw.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pgrsoft.springhw.servicios.NumberFormatter;

@RestController
public class ConversorController {
	
	@Autowired
	private NumberFormatter numberFormatter;
	
	@RequestMapping(value="/conversor/{numero}")
	public String conversor (@PathVariable("numero") int numero) {
		return numberFormatter.convert(numero);
	}
}
