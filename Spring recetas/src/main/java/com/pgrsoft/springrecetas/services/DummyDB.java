package com.pgrsoft.springrecetas.services;

import java.util.Map;

import com.pgrsoft.springrecetas.modelo.Ingrediente;
import com.pgrsoft.springrecetas.modelo.Receta;

public interface DummyDB {

	public Map<Long,Receta> getRecetasMap();
	public Map<Long,Ingrediente> getIngredientesMap();
	
}
