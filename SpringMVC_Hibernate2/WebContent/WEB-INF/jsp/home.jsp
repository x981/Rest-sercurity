<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath }/js/jquery-1.11.3.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		var index = $('#index').val();
		if (index == 0){
			$('.list-group-item').removeClass('active');
		} else if (index == 1){
			$('.list-group-item').removeClass('active');
			$('.list-group-item').first().addClass('active');
		} else if (index == 2){
			$('.list-group-item').removeClass('active');
			$('.list-group-item').first().next().addClass('active');
		} else {
			$('.list-group-item').removeClass('active');
			$('.list-group-item').last().addClass('active');
		}
	});
</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<tiles:insertAttribute name="header" />
		</div>
		<div class="row">
			<div class="col-md-2">
				<tiles:insertAttribute name="menu" />
			</div>
			<div class="col-md-10">
				<tiles:insertAttribute name="body" />
			</div>
		</div>
		<div class="row" style="background-color: #cee0f4;">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>