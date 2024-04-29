package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tbl_Categorias;
import model.Tbl_Stock;

public class Tst_Categorias {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA_proyectoinventario");
	EntityManager em=emf.createEntityManager();
	
	
	public Tst_Categorias() {}
	public void Insertar_Categorias() {
		Tbl_Categorias insertarCategorias = new Tbl_Categorias();
		insertarCategorias.setIdcategorias(11);
		insertarCategorias.setDescripcion("Aseo personal");
		em.getTransaction().begin();
		em.persist(insertarCategorias);
		em.getTransaction().commit();

	}
	public void Actualizar_Categorias() {
		em.getTransaction().begin();
		Tbl_Categorias actualizarCategorias = em.find(Tbl_Categorias.class, 10);
		System.out.println("idcategorias" + actualizarCategorias.getIdcategorias());
		System.out.println("descripcion" + actualizarCategorias.getDescripcion());
		actualizarCategorias.setDescripcion("Bolsa plastica");
		em.merge(actualizarCategorias);
		em.getTransaction().commit();
				
	}
	public void Eliminar_Categorias() {
		em.getTransaction().begin();
		Tbl_Categorias eliminarCategorias = em.find(Tbl_Categorias.class , 9);
		System.out.println("idcategorias" + eliminarCategorias.getIdcategorias());
		System.out.println("descripcion" + eliminarCategorias.getDescripcion());
		
		em.remove(eliminarCategorias);
		em.getTransaction().commit();
		
		}
	
	
	public static void main(String [] args) {
		Tst_Categorias categoriasTst = new Tst_Categorias();
		categoriasTst.Eliminar_Categorias();
	}

}
