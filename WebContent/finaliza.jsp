<%@page import="negocio.Chef"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<title>Cadastro realizado com sucesso!</title>
	<meta charset="ISO-8859-1">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>

<body>

	<%
	String titulo= (String)request.getAttribute("titulo");
	String mensagem = (String)request.getAttribute("mensagem");
	String controller = (String)request.getAttribute("controller");
	%>

	<form action="<%=controller%>">
				<button type="submit" class="btn btn-danger navbar-btn">Voltar</button>
			</form>
	

	<div class="container">
  		<h2><%=titulo %></h2>
  		<div class="alert alert-success">
    		<strong>Successo!</strong> <%=mensagem%>.
  		</div>
  	</div>
  	
</body>
</html>