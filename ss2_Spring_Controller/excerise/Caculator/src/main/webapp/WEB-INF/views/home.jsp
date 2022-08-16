<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator
</h1>
<form action="/calculator" method="post">
    <div>
        <span><input type="number" name="num1" value="${num1}"></span>
        <span><input type="number" name="num2" value="${num2}"></span>
    </div>
    <div>
        <span><button type="submit" value="addition" name="operand">Addition </button></span>
        <span><button type="submit" value="subtraction" name="operand">Subtraction</button></span>
        <span><button type="submit" value="multiplication" name="operand">Multiplication</button></span>
        <span><button type="submit" value="division" name="operand">Division</button></span>
    </div>
</form>
<c:if test="${result != null}">
    <h1>Result: ${result}</h1>
</c:if>

</body>
</html>
