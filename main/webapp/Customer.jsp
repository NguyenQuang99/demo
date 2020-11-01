<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/11/2020
  Time: 6:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jsp1/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="tong">
    <table border="1px">
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Phone</td>
            <td>Address</td>
            <td>Date</td>
        </tr>
        <tr>
            <c:forEach items='${requestScope["customer"]}' var="item" varStatus="loop">
        <tr>
            <td>${loop.index + 1}</td>
            <td>${item.getName()}</td>
            <td>${item.getPhone()}</td>
            <td>${item.getAddress()}</td>
            <td>${item.getDate()}</td>
        </tr>

            <%--                <td><img src="${item.getImg}" alt="${item.getName}"></td>--%>
        </c:forEach>
        </tr>
    </table>
</div>

</body>
</html>
