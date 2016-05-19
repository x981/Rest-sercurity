<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#errormess{
	
		color: red;
	}
	
	.login{
		margin-top: 200px;
		margin: auto;
    	width: 30%;
    	border: 1px solid #73AD21;
    	padding: 10px;
	}
</style>
</head>
<body>
	<div class="login">
	<h4>ĐĂNG NHẬP HỆ THỐNG</h4>
	<p id="errormess">${mess }</p>
	<input type="hidden" value="0" id="index"> 
	<form action="login.html" method="post">
		<table>
			<tr>
				<td>Tên đăng nhập:</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Mật khẩu:</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Đăng nhập"></td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>