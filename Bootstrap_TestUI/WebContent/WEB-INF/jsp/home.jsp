<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath }/js/jquery-1.11.3.js"></script>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/style.css">
</head>
<body>
	<div id="header">
		<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><strong>303STUDIO</strong> </a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#">Portfolio</a></li>
					<li><a href="#">Contact</a></li>
					<li><a href="#">AboutUs</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid --> </nav>
	</div>
	<div id="content">
		<div class="container">
			<div id="carousel-example-generic" class="carousel slide"
				data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#carousel-example-generic" data-slide-to="0"
						class="active"></li>
					<li data-target="#carousel-example-generic" data-slide-to="1"></li>
					<li data-target="#carousel-example-generic" data-slide-to="2"></li>
					<li data-target="#carousel-example-generic" data-slide-to="3"></li>
					<li data-target="#carousel-example-generic" data-slide-to="4"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<img src="${pageContext.request.contextPath }/images/1.jpg"
							width="100%" class="img-responsive">
						<div class="carousel-caption">
							<h3>Image 1</h3>
							<p>Thiet ke phong doc sach</p>
						</div>
					</div>
					<div class="item">
						<img src="${pageContext.request.contextPath }/images/2.jpg" class="img-responsive">
						<div class="carousel-caption">
							<h3>Image 2</h3>
							<p>Thiet ke phong doc sach</p>
						</div>
					</div>
					<div class="item">
						<img src="${pageContext.request.contextPath }/images/3.jpg" class="img-responsive">
						<div class="carousel-caption">
							<h3>Image 3</h3>
							<p>Thiet ke phong doc sach</p>
						</div>
					</div>
					<div class="item">
						<img src="${pageContext.request.contextPath }/images/4.jpg" class="img-responsive">
						<div class="carousel-caption">
							<h3>Image 4</h3>
							<p>Thiet ke phong doc sach</p>
						</div>
					</div>
					<div class="item">
						<img src="${pageContext.request.contextPath }/images/5.jpg" class="img-responsive">
						<div class="carousel-caption">
							<h3>Image 5</h3>
							<p>Thiet ke phong doc sach</p>
						</div>
					</div>
				</div>

				<!-- Controls -->
				<a class="left carousel-control" href="#carousel-example-generic"
					role="button" data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#carousel-example-generic"
					role="button" data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
		</div>
		<div id="portfolio">
			<div class="container">
				<div class="row">
					<div class="col-xs-12 col-sm-12 col-md-12" id="title">
						<h3>
							<span class="glyphicon glyphicon-stats"></span><strong> Portfolio</strong>
						</h3>
						<hr>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12 col-sm-6 col-md-4">
						<div class="thumbnail">
							<img src="${pageContext.request.contextPath }/images/da1.jpg"
								alt="...">
							<div class="caption">
								<h3>Thumbnail label</h3>
								<p>...</p>
								<p>
									<a href="#" class="btn btn-primary" role="button">Detail</a>
								</p>
							</div>
						</div>
					</div>
					<div class="col-xs-12 col-sm-6 col-md-4">
						<div class="thumbnail">
							<img src="${pageContext.request.contextPath }/images/da2.jpg"
								alt="...">
							<div class="caption">
								<h3>T-COFFEE</h3>
								<p>...</p>
								<p>
									<a href="#" class="btn btn-primary" role="button">Detail</a>
								</p>
							</div>
						</div>
					</div>
					<div class="col-xs-12 col-sm-6 col-md-4">
						<div class="thumbnail">
							<img src="${pageContext.request.contextPath }/images/da3.jpg"
								alt="...">
							<div class="caption">
								<h3>TRUNG TÂM TIẾNG ANH KELLA</h3>
								<p>...</p>
								<p>
									<a href="#" class="btn btn-primary" role="button">Detail</a>
								</p>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12 col-sm-6 col-md-4">
						<div class="thumbnail">
							<img src="${pageContext.request.contextPath }/images/da4.jpg"
								alt="...">
							<div class="caption">
								<h3>KID ROOM - GOLDEN WESTLAKE</h3>
								<p>Căn phòng nhỏ xinh xắn với diện tích khoảng 15m2 đã được
									303 Studio cải tạo nội thất, với gam màu chủ đạo là trắng xanh,
									không gian đã mang được sự thích thú cho cậu chủ nhỏ.</p>
								<p>
									<a href="#" class="btn btn-primary" role="button">Detail</a>
								</p>
							</div>
						</div>
					</div>
					<div class="col-xs-12 col-sm-6 col-md-4">
						<div class="thumbnail">
							<img src="${pageContext.request.contextPath }/images/da5.jpg"
								alt="...">
							<div class="caption">
								<h3>CT2B-APARTMENT</h3>
								<p>Căn hộ tầng 10 tại chung cư Ct2b-234 Hoàng Quốc Việt với
									diện tích ~80m2 : 2 Phòng ngủ được chúng tôi thiết kế và hoàn
									thiện thi công nội thất trong thời gian 02 tháng kể từ ngày
									giao nhà.</p>
								<p>
									<a href="#" class="btn btn-primary" role="button">Detail</a>
								</p>
							</div>
						</div>
					</div>
					<div class="col-xs-12 col-sm-6 col-md-4">
						<div class="thumbnail">
							<img src="${pageContext.request.contextPath }/images/da6.jpg"
								alt="...">
							<div class="caption">
								<h3>Biệt thự đơn lập-Ecopark</h3>
								<p>...</p>
								<p>
									<a href="#" class="btn btn-primary" role="button">Detail</a>
								</p>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12 col-sm-6 col-md-4">
						<div class="thumbnail">
							<img src="${pageContext.request.contextPath }/images/da7.jpg"
								alt="...">
							<div class="caption">
								<h3>SoGREEN Cold Pressed Juice</h3>
								<p>Dự án quán cafee Sogreen được thiết kế và thi công bởi
									Công ty CP Kiến trúc 303Studio Việt Nam, đã đáp ứng được cả nhu
									cầu về công năng và hình thức yêu cầu của chủ đầu tư.</p>
								<p>
									<a href="#" class="btn btn-primary" role="button">Detail</a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div id="about">
			<div class="container">
				<div class="row">
					<div class="col-xs-12 col-sm-12 col-md-12" id="title">
						<h3>
							<span class="glyphicon glyphicon-user"></span><strong> AboutUs</strong>
						</h3>
						<hr>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12 col-md-6">
						<h4>Nâng tầm giá trị cho mọi không gian sống</h4>
						<p>
							Với trên 6 năm kinh nghiệm hoạt động trong ngành xây dựng, chúng
							tôi cung cấp đầy đủ các dịch vụ thiết kế và thi công nội thất.
							Mỗi một công trình của <span style="color: #0091a1"><strong>303STUDIO</strong></span>
							không chỉ dừng lại ở thẩm mỹ, công năng mà còn mang lại nhiều giá
							trị hơn cho cuộc sống của bạn.
						</p>
					</div>
					<div class="col-xs-12 col-md-6" id="gioithieu">
						<img alt=""
							src="${pageContext.request.contextPath }/images/nha.jpg" class="img-responsive">
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12 col-sm-3 col-md-3">
						<div class="jumbotron jumbotron-responsive">
							<img src="${pageContext.request.contextPath }/images/man4.jpg"
								alt="..." class="img-responsive">
							<h5>
								<strong>NGUYEN TRUNG KIEN</strong>
							</h5>
							<h6>CHAIRMAN- ARCHITECT</h6>
						</div>
					</div>
					<div class="col-xs-12 col-sm-3 col-md-3">
						<div class="jumbotron jumbotron-responsive">
							<img src="${pageContext.request.contextPath }/images/man1.jpg"
								alt="..." class="img-responsive">
							<h5>
								<strong>NGUYEN HOANG ANH</strong>
							</h5>
							<h6>CEO- ARCHITECT</h6>
						</div>
					</div>
					<div class="col-xs-12 col-sm-3 col-md-3">
						<div class="jumbotron jumbotron-responsive">
							<img src="${pageContext.request.contextPath }/images/man3.jpg"
								alt="..." class="img-responsive">
							<h5>
								<strong>NGUYEN CONG HIEP</strong>
							</h5>
							<h6>DESIGN DIRECTOR-ARCHITECT</h6>
						</div>
					</div>
					<div class="col-xs-12 col-sm-3 col-md-3">
						<div class="jumbotron jumbotron-responsive">
							<img src="${pageContext.request.contextPath }/images/man2.jpg"
								alt="..." class="img-responsive">
							<h5>
								<strong>DO DUY THAI</strong>
							</h5>
							<h6>CHIEF HUMAN RESOURCES OFFCIER-ARCHITECT</h6>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
		<div class="container">
			<div class="row">
				<div class="col-xs-12 col-md-1">
					<img alt=""
						src="${pageContext.request.contextPath }/images/logo.jpg"
						width="90px" height="90px">
				</div>
				<div class="col-xs-12 col-md-4">
					<p>
						<small><strong>303STUDIO.,JSC</strong></small>
					</p>
					<p>
						<span class="glyphicon glyphicon-home"></span><small>:
							ROOM 303. H1 APARTMENT, 37TH LANE, KIM MA THUONG STREET, BADINH
							DISTRICT, HANOI, VIETNAM</small>
					</p>
					<p>
						<span class="glyphicon glyphicon-envelope"></span><small>:
							303studio.vn@gmail.com</small>
					</p>
					<p>
						<span class="glyphicon glyphicon-phone"></span><small>: </small>
					</p>
				</div>
				<div class="col-xs-12 col-md-4 col-md-offset-3" align="right">
					<img alt=""
						src="${pageContext.request.contextPath }/images/map.png"
						width="270px;" height="200px;" class="text-center" class="img-responsive">
				</div>
			</div>
		</div>
	</div>
</body>
</html>