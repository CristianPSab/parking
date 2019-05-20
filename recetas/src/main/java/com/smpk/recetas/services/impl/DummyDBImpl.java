package com.smpk.recetas.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.smpk.recetas.model.Ingrediente;
import com.smpk.recetas.model.Receta;
import com.smpk.recetas.services.DummyDB;
@Repository
public class DummyDBImpl implements DummyDB {

	private static final Map<Long, Receta> RECETAS;
	private static final Map<Long, Ingrediente> INGREDIENTES;

	static {

		RECETAS = new HashMap<>();
		INGREDIENTES = new HashMap<>();

		llenarIngredientes();
		llenarRecetas();
	}

	@Override
	public Map<Long, Receta> getRecetasMap() {
		return RECETAS;
	}

	private static void llenarIngredientes() {

		String[] noms = { "Phantom's Blood", "Strix's Innards", "Witch's Hair", "Tengu Hook", "Gargoyle Dust",
				"Pixie Dust", "Marsh Betty", "Life's Bindweed", "Ground Bite", "Electrified Bittercress",
				"Unicorn Tear", "Merman Hook", "Urchin Talon", "Leviathan Liver", "Wolpertinger Antler",
				"Demon Essence", "Onyx Blight", "Sad Bloom", "Rotten Blossom", "Agony Bone", "Sphinx's Gland",
				"Griffin Shell", "Giant's Tears", "Drake Stalk", "Jackalope Antler", "Vampire Dust", "Brown Brick",
				"Burning Brier", "Forbidden Brittlebush", "Numbing Broadleaf" };
		String[] cat = { "Edradoch", "Rarn", "Vord", "Dairle", "Xunn" };

		for (int i = 0; i < 30; i++) {
			INGREDIENTES.put((long) i, new Ingrediente((long) i, noms[i], cat[i % 5]));
		}
	}

	private static void llenarRecetas() {
		Long codigo;
		Date fechaAlta;
		String nombre;
		int nivelDificultad; // 0-10
		boolean aptaCeliacos;
		List<Ingrediente> ingredientes;
		String receta;

		String[] noms = { "Potion of Blank Minds", "Philter of Blessed Water", "Potion of Peace of Mind",
				"Brew of Dreams", "Elixir of Potency", "Potion of Blessed Water", "Elixir of Balance",
				"Potion of Perception", "Tonic of Might", "Draught of Scrutiny", "Elixir of Joy",
				"Philter of the Forest", "Tonic of Enhanced Reflexes", "Philter of Fury", "Draught of Hysteria",
				"Potion of Holy Protection", "Elixir of the Blind", "Brew of the Sloth", "Flask of Rose Petals",
				"Flask of Domination" };

		for (int i = 0; i < 20; i++) {
			codigo = (long) 1;
			fechaAlta = new Date();
			nombre = noms[i];
			nivelDificultad = (int) (Math.random() * 11);
			aptaCeliacos = Math.random() * 10 > 1;
			ingredientes = new ArrayList<>();
			receta = "Maaaaaagia";
			for (int j = 0; j < 4; j++) {
				Ingrediente in=INGREDIENTES.get((long) (Math.random() * INGREDIENTES.size()));
				System.out.println(in);
				ingredientes.add(in);
			}
			RECETAS.put((long) i,
					new Receta(codigo, fechaAlta, nombre, nivelDificultad, aptaCeliacos, ingredientes, receta));
		}

	}

	@Override
	public Map<Long, Ingrediente> getIngredientesMap() {
		return INGREDIENTES;
	}
	public List<Ingrediente> getIngredientesList(){
		return new ArrayList<>(INGREDIENTES.values());
	}

	@Override
	public List<Receta> getRecetasList() {
		return new ArrayList<>(RECETAS.values());
	}

}
