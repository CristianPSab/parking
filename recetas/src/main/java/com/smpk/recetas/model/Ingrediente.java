package com.smpk.recetas.model;

import java.io.Serializable;

public class Ingrediente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long codigo;
	private String nombre;
	private String categoria;

	public Ingrediente() {
		
	}

	public Ingrediente(Long codigo, String nombre, String categoria) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
	}

	public final Long getCodigo() {
		return codigo;
	}

	public final void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public final String getNombre() {
		return nombre;
	}

	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public final String getCategoria() {
		return categoria;
	}

	public final void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Ingrediente other = (Ingrediente) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Ingrediente [codigo=" + codigo + ", nombre=" + nombre + ", categoria=" + categoria + "]";
	}
	
}
