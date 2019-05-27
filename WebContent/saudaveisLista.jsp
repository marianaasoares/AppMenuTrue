<%@page import="negocio.Saudaveis"%>
<%@page import="dao.SaudaveisDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Saudaveis </title>
</head>
<body>

	<%
	List<Saudaveis> lista = (List<Saudaveis>)request.getAttribute("lista");
	%>

	<form action="AppController" method="get">
		<div style="height: 75px;">
				<h3>Saudaveis</h3>
				<input type="hidden" name="tela" value="Saudaveis">
				<input type="submit" value="Cadastrar">
		</div>
		<div class="container">            
	  <table class="table">
	    <thead>
	      <tr>
	        <th>Nome da receita</th>
	        <th>Tempo de preparo (em minutos)</th>
	      </tr>
	    </thead>
	    <tbody>
	    <% for(Saudaveis item : lista){ %>
	      <tr>
	         <td><%=item.getNomeReceita()%></td>
	         <td><%=item.getTempoMinutos()%></td>
	      </tr>
	    <%} %>
	    </tbody>
	  </table>
	</div>
	</form>
</body>
</html>