<%@page import="dao.ChefDao"%>
<%@page import="negocio.Chef"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Cadastro de Estudante</title>
</head>
<body>

	<%
	List<Chef> lista = (List<Chef>)request.getAttribute("lista");
	%>
	
	<form action="AppController" method="get">
		<div style="height: 75px;">
				<h3>Chef</h3>
				<input type="hidden" name="tela" value="Chef">
				
				<input type="submit" value="Cadastrar">
		</div>
			
	<div class="container">            
	  <table class="table">
	    <thead>
	      <tr>
	        <th>Nome</th>
	        <th>Usuario</th>
	      </tr>
	    </thead>
	    <tbody>
	    <% for(Chef item : lista){ %>
	      <tr>
	        <td><%=item.getNome()%></td>
	        <td><%=item.getUsuario()%></td>
	      </tr>
	       <%} %>
	    </tbody>
	  </table>
	</div>
	</form>

</body>
</html>