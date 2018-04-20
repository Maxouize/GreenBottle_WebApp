<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/login.css" rel="stylesheet" type="text/css" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login GreenBottle</title>
</head>
<body>
	<div class="login-page">
		<div class="form">
			<form class="login-form" method="post" action="loginServlet">
				<p><c:out value="${clientInvalide}"></c:out></p>
				<input type="text" name="mail" placeholder="adresse mail" />
				<input type="password" name="password" placeholder="mot de passe" />
				<button type="submit">Connexion</button>
				<p class="message">
					Pas inscrit ? <a href="register.jsp">Créer un compte</a>
				</p>
			</form>
		</div>
	</div>
</body>
</html>