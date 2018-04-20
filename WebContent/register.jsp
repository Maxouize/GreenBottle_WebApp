<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/login.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inscription GreenBottle</title>
</head>
<body>
	<div class="login-page">
		<div class="form">
			<form class="register-form" action="RegisterServlet" method="POST">
				<input type="text" placeholder="nom" name="nom"/> <input type="text"
					placeholder="prénom" name="prenom"/> <input type="text"
					placeholder="adresse mail" name="mail"/> <input type="password"
					placeholder="mot de passe" name="password"/>
				<div>
					<input type="text" placeholder="n°" name="numero" style="width: 20%" /> <input
						type="text" placeholder="adresse" name="adresse" style="width: 78%" />
				</div>
				<div>
					<input type="text" value="62000" name="codePostal" readonly="readonly" style="width: 49%" /> <input
						type="text" value="Arras" name="ville" readonly="readonly" style="width: 49%" />
				</div>
				<button type="submit">Create</button>
				<p class="message">
					Déjà inscrit ? <a href="index.jsp">Se connecter</a>
				</p>
			</form>
		</div>
	</div>
</body>
</html>