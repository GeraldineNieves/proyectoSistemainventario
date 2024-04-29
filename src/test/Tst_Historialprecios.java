package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tbl_Categorias;
import model.Tbl_Historialprecios;

public class Tst_Historialprecios {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA_proyectoinventario");
	EntityManager em=emf.createEntityManager();
	
	
	
	
	public Tst_Historialprecios() {}
	public void Insertar_Historialprecios() {
		Tbl_Historialprecios insertarHistorialprecios = new Tbl_Historialprecios();
		insertarHistorialprecios.setIdhistorial(5);
		insertarHistorialprecios.setPrecioanterior(4458);
		insertarHistorialprecios.setNuevoprecio(3000);
		insertarHistorialprecios.setFechacambio("19-10-20");
		insertarHistorialprecios.setIdproducto(7);
		
		em.getTransaction().begin();
		em.persist(insertarHistorialprecios);
		em.getTransaction().commit();

	}
	public void Actualizar_Historialprecios() {
		em.getTransaction().begin();
		Tbl_Historialprecios actualizarHistorialprecios = em.find(Tbl_Historialprecios.class, 4);
		System.out.println("idhistorial" + actualizarHistorialprecios.getIdhistorial());
		System.out.println("precioanterior" + actualizarHistorialprecios.getPrecioanterior());
		System.out.println("nuevoprecio" + actualizarHistorialprecios.getNuevoprecio());
		System.out.println("fechacambio" + actualizarHistorialprecios.getFechacambio());
		System.out.println("idproducto" + actualizarHistorialprecios.getIdproducto());
		actualizarHistorialprecios.setPrecioanterior(800);
		actualizarHistorialprecios.setNuevoprecio(900);
		actualizarHistorialprecios.setFechacambio("12-04-21");
		actualizarHistorialprecios.setIdproducto(6);
		em.merge(actualizarHistorialprecios);
		em.getTransaction().commit();
				
	}
	public void Eliminar_Historialprecios() {
		em.getTransaction().begin();
		Tbl_Historialprecios eliminarHistorialprecios = em.find(Tbl_Historialprecios.class , 4);
		System.out.println("idhistorial" + eliminarHistorialprecios.getIdhistorial());
		System.out.println("precioanterior" + eliminarHistorialprecios.getPrecioanterior());
		System.out.println("nuevoprecio" + eliminarHistorialprecios.getNuevoprecio());
		System.out.println("fechacambio" + eliminarHistorialprecios.getFechacambio());
		
		em.remove(eliminarHistorialprecios);
		em.getTransaction().commit();
		
		}
	
	
	public static void main(String [] args) {
		Tst_Historialprecios historialpreciosTst = new Tst_Historialprecios();
		historialpreciosTst.Eliminar_Historialprecios();
	}

}
