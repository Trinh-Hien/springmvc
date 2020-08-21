<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tạo máy mới</title>
    <link href='<c:url value="/resources/css/bootstrap.min.css" />' rel="stylesheet">
	<script src='<c:url value="/resources/js/jquery-3.3.1.slim.min.js" />'></script>
	<script src='<c:url value="/resources/js/bootstrap.min.js" />'></script>
    
</head>

<body>
    <div class="contaner-fluid">
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">
                <img src='<c:url  value="/resources/images/worldwide.png"/>'>
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
                    <li class="nav-item dropdown  active">
                        <a class="nav-link dropdown-toggle" href="#" role="button"
                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            MÁY
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item active" href="taomoimay">Tạo máy mới</a>
                            <a class="dropdown-item" href="danhsachmay">Danh sách máy</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="dangkisdmay">Đăng kí sử dụng máy</a>
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
        <form action="taomoimay" method="post">
            <div class="form-group row">
                <label for="computerID" class="col-sm-2 col-form-label">Mã máy</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="computerID" name="computerID" placeholder="Mã Máy..." required>
                </div>
            </div>
            <div class="form-group row">
                <label for="position" class="col-sm-2 col-form-label">Vị trí</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="position" name="position" placeholder="Vị trí..." required>
                </div>
            </div>
            <fieldset class="form-group">
                <div class="row">
                    <legend class="col-form-label col-sm-2 pt-0">Trạng thái</legend>
                    <div class="col-sm-10">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="status" id="free" value="Đang rảnh"
                                checked>
                            <label class="form-check-label" for="free">
                                Đang rảnh
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="status" id="busy" value="Đang bận">
                            <label class="form-check-label" for="busy">
                                Đang bận
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="status" id="used"
                                value="Đang được dùng">
                            <label class="form-check-label" for="used">
                                Đang được dùng
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="status" id="repair"
                                value="Đang sửa chữa">
                            <label class="form-check-label" for="repair">
                                Đang sửa chữa
                            </label>
                        </div>
                    </div>
                </div>
            </fieldset>
            <div class="form-group row">
                <div class="col-sm-10">
                    <button type="submit" name="action" value="Add" class="btn btn-primary">Add</button>
                    <button type="submit" name="action" value="Update" class="btn btn-primary" style="margin-left: 50px;" disabled="disabled">Update</button>
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
     
	<script type="text/javascript">
	if(${computer !=null}){
		$("#computerID").val("${computer.getComputerID()}");
		$("#computerID").attr('readonly','readonly');
		$("#position").val("${computer.getPosition()}");
		$("[name='status'][value='${computer.getStatus()}']").attr("checked", true);
		$("[name='action'][value='Add']").attr("disabled", true);
		$("[name='action'][value='Update']").attr("disabled", false);
	}
	
	</script>
</body>

</html>