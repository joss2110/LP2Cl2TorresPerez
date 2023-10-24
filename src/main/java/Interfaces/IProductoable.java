package Interfaces;

import java.util.List;

import model.TblProductocl2;

public interface IProductoable {
	public int RegistrarProducto(TblProductocl2 tblprod);
	public void ActualizarProducto(TblProductocl2 tblprod);
	public void EliminarProducto(TblProductocl2 tblprod);
	public List<TblProductocl2> ListadoProducto();
	public TblProductocl2 BuscarProductoCodigo(TblProductocl2 tblprod);
}