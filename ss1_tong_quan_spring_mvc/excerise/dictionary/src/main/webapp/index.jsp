<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/12/2022
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Từ Điền</h1>
  <form action="/dictionary">
  <div>
    <h1>Nhập từ</h1>
    <input type="text" name="word" value="${word}">
    <button type="submit">Dịch</button>
  </div>
    <h1>${ketQua}</h1>
  </form>
  </body>
</html>
