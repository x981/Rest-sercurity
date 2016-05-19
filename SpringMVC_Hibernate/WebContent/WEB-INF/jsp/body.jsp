<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Tìm kiếm học sinh</h3>
	<form action="timhs.html" method="post">
		Theo: Tên: <input type="text" name="tenhs"> SDTB: <input
			type="text" name="sdtb"> SDTM: <input type="text" name="sdtm">
		<input type="submit" value="Tìm kiếm">
	</form>
	<hr/>
	<c:if test="${dshs!=null }">	
	<table cellpadding="2" cellspacing="2" border="1">
		<tr>
			<td style="width: 50px">Mã Hs</td>
			<td style="width: 180px">Tên HS</td>
			<td>Giới tính</td>
			<td>Năm sinh</td>
			<td>Bố</td>
			<td>SDTB</td>
			<td>Mẹ</td>
			<td>SDTM</td>
			<td>SDTCD</td>
			<td>Địa chỉ</td>
			<td>Lớp</td>
			<td>Đối tượng</td>
			<td>Trạng thái</td>
		</tr>
		<c:forEach var="hs" items="${dshs }">
		<tr>
			<td>${hs.maHs }</td>
			<td>${hs }</td>
			<td>${hs.gioitinh }</td>
			<td>
				<fmt:formatDate value="${hs.namsinh }" pattern="dd/MM/yyyy"/>
			</td>
			<td>${hs.chitietHs.bo }</td>
			<td>${hs.chitietHs.sdtB }</td>
			<td>${hs.chitietHs.me }</td>
			<td>${hs.chitietHs.sdtM }</td>
			<td>${hs.chitietHs.sdtCd }</td>
			<td>${hs.chitietHs.diachi }</td>
			<td>${hs.lophoc }</td>
			<td>${hs.doituong }</td>
			<td>${hs.trangthai }</td>
		</tr>
		</c:forEach>
	</table>
	</c:if>
</body>
</html>