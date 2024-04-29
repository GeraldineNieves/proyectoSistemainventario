package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tbl_Proveedores;
import model.Tbl_Stock;

public class Tst_Proveedores {EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA_proyectoinventario");
EntityManager em=emf.createEntityManager();

public Tst_Proveedores() {}
public void Insertar_Proveedores() {
	Tbl_Proveedores insertarProveedores = new Tbl_Proveedores();
	insertarProveedores.setIdproveedores(6);
	insertarProveedores.setNombre("Carmen");
	insertarProveedores.setTelefono("975564545");
	insertarProveedores.setDireccion("av.ejercito");
	insertarProveedores.setEmail("ejemplo@gamil.com");
	insertarProveedores.setIdtipoprov(10);
	em.getTransaction().begin();
	em.persist(insertarProveedores);
	em.getTransaction().commit();

}
public void Actualizar_Proveedores() {
	em.getTransaction().begin();
	Tbl_Proveedores actualizarProveedores = em.find(Tbl_Proveedores.class, 2);
	System.out.println("idproveedores" + actualizarProveedores.getIdproveedores());
	System.out.println("nombre" + actualizarProveedores.getNombre());
	System.out.println("telefono" + actualizarProveedores.getTelefono());
	System.out.println("direccion" + actualizarProveedores.getDireccion());
	System.out.println("email" + actualizarProveedores.getEmail());
	System.out.println("idtipoprov" + actualizarProveedores.getIdtipoprov());
	actualizarProveedores.setNombre("9383894");
	actualizarProveedores.setTelefono("9383894");
	actualizarProveedores.setDireccion("9383894");
	actualizarProveedores.setEmail("9383894");
	actualizarProveedores.setIdtipoprov(1);
	em.merge(actualizarProveedores);
	em.getTransaction().commit();
			
}
public void Eliminar_Proveedores() {
	em.getTransaction().begin();
	Tbl_Proveedores eliminarProveedores = em.find(Tbl_Proveedores.class , 6);
	System.out.println("idproveedores" + eliminarProveedores.getIdproveedores());
	System.out.println("nombre" + eliminarProveedores.getNombre());
	System.out.println("telefono" + eliminarProveedores.getTelefono());
	System.out.println("direccion" + eliminarProveedores.getDireccion());
	System.out.println("email" + eliminarProveedores.getEmail());
	em.remove(eliminarProveedores);
	em.getTransaction().commit();
	
	}




public static void main(String [] args) {
	Tst_Proveedores proveedoresTst = new Tst_Proveedores();
	proveedoresTst.Eliminar_Proveedores();
}


}
