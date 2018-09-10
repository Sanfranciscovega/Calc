<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.request.contextPath}">
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/styles.css" />
<title>Insert title here</title>
</head>
<body>
	<h1>Calculatrice en ligne</h1>
	<!-- Include forms -->
	<%@include file="formulaire.jsp" %>
	<!-- Show calculation result -->
	<h2>${ ! empty result ? field1 += " " +=  operator += " " += field2 += " = " += result : ''}</h2>
	
</body>
</html>