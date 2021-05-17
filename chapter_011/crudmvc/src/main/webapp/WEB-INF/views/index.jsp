<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Car Shop</title>
</head>
<body>
<form:form enctype="multipart/form-data" action="${pageContext.request.contextPath}/general/list"  method="get">

    <div id="container">
        <div id="content">

            <input type="button" value="Add New Order"
                   onclick="window.location.href='showFormForAdd'; return false;"
                   class="add-button"/>

            <table>
                <tr>
                    <th>ID</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th>Sold</th>
                    <th>Body</th>
                    <th>Brand</th>
                    <th>Engine</th>
                    <th>Model</th>
                    <th>Image</th>
                </tr>

                <c:forEach var="tempOrder" items="${orders}">
                    <tr>
                        <td>"${tempOrder.id}"</td>
                        <td>"${tempOrder.description}"</td>
                        <td>"${tempOrder.price}"</td>
                        <td>"${tempOrder.sold}"</td>
                        <td>"${tempOrder.body}"</td>
                        <td>"${tempOrder.brand}"</td>
                        <td>"${tempOrder.engine}"</td>
                        <td>"${tempOrder.model}"</td>
                        <td>"${tempOrder.image}"</td>
                        <td>"${tempOrder.imageStr}"</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</form:form>
</body>
</html>
