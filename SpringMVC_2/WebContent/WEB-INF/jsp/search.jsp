<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
	href="${pageContext.servletContext.contextPath }/css/themes/base/jquery.ui.all.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="${pageContext.servletContext.contextPath }/js/jquery-1.6.2.js"></script>
<script type="text/javascript"
	src="${pageContext.servletContext.contextPath }/js/jquery-ui-1.8.2.custom.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#tensp').autocomplete({
			source : '${pageContext.request.contextPath}/ajax/'
		});

		$('#ngay').datepicker({
			dateFormat: 'dd/mm/yy',
		});
	});
</script>
<title>Insert title here</title>
</head>
<body>

	Ten sp:
	<input type="text" id="tensp">
	<br> Ngay sx
	<input type="text" id="ngay">

</body>
</html>