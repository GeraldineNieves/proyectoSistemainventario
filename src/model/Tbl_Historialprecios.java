package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_historialprecios")

public class Tbl_Historialprecios {
	@Id
	@Column(name="idhistorial")
	private int idhistorial;
	@Column(name="precioanterior")
	private double precioanterior;
	@Column(name="nuevoprecio")
	private double nuevoprecio;
	@Column(name=" fechacambio")
	private String fechacambio;
	@Column(name="idproducto")
	private int idproducto;
	
	public Tbl_Historialprecios() {
		
	}

	public int getIdhistorial() {
		return idhistorial;
	}

	public void setIdhistorial(int idhistorial) {
		this.idhistorial = idhistorial;
	}

	public double getPrecioanterior() {
		return precioanterior;
	}

	public void setPrecioanterior(double precioanterior) {
		this.precioanterior = precioanterior;
	}

	public double getNuevoprecio() {
		return nuevoprecio;
	}

	public void setNuevoprecio(double nuevoprecio) {
		this.nuevoprecio = nuevoprecio;
	}

	public String getFechacambio() {
		return fechacambio;
	}

	public void setFechacambio(String fechacambio) {
		this.fechacambio = fechacambio;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	
	
	
	
	
	
	
	
	
	

}
