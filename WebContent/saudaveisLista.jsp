<%@page import="negocio.Saudaveis"%>
<%@page import="dao.SaudaveisDao"%>
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
	List<Saudaveis> lista = (List<Saudaveis>)request.getAttribute("lista");
	%>
	<form action="AppController" method="get">
		<div style="height: 75px;">
				<h3>Detalhes do cadastramento de estudantes</h3>
				<input type="hidden" name="tela" value="Estudante">
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
	    <% for(Saudaveis item : lista){ %>
	      <tr>
	        <td><%=item.getTipo()%></td>
	        <td><%=item.isVegana()%></td>
	      </tr>
	      <%} %>
	    </tbody>
	  </table>
	</div>
	</form>
</body>
</html>