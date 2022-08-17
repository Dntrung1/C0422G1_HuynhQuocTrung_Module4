<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Language: ${email.languages}</h1>
<h1>Page Size: ${email.pageSizes}</h1>
<h1>Spam filter: ${email.spamFilter}</h1>
<h1>signature: ${email.signature}</h1>
</body>
</html>
