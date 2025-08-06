<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Burger Tracker</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
          rel="stylesheet" 
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
          crossorigin="anonymous">
</head>
<body>

<div class="container mt-4">
    <h2>Add a Burger</h2>
    <form:form action="/burgers" method="POST" modelAttribute="burger">
        <div class="mb-3">
            <form:label path="burgerName">Burger Name:</form:label>
            <form:input path="burgerName" cssClass="form-control"/>
            <form:errors path="burgerName" cssClass="text-danger"/>
        </div>
        <div class="mb-3">
            <form:label path="restaurantName">Restaurant:</form:label>
            <form:input path="restaurantName" cssClass="form-control"/>
            <form:errors path="restaurantName" cssClass="text-danger"/>
        </div>
        <div class="mb-3">
            <form:label path="rating">Rating (1-5):</form:label>
            <form:input path="rating" type="number" cssClass="form-control"/>
            <form:errors path="rating" cssClass="text-danger"/>
        </div>
        <div class="mb-3">
            <form:label path="notes">Notes:</form:label>
            <form:textarea path="notes" cssClass="form-control"/>
            <form:errors path="notes" cssClass="text-danger"/>
        </div>
        <input type="submit" value="Submit" class="btn btn-primary"/>
    </form:form>

    <h2 class="mt-5">Burger Tracker</h2>
    <table class="table table-striped">
        <thead>
            <tr>
                <th>Burger Name</th>
                <th>Restaurant</th>
                <th>Rating</th>
                <th>Notes</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="burger" items="${allBurgers}">
                <tr>
                    <td>${burger.burgerName}</td>
                    <td>${burger.restaurantName}</td>
                    <td>${burger.rating}</td>
                    <td>${burger.notes}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
