<%@ page import="ru.job4j.servlets.User" %>
<%@ page import="ru.job4j.servlets.UserStorage" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/echo" method="post">
    Login : <label>
    <input type="text" name="login">
</label><br/>
    Email : <label>
    <input type="text" name="email">
</label><br/>
    <input type="submit">
</form>
<br/>

<table>
    <td>login</td>
    <td>email</td>
    <% for (User user : UserStorage.getInstance().getUsers()) {%>
    <tr>
        <td><%=user.getLogin()%>></td>
        <td><%=user.getEmail()%>></td>
    </tr>
    <% } %>

</table>

</body>
</html>
