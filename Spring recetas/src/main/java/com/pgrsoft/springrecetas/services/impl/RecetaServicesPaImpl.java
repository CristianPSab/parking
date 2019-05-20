package com.pgrsoft.springrecetas.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pgrsoft.springrecetas.modelo.Ingrediente;
import com.pgrsoft.springrecetas.modelo.Receta;
import com.pgrsoft.springrecetas.services.DummyDB;
import com.pgrsoft.springrecetas.services.RecetaServices;

public class RecetaServicesPaImpl implements RecetaServices {

	//TODO Cada grupo debe refactorizar el nombre de esta clase!!!!
	
	@Autowired
	private DummyDB dummyDB;
	
	@Override
	public Receta create(Receta receta) {
		
		return dummyDB.getRecetasMap().put(receta.getCodigo(), receta);
	}

	@Override
	public Receta read(Long codigo) {
		
		return dummyDB.getRecetasMap().get(codigo);
	}

	@Override
	public Receta update(Receta receta) {
		
		return dummyDB.getRecetasMap().put(receta.getCodigo(), receta);
	}

	@Override
	public Receta delete(Long codigo) {

		return dummyDB.getRecetasMap().remove(codigo);
	}

	@Override
	public List<Receta> getAll() {
		
		return new ArrayList<Receta> (dummyDB.getRecetasMap().values());
	}

	@Override
	public List<Receta> getByIngrediente(Ingrediente ingrediente) {
		List<Receta> llista=getAll();
		List<Receta> ret = new ArrayList<>();
		for (Receta receta : llista) {
			if (receta.getIngredientes().contains(ingrediente)) {
				ret.add(receta);
			}
		}
		return ret;
	}

	@Override
	public List<Receta> getForCeliaco() {
		List<Receta> ret = new ArrayList<>();
		for (Receta receta : dummyDB.getRecetasMap().values()) {
			if(receta.isAptaCeliacos()) {
				ret.add(receta);
			}
		}
		return ret;
	}

}
