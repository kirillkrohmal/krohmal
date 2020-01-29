<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Авторизация и аутентификации пользователя</title>
</head>
<body>
<h2>Авторизация и аутентификации пользователя: </h2>

<%--<form action="<%=request.getContextPath()%>/loginsecurity" method="post">
    <table>
        <tr>
            <td>Login:</td>
            <td>
                <label>
                    <input type="text" name="login">
                </label>
            </td>
        </tr>
        <tr>
            <td>Password:</td>
            <td>
                <label>
                    <input type="password" name="password">
                </label>
            </td>
        </tr>

        <tr>
            <td><input type="submit" align="center" value="Submit"></td>
        </tr>
    </table>

</form>



<ul>
    <li><a href="<%=request.getContextPath()%>/rolesecurity">Выбрать роль</a></li>
</ul>

<ul>
    <li><a href="<%=request.getContextPath()%>/security">Создать пользователя</a></li>
</ul>--%>



<table style="border: 1px solid black;" cellpadding="1" cellspacing="1" border="1">
    <tr>
        <th>Id</th>
        <th>Login</th>
        <th>Password</th>
        <th>Role</th>
        <th>Действие</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <th><c:out value="${user.id}"/></th>
            <th><c:out value="${user.login}"/></th>
            <th><c:out value="${user.password}"/></th>
            <th><c:out value="${user.role}"/></th>

            <th><a href="<%=request.getContextPath()%>/editsecurity?=${user.id}">Редактировать пользователя</a></th>
        </tr>
    </c:forEach>
</table>

</body>
</html>