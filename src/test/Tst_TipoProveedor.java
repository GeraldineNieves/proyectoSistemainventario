package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tbl_TipoProveedor;



public class Tst_TipoProveedor {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA_proyectoinventario");
	EntityManager em=emf.createEntityManager();
	
	public Tst_TipoProveedor() {}
		public void Insertar_TipoProveedor() {
			Tbl_TipoProveedor insertarTipoProveedor = new Tbl_TipoProveedor();
			insertarTipoProveedor.setIdtipoprov(10);
			insertarTipoProveedor.setDescripcion("Jugos");
			em.getTransaction().begin();
			em.persist(insertarTipoProveedor);
			em.getTransaction().commit();
		
	}
		
		
	
		public void Actualizar_TipoProveedor() {
			em.getTransaction().begin();
			Tbl_TipoProveedor actualizarTipoProveedor = em.find(Tbl_TipoProveedor.class, 1);
			System.out.println("idtipoprov" + actualizarTipoProveedor.getIdtipoprov());
			System.out.println("descripcion" + actualizarTipoProveedor.getDescripcion());
			actualizarTipoProveedor.setDescripcion("insumos");
			em.merge(actualizarTipoProveedor);
			em.getTransaction().commit();
					
		}
		public void Eliminar_TipoProveedor() {
			em.getTransaction().begin();
			Tbl_TipoProveedor eliminarTipoProveedor = em.find(Tbl_TipoProveedor.class , 1);
			System.out.println("idtipoprov" + eliminarTipoProveedor.getIdtipoprov());
			System.out.println("descripcion" + eliminarTipoProveedor.getDescripcion());
			
			em.remove(eliminarTipoProveedor);
			em.getTransaction().commit();
			
			}
		
		
		
		public static void main(String [] args) {
			Tst_TipoProveedor TipoProveedorTst = new Tst_TipoProveedor();
			TipoProveedorTst.Insertar_TipoProveedor();
		}

}
