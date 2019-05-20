package com.pgrsoft.springrecetas.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pgrsoft.springrecetas.modelo.Ingrediente;
import com.pgrsoft.springrecetas.services.DummyDB;
import com.pgrsoft.springrecetas.services.IngredienteServices;


public class IngredienteServicesPaImpl implements IngredienteServices {
	
	@Autowired
	private DummyDB dummyDB;
	
	

	
	//TODO Cada grupo debe refactorizar el nombre de esta clase!!!!

	@Override
	public Ingrediente create(Ingrediente ingrediente) {
		// TODO Auto-generated method stub
		
		
		dummyDB.getIngredientesMap().put(ingrediente.getCodigo(), ingrediente);
		
		
		
		return dummyDB.getIngredientesMap().get(ingrediente.getCodigo());
	}

	@Override
	public Ingrediente read(Long codigo) {
		// TODO Auto-generated method stub
		
		return dummyDB.getIngredientesMap().get(codigo);
	}

	@Override
	public List<Ingrediente> getAll() {
		// TODO Auto-generated method stub
		
		
		return new ArrayList<Ingrediente> (dummyDB.getIngredientesMap().values());
	}

	@Override
	public List<Ingrediente> getByCategoria(String categoria) {
		List<Ingrediente> llista=getAll();
		List<Ingrediente> ret= new ArrayList<>();
		for (Ingrediente ingrediente : llista) {
			if (ingrediente.getCategoria().contentEquals(categoria)) {
				ret.add(ingrediente);
			}
		}
		return ret;
	}

}
