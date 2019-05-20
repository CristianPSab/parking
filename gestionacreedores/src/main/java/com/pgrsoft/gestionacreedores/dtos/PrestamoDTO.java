package com.pgrsoft.gestionacreedores.dtos;

public class PrestamoDTO {

	private String acreedor;
	private double importe;
	
	public PrestamoDTO() {
	}

	public PrestamoDTO(String acreedor, double importe) {
		this.acreedor = acreedor;
		this.importe = importe;
	}

	public String getAcreedor() {
		return acreedor;
	}

	public void setAcreedor(String acreedor) {
		this.acreedor = acreedor;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
}
