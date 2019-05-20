package com.pgrsoft.springhw.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//	Estamos programando end-poins
//	són métodos que interceptan un request y emiten un response...
	
	
	@RequestMapping("/helloworld")
	public String xxxx() {
		return "Hola Mundo!";
	}
	
	@RequestMapping("/producto")
	public Producto yyyyy() {
//		Producto p = new Producto();
//		p.setCodigo(100);
//		p.setNombre("impresora Epson IIP");
//		p.setPrecio(240.70);
//		return p;
		return new Producto(100, "impresora Epson IIP", 240.70);
		
	}
	
	class Producto {
		private int  codigo;
		private String nombre;
		private double precio;
		
		public Producto() {
		}

		

		public Producto(int i, String string, double d) {
			

		}



		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		
		
	}
}
