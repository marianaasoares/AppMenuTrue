<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Massa</title>
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
	<form action="MassaController" method="post">
	<img alt="AppMariana"
			src="C:\Users\mariana_dsantos\Downloads\icon_appmariana.png">
	<h3><b>Cadastre a massa desejada:</b></h3>
	<div id="formulario">
		<h3>Nome da receita:</h3>
		<input class="form-control" type="text" name="nomeReceita">
	
		<h3>Tempo de preparo:</h3>
		<input class="form-control" type="text" name="tempoMinutos">
	
		<h3>Tipo de massa:</h3> <h6>(ex: Espaguete, nhoque, etc)</h6>
		<input class="form-control" type="text" name="tipo">
		
		<h3>Massa Fresca?</h3>
		<div class="form-check form-check-inline">
 			<input class="form-check-input" type="radio" name="massaFresca" id="inlineRadio1" value="massaFresca">
  			<label class="form-check-label" for="inlineRadio1">Massa Fresca</label>
		</div>
		<div class="form-check form-check-inline">
 			<input class="form-check-input" type="radio" name="massaFresca" id="inlineRadio1" value="massaFresca">
  			<label class="form-check-label" for="inlineRadio1">Nao Massa Fresca</label>
		</div>
	
		<h3>Quantidade de massa:</h3>
		<h6>(em gramas)</h6>
		<input class="form-control" type="text" name="qtdeMassa">
		

		<button type="submit" class="btn btn-secondary btn-lg">Cadastrar</button>
	</div>
</form>
</body>
</html>