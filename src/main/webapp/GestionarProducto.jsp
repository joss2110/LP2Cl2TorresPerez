<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*"  %>
    <%@page import="model.TblProductocl2" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css"> 
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Registrar Producto</h1>
	<form action="ControladorProducto" method="post">
	<table align="center" class="TablaRegistrar">
		<tr >
			<td>Nombre</td>
			<td ><input type="text" name="nombre"></td>
		</tr>
		<tr>
			<td>Precio de Venta</td>
			<td><input type="text" name="precioventa"></td>
		</tr>
		<tr>
			<td>Precio de Compra</td>
			<td><input type="text" name="preciocompra"></td>
		</tr>
		<tr>
			<td>Estado</td>
			<td>
				<select id="estado" name="estado">
				  <option value="Activo">Activo</option>
				  <option value="Inactivo">Inactivo</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>Descripción</td>
			<td><input type="text" name="descripcion"></td>
		</tr>
		<tr align="center">
			<td colspan="2"><input class="botones" type="submit" name="Registrar Producto"></td>
		</tr>
	</table>
		
	</form>
	
	<%String mensaje= (String)request.getAttribute("mensaje");
	if(mensaje==null){
		mensaje="";
	}
	%>
	<div align="center">
	<%=mensaje%>
	</div>
	
	<h1 align="center">Listado Producto</h1>
	
	
	<table class="tablaListado" align="center" border="2" >
		<tr>
		<th>Codigo</th>
		<th>Nombre</th>
		<th>Precio de Venta</th>
		<th>Precio de Compra</th>
		<th>Estado</th>
		<th>Descripción</th>
		</tr>
	
	<%List<TblProductocl2> ListadoProducto=(List<TblProductocl2>)request.getAttribute("listado");
	if(ListadoProducto !=null){
		for(TblProductocl2 lis:ListadoProducto){
			%>
			<tr>
			<td>
			<%=lis.getIdproductocl2()%>
			</td>
			<td>
			<%=lis.getNombrecl2()%>
			</td>
			<td>
			<%=lis.getPrecioventacl2()%>
			</td>
			<td>
			<%=lis.getPreciocomp()%>
			</td>
			<td>
			<%=lis.getEstadocl2()%>
			</td>
			<td>
			<%=lis.getDescripcl2()%>
			</td>
			
			</tr>
			<%
		}
	}
	%>
	</table>
</body>
</html>