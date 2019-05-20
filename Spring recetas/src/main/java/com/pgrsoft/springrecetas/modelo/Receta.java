package com.pgrsoft.springrecetas.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Receta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long codigo;
	private Date fechaAlta;
	private String nombre;
	private int nivelDificultad; // 0-10
	private boolean aptaCeliacos;
	private List<Ingrediente> ingredientes;
	private String receta;
	
	public Receta() {
		
	}

	public Receta(Long codigo, Date fechaAlta, String nombre, int nivelDificultad, boolean aptaCeliacos,
			List<Ingrediente> ingredientes, String receta) {
		this.codigo = codigo;
		this.fechaAlta = fechaAlta;
		this.nombre = nombre;
		this.nivelDificultad = nivelDificultad;
		this.aptaCeliacos = aptaCeliacos;
		this.ingredientes = ingredientes;
		this.receta = receta;
	}

	public final Long getCodigo() {
		return codigo;
	}

	public final void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public final Date getFechaAlta() {
		return fechaAlta;
	}

	public final void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public final String getNombre() {
		return nombre;
	}

	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public final int getNivelDificultad() {
		return nivelDificultad;
	}

	public final void setNivelDificultad(int nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}

	public final boolean isAptaCeliacos() {
		return aptaCeliacos;
	}

	public final void setAptaCeliacos(boolean aptaCeliacos) {
		this.aptaCeliacos = aptaCeliacos;
	}

	public final List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public final void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public final String getReceta() {
		return receta;
	}

	public final void setReceta(String receta) {
		this.receta = receta;
	}

	@Override
	public String toString() {
		return "Receta [codigo=" + codigo + ", fechaAlta=" + fechaAlta + ", nombre=" + nombre + ", nivelDificultad="
				+ nivelDificultad + ", aptaCeliacos=" + aptaCeliacos + ", ingredientes=" + ingredientes + ", receta="
				+ receta + "]";
	}
	
}
