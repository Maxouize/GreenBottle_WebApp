<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/login.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modification du profil GreenBottle</title>
</head>
<body>
<jsp:include page="header.jsp" />
	<div class="login-page">
		<div class="form">
			<form class="register-form" action="ModifierProfilServlet" method="POST">
			<p><c:out value="${clientInvalide}"></c:out></p>
				<label>Nom: </label><input type="text" name="nom" value="<c:out value="${client.nom}"/>" /> 
				<label>Prenom </label><input type="text" name="prenom" value="<c:out value="${client.prenom}"/>"/> 
				<label>Mail: </label><input type="text" name="mail"value="<c:out value="${client.adresseMail}"/>"/> 
				<div>
					<label>Numero: </label><input type="text" placeholder="n°" name="numero" style="width: 20%" value="<c:out value="${client.numeroAdresse}"/>"/>
					 <label>Adresse: </label><input	type="text" placeholder="adresse" name="adresse" style="width: 78%" value="<c:out value="${client.nomVoie}"/>"/>
				</div>
				<div>
					<label>Code Postal: </label><input type="text" value="62000" name="codePostal" readonly="readonly" style="width: 49%" /> <label>Ville: </label><input
						type="text" value="Arras" name="ville" readonly="readonly" style="width: 49%" />
				</div>
				<button type="submit">Modifier les informations</button>
			</form>
		</div>
	</div>
</body>
</html>