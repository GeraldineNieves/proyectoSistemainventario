package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_productos")
public class Tbl_Productos {
	@Id
	@Column(name="idproducto")
	private int idproducto;
	@Column(name="codproducto")
	private String codproducto;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="preciouni")
	private double preciouni;
	@Column(name="idproveedores")
	private int idproveedores;
	@Column(name="idcategorias")
	private int idcategorias;
	@Column(name="idstock")
	private int idstock;
	
	
	public Tbl_Productos() {
		
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getCodproducto() {
		return codproducto;
	}

	public void setCodproducto(String codproducto) {
		this.codproducto = codproducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPreciouni() {
		return preciouni;
	}

	public void setPreciouni(double preciouni) {
		this.preciouni = preciouni;
	}

	public int getIdproveedores() {
		return idproveedores;
	}

	public void setIdproveedores(int idproveedores) {
		this.idproveedores = idproveedores;
	}

	public int getIdcategorias() {
		return idcategorias;
	}

	public void setIdcategorias(int idcategorias) {
		this.idcategorias = idcategorias;
	}

	public int getIdstock() {
		return idstock;
	}

	public void setIdstock(int idstock) {
		this.idstock = idstock;
	}

	
	
	

}
