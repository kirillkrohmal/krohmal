<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Car Shop</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

<%--@elvariable id="order" type=""--%>
<form:form action="${pageContext.request.contextPath}/general/saveOrders" enctype="multipart/form-data"
           modelAttribute="order" method="post">

        <div class="container">
            <div id="row">
                <div class="col-md-9">
                    <h2 style="text-align: center">Создание объявления</h2>

                    <div class="form-group">
                        <label for="description" type="table" class="table">Description:</label>
                        <label>
                            <input id="description" name="description"/>
                        </label>
                    </div>
                    <div class="form-group">
                        <label for="price" type="table" class="table">Price:</label>
                        <label>
                            <input id="price" name="price"/>
                        </label>
                    </div>
                    <div class="form-group">
                        <label for="body" type="table" class="table">Body:</label>
                        <label>
                            <input id="body" name="body"/>
                        </label>
                    </div>
                    <div class="form-group">
                        <label for="brand" type="table" class="table">Brand:</label>
                        <label>
                            <input id="brand" name="brand"/>
                        </label>
                    </div>
                    <div class="form-group">
                        <label for="engine" type="table" class="table">Engine:</label>
                        <label>
                            <input id="engine" name="engine"/>
                        </label>
                    </div>
                    <div class="form-group">
                        <label for="model" type="table" class="table">Model:</label>
                        <label>
                            <input id="model" name="model"/>
                        </label>
                    </div>
                    <div class="form-group">
                        <label>Sold:</label>
                        <label>
                            <input id="sold" type="checkbox" name="sold">
                        </label>
                    </div>

                    <div class="form-group">
                        <label for="pic">Image</label>
                        <label>
                            <input id="pic" name="picture" type="file" class="file">
                        </label>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default" name="saveOrders">Сохранить</button>
                        </div>
                    </div>

                    <p>
                        <a href="${pageContext.request.contextPath}/general/list"
                           class="btn btn-outline-info btn-lg my-3">Back to Orders list</a>
                    </p>
                </div>
            </div>
        </div>
        </form:form>
</body>
</html>