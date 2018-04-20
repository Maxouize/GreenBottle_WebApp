<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="java.util.List" %>
	<%@ page import="com.greenBottle.bean.Retrait"%>
	<%@ page import="java.util.ArrayList" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
	<jsp:include page="header.jsp" />
<c:forEach items="${listeRetraits}" var="Retrait">
    <p><c:out value="${Retrait.dateRetrait}" /> !</p>
</c:forEach>
<c:out value="${client.nom}"></c:out>	
</body>
</html>
