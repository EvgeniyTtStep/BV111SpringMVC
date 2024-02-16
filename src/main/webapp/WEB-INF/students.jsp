<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 16.02.2024
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="student" items="${students}">
    <p>Student ${student.name}</p>
</c:forEach>
</body>
</html>
