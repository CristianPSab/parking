package com.smpk.recetas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smpk.recetas.model.Ingrediente;
import com.smpk.recetas.services.IngredienteServices;

@RestController
@RequestMapping("/api")
public class IngredienteServicesController {
	@Autowired
	private IngredienteServices ingredienteServices;

	@GetMapping("/ingredientes")
	public List<Ingrediente> all(@RequestParam(name = "categoria", required = false) String cat) {
		
		return ingredienteServices.getAll();
	}

	@GetMapping("/ingredientes/{codigo}")
	public Ingrediente getIngrediente(@PathVariable Long codigo) {
		return ingredienteServices.read(codigo);
	}

//	@DeleteMapping("/ingredientes/{codigo}")
//	public Ingrediente delete(@PathVariable Long codigo) {
//		return ingredienteServices.
//	}

	@PostMapping("/ingredientes")
	public Ingrediente newIngrediente(@RequestBody Ingrediente ing) {
return ingredienteServices.create(ing);
	}
}
