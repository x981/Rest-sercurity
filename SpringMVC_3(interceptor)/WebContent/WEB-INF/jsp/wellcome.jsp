<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Wellcome ${sessionScope.tentk}</h3>
	<br>
	<a href="${pageContext.request.contextPath }/sanpham/danhsachsanpham.html">Danh sach san pham</a>
	<br>
	<a href="${pageContext.request.contextPath }/account/logout.html">Logout</a>
</body>
</html>