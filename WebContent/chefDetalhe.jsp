<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chef Detalhe</title>
</head>
<body>
	<form action="ChefController" method="post">
	
		<hr>
		
		<h3>Nome do Chef</h3>
		<input type="text" name="nome">
	
		<h3>Usuário</h3>
		<input type="text" name="usuario">
		
		<h3>Email</h3>
		<input type="text" name="email">
		
		<h3>Amador</h3>
		<input type="radio" name="Amador(a)" value="Amador(a)"> Amador(a)
		<input type="radio" name="Amador(a)" value="Profissional"> Profissional

		

		<input type="submit" value="Cadastrar">
</form>
</body>
</html>