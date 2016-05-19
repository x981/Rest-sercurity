<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				    var s='';
				    s = s + '<table cellpadding="2" cellspacing="2" border="1"><tr><td>Ma sv</td><td>Ho ten</td><td>Ten</td><td>Lop</td></tr>';
				    for (var i=0; i<result.length; i++){
						s = s + '<tr><td>' + result[i].maSv + '</td><td>' +  result[i].hoten + '</td><td>' +  result[i].ten + '</td><td>' +  result[i].lophoc.tenlop + '</td></tr>';
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
	Chọn lớp:
	<select name="cblop" class="cblop">
		<c:forEach var="lh" items="${dslop }">
			<option value="${lh.maLop }">${lh.tenlop }</option>
		</c:forEach>
	</select>
	<input type="button" value="List" id="btnl">
	<hr />
	<span id="result"></span>
</body>
</html>