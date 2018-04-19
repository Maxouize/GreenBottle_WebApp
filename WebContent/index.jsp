<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/login.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="js/login.js" type="text/javascript"></script>
<title>Login GreenBottle</title>
</head>
<body>
	<div class="login-page">
		<div class="form">
			<form class="register-form">
				<input type="text" placeholder="name" /> <input type="password"
					placeholder="password" /> <input type="text"
					placeholder="email address" /> <a href="accueil.jsp">Accueil</a>
				<button>create</button>
				<p class="message">
					Already registered? <a href="#">Sign In</a>
				</p>
			</form>
			<form class="login-form" method="post" action="loginServlet">
				<input type="text" name="username" placeholder="username" /> 
				<input type="password" name="password" placeholder="password" />
				<button type="submit">login</button>
				<p class="message">
					Not registered? <a id="testClick" href="#">Create an account</a>
				</p>
			</form>
		</div>
	</div>
</body>
</html>