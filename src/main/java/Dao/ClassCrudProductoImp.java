package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProductoable;
import model.TblProductocl2;

public class ClassCrudProductoImp implements IProductoable{

	@Override
	public int RegistrarProducto(TblProductocl2 tblprod) {
		// TODO Auto-generated method stub
		//Establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_TORRESPEREZGISELAJOSELYNE");
		//manejador de unidades segun unidad de persistencia...
		EntityManager entitymanag=conex.createEntityManager();
		//realizamos el proceso...
		//iniciar transaccion...
		int x=0;
		try {
			entitymanag.getTransaction().begin();
			//refistramos datos...
			entitymanag.persist(tblprod);
			//confirmamos
			entitymanag.getTransaction().commit();
			x=1;
			
		} catch (Exception e) {
			if (entitymanag.getTransaction() != null && entitymanag.getTransaction().isActive()) {
				entitymanag.getTransaction().rollback();
		    }
			x=0;
		    e.printStackTrace();
		    
		}finally{
			entitymanag.close();
		}
		
		return x;
	}

	@Override
	public void ActualizarProducto(TblProductocl2 tblprod) {
		// TODO Auto-generated method stub
		//Establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_TORRESPEREZGISELAJOSELYNE");
		//manejador de unidades segun unidad de persistencia...
		EntityManager entitymanag=conex.createEntityManager();
		//realizamos el proceso...
		//iniciar transaccion...
		entitymanag.getTransaction().begin();
		//refistramos datos...
		entitymanag.merge(tblprod);
		//confirmamos
		entitymanag.getTransaction().commit();
		//cerramos
		entitymanag.close();
	}

	@Override
	public void EliminarProducto(TblProductocl2 tblprod) {
		// TODO Auto-generated method stub
		//Establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_TORRESPEREZGISELAJOSELYNE");
		//manejador de unidades segun unidad de persistencia...
		EntityManager entitymanag=conex.createEntityManager();
		//realizamos el proceso...
		//iniciar transaccion...
		entitymanag.getTransaction().begin();
		//refistramos datos...
		
		TblProductocl2 elim = entitymanag.merge(tblprod);
		
		entitymanag.remove(elim);
		//confirmamos
		entitymanag.getTransaction().commit();
		//cerramos
		entitymanag.close();
	}

	@Override
	public List<TblProductocl2> ListadoProducto() {
		// TODO Auto-generated method stub
		//Establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_TORRESPEREZGISELAJOSELYNE");
		//manejador de unidades segun unidad de persistencia...
		EntityManager entitymanag=conex.createEntityManager();
		//realizamos el proceso...
		//iniciar transaccion...
		entitymanag.getTransaction().begin();
		//aplicamos JPQL
		List<TblProductocl2> listado=entitymanag.createQuery("select e from TblProductocl2 e",TblProductocl2.class).getResultList();
		//confirmamos
		entitymanag.getTransaction().commit();
		//cerramos
		entitymanag.close();
		
		
		return listado;
	}

	@Override
	public TblProductocl2 BuscarProductoCodigo(TblProductocl2 tblprod) {
		// TODO Auto-generated method stub
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_TORRESPEREZGISELAJOSELYNE");
		//manejador de unidades segun unidad de persistencia...
		EntityManager entitymanag=conex.createEntityManager();
		//realizamos el proceso...
		//iniciar transaccion...
		entitymanag.getTransaction().begin();
		//aplicamos JPQL
		TblProductocl2 buscar=entitymanag.find(TblProductocl2.class, tblprod.getIdproductocl2());
		//confirmamos
		entitymanag.getTransaction().commit();
		//cerramos
		entitymanag.close();
		return buscar;
	}

}
