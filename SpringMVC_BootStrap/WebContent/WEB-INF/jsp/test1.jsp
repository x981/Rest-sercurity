<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/half-slider.css">
<script src="${pageContext.request.contextPath }/js/jquery-1.11.3.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('.carousel').carousel({
			interval : 2000
		});
		$('li').click(function() {
			$('li').removeClass('active');
			$(this).addClass('active');
		});

	});
</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<nav class="navbar navbar-inverse" role="navigation">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Sunshine English Center</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-right">
						<li><a href="#">Login</a></li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid --> </nav>
		</div>
		<div class="row">
			<div class="col-md-3">
				<div class="list-group">
					<a href="#" class="list-group-item active"> Cras justo odio </a> <a
						href="#" class="list-group-item">Dapibus ac facilisis in</a> <a
						href="#" class="list-group-item">Morbi leo risus</a> <a href="#"
						class="list-group-item">Porta ac consectetur ac</a> <a href="#"
						class="list-group-item">Vestibulum at eros</a>
				</div>
			</div>
			<div class="col-md-9">
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="row">
							<div class="col-sm-3 col-md-4">
								<div class="thumbnail">
									<img data-src="holder.js/300x200" alt="..."
										src="../../images/ELV_0998-1.png">
									<div class="caption">
										<h3>Thumbnail label</h3>
										<p>...</p>
										<p>
											<a href="#" class="btn btn-primary" role="button">Detail</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-sm-3 col-md-4">
								<div class="thumbnail">
									<img data-src="holder.js/300x200" alt="..."
										src="../../images/ELV_1000-1.png">
									<div class="caption">
										<h3>Thumbnail label</h3>
										<p>...</p>
										<p>
											<a href="#" class="btn btn-primary" role="button">Detail</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-sm-3 col-md-4">
								<div class="thumbnail">
									<img data-src="holder.js/300x200" alt="..."
										src="../../images/ELV_0241-1.png">
									<div class="caption">
										<h3>Thumbnail label</h3>
										<p>...</p>
										<p>
											<a href="#" class="btn btn-primary" role="button">Detail</a>
										</p>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-3 col-md-4">
								<div class="thumbnail">
									<img data-src="holder.js/300x200" alt="..."
										src="../../images/ELV_0692.png">
									<div class="caption">
										<h3>Thumbnail label</h3>
										<p>...</p>
										<p>
											<a href="#" class="btn btn-primary" role="button">Detail</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-sm-3 col-md-4">
								<div class="thumbnail">
									<img data-src="holder.js/300x200" alt="..."
										src="../../images/ELV_0712.png">
									<div class="caption">
										<h3>Thumbnail label</h3>
										<p>...</p>
										<p>
											<a href="#" class="btn btn-primary" role="button">Detail</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row" style="background-color: #f98383;">
			<br>
			<div class="col-sm-4">
				<address>
					<strong>Twitter, Inc.</strong><br> 795 Folsom Ave, Suite 600<br>
					San Francisco, CA 94107<br> <abbr title="Phone">P:</abbr>
					(123) 456-7890
				</address>

				<address>
					<strong>Full Name</strong><br> <a href="mailto:#">first.last@example.com</a>
				</address>
			</div>
			<div class="col-sm-4">
				<dl>
					<dt>Description lists</dt>
					<dd>A description list is perfect for defining terms.</dd>
					<dt>Euismod</dt>
					<dd>Vestibulum id ligula porta felis euismod semper eget
						lacinia odio sem nec elit. Donec id elit non mi porta gravida at
						eget metus.</dd>
					<dt>Malesuada porta</dt>
					<dd>Etiam porta sem malesuada magna mollis euismod.</dd>
				</dl>
			</div>
			<div class="col-sm-4">
				<dl>
					<dt>Description lists</dt>
					<dd>A description list is perfect for defining terms.</dd>
					<dt>Euismod</dt>
					<dd>Vestibulum id ligula porta felis euismod semper eget
						lacinia odio sem nec elit. Donec id elit non mi porta gravida at
						eget metus.</dd>
					<dt>Malesuada porta</dt>
					<dd>Etiam porta sem malesuada magna mollis euismod.</dd>
				</dl>
			</div>
			<p></p>
			<p></p>
			<p></p>
			<p></p>
			<p></p>
		</div>
	</div>
</body>
</html>