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
		<input type="text" name="nome">
	
		<h3>Tempo de preparo</h3>
		<input type="text" name="tempo">
		
		<h3>Segmento</h3>
		<input type="text" name="segmento">
		
		<h3>Vegetariana</h3>
		<input type="radio" name="Vegetariana" value="Vegetariana"> Vegetariana
		<input type="radio" name="Vegetariana" value="Não Vegetariana"> Não Vegetariana
	
		<h3>Vegana</h3>
		<input type="radio" name="Vegana" value="Vegana"> Vegana
		<input type="radio" name="Vegana" value="Não Vegana"> Não Vegana
		
		<h3>Serve</h3>
		<input type="text" name="quantidade">
		

		<input type="submit" value="Cadastrar">
</form>
</body>
</html>