<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Danh sách máy</title>
<link href='<c:url value="/resources/css/bootstrap.min.css" />'
	rel="stylesheet">
<script src='<c:url value="/resources/js/jquery-3.3.1.slim.min.js" />'></script>
<script src='<c:url value="/resources/js/bootstrap.min.js" />'></script>
<%-- <script src='<c:url value="resources/js/deleteRow.js" />'></script> --%>

</head>

<body>
	<div class="contaner-fluid">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<a class="navbar-brand" href="#"> <img
				src='<c:url  value="/resources/images/worldwide.png"/>'>
			</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item"><a class="nav-link" href="trangchu">TRANG
							CHỦ <span class="sr-only">(current)</span>
					</a></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> KHÁCH HÀNG </a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="taomoikhachhang">Tạo mới khách
								hàng</a> <a class="dropdown-item" href="danhsachkhachhang">Danh
								sách khách hàng</a>

						</div></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> DỊCH VỤ </a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="taomoidichvu">Tạo mới dịch vụ</a>
							<a class="dropdown-item" href="danhsachdichvu">Danh sách dịch
								vụ</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="dangkisddichvu">Đăng kí sử
								dụng dịch vụ</a>
						</div></li>
					<li class="nav-item dropdown  active"><a
						class="nav-link dropdown-toggle" href="#"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> MÁY </a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="taomoimay">Tạo máy mới</a> <a
								class="dropdown-item  active" href="">Danh sách máy</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="dangkisdmay">Đăng kí sử dụng
								máy</a>
						</div></li>
					<li class="nav-item"><a class="nav-link"
						href="thongtinchitiet">THÔNG TIN CHI TIẾT</a></li>
				</ul>
				<form class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-2" type="search"
						placeholder="Search" aria-label="Search">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				</form>
			</div>
		</nav>
	</div>
	<div class="container" style="margin-top: 100px; margin-bottom: 100px;">
		<table class="table" id="tbl">
			<thead class="thead-light">
				<tr>
					<th scope="col">Mã máy</th>
					<th scope="col">Vị Trí</th>
					<th scope="col">Trạng thái</th>
					<th scope="col"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="element">
					<tr>
						<td scope="row">${element.getComputerID()}</td>
						<td scope="row">${element.getPosition()}</td>
						<td scope="row">${element.getStatus()}</td>
						<td scope="row">
						<a href="editComputer?id=<c:out value='${element.getComputerID()}' />">
							<img src='<c:url value="/resources/images/edit.png" />'></a>
                        <a href="deleteComputer?id=<c:out value='${element.getComputerID()}' /> ">
							<img src='<c:url value="/resources/images/quit.png" />'></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<nav aria-label="Page navigation example">
			<ul class="pagination justify-content-end">
				<c:if test="${currentPage != 1}">
					<li class="page-item"><a class="page-link"
						href="danhsachmay?currentPage=${currentPage-1}">Previous</a></li>
				</c:if>

				<c:forEach begin="1" end="${noOfPages}" var="i">
					<c:choose>
						<c:when test="${currentPage eq i}">
							<li class="page-item active"><a class="page-link"> ${i}
									<span class="sr-only">(current)</span>
							</a></li>
						</c:when>
						<c:otherwise>
							<li class="page-item"><a class="page-link"
								href="danhsachmay?currentPage=${i}">${i}</a></li>
						</c:otherwise>
					</c:choose>
				</c:forEach>

				<c:if test="${currentPage lt noOfPages}">
					<li class="page-item"><a class="page-link"
						href="danhsachmay?currentPage=${currentPage+1}">Next</a></li>
				</c:if>
			</ul>
		</nav>
	</div>
	<div class="container-fluid" style="background-color: black;">
		<footer class="page-footer font-small blue">

			<!-- Copyright -->
			<div class="footer-copyright text-center py-3"
				style="color: white; font-size: 15px;">© 2020 Copyright by
				HienTT20</div>
			<!-- Copyright -->

		</footer>
	</div>

</body>

</html>