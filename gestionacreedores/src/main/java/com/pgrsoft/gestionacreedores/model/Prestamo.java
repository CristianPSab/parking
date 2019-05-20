package com.pgrsoft.gestionacreedores.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="PRESTAMOS")
public class Prestamo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private long id;
	
	private String acreedor;
	
	@Temporal (TemporalType.DATE)
	@Column(name="FECHA_PRESTAMO")
	private Date fechaPrestamo;
	
	private String descripcion;
	
	private String observaciones;
	
	private double importe;
	
	
	public Prestamo() {
	}


	public Prestamo(long id, String acreedor, Date fechaPrestamo, String descripcion, String observaciones,
			double importe) {
		this.id = id;
		this.acreedor = acreedor;
		this.fechaPrestamo = fechaPrestamo;
		this.descripcion = descripcion;
		this.observaciones = observaciones;
		this.importe = importe;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getAcreedor() {
		return acreedor;
	}


	public void setAcreedor(String acreedor) {
		this.acreedor = acreedor;
	}


	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}


	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public double getImporte() {
		return importe;
	}


	public void setImporte(double importe) {
		this.importe = importe;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Acreedor [id=" + id + ", acreedor=" + acreedor + ", fechaPrestamo=" + fechaPrestamo + ", descripcion="
				+ descripcion + ", observaciones=" + observaciones + ", importe=" + importe + "]";
	}
	
	
	
	 
	
	
}
