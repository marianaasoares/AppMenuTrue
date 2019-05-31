<%@page import="negocio.Massa"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> MASSA </title>
</head>
<body>

	<%
	List<Massa> lista = (List<Massa>)request.getAttribute("lista");
	%>
	
	<form action="massaDetalhe.jsp">
		<div style="height: 75px;">
				<h3>Detalhes de Massa</h3>
		</div>
		<div class="container">            
	  <table class="table">
	    <thead>
	      <tr>
	        <th>Nome da Receita</th>
	        <th>Tempo de preparo (em minutos) </th>
	      </tr>
	    </thead>
	    <tbody>
	     <% for(Massa item : lista){ %>
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