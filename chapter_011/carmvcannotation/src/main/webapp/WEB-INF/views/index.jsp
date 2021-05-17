<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Car Shop</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<form:form enctype="multipart/form-data" action="${pageContext.request.contextPath}/general/list" method="get">

        <div class="container">
            <div class="col-md-12">
                <input type="button" value="Новое объявление"
                       onclick="window.location.href='showFormForAdd'; return false;"
                       class="btn btn-outline-info btn-lg my-3"/>

                <h2 style="text-align: center">Список ваших объявлений</h2>

                <table class="table">
                    <thead class="thead-light">
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
                        </tr>
                    </c:forEach>
                    </thead>
                </table>
            </div>
        </div>
</form:form>
</body>
</html>
