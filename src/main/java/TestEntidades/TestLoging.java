package TestEntidades;

import java.io.Console;

import Dao.ClassLoginUsuarioImp;
import model.TblUsuariocl2;

public class TestLoging {
	public static void main(String[] args) {
		
		TblUsuariocl2 tblusu= new TblUsuariocl2();
		ClassLoginUsuarioImp loginImp = new ClassLoginUsuarioImp();
		
		tblusu.setUsuariocl2("Admin");
		tblusu.setPasswordcl2("123456");
		
		if(loginImp.login(tblusu)!=null) {
			System.out.print("Ingresaste");
		}else {
			System.out.print("Usuario o contraseña incorrectas");
		}
		
		
	}
}
