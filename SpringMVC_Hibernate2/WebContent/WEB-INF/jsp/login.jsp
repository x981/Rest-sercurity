<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath }/js/jquery-1.11.3.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#myModal').modal({
			backdrop : 'static',
			keyboard : false
		});
	});
</script>
</head>
<body>
	<div class="modal fade" tabindex="-1" role="dialog" id="myModal">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header" style="background-color: #cee0f4">
					<h3>Đăng nhập</h3>
				</div>
				<div class="modal-body">
					<form action="login.html" method="post">
						<strong>Tên đăng nhập:</strong>
						<p>
							<input type="text" class="form-control" name="username">
						</p>
						<strong>Mật khẩu:</strong>
						<p>
							<input type="password" class="form-control"  name="pass">
						</p>
						<button type="submit" class="btn btn-primary">Đăng nhập</button>
						<a href="#">Quên mật khẩu?</a>
					</form>
				</div>
				<div class="modal-footer" style="background-color: #cee0f4">
					
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
</body>
</html>