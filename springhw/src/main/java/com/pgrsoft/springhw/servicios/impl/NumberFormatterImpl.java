package com.pgrsoft.springhw.servicios.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.pgrsoft.springhw.servicios.NumberFormatter;

@Service
public class NumberFormatterImpl implements NumberFormatter {

	private static final Map<Integer, String> UNIDADES = new HashMap<>();
	private static final Map<Integer, String> DECENAS = new HashMap<>();
	private static final Map<Integer, String> EXCEPCIONES = new HashMap<>();
	private static final Map<Integer, String> CENTENAS = new HashMap<>();
	
	static {
		
		UNIDADES.put(0,"");
		UNIDADES.put(1,"uno");
		UNIDADES.put(2,"dos");
		UNIDADES.put(3,"tres");
		UNIDADES.put(4,"cuatro");
		UNIDADES.put(5,"cinco");
		UNIDADES.put(6,"seis");
		UNIDADES.put(7,"siete");
		UNIDADES.put(8,"ocho");
		UNIDADES.put(9,"nueve");
		
		DECENAS.put(0,"");
		DECENAS.put(3,"treinta");
		DECENAS.put(4,"cuarenta");
		DECENAS.put(5,"cincuenta");
		DECENAS.put(6,"sesenta");
		DECENAS.put(7,"setenta");
		DECENAS.put(8,"ochenta");
		DECENAS.put(9,"noventa");
		
		CENTENAS.put(0,"");
		CENTENAS.put(1,"ciento");
		CENTENAS.put(2,"doscientos");
		CENTENAS.put(3,"trescientos");
		CENTENAS.put(4,"cuatrocientos");
		CENTENAS.put(5,"quinientos");
		CENTENAS.put(6,"seiscientos");
		CENTENAS.put(7,"setecientos");
		CENTENAS.put(8,"ochocientos");
		CENTENAS.put(9,"novecientos");
		
		EXCEPCIONES.put(10,"diez");
		EXCEPCIONES.put(11,"once");
		EXCEPCIONES.put(12,"doce");
		EXCEPCIONES.put(13,"trece");
		EXCEPCIONES.put(14,"catorce");
		EXCEPCIONES.put(15,"quince");
		EXCEPCIONES.put(16,"dieciséis");
		EXCEPCIONES.put(17,"diecisiete");
		EXCEPCIONES.put(18,"dieciocho");
		EXCEPCIONES.put(19,"diecinueve");
		EXCEPCIONES.put(20,"veinte");
		EXCEPCIONES.put(21,"veintiuno");
		EXCEPCIONES.put(22,"veintidós");
		EXCEPCIONES.put(23,"veintitrés");
		EXCEPCIONES.put(24,"veinticuatro");
		EXCEPCIONES.put(25,"veinticinco");
		EXCEPCIONES.put(26,"veintiséis");
		EXCEPCIONES.put(27,"veintisiete");
		EXCEPCIONES.put(28,"veintiocho");
		EXCEPCIONES.put(29,"veintinueve");	
	}
	
	@Override
	public String convert(int numero) {
		
		if (numero < 0 || numero > 999999999) {
			throw new IllegalArgumentException ("El número a convertir ha de estar entre 0 y 999999999");
		}
		
		String resultado = "";
		
		if (numero > 999999) { // si tiene millones...
			int millones = numero / 1000000;
			resultado = (millones == 1) ? "un millón " : cdu (millones) + " millones ";
			numero -= millones * 1000000;
		}
		
		if (numero > 999) { // si tiene miles...
			int miles = numero / 1000;
			resultado = resultado + cdu(miles) + " mil ";
			numero -= miles * 1000;
		}
		
		if (numero > 0) {
			resultado = resultado + cdu(numero);
		}
		
		return resultado;
	}
	
	@Override
	public String convert(String strNumero) {
		
		int numero = 0;
		
		try {
			numero = Integer.parseInt(strNumero);
		} catch (Exception e) {
			throw new IllegalArgumentException(strNumero + " no se puede convertir en número");
		}
		
		return convert(numero);
	}
	
	private String cdu(int numero) {
		
		if (numero == 100) return "cien";
		
		int u = numero % 10;
		int d = numero % 100 / 10;
		int c = numero / 100;
		
		String resultado = "";
		
		int du = d * 10 + u;
	
		if (du > 9 && du < 30 ) {
			resultado = EXCEPCIONES.get(du);
		} else {
			String separador = (d == 0 || u == 0) ? "" : " y ";
			resultado = DECENAS.get(d) + separador + UNIDADES.get(u);
		}
		
		return (CENTENAS.get(c) + " " + resultado).trim();
	}

}
