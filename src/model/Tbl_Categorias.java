package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_categorias")
public class Tbl_Categorias {
	@Id
	@Column(name="idcategorias")
	private int idcategorias;
	@Column(name="descripcion")
	private String descripcion;
	
public Tbl_Categorias() {
	}

public int getIdcategorias() {
	return idcategorias;
}

public void setIdcategorias(int idcategorias) {
	this.idcategorias = idcategorias;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}


}
