<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link href="./index.css" type="text/css" rel="stylesheet" />
<link
	href="https://fonts.googleapis.com/css?family=Raleway&display=swap"
	rel="stylesheet">

</head>

<body>

	<%
	boolean invalido = false;
	if(request.getAttribute("invalido") != null){
		invalido = (Boolean)request.getAttribute("invalido");
	}
	%>

	<%if(invalido){%>
	<div class="container">
		<div class="alert alert-danger">
			<strong>Problema!</strong> Usuário não encontrado!!!
		</div>
	</div>
	<%}%>

	<form action="AcessoController" method="post">
		<div class="container">
			<img alt="AppMariana"
				src="C:\Users\mariana_dsantos\Downloads\icon_appmariana.png">
			<h2 id="bemvindo">Seja bem-vindo ao sistema do App Mariana!</h2>
			<h4 id="subtitulo">Acesse abaixo com seu login e senha:</h4>
			<div id="campos">
				<div class="form-group">
					<label for="email">Email:</label> <input type="email"
						class="form-control" id="email" placeholder="Entre com o email"
						name="email">
				</div>
				<div class="form-group">
					<label for="pwd">Senha:</label> <input type="password"
						class="form-control" id="pwd" placeholder="Entre com a senha"
						name="senha">
				</div>
				<button type="submit" class="btn btn-secondary btn-lg btn-block">Cadastrar</button>
			</div>
		</div>
	</form>
</body>
</html>