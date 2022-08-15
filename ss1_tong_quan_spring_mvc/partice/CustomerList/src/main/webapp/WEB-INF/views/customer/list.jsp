<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/15/2022
  Time: 1:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>Stt</th>
        <th>id</th>
        <th>name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    <c:forEach var="cus" items="${customerList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${cus.id}</td>
            <td>${cus.name}</td>
            <td>${cus.email}</td>
            <td>${cus.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
