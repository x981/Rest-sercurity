<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h4>Wellcome ${sessionScope.tentk} - Danh sach san pham</h4>
	<table cellpadding="2" cellspacing="2" border="1">
		<tr>
			<td>Ma sp</td>
			<td>Ten sp</td>
			<td>So luong</td>
		</tr>
		<c:forEach var="sp" items="${dssp }">
		<tr>
			<td>${sp.masp }</td>
			<td>${sp.tensp }</td>
			<td>${sp.soluong }</td>
		</tr>
		</c:forEach>
	</table>
	<br>
	<a href="${pageContext.request.contextPath }/account/wellcome.html">Quay lai</a>

</body>
</html>