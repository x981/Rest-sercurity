<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<fieldset>
		<legend>Text return</legend>
		<a href="HelloRestFulController?action=text">Text return</a>
		<br>
		${result }
	</fieldset>

	<fieldset>
		<legend>HTML return</legend>
		<a href="HelloRestFulController?action=html">HTML return</a>
		<br>
		${result1 }
	</fieldset>

	<fieldset>
		<legend>Co tham so</legend>
		<form action="HelloRestFulController?action=cothamso" method="post">
			Nhap ten: <input type="text" name="ten"><input type="submit" value="Chao di">
		</form>
		<br>
		${result2 }
	</fieldset>

	<fieldset>
		<legend>Tong hai so</legend>
		<form action="HelloRestFulController?action=tong2so" method="post">
			So a: <input type="text" name="a">
			<br>
			So b: <input type="text" name="b">
			<br>
			<input type="submit" value="Tinh tong"> 
		</form>
		<br>
		${result3 }
	</fieldset>

</body>
</html>