package com.pgrsoft.gestionacreedores.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgrsoft.gestionacreedores.model.Prestamo;
import com.pgrsoft.gestionacreedores.repositories.PrestamoRepository;
import com.pgrsoft.gestionacreedores.services.PrestamoServices;

@Service
public class PrestamoServicesImpl implements PrestamoServices {

	@Autowired
	private PrestamoRepository prestamoRepository;

	@Override
	public Prestamo read(Long id) {
		
		// El método getOne() nos devuelve un proxy pero no lo esta retornando
		// con el método findById se retorna a partir de la Id

		Prestamo prestamo = null;
		
		Optional<Prestamo> optional = prestamoRepository.findById(id);
		
		if (optional.isPresent()) {
			prestamo = optional.get();
		}

		return prestamo;
	}

	@Override
	public Prestamo create(Prestamo acreedor) {
		
		return prestamoRepository.save(acreedor);
	}

	@Override
	public List<Prestamo> getAll() {

		
		return prestamoRepository.findAll();
	}

	@Override
	public List<Prestamo> getBetweenImporteRange(double min, double max) {
		List<Prestamo> prestamos = new ArrayList<>();
		
		for (Prestamo prestamo : getAll()) {
			
			if( prestamo.getImporte() > min && prestamo.getImporte() < max) {
				
			}
		}
	
		return null;
	}

	@Override
	public int deletePrestamoBefore(Date fecha) {
		// TODO Auto-generated method stub
		return 0;
	}

}
