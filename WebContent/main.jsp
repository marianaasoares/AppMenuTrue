<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	
	<title>AppMariana</title>
	
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
			<h3>Cadastramento de Estudantes</h3>
				<input type="submit" name="tela" value="Estudante">
		</div>
		
		<div style="height: 75px;">		
			<h3>Cadastramento de Professores</h3>
				<input type="submit" name="tela" value="Professor">
		</div>
		
		<div style="height: 75px;">
			<h3>Cadastramento de Coordenadores</h3>
				<input type="submit" name="tela" value="Coordenador">
		</div>
		<div style="height: 75px;">
			<h3>Cadastramento de Diretores</h3>
				<input type="submit" name="tela" value="Diretor">
		</div>
	</form>
</body>
</html>