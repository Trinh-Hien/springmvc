<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng kí sử dụng dịch vụ</title>
    <link href='<c:url value="/resources/css/bootstrap.min.css" />' rel="stylesheet">
	<script src='<c:url value="/resources/js/jquery-3.3.1.slim.min.js" />'></script>
	<script src='<c:url value="/resources/js/bootstrap.min.js" />'></script>
	<script src='<c:url value="/resources/js/validateUseOfService.js" />'></script>
</head>

<body>
    <div class="contaner-fluid">
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">
                <img src='<c:url  value="/resources/images/worldwide.png"/>' >
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="trangchu">TRANG CHỦ <span class="sr-only">(current)</span></a>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button"
                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            KHÁCH HÀNG
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="taomoikhachhang">Tạo mới khách hàng</a>
                            <a class="dropdown-item" href="danhsachkhachhang">Danh sách khách hàng</a>

                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button"
                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            DỊCH VỤ
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="taomoidichvu">Tạo mới dịch vụ</a>
                            <a class="dropdown-item" href="danhsachdichvu">Danh sách dịch vụ</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="dangkisddichvu">Đăng kí sử dụng dịch vụ</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown active">
                        <a class="nav-link dropdown-toggle" href="#" role="button"
                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            MÁY
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="taomoimay">Tạo máy mới</a>
                            <a class="dropdown-item" href="danhsachmay">Danh sách máy</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item active" href="dangkisdmay">Đăng kí sử dụng máy</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="thongtinchitiet">THÔNG TIN CHI TIẾT</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </nav>
    </div>
    <div class="container" style="margin-top: 100px; margin-bottom: 200px;">
        <form action="dangkisdmay" method="post">
            <div class="form-group row">
                <label for="customerID" class="col-sm-2 col-form-label">Mã khách hàng</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="customerID" name="customerID" placeholder="Mã khách hàng...">
                </div>
            </div>
            <div class="form-group row">
                <label for="computerID" class="col-sm-2 col-form-label">Mã máy</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="computerID" name="computerID" placeholder="Mã Máy...">
                </div>
            </div>
            <div class="form-group row">
                <label for="ngayBDSD" class="col-sm-2 col-form-label">Ngày bắt đầu sử dụng</label>
                <div class="col-sm-10">
                    <input type="date" class="form-control" id="ngayBDSD" name="ngayBDSD" placeholder="ngày bắt đầu sử dụng...">
                </div>
            </div>
            <div class="form-group row">
                <label for="gioBDSD" class="col-sm-2 col-form-label">Giờ bắt đầu sử dụng</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="gioBDSD" name="gioBDSD" placeholder="hh:mm:ss...">
                </div>
            </div>
            <div class="form-group row">
                <label for="periodOfTime" class="col-sm-2 col-form-label">Thời gian sử dụng</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" id="periodOfTime"  name="periodOfTime" placeholder="Thời gian sử dụng...">
                </div>
            </div>


            <div class="form-group row">
                <div class="col-sm-10">
                    <button type="submit" class="btn btn-primary">Add</button>
                    <label id="notification" style="margin-left: 300px;"></label>
                </div>
            </div>
        </form>

    </div>
    <div class="container-fluid" style="background-color: black;">
        <footer class="page-footer font-small blue">

            <!-- Copyright -->
            <div class="footer-copyright text-center py-3" style="color: white; font-size: 15px;">© 2020 Copyright by HienTT20
              
            </div>
            <!-- Copyright -->
          
          </footer>
    </div> 

</body>

</html>