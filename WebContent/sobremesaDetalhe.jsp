<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de sobremesas</title>
</head>
<body>
<hr>
<form action="SobremesaController" method="post">
		<h3>Nome da receita</h3>
		<input type="text" name="nomeReceita">
	
		<h3>Tempo de preparo</h3>
		<input type="text" name="tempoMinutos">
		
		<h3>Chocolate</h3>
		<input type="radio" name="temChocolate" value="Chocolate"> Chocolate
		<input type="radio" name="temChocolate" value="Não tem Chocolate"> Não tem Chocolate
	
		<h3>Gelado</h3>
		<input type="radio" name="gelado" value="Gelado"> Gelado
		<input type="radio" name="gelado" value="Não Gelado"> Não Gelado
		
		<h3>Serve</h3>
		<input type="text" name="qtdeServe">
		

		<input type="submit" value="Cadastrar">
</form>
</body>
</html>