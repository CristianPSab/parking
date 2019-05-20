package com.smpk.recetas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smpk.recetas.model.Ingrediente;
import com.smpk.recetas.model.Receta;
import com.smpk.recetas.services.DummyDB;
import com.smpk.recetas.services.impl.DummyDBImpl;

@RestController
@RequestMapping("/api")
public class RecetaServicesController {
	private final DummyDB dummyDB= new DummyDBImpl();

	@GetMapping("/recetas")
	public List<Receta> all() {
		System.out.println("hry");
		List<Receta> list= dummyDB.getRecetasList();
		for (Receta receta : list) {
			for (Ingrediente ingr: receta.getIngredientes()) {
				System.out.println(ingr.getNombre());
			}
		}
		return list;

	}
	@GetMapping("/recetas/{codigo}")
	public Receta getReceta(@PathVariable Long codigo) {
		return dummyDB.getRecetasMap().get(codigo);
	}
	@DeleteMapping("/recetas/{codigo}")
	public Receta delete(@PathVariable Long codigo) {
		return dummyDB.getRecetasMap().remove(codigo);
	}
}
