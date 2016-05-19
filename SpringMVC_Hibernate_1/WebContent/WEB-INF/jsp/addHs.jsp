<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script type="text/javascript">
	$(document).ready(function() {
		$('#namsinh').datepicker({
			dateFormat : 'dd/mm/yy'
		});
	});
</script>
</head>
<body>
	<h3>TẠO MỚI HỌC SINH</h3>
	<s:form action="Post" commandName="hs">
		<table>
			<tr>
				<td>Họ tên:</td><td><s:input path="hoten" /></td>
				<td>Tên:</td><td><s:input path="ten" /></td>
			</tr>
			<tr>
				<td>Giới tính:</td><td colspan="3"><s:radiobutton path="gioitinh" value="Nam" />Nam
					<s:radiobutton path="gioitinh" value="Nữ" />Nữ
				</td>
			</tr>
			<tr>
				<td>Năm sinh:</td><td colspan="3"><s:input path="namsinh" id="namsinh"/>
				</td>
			</tr>
			<tr>
				<td colspan="1">Bố:</td><td colspan="3"><s:input path="chitietHs.bo" />
				</td>
			</tr>
			<tr>
				<td colspan="1">SDTB:</td><td colspan="3"><s:input path="chitietHs.sdtB" />
				</td>
			</tr>
			<tr>
				<td colspan="1">Job:</td><td colspan="3"><s:input path="chitietHs.jobB" />
				</td>
			</tr>
			<tr>
				<td colspan="1">Mẹ:</td><td colspan="3"><s:input path="chitietHs.me" />
				</td>
			</tr>
			<tr>
				<td colspan="1">SDTM:</td><td colspan="3"><s:input path="chitietHs.sdtM" />
				</td>
			</tr>
			<tr>
				<td colspan="1">Job:</td><td colspan="3"><s:input path="chitietHs.jobM" />
				</td>
			</tr>
			<tr>
				<td colspan="1">SDTCD:</td><td colspan="3"><s:input path="chitietHs.sdtCd" />
				</td>
			</tr>
			<tr>
				<td colspan="1">Địa chỉ:</td><td colspan="3"><s:input path="chitietHs.diachi" />
				</td>
			</tr>
			<tr>
				<td colspan="1">Đối tượng:</td><td colspan="3"><s:select path="doituong" items="${dsdoituong }" itemLabel="tenDt" itemValue="maDt"></s:select> </td>
			</tr>
			<tr>
				<td colspan="1">Lớp:</td><td colspan="3"><s:select path="lophoc" items="${dslop }" itemLabel="tenlop" itemValue="maLop"></s:select> </td>
			</tr>
			<tr>
				<td colspan="1">Ghi chú:</td><td colspan="3"><s:textarea path="ghichu" cols="20" rows="6"/> </td>
			</tr>
			<tr>
				<td>&nbsp;</td><td align="right"><input type="submit" value="Tạo mới"></td><td colspan="2">&nbsp;</td>
			</tr>
		</table>
	</s:form>


</body>
</html>