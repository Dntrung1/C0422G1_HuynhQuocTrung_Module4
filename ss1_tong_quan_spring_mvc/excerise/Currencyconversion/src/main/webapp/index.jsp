<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/12/2022
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/conversion" method="get">
    <div>
        <h1>nhập số tiền chuyển đổi</h1>
        <input type="number" name="soCanChuyenDoi" value="${soCanChuyenDoi}" required>
    </div>
    <div>
        <h1>nhập tỉ giá</h1>
        <input type="number" name="tiGia" value="${tiGia}" required>
    </div>
    <button type="submit">Tính</button>
</form>
<h1>
    <h1>Kết quả:${ketqua}</h1>
</h1>
</body>
</html>
