<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Thong tin tai khoan</h2>
	<br> Ho ten: ${sv.hoten }
	<br> Ten: ${sv.ten }
	<br> Ngay sinh: <fmt:formatDate value="${sv.ngaysinh }" pattern="dd-MM-yyyy"/>
	<br> Gioi tinh: ${sv.gioitinh }
	<br> So thich:
	<c:forEach var="s" items="${sv.sothich }">
			${s },
		</c:forEach>
	<br> FrameWork:
	<c:forEach var="d" items="${sv.framework }">
			${d },
		</c:forEach>
	<br> Lop hoc: ${sv.lophoc.malop } - ${sv.lophoc.tenlop } 
	<br> Sdt: ${sv.sdt }
	<br> Dia chi: ${sv.diachi }

</body>
</html>