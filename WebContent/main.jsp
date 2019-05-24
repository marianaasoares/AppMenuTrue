<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
	
	<form action="AppController" method="post">
	
		<div style="height: 75px;">
			<h3>Massa</h3>
				<input type="submit" name="tela" value="Massa">
		</div>
		
		<div style="height: 75px;">		
			<h3>Sobremesa</h3>
				<input type="submit" name="tela" value="Sobremesa">
		</div>
		
		<div style="height: 75px;">
			<h3>Saudaveis</h3>
				<input type="submit" name="tela" value="Saudaveis">
		</div>
		<div style="height: 75px;">
			<h3>Chef</h3>
				<input type="submit" name="tela" value="Chef">
		</div>
	</form>
</body>
</html>