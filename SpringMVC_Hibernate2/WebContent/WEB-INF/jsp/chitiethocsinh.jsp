<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="jumbotron">
		<h4 style="font-weight: bold;">THÔNG TIN HỌC SINH</h4>
		<input type="hidden" value="2" id="index">
		<table cellpadding="2" cellspacing="0" border="0">
			<tr>
				<td>Mã Hs:</td>
				<td>${hs.maHs }</td>
			</tr>
			<tr>
				<td>Họ tên:</td>
				<td>${hs.hoten }</td>
			</tr>
			<tr>
				<td>Tên:</td>
				<td>${hs.ten }</td>
			</tr>
			<tr>
				<td>Giới tính:</td>
				<td>${hs.gioitinh }</td>
			</tr>
			<tr>
				<td>Năm sinh:</td>
				<td><fmt:formatDate value="${hs.namsinh }" pattern="dd/MM/yyyy" /></td>
			</tr>
			<tr>
				<td>Bố:</td>
				<td>${hs.chitietHs.bo }</td>
			</tr>
			<tr>
				<td>SDT Bố:</td>
				<td>${hs.chitietHs.sdtB }</td>
			</tr>
			<tr>
				<td>Mẹ:</td>
				<td>${hs.chitietHs.me }</td>
			</tr>
			<tr>
				<td>SDT Mẹ:</td>
				<td>${hs.chitietHs.sdtM }</td>
			</tr>
			<tr>
				<td>SDT CĐ</td>
				<td>${hs.chitietHs.sdtCd }</td>
			</tr>
			<tr>
				<td>Địa chỉ:</td>
				<td>${hs.chitietHs.diachi }</td>
			</tr>
			<tr>
				<td>Lớp:</td>
				<td>${hs.lophoc }</td>
			</tr>
			<tr>
				<td>Trạng thái:</td>
				<td>${hs.trangthai }</td>
			</tr>
		</table>
		<p>
			<a href="${pageContext.request.contextPath }/timhs/${page }.html"
				class="btn btn-primary btn-lg" role="button">Quay lại</a>
		</p>
	</div>
</body>
</html>