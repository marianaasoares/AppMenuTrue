<%@page import="negocio.Massa"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MASSA</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link href="./index.css" type="text/css" rel="stylesheet" />
<link
	href="https://fonts.googleapis.com/css?family=Raleway&display=swap"
	rel="stylesheet">
</head>
<body>

	<%
	List<Massa> lista = (List<Massa>)request.getAttribute("lista");
	%>

	<form action="massaDetalhe.jsp">
		<img alt="AppMariana"
			src="C:\Users\mariana_dsantos\Downloads\icon_appmariana.png">
		<h3>Detalhes de Massa</h3>
		<div class="container">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Nome da Receita</th>
						<th scope="col">Tempo de preparo (em minutos)</th>
						<th scope="col">Tipo de massa</th>
						<th scope="col">Massa Fresca</th>
						<th scope="col">Quantidade de massa(em gramas)</th>
					</tr>
				</thead>
				<tbody>
					<% for(Massa item : lista){ %>
					<tr>
						<td><%=item.getNomeReceita()%></td>
						<td><%=item.getTempoMinutos()%></td>
						<td><%=item.getTipo() %></td>
						<td><%=item.getMassaFresca() %></td>
						<td><%=item.getQtdeMassa() %></td>
					</tr>
					<%} %>
				</tbody>
			</table>
		</div>
		<button type="submit" class="btn btn-secondary btn-lg">Cadastrar</button>
	</form>
</body>
</html>