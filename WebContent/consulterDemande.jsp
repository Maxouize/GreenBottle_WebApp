<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.greenBottle.bean.Retrait"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
	<jsp:include page="header.jsp" />
	<div class="background-image"></div>
	<div class="background-cover"></div>
	<div style="padding-bottom: 50px;"></div>
	<div class="demandeContainer">
		<h2 style="text-align: center;">
			<span>VOS DEMANDES !</span>
		</h2>

		<div class="dima-divider topaz-line">
			<i class="fa fa-stop"></i>
		</div>
		<table class="table">
			<thead>
				<tr>
					<input type="hidden" value="${Retrait.id}" />
					<th scope="col">Date</th>
					<th scope="col">Heure</th>
					<th scope="col">Poids</th>
					<th scope="col">Commentaire</th>
					<th scope="col">Statut</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listeRetraits}" var="Retrait">
					<tr>
						<td scope="row">${Retrait.dateRetrait}</td>
						<td>${Retrait.heureRetrait}</td>
						<td>${Retrait.poids}</td>
						<td>${Retrait.commentaire}</td>
						<td>${Retrait.statut}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</body>
</html>
