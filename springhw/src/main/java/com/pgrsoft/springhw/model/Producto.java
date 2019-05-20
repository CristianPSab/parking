package com.pgrsoft.springhw.model;

import java.io.Serializable;
import java.util.Date;

public class Producto implements Serializable {

	private static final long serialVersionUID = 1656566L;
	
	private Long codigo;
	private String nombre;
	private Date fechaAlta;
	private boolean descatalogado;
	private String descripcion;
	private double precio;
	private int stock;
	
	public Producto() {
	}

	public Producto(Long codigo, String nombre, Date fechaAlta, boolean descatalogado, String descripcion,
			double precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
		this.descatalogado = descatalogado;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public boolean isDescatalogado() {
		return descatalogado;
	}

	public void setDescatalogado(boolean descatalogado) {
		this.descatalogado = descatalogado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
