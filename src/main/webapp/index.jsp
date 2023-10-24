<html>
<link href="style.css" rel="stylesheet" type="text/css"> 
<body>
<h1 align="center">Ingresar al Sistema</h1>
<form action="ControladorLoging" method="post">
<table align="center">
<tr>
<td>Usuario</td>
<td ><input type="text" name="usuario"></td>
</tr>
<tr>
<td>Contraseña</td>
<td ><input type="password" name="pass"></td>
</tr>
<tr align="center">
<td colspan="2"><input class="botones" type="submit" name="Ingresar"></td>
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

</body>
</html>
