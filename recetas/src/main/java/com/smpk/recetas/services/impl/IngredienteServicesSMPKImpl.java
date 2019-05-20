package com.smpk.recetas.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.smpk.recetas.model.Ingrediente;
import com.smpk.recetas.services.DummyDB;
import com.smpk.recetas.services.IngredienteServices;

@Service
public class IngredienteServicesSMPKImpl implements IngredienteServices {

	@Autowired
	private DummyDB dummyDB;
	

	@Override
	public Ingrediente create(Ingrediente ingrediente) {
		ingrediente.setCodigo((long)dummyDB.getIngredientesMap().size());
		dummyDB.getIngredientesMap().put(ingrediente.getCodigo(),ingrediente);
		return dummyDB.getIngredientesMap().get(ingrediente.getCodigo());
	}

	@Override
	public Ingrediente read(Long codigo) {
		return dummyDB.getIngredientesMap().get(codigo);
	}

	@Override
	public List<Ingrediente> getAll() {
		return new ArrayList<>(dummyDB.getIngredientesMap().values());
	}

	@Override
	public List<Ingrediente> getByCategoria(String categoria) {
		List<Ingrediente> llista=new ArrayList<>();
		for (Ingrediente ingrediente : dummyDB.getIngredientesList()) {
			if(ingrediente.getCategoria().equals(categoria)) {
				llista.add(ingrediente);
			}
		}
		return llista;
	}
	public Ingrediente newIngrediente(@RequestBody Ingrediente ing) {
		ing.setCodigo((long)dummyDB.getIngredientesMap().size());
		return dummyDB.getIngredientesMap().put(ing.getCodigo(),ing);
	}

}
