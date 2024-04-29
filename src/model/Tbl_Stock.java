package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_stock")

public class Tbl_Stock {
	@Id
	@Column(name="idstock")
	private int idstock;
	@Column(name="descripcion")
	private String descripcion;
	
	public Tbl_Stock() {
		
	}

	public int getIdstock() {
		return idstock;
	}

	public void setIdstock(int idstock) {
		this.idstock = idstock;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
