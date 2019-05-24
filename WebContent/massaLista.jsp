<%@page import="negocio.Massa"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> MASSA </title>
</head>
<body>
	<form action="AppController" method="get">
		<div style="height: 75px;">
				<h3>Detalhes de Massa</h3>
				<input type="hidden" name="tela" value="Massa">
				<input type="submit" value="Cadastrar">
		</div>
		<div class="container">            
	  <table class="table">
	    <thead>
	      <tr>
	        <th>Tipo</th>
	        <th>Massa Fresca</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>Nome</td>
	        <td>Universidade</td>
	      </tr>
	    </tbody>
	  </table>
	</div>
	</form>
</body>
</html>