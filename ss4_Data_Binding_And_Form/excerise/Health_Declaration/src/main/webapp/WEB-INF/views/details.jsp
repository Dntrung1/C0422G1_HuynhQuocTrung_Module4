<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/17/2022
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<a class="btn btn-success" href="/list">Quay lại</a>
<table class="table table-success table-striped">
    <tr>
        <th>Họ tên</th>
        <th>Năm sinh</th>
        <th>Giới tính</th>
        <th>Quốc tịch</th>
        <th>CMND</th>
        <th>Thông tin đi lại</th>
        <th>Phương tiện</th>
        <th>Số ghê</th>
        <th colspan="3">Ngày khởi hành</th>
        <th colspan="3">Ngày kết thúc</th>
        <th>Lưu ý</th>
    </tr>
    <tr>
        <td>${details.name}</td>
        <td>${details.yearOfBirth}</td>
        <c:if test="${details.gender==true}">
            <td>Nam</td>
        </c:if>
        <c:if test="${details.gender==false}">
            <td>Nữ</td>
        </c:if>
        <td>${details.nationality}</td>
        <td>${details.identityCard}</td>
        <td>${details.travelInformation}</td>
        <td>${details.vehicleNumber}</td>
        <td>${details.seats}</td>
        <td>${details.departureDay}</td>
        <td>${details.departureMonth}</td>
        <td>${details.departureYear}</td>
        <td>${details.dayEnds}</td>
        <td>${details.monthEnds}</td>
        <td>${details.yearEnds}</td>
        <td>${details.note}</td>
    </tr>
</table>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
