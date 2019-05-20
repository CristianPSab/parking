package com.pgrsoft.gestionacreedores.services;

import java.util.Date;
import java.util.List;

import com.pgrsoft.gestionacreedores.model.Prestamo;

public interface PrestamoServices {

	public Prestamo read(Long id);
	
	public Prestamo create(Prestamo acreedor);
	 
	public List<Prestamo> getAll();
	
	public List<Prestamo> getBetweenImporteRange(double min, double max);
	
//	Ejemplo de método de lógica de Negocio
	
	public int deletePrestamoBefore(Date fecha);
	
}
