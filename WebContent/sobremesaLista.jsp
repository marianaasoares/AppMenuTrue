<%@page import="negocio.Sobremesa"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Sobremesa </title>
</head>
<body>
	<%
	List<Sobremesa> lista = (List<Sobremesa>)request.getAttribute("lista");
	%>
	<form action="AppController" method="get">
		<div style="height: 75px;">
				<h3>Sobremesa</h3>
				<input type="hidden" name="tela" value="Sobremesa">
				<input type="submit" value="Cadastrar">
		</div>
		<div class="container">            
	  <table class="table">
	    <thead>
	      <tr>
	        <th>Nome</th>
	        <th>Universidade</th>
	      </tr>
	    </thead>
	    <tbody>
	    <% for(Sobremesa item : lista){ %>
	      <tr>
	        <td><%=item.getQtdeServe()%></td>
	        <td><%=item.getTemChocolate()%></td>
	      </tr>
	      <%} %>
	    </tbody>
	  </table>
	</div>
	</form>
</body>
</html>