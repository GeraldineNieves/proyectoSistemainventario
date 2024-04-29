package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_tiposproveedores")


public class Tbl_TipoProveedor {
	@Id
	@Column(name="idtipoprov")
	private int idtipoprov;
	@Column(name="descripcion")
	private String descripcion;
	
	
public Tbl_TipoProveedor() {
		
	}


public int getIdtipoprov() {
	return idtipoprov;
}


public void setIdtipoprov(int idtipoprov) {
	this.idtipoprov = idtipoprov;
}


public String getDescripcion() {
	return descripcion;
}


public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}



}
