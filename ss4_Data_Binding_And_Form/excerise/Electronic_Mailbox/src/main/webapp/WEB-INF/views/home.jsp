<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/create" method="post" modelAttribute="email">
    <div>
        <span>Language</span>
        <form:select path="languages" items="${language}"></form:select>
    </div>
    <div>
        <span>Page size:</span>
        <span>show</span>
        <form:select path="pageSizes" items="${pagesize}"></form:select>
        <span>email per page</span>
    </div>
    <div>
        <span>Spams filter:</span>
        <form:checkbox path="spamFilter"></form:checkbox>
        <span>Enable spams filter</span>
    </div>
    <div>
        <span>signature</span>
        <form:textarea path="signature"></form:textarea>
    </div>
    <div>
        <button type="submit">Update</button>
    </div>
</form:form>
</body>
</html>
