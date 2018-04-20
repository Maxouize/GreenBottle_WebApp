<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<header> </header>
<body>

	<jsp:include page="header.jsp" />
	<div class="background-image"></div>
	<div class="background-cover"></div>
	<div style="padding-bottom: 50px;"></div>
	<div class="demandeContainer">
		<h2 style="text-align: center;">
			<span>EFFECTUEZ VOTRE DEMANDE !</span>
		</h2>

		<div class="dima-divider topaz-line">
			<i class="fa fa-stop"></i>
		</div>
		<form class="needs-validation formDemande" novalidate>
			<div class="form-row">
				<div class="form-group col-md-12">
					<p>Date de retrait (obligatoire)</p>
					<input type="date" required="true" />
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-12">
					<p>Heure de retrait (obligatoire)</p>
					<input type="time" required="true" />
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-12">
					<p>Poids (kg)</p>
					<input type="number" required="true" />
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-12">
					<p>Message</p>
					<textarea cols="40" rows="10"></textarea>
				</div>
			</div>
			<div style="text-align: center">
				<input type=submit value="Envoyer">
			</div>
		</form>
	</div>
</body>
</html>
