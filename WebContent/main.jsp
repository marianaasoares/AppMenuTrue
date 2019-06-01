<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Main</title>
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

	<form action="AppController" method="post"></form>
	<img alt="AppMariana"
		src="C:\Users\mariana_dsantos\Downloads\icon_appmariana.png">
	<h3 id="main_title">Selecione um segmento:</h3>

	<div id="segmentos">
		<form action="MassaController">
			<button type="submit" class="btn btn-secondary btn-lg btn-block">Massa</button>
		</form>

		<form action="SobremesaController">
			<button type="submit" class="btn btn-secondary btn-lg btn-block">Sobremesa</button>
		</form>

		<form action="SaudaveisController">
			<button type="submit" class="btn btn-secondary btn-lg btn-block">Saudaveis</button>
		</form>

		<form action="ChefController">
			<button type="submit" class="btn btn-secondary btn-lg btn-block">Chef</button>
		</form>
	</div>
</body>
</html>