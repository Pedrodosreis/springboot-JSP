<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	
<style>
.bottom-30 {
	margin-bottom: 30px;
}


</style>

<title>Insert title here</title>
</head>
<body class="container">

	<h1 class="bottom-30">Site de Receitas</h1>
	
	<h2 class="bottom-30">Editar Receita</h2>

	<form action="editrecipe" method="post">
		<div class="form-group"><label>ID Receita</label> <input class="form-control" name="id" type="text" value="${recipe.id}" />  </div>
		<div class="form-group"><label>Nome da Receita</label> <input class="form-control" name="name" type="text" value="${recipe.name}" />  </div>
		<div class="form-group"><label>Tempo de preparo</label> <input class="form-control" name="timeRecipe" type="text" value="${recipe.timeRecipe}"></input> </div>
		<div class="form-group"><label>Criado por</label> <input class="form-control" name="createdBy" type="text" value="${recipe.createdBy}"></input> </div>
		<button class="btn btn-primary" type="submit" value="enviar formulário">Editar Receita</button>
	</form>


</body>
</html>























