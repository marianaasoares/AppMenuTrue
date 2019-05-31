<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Saudáveis</title>
</head>
<body>
	<form action="SaudaveisController" method="post">
	
		<hr>
		
		<h3>Nome da receita</h3>
		<input type="text" name="nomeReceita">
	
		<h3>Tempo de preparo</h3>
		<input type="text" name="tempoMinutos">
		
		<h3> Tipo </h3>
		<input type="text" name="tipo">
		
		<h3>Vegetariana</h3>
		<input type="radio" name="vegetariana" value="Vegetariana"> Vegetariana
		<input type="radio" name="vegetariana" value="Não Vegetariana"> Não Vegetariana
	
		<h3>Vegana</h3>
		<input type="radio" name="vegana" value="Vegana"> Vegana
		<input type="radio" name="vegana" value="Não Vegana"> Não Vegana
		
		<h3>Serve</h3>
		<input type="text" name="serve">
		

		<input type="submit" value="Cadastrar">
</form>
</body>
</html>