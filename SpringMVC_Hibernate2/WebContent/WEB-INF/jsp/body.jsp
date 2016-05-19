<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script type="text/javascript"
	src="${pageContext.servletContext.contextPath }/js/jquery-1.6.2.js"></script>
<script type="text/javascript">
	$(document)
			.ready(
					function() {

						$('.hang').hover(function() {
							$(this).css('cursor', 'pointer');
						}, function() {
						});

						$('.hang').click(function() {
							var id = '#' + $(this).attr('id');
							$('.hang').css("background-color", "white");
							$(this).css("background-color", " #aac0d1");
						});

						$('.hang')
								.dblclick(
										function() {
											var id = $(this).attr('id');
											var current = $('.active a')
													.text();
											window
													.open('${pageContext.request.contextPath}/chitiethocsinh/'
															+ current
															+ '/'
															+ id + '.html');
										});
					});
</script>
<title>Insert title here</title>
<style type="text/css">
	.hang td{
		font-size: 12px;
	}
</style>
</head>
<body>
	<h4>Tìm kiếm học sinh</h4>
	<input type="hidden" value="2" id="index">
	<form action="${pageContext.request.contextPath }/timhs.html"
		method="post">
		Theo: Tên: <input type="text" name="tenhs"> SDTB: <input
			type="text" name="sdtb"> SDTM: <input type="text" name="sdtm">
		<input type="submit" value="Tìm kiếm">
	</form>
	<hr />
	<c:if test="${dshs!=null }">
	<div class="table-responsive">
		<table class="table table-bordered table-striped">
			<thead>
				<tr>
					<th>Mã Hs</th>
					<th>Tên HS</th>
					<th>Giới tính</th>
					<th>Năm sinh</th>
					<th>Bố</th>
					<th>SDTB</th>
					<th>Mẹ</th>
					<th>SDTM</th>
					<th>SDTCD</th>
					<th>Địa chỉ</th>
					<th>Lớp</th>
					<th>Đối tượng</th>
					<th>Trạng thái</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="hs" items="${dshs }">
					<tr class="hang" id="${hs.maHs }">
						<td>${hs.maHs }</td>
						<td>${hs }</td>
						<td>${hs.gioitinh }</td>
						<td><fmt:formatDate value="${hs.namsinh }"
								pattern="dd/MM/yyyy" /></td>
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
			</tbody>
		</table>
		<div class="container" align="center">
			<ul class="pagination pagination-sm">
				<c:forEach var="i" begin="1" end="${sotrang }">
					<c:choose>
						<c:when test="${tranghientai eq i}">
							<li class="active"><a
								href="${pageContext.request.contextPath }/timhs/${i }.html">${i}</a></li>
						</c:when>
						<c:otherwise>
							<li><a
								href="${pageContext.request.contextPath }/timhs/${i }.html">${i}</a></li>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</ul>
		</div>
	</div>
	</c:if>
</body>
</html>