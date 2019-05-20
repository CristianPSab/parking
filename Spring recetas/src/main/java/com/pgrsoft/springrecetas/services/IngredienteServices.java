package com.pgrsoft.springrecetas.services;

import java.util.List;

import com.pgrsoft.springrecetas.modelo.Ingrediente;

public interface IngredienteServices {

	public Ingrediente create(Ingrediente ingrediente); // El sistema otorga codigo
	public Ingrediente read(Long codigo);
	
	public List<Ingrediente> getAll();
	public List<Ingrediente> getByCategoria(String categoria);
}
