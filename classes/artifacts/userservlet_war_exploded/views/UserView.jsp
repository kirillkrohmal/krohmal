<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Пользователи</title>
</head>

<body>

<table border="1">
    <td valign="top">id</td>
    <td valign="top">login</td>
    <td valign="top">email</td>

    <c:forEach items="${users}" var="user" varStatus="status">
        <tr>
            <td>"${user.id}"</td>
            <td>"${user.login}"</td>
            <td>"${user.email}"</td>

            <td>
                <a href="${pageContext.servletContext.contextPath}/update?id=${user.id}">Редактировать пользователя</a>
                <a href="${pageContext.servletContext.contextPath}/delete?id=${user.id}">Удалить пользователя</a>
            </td>
        </tr>
    </c:forEach>

</table>

<ul>
    <li><a href="${pageContext.servletContext.contextPath}/views/CreateUser.jsp">Добавить пользователя</a></li>
</ul>


</body>
</html>