package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tbl_Productos;



public class Tst_Productos {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA_proyectoinventario");
	EntityManager em=emf.createEntityManager();
	
	public Tst_Productos() {}
		public void Insertar_Productos() {
			Tbl_Productos insertarProductos = new Tbl_Productos();
			insertarProductos.setIdproducto(8);
			insertarProductos.setCodproducto("WWWW");
			insertarProductos.setDescripcion("Carne azada");
			insertarProductos.setPreciouni(39);
			insertarProductos.setIdproveedores(4);
			insertarProductos.setIdcategorias(6);
			insertarProductos.setIdstock(5);
			em.getTransaction().begin();
			em.persist(insertarProductos);
			em.getTransaction().commit();
		
	}
		
		
	
		public void Actualizar_Productos() {
			em.getTransaction().begin();
			Tbl_Productos actualizarProductos = em.find(Tbl_Productos.class, 8);
			System.out.println("idproducto" + actualizarProductos.getIdproducto());
			System.out.println("codproducto" + actualizarProductos.getCodproducto());
			System.out.println("descrpcion" + actualizarProductos.getDescripcion());
			System.out.println("preciouni" + actualizarProductos.getPreciouni());
			System.out.println("idproveedores" + actualizarProductos.getIdproveedores());
			System.out.println("idcategorias" + actualizarProductos.getIdcategorias());
			System.out.println("idstock" + actualizarProductos.getIdstock());
			actualizarProductos.setCodproducto("VVVV");
			actualizarProductos.setDescripcion("CATIVA");
			actualizarProductos.setPreciouni(56);
			actualizarProductos.setIdproveedores(4);
			actualizarProductos.setIdcategorias(6);
			actualizarProductos.setIdstock(5);
			em.merge(actualizarProductos);
			em.getTransaction().commit();
					
		}
		public void Eliminar_Productos() {
			em.getTransaction().begin();
			Tbl_Productos eliminarProductos = em.find(Tbl_Productos.class , 8);
			System.out.println("idproducto" + eliminarProductos.getIdproducto());
			System.out.println("codproducto" + eliminarProductos.getCodproducto());
			System.out.println("descripcion" + eliminarProductos.getDescripcion());
			System.out.println("preciouni" + eliminarProductos.getPreciouni());
			em.remove(eliminarProductos);
			em.getTransaction().commit();
			
			}
		
		
		
		public static void main(String [] args) {
			Tst_Productos productosTst = new Tst_Productos();
			productosTst.Eliminar_Productos();
		}

	
	
	
	
	
	


}
