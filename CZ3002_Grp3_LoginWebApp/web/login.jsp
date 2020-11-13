<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<h2>CZ3002 Assignment 2</h2>
<h3>Done by: Gwyn Bong Xiao Min, Tang Hexuan, Nikhita Menon</h3>

<s:form action="login">
	<s:textfield label="Username" key="username"/>
	<s:password label="Password" key="password"/>
	<s:submit value="Login"/>
</s:form>

<s:actionerror style="color: red"/>

</body>
</html>