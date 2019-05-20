package com.smpk.recetas.services;

import java.util.List;
import java.util.Map;

import com.smpk.recetas.model.Ingrediente;
import com.smpk.recetas.model.Receta;

public interface DummyDB {

	public Map<Long,Receta> getRecetasMap();
	public Map<Long,Ingrediente> getIngredientesMap();
	public List<Ingrediente> getIngredientesList();
	public List<Receta> getRecetasList();
	
}
