package com.pgrsoft.springhw.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pgrsoft.springhw.model.Producto;

@RestController
@RequestMapping("/api")
public class ProductoController {

//	End-ponts para operaciones CRUD
	
	@RequestMapping(value="/productos/{code}",
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public Producto read(@PathVariable ("code") Long codigo) {
		 
		return new Producto(codigo, "ProductoA", new Date(), false, null, 150.60, 24);
	}
	
	@RequestMapping(value= "/productos", 
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)

	public List<Producto> getAll(){
		List<Producto> productos = new ArrayList<>();
		productos.add(new Producto(100L, "Producto_A", new Date() , false, null, 120.45, 100));
		productos.add(new Producto(200L, "Producto_B", new Date() , true, null, 120.45, 100));
		productos.add(new Producto(500L, "Producto_A", new Date() , false, null, 120.45, 100));
		productos.add(new Producto(100L, "Producto_A", new Date() , false, null, 120.45, 100));
		productos.add(new Producto(180L, "Producto_A", new Date() , false, null, 120.45, 100));

		return productos;
	}
	
	@RequestMapping(value="/productos/{code}",
			method = RequestMethod.DELETE)
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public void  delete(@PathVariable ("code")Long codigo) {
		System.out.println("SE ELIMINA EL PRODUCTO" + codigo + " DEL SISTEMA!");
		
		
	}
	
	@RequestMapping(value="/productos}",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Producto create(@RequestBody Producto nuevoProducto) {
		
		Long codigo = (long)(Math.random() * 1000);
		
		Producto createdProducto = new Producto();
		createdProducto.setCodigo(codigo);
		createdProducto.setNombre(nuevoProducto.getNombre());
		createdProducto.setDescatalogado(nuevoProducto.isDescatalogado());
		createdProducto.setFechaAlta(nuevoProducto.getFechaAlta());
		createdProducto.setPrecio(nuevoProducto.getPrecio());
		createdProducto.setStock(nuevoProducto.getStock());
		createdProducto.setDescripcion(nuevoProducto.getDescripcion());

		System.out.println("Se ha creado el producto: " + createdProducto);
		
		return createdProducto;
		
	}
	
	@RequestMapping(value="/productos}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> getFiltered(@RequestParam(value = "stockmin",
									                required = false
									                )
													Integer stockMin){
		
		System.out.println("Filtro precio > " + stockMin);
		List<Producto> productos = new ArrayList<>();
		productos.add(new Producto(101L, "Producto_A", new Date() , false, null, 120.45, 10));
		productos.add(new Producto(102L, "Producto_B", new Date() , false, null, 120.45, 70));
		productos.add(new Producto(103L, "Producto_C", new Date() , false, null, 120.45, 50));
		productos.add(new Producto(104L, "Producto_D", new Date() , false, null, 120.45, 100));
		
		if (stockMin != null) {
			productos = productos.stream()
			.filter(x-> x.getStock() < stockMin)
			.collect(Collectors.toList());
		}
		return productos;
		
		
	}
	
	
	
}
