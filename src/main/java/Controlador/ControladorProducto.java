package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Dao.ClassCrudProductoImp;
import model.TblProductocl2;



/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ClassCrudProductoImp crudAuto= new ClassCrudProductoImp();
		List<TblProductocl2> listadoproducto=crudAuto.ListadoProducto();
		request.setAttribute("listado", listadoproducto);
		request.getRequestDispatcher("/GestionarProducto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nombre=request.getParameter("nombre");
		double precioventa=Double.parseDouble(request.getParameter("precioventa"));
		double preciocompra=Double.parseDouble(request.getParameter("preciocompra"));
		String estado=request.getParameter("estado");
		String descripcion=request.getParameter("descripcion");
		
		ClassCrudProductoImp crudProducto= new ClassCrudProductoImp();
		TblProductocl2 producto = new TblProductocl2();
		
		producto.setNombrecl2(nombre);
		producto.setPrecioventacl2(precioventa);
		producto.setPreciocomp(preciocompra);
		producto.setEstadocl2(estado);
		producto.setDescripcl2(descripcion);
		
		int x = crudProducto.RegistrarProducto(producto);
		if (x==1) {
			request.setAttribute("mensaje", "El producto fue registrado exitosamente");
		}else {
			request.setAttribute("mensaje", "El producto NO fue registrado, Intente otra vez!");
		}
		List<TblProductocl2> listadoproducto=crudProducto.ListadoProducto();
		request.setAttribute("listado", listadoproducto);
		request.getRequestDispatcher("/GestionarProducto.jsp").forward(request, response);
	}

}
