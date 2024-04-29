package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tbl_Stock;

public class Tst_Stock {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA_proyectoinventario");
	EntityManager em=emf.createEntityManager();
	
	public Tst_Stock() {}
		public void Insertar_Stock() {
			Tbl_Stock insertarStock = new Tbl_Stock();
			insertarStock.setIdstock(6);
			insertarStock.setDescripcion("Hay 416 unidades de este producto");
			em.getTransaction().begin();
			em.persist(insertarStock);
			em.getTransaction().commit();
		
	}
		
		
	
		public void Actualizar_Stock() {
			em.getTransaction().begin();
			Tbl_Stock actualizarStock = em.find(Tbl_Stock.class, 5);
			System.out.println("idstock" + actualizarStock.getIdstock());
			System.out.println("descripcion" + actualizarStock.getDescripcion());
			actualizarStock.setDescripcion("Hay 200 unidades de este producto");
			em.merge(actualizarStock);
			em.getTransaction().commit();
					
		}
		public void Eliminar_Stock() {
			em.getTransaction().begin();
			Tbl_Stock eliminarStock = em.find(Tbl_Stock.class , 6);
			System.out.println("idstock" + eliminarStock.getIdstock());
			System.out.println("descripcion" + eliminarStock.getDescripcion());
			
			em.remove(eliminarStock);
			em.getTransaction().commit();
			
			}
		
		
		
		
		public static void main(String [] args) {
			Tst_Stock stockTst = new Tst_Stock();
			stockTst.Eliminar_Stock();
		}

}
