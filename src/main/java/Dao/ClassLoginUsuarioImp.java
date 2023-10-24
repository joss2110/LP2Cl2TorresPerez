package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import Interfaces.IUsuarioable;
import model.TblUsuariocl2;

public class ClassLoginUsuarioImp implements IUsuarioable{

	@Override
	public TblUsuariocl2 login(TblUsuariocl2 tblusu) {
		// TODO Auto-generated method stub
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_TORRESPEREZGISELAJOSELYNE");
		EntityManager entimanaUsuario=conex.createEntityManager();
		//aplicamos el JPQL... relacionado con entidades
		Query consulta=entimanaUsuario.createQuery("select u from TblUsuariocl2 u where u.usuariocl2=:x and u.passwordcl2=:y",TblUsuariocl2.class);
		//pasamos los parametros
		consulta.setParameter("x", tblusu.getUsuariocl2());
		consulta.setParameter("y", tblusu.getPasswordcl2());
		TblUsuariocl2 u;
		try {
			u=(TblUsuariocl2) consulta.getSingleResult();
			
		} catch (Exception ex) {
			u=null;
			
		}
		return u;
	}

}
