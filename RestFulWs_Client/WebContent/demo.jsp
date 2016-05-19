<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<fieldset>
		<legend>Find XML</legend>
		<form action="SunshineRestFulController?action=timxml" method="post">
			Nhap ten: <input type="text" name="tenhs"> <input
				type="submit" value="Tim">
		</form>
		<br>
		<table cellpadding="1" cellspacing="1" border="1">
			<tr>
				<td>Ma Hs</td>
				<td>Ho ten</td>
				<td>Ten</td>
				<td>Ngay sinh</td>
				<td>Lop</td>
				<td>Trang thai</td>
			</tr>
			<c:forEach var="hs" items="${dshs }">
				<tr>
					<td>${hs.mahs}</td>
					<td>${hs.hoten}</td>
					<td>${hs.ten}</td>
					<td><fmt:formatDate value="${hs.ngaysinh}"
							pattern="dd/MM/yyyy" /></td>
					<td>${hs.lop}</td>
					<td>${hs.trangthai }</td>
				</tr>
			</c:forEach>

		</table>

	</fieldset>

	<fieldset>
		<legend>Find JSON</legend>
		<form action="SunshineRestFulController?action=timjson" method="post">
			Nhap ten: <input type="text" name="tenhs"> <input
				type="submit" value="Tim">
		</form>

		<br>
		<table cellpadding="1" cellspacing="1" border="1">
			<tr>
				<td>Ma Hs</td>
				<td>Ho ten</td>
				<td>Ten</td>
				<td>Ngay sinh</td>
				<td>Lop</td>
				<td>Trang thai</td>
			</tr>
			<c:forEach var="hs1" items="${dshs1 }">
				<tr>
					<td>${hs1.mahs}</td>
					<td>${hs1.hoten}</td>
					<td>${hs1.ten}</td>
					<td><fmt:formatDate value="${hs1.ngaysinh}"
							pattern="dd/MM/yyyy" /></td>
					<td>${hs1.lop}</td>
					<td>${hs1.trangthai }</td>
				</tr>
			</c:forEach>

		</table>
	</fieldset>

	<fieldset>
		<legend>Sua thong tin hoc sinh - Su dung form</legend>
		<form action="SunshineRestFulController?action=timma" method="post">
			Nhap ma hs: <input type="text" name="mahs"><input
				type="submit" value="Tim kiem">
		</form>
		<br> Thong tin hs <br>
		<form action="SunshineRestFulController?action=capnhat" method="post">
			Ma Hs: <input type="text" value="${hs2.mahs }" name="mahs"> <br>
			Ho ten: <input type="text" value="${hs2.hoten }" name="hoten">
			<br> Ten: <input type="text" value="${hs2.ten }" name="ten">
			<br> <input type="submit" value="Cap nhat">
		</form>
	</fieldset>

	<fieldset>
		<legend>Tao moi hoc sinh</legend>
			<form action="SunshineRestFulController?action=taomoi" method="post">
				Ho ten hs: <input type="text" name="hoten">
				<br>
				Ten hs: <input type="text" name="ten">
				<br>
				<input type="submit" value="Tao moi">
			</form>
	</fieldset>

</body>
</html>