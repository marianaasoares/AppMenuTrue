<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Massa</title>
</head>
<body>
	<form action="MassaController" method="post">
	
		<hr>
		
		<h3>Nome da receita</h3>
		<input type="text" name="nomeReceita">
	
		<h3>Tempo de preparo</h3>
		<input type="text" name="tempoMinutos">
	
		<h3>Tipo de massa</h3>
		<input type="text" name="tipo">
		
		<h3>Massa Fresca</h3>
		<input type="radio" name="massa" value="Massa Fresca"> Massa Fresca
		<input type="radio" name="massa" value="Não Massa Fresca"> Não Massa Fresca
	
		<h3>Quantidade de massa</h3>
		<input type="text" name="qtdeMassa">
		

		<input type="submit" value="Cadastrar">
</form>
</body>
</html>