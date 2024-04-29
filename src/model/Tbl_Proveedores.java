package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_proveedores")

public class Tbl_Proveedores {
	@Id
	@Column(name="idproveedores")
	private int idproveedores;
	@Column(name="nombre")
	private String nombre;
	@Column(name="telefono")
	private String telefono;
	@Column(name="direccion")
	private String direccion;
	@Column(name="email")
	private String email;
	@Column(name="idtipoprov")
	private int idtipoprov ;
	
	public Tbl_Proveedores() {
		
	}

	public int getIdproveedores() {
		return idproveedores;
	}

	public void setIdproveedores(int idproveedores) {
		this.idproveedores = idproveedores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdtipoprov() {
		return idtipoprov;
	}

	public void setIdtipoprov(int idtipoprov) {
		this.idtipoprov = idtipoprov;
	}

	
	
	
	
	
}