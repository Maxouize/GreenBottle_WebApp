<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="com.greenBottle.bean.Retrait"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
	<jsp:include page="header.jsp" />
<table>
<th>Date</th>
<th>Heure</th>
<th>Statut</th>
<th>Poids</th>
<th>Commentaire</th>	
<c:forEach items="${listeRetraits}" var="Retrait">
<tr>
<td>${Retrait.dateRetrait}</td>
<td>${Retrait.heureRetrait}</td>
<td>${Retrait.statut}</td>
<td>${Retrait.poids}</td>
<td>${Retrait.commentaire}</td>
</tr>
</c:forEach>

</table>
</body>
</html>
