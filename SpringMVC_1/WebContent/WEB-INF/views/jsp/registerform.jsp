<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error{
		color: red;
	}

</style>
</head>
<body>
	<h3>Dang ky tai khoan</h3>
	<br>
	<s:form method="Post" commandName="sv" action="register.html">
	  	<table cellpadding="2" cellspacing="2" border="0">
	  		<tr>
	  			<td>Ho ten:</td>
	  			<td> <s:input path="hoten"/> </td>
	  			<td> <s:errors path="hoten" cssClass="error"></s:errors> </td>
	  		</tr>
	  		<tr>
	  			<td>Ten:</td>
	  			<td> <s:input path="ten"/> </td>
	  			<td> <s:errors path="ten" cssClass="error"></s:errors> </td>
	  		</tr>
	  		<tr>
	  			<td>Ngay sinh:</td>
	  			<td> <s:input path="ngaysinh"/> </td>
	  			<td></td>
	  		</tr>
	  		<tr>
	  			<td>Gioi tinh:</td>
	  			<td> 
	  				<s:radiobutton path="gioitinh" value="nam"/>Nam
	  			 	<s:radiobutton path="gioitinh" value="nu"/>Nu
	  			</td>
	  			<td></td>
	  		</tr>
	  		<tr>
	  			<td>So thich:</td>
	  			<td> <s:select path="sothich" items="${st }"></s:select> </td>
	  			<td></td>
	  		</tr>
	  		<tr>
	  			<td>FrameWork:</td>
	  			<td> <s:checkboxes items="${fw }" path="framework" delimiter="<br>"/> </td>
	  			<td></td>
	  		</tr>
	  		<tr>
	  			<td>Lop hoc:</td>
	  			<td> <s:select path="lophoc" items="${dslop }" itemLabel="tenlop" itemValue="malop"></s:select> </td>
	  			<td></td>
	  		</tr>
	  		<tr>
	  			<td>SDT:</td>
	  			<td> <s:input path="sdt"/> </td>
	  			<td> <s:errors path="sdt" cssClass="error"></s:errors> </td>
	  		</tr>
	  		<tr>
	  			<td>Dia chi:</td>
	  			<td> <s:textarea path="diachi" cols="20" rows="7"/> </td>
	  			<td></td>
	  		</tr>
	  		<tr>
	  			<td>&nbsp;</td>
	  			<td colspan="2"> <input type="submit" value="Save"> </td>
	  		</tr>
	  	</table>
	</s:form>
</body>
</html>