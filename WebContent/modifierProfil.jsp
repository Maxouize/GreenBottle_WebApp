<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modification du profil GreenBottle</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="background-image"></div>
	<div class="background-cover"></div>
	<div class="demandeContainer">
		<form class="needs-validation formDemande"
			action="ModifierProfilServlet" method="POST">
			<p>
				<c:out value="${clientInvalide}"></c:out>
			</p>
			<div class="form-row">
				<div class="form-group col-md-12">
					<p>Nom:</p>
					<input type="text" name="nom"
						value="<c:out value="${client.nom}"/>" />
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-12">
					<p>Prenom</p>
					<input type="text" name="prenom"
						value="<c:out value="${client.prenom}"/>" />
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-12">
					<p>Mail</p>
					<input type="text" name="mail"
						value="<c:out value="${client.adresseMail}"/>" />
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<p>Numéro</p>
					<input type="text" name="numero"
						value="<c:out value="${client.numeroAdresse}"/>" />
				</div>
				<div class="form-group col-md-6">
					<p>Adresse</p>
					<input type="text" name="adresse"
						value="<c:out value="${client.nomVoie}"/>" />
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-12">
					<p>Mot de passe</p>
					<input type="password" name="password"
						value="<c:out value="${client.password}"/>" />
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<p>Code postal</p>
					<input type="text" value="62000" name="codePostal"
						readonly="readonly" />
				</div>
				<div class="form-group col-md-6">
					<p>Ville</p>
					<input type="text" value="Arras" name="ville" readonly="readonly"
						 />
				</div>
			</div>
			<div style="text-align: center">
				<input type=submit value="Modifier les informations">
			</div>
		</form>
</body>
</html>