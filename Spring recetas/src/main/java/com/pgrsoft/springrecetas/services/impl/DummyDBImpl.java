package com.pgrsoft.springrecetas.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pgrsoft.springrecetas.modelo.Ingrediente;
import com.pgrsoft.springrecetas.modelo.Receta;
import com.pgrsoft.springrecetas.services.DummyDB;

public class DummyDBImpl implements DummyDB {

	private static final Map<Long, Receta> RECETAS;
	private static final Map<Long, Ingrediente> INGREDIENTES;

	static {

		RECETAS = new HashMap<>();
		INGREDIENTES = new HashMap<>();

		// TODO ... inicializar la "base de datos" con algunos datos de ejemplo
		llenarIngredientes();
		llenarRecetas();

	}

	@Override
	public Map<Long, Receta> getRecetasMap() {
		return RECETAS;
	}

	private static void llenarIngredientes() {

		for (int i = 0; i < 200; i++) {
			INGREDIENTES.put((long) i, new Ingrediente((long) i, "ingrediente" + i, "categoria" + i));
		}
	}

	private static void llenarRecetas() {

		for (int i = 0; i < 80; i++) {

			// Per a cada Ingredient
			Long codigo = (long) i;
			Date fechaAlta = new Date();
			String nombre = "receta" + i;
			int nivelDificultad = (int) (Math.random() * 3);
			boolean aptaCeliacos = i % 2 == 0;
			List<Ingrediente> ingredientes = new ArrayList<>();
			String receta = "Pepín";
			for (int j = 0; j < 20; j++) {

				ingredientes.add(INGREDIENTES.get((long) (Math.random() * INGREDIENTES.size())));
			}

			RECETAS.put(codigo,
					new Receta(codigo, fechaAlta, nombre, nivelDificultad, aptaCeliacos, ingredientes, receta));
		}

	}

	@Override
	public Map<Long, Ingrediente> getIngredientesMap() {

		return INGREDIENTES;
	}

}
