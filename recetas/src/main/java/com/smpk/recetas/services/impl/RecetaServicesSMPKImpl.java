package com.smpk.recetas.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smpk.recetas.model.Ingrediente;
import com.smpk.recetas.model.Receta;
import com.smpk.recetas.services.DummyDB;
import com.smpk.recetas.services.RecetaServices;

@Service
public class RecetaServicesSMPKImpl implements RecetaServices {

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
	public List<Receta> getAll() {
		return new ArrayList<>(dummyDB.getRecetasMap().values());
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
	public List<Receta> getByIngrediente(Ingrediente ingrediente) {

		List<Receta> ret = new ArrayList<>();
		for (Receta receta : dummyDB.getRecetasList()) {
			if (receta.getIngredientes().contains(ingrediente)) {
				ret.add(receta);
			}
		}
		return ret;
	}

	@Override
	public List<Receta> getForCeliaco() {
		List<Receta> ret = new ArrayList<>();
		for (Receta receta : dummyDB.getRecetasList()) {
			if (receta.isAptaCeliacos()) {
				ret.add(receta);
			}
		}
		return ret;
	}

}
