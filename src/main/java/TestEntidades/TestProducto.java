package TestEntidades;

import java.util.List;

import Dao.ClassCrudProductoImp;
import model.TblProductocl2;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblProductocl2 tblProd=new TblProductocl2();
		ClassCrudProductoImp crudProd= new ClassCrudProductoImp();
		
		/*INSERTAR*/
		
		/*tblProd.setNombrecl2("AZUCAR");
		tblProd.setPrecioventacl2(3.5);
		tblProd.setPreciocomp(2.5);
		tblProd.setEstadocl2("ACTIVO");
		tblProd.setDescripcl2("Rubia");
		crudProd.RegistrarProducto(tblProd);*/
		
		/*ACTUALIZAR*/
		
		/*tblProd.setIdproductocl2(1);
		tblProd.setNombrecl2("AZUCAR");
		tblProd.setPrecioventacl2(3.5);
		tblProd.setPreciocomp(2.5);
		tblProd.setEstadocl2("ACTIVO");
		tblProd.setDescripcl2("Blanca");
		crudProd.ActualizarProducto(tblProd);*/
		
		/*ELIMINAR*/
		
		/*tblProd.setIdproductocl2(10);
		crudProd.EliminarProducto(tblProd);*/
		
		/*LISTAR*/
		
		/*List<TblProductocl2> listado = crudProd.ListadoProducto();
		for(TblProductocl2 p: listado) {
			System.out.print( p.getIdproductocl2()+"\n");
			System.out.print(p.getNombrecl2()+"\n");
			System.out.print(p.getPrecioventacl2()+"\n");
			System.out.print(p.getPreciocomp()+"\n");
			System.out.print(p.getEstadocl2()+"\n");
			System.out.print(p.getDescripcl2()+"\n");
		}*/
		

		
	}

}
