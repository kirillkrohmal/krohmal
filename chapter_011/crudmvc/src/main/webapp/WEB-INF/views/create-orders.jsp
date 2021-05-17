<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Car Shop</title>
</head>
<body>


<div id="container">
    <div id="content">
        <h3>Save Orders</h3>
        <%--@elvariable id="order" type="ru.job4j.controller"--%>
        <form:form action="${pageContext.request.contextPath}/general/saveOrders" enctype="multipart/form-data"
                   modelAttribute="order" method="post">
        <form:hidden path="id"/>

        <table>
            <tbody>
            <tr>
                <td><label>Description</label></td>
                <td><input path="description"/></td>
            </tr>
            <tr>
                <td><label>Price</label></td>
                <td><input path="price"/></td>
            </tr>
            <tr>
                <div class="form-group">
                    <label>Sold:</label>
                    <label>
                        <input type="checkbox" name="sold">
                    </label>
                </div>
            </tr>
            <tr>
                <td><label>Body</label></td>
                <td><input path="body"/></td>
            </tr>
            <tr>
                <td><label>Brand</label></td>
                <td><input path="brand"/></td>
            </tr>
            <tr>
                <td><label>Engine</label></td>
                <td><input path="engine"/></td>
            </tr>
            <tr>
                <td><label>Model</label></td>
                <td><input path="model"/></td>
            </tr>
            <div><label for="pic">Image</label>
                <input id="pic" name="file" type="file" class="file"/>
            </div>
            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Save" class="save"/></td>
            </tr>
            </tbody>
        </table>
        </form:form>

        <div style="clear: both"></div>

        <p>
            <a href="${pageContext.request.contextPath}/general/list">Back to Orders list</a>
        </p>
    </div>
</div>


</body>
</html>