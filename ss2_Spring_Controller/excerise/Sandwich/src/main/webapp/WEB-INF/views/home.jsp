<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/16/2022
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/option" method="post">
<h1>Sandwich Condiments</h1>
<h3>Option</h3>
<c:forEach var="option" items="${option}">
    <div>
        <span>${option.name}</span>
        <input type="checkbox" value="${option.name}" name="option">
    </div>
</c:forEach>
    <button type="submit">save</button>
</form>
</body>
</html>
