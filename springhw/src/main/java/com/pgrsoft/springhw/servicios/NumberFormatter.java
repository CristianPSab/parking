package com.pgrsoft.springhw.servicios;

/**
 * 
 * Convierte n�meros a su nombre en castellano.
 * 
 * Ejemplo: 256 -> doscientos cincuenta y seis
 * 
 * Rango de n�meros permitidos: [0,999999999]
 * 
 * Si el argumento no es v�lido se debe lanzar IllegalArgumentException
 * 
 * @author Jordi Alemany
 *
 */
public interface NumberFormatter {

	public String convert(int numero);
	
	public String convert(String numero);
	
	
}
