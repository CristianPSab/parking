package com.pgrsoft.gestionacreedores.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pgrsoft.gestionacreedores.dtos.PrestamoDTO;
import com.pgrsoft.gestionacreedores.model.Prestamo;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
	
	public List<Prestamo> findByImporteGreaterThanAndImporteLessThan(double min, double max);
	
	public List<Prestamo> findImporteBetween(double min, double max);
	
	public List<Prestamo> findByAcreedor(String acreedor);
	
	@Query("select p.acreedor, p.descripcion from Prestamo p")
	public List<Object[]> dameEsto();
	
	@Query("select new com.pgrsoft.gestionacreedores.dtos.PrestamoDTO(p.acreedor, p.importe) from Prestamo p ")
	
	public List<PrestamoDTO> dameLoOtro();
	
	@Query("select new com.pgrsoft.gestionacreedores.dtos.PrestamoDTO(p.acreedor, p.importe) from Prestamo p where p.importe > min")

	public List<PrestamoDTO> dameLoOtro(double min);

	
	
}
