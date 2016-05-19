<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/jquery-1.6.2.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		var malop = ''; 
		$('.cblop').change(function(){
			malop = $('.cblop').val();
		});

		$('#btnl').click(function(){
			$.ajax({
				type: "GET",
				headers: { 
			        Accept : "application/json; charset=utf-8",
			        "Content-Type": "application/json; charset=utf-8"
			    },
			    url: '${pageContext.request.contextPath}/danhsachlop/' + malop + '.html',
			    success: function(result){
			    	var s = '<table cellpadding="2" cellspacing="2" border="1"><tr><td>Mã HS</td><td>Họ tên</td><td>Tên</td><td>Giới tính</td><td>Năm sinh</td><td>Lớp</td></tr>';
			    	for (var i=0; i<result.length; i++){
				    	s = s + '<tr><td>' + result[i].maHs + '</td><td>' + result[i].hoten + '</td><td>' + result[i].ten + '</td><td>' + result[i].gioitinh +
				    	'</td><td><fmt:formatDate value="${result[i].namsinh}" pattern="dd/MM/yyyy"/></td><td>' + result[i].lophoc.tenlop + '</td></tr>';
				    }
			    	s = s + '</table>';
			    	$('#result').html(s);
			    	
			    }
			});

		});
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<h3>DANH SÁCH LỚP</h3>
	<form action="chitietlop.html" method="post">
		Chọn lớp:
		<select name="cblop">
			<c:forEach var="lh" items="${dslop }">
				<option value="${lh.maLop }">${lh.tenlop }</option>
			</c:forEach>
		</select>
		<input type="submit" value="List">
	</form>
	<hr />
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