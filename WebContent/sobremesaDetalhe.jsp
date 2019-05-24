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
<form action="" method="">
		<h3>Nome da receita</h3>
		<input type="text" name="nome">
	
		<h3>Tempo de preparo</h3>
		<input type="text" name="tempo">
		
		<h3>Segmento</h3>
		<input type="text" name="segmento">
		
		<h3>Chocolate</h3>
		<input type="radio" name="Chocolate" value="Chocolate"> Chocolate
		<input type="radio" name="Chocolate" value="Não tem Chocolate"> Não tem Chocolate
	
		<h3>Gelado</h3>
		<input type="radio" name="Gelado" value="Gelado"> Gelado
		<input type="radio" name="Gelado" value="Não Gelado"> Não Gelado
		
		<h3>Serve</h3>
		<input type="text" name="quantidade">
		

		<input type="submit" value="Cadastrar">
</form>
</body>
</html>