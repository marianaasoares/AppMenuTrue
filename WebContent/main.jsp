<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<link href="../WebContent/style.css" rel="stylesheet" type="text/css">
	<meta charset="ISO-8859-1">
	
	<title>Menu Main</title>
	
	<style>
		input[type = submit] {
		     width: 150px;
		     height: 30px;
		}
		
	</style>
</head>
<body>
	
	<form action="AppController" method="post"> 	</form>
	
	<form action="MassaController">
		<div style="height: 75px;">
			<h3>Massa</h3>
				<button type="submit"> Massa </button>
		</div>
	</form>	
		
	<form action="SobremesaController">	
		<div style="height: 75px;">		
			<h3>Sobremesa</h3>
				<button type="submit"> Sobremesa </button>
		</div>
	</form>	
	
	<form action="SaudaveisController">
		<div style="height: 75px;">
			<h3>Saudaveis</h3>
				<button type="submit"> Saudaveis </button>
		</div>
	</form>
	
	<form action="ChefController">
		<div style="height: 75px;">
			<h3>Chef</h3>
				<button type="submit"> Chef </button>
		</div>
	</form>
</body>
</html>