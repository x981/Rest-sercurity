<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.servletContext.contextPath }/css//themes/base/jquery.ui.all.css" rel="stylesheet" type="text/css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('#btnkhongthamso').click(function(){
			$.ajax({
				type: 'GET',
				url: '${pageContext.request.contextPath}/ajax/hello.html',
				success: function(result){
					$('#result').html(result);
				}	
			});
		});

		$('#btncothamso').click(function(){
			var str = $('.name').val();
			$.ajax({
				type: 'GET',
				url: '${pageContext.request.contextPath}/ajax/helloname/' + str + '.html',
				success: function(result){
					$('#result1').html(result);
				}
			});
		});

		$('#ajaxjson1').click(function(){
			var masp = $('.masp').val();
			$.ajax({
				type: "GET",
				headers: { 
			        Accept : "application/json; charset=utf-8",
			        "Content-Type": "application/json; charset=utf-8"
			    },
			    url: '${pageContext.request.contextPath}/ajax/laysp/' + masp + '.html',
			    success: function(result){
			    	var s='';
						s += '<br>Ma san pham: ' + result.masp;
						s += '<br>Ten san pham: ' + result.tensp;
						s += '<br>Gia: ' + result.soluong;
					$('#result2').html(s);
				}
			});
		});

		$('#ajaxjson2').click(function(){
			$.ajax({
				type: "GET",
				headers: { 
			        Accept : "application/json; charset=utf-8",
			        "Content-Type": "application/json; charset=utf-8"
			    },
			    url: '${pageContext.request.contextPath}/ajax/laydssp.html',
			    success: function(result){
				    var s='';
					for (var i=0; i<result.length; i++){
						s += '<br>Ma san pham: ' + result[i].masp;
						s += '<br>Ten san pham: ' + result[i].tensp;
						s += '<br>Gia: ' + result[i].soluong;
						s += '<br>====================';
					}
					$('#result3').html(s);
				}
			});
		});

		$('#tensp').autocomplete({
			source :'${pageContext.request.contextPath}/ajax/laytensp.html'
		});

		$('#btnadd').click(function(){
			var str = $('#masp').val();
			var str4 = $('#tensanpham').val();
			var str2 = $('#soluong').val();
			alert(str + ", " + str4+ ", " + str2);
			$.ajax({
				type: "GET",
				data:'masp=' + str + '&tensp=' + str4 + '&soluong=' + str2,
				headers: { 
			        Accept : "application/json; charset=utf-8",
			        "Content-Type": "application/json; charset=utf-8"
			    },
			    url: '${pageContext.request.contextPath}/ajax/taomoi.html',
			    success: function(result){
			    	var s='';
					s += '<br>Ma san pham: ' + result.masp;
					s += '<br>Ten san pham: ' + result.tensp;
					s += '<br>Gia: ' + result.soluong;
					$('#result4').html(s);
				}
			});
		});
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Ajax khong tham so</legend>
		<input type="button" id="btnkhongthamso" value="Ajax">
		<br>
		<span id="result"></span>
	</fieldset>
	<fieldset>
		<legend>Ajax co tham so</legend>
		Nhap ten: <input type="text" class="name"><input type="button" id="btncothamso" value="Hello">
		<br>
		<span id="result1"></span> 
	</fieldset>
	<fieldset>
		<legend>Ajax JSON 1</legend>
		Nhap ma sp: <input type="text" class="masp"><input type="button" value="Get" id="ajaxjson1">
		<br>
		<span id="result2"></span>
	</fieldset>
	<fieldset>
		<legend>Ajax JSON 2</legend>
		<input type="button" value="Get" id="ajaxjson2">
		<br>
		<span id="result3"></span>
	</fieldset>
	<fieldset>
		<legend>Autocomplete</legend>
		Ten sp: <input type="text" id="tensp">
	</fieldset>
	<fieldset>
		<legend>Add Item</legend>
		<form method="get">
		<table>
			<tr>
				<td>Ma sp:</td>
				<td><input type="text" id="masp"></td>
			</tr>
			<tr>
				<td>Ten sp:</td>
				<td><input type="text" id="tensanpham"></td>
			</tr>
			<tr>
				<td>So luong sp:</td>
				<td><input type="text" id="soluong"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="button" value="Add" id="btnadd"></td>
			</tr>
		</table>
		</form>
		<span id="result4"></span>
	</fieldset>		
	
</body>
</html>