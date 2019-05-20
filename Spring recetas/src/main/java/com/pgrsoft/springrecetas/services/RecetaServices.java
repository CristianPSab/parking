package com.pgrsoft.springrecetas.services;

import java.util.List;

import com.pgrsoft.springrecetas.modelo.Ingrediente;
import com.pgrsoft.springrecetas.modelo.Receta;

public interface RecetaServices {

	public Receta create(Receta receta); 	// El sistema otorga el codigo
	public Receta read(Long codigo);
	public Receta update(Receta receta); 	// El m�todo devuelve la receta actualizada
	public Receta delete(Long codigo); 		// El m�todo devuelve la receta eliminada
	
	public List<Receta> getAll();
	public List<Receta> getByIngrediente(Ingrediente ingrediente);
	public List<Receta> getForCeliaco();
}
