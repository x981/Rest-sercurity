<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>Tim kiem thong tin hoc sinh</h3>
	<form method="post" action="TimkiemController">
		Ten hoc sinh: <input type="text" name="tenhs"> <input
			type="submit" value="Timkiem">
	</form>

	<br>
	Ket qua tim kiem: ${kq }
	<br>
	<table cellpadding="1" cellspacing="1" border="1">
		<tr>
			<td>Ma Hs</td>
			<td>Ho ten</td>
			<td>Ten</td>
			<td>Gioi tinh</td>
			<td>Ngay sinh</td>
			<td>Lop</td>
		</tr>
		<c:forEach var="hs" items="${dshs }">
			<tr>
				<td>${hs.maHs}</td>
				<td>${hs.hoten}</td>
				<td>${hs.ten}</td>
				<td>${hs.gioitinh}</td>
				<td>
					<fmt:formatDate value="${hs.ngaysinh}" pattern="dd/MM/yyyy"/>
				</td>
				<td>${hs.lop}</td>
			</tr>
		</c:forEach>

	</table>


</body>
</html>