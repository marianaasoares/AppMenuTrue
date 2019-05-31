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

	<form action="sobremesaDetalhe.jsp">
		<div style="height: 75px;">
				<h3>Sobremesa</h3>
		</div>
		<div class="container">            
	  <table class="table">
	    <thead>
	      <tr>
	        <th>Nome</th>
	        <th>Tempo de preparo (em minutos)</th>
	      </tr>
	    </thead>
	    <tbody>
	     <% for(Sobremesa item : lista){ %>
	      <tr>
	         <td><%=item.getNomeReceita()%></td>
	         <td><%=item.getTempoMinutos()%></td>
	      </tr>
	      <%} %>
	    </tbody>
	  </table>
	</div>
	<input type="submit" value="Cadastrar">
	</form>
</body>
</html>