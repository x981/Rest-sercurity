<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
	.mess{
		color: red;
	}
</style>
<title>Insert title here</title>
</head>
<body>

	<h3>Login</h3>
	<div>
		<p class="mess">${mess }</p>
	</div>
	<s:form method="Post" commandName="tk" action="login.html">
		<table>
			<tr>
				<td>Ten dang nhap: </td>
				<td><s:input path="ten"/></td>
			</tr>
			<tr>
				<td>Mat khau: </td>
				<td><s:input path="pass"/></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</s:form>

</body>
</html>