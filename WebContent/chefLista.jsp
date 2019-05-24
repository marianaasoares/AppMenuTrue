<%@page import="dao.ChefDao"%>
<%@page import="negocio.Chef"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Cadastro de Estudante</title>
</head>
<body>

	
	<form action="AppController" method="get">
		<div style="height: 75px;">
				<h3>Chef</h3>
				<input type="hidden" name="tela" value="Chef">
				
				<input type="submit" value="Cadastrar">
		</div>
			
	<div class="container">            
	  <table class="table">
	    <thead>
	      <tr>
	        <th>Nome</th>
	        <th>Universidade</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>nome</td>
	        <td>universidade</td>
	      </tr>
	    </tbody>
	  </table>
	</div>
	</form>

</body>
</html>