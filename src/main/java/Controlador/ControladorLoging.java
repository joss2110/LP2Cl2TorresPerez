package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassCrudProductoImp;
import Dao.ClassLoginUsuarioImp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorLoging
 */
public class ControladorLoging extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorLoging() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//doGet(request, response);
		ClassLoginUsuarioImp crudLogin = new ClassLoginUsuarioImp();
		TblUsuariocl2 tblUsuariocl2 = new TblUsuariocl2();
		
		String usuario=request.getParameter("usuario");
		String pass=request.getParameter("pass");
		
		tblUsuariocl2.setUsuariocl2(usuario);
		tblUsuariocl2.setPasswordcl2(pass);
		
		if(crudLogin.login(tblUsuariocl2)!=null) {
			request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
		}else {
			request.setAttribute("mensaje", "Usuario y/o Contraseña incorrectas");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
		
	}

}
