<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Burger</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
          rel="stylesheet" 
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
          crossorigin="anonymous">
</head>
<body>

<div class="container mt-4">
    <h2>Edit Burger</h2>

    <form:form action="/burgers/update/${burger.id}" method="POST" modelAttribute="burger">
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

        <button type="submit" class="btn btn-primary">Update Burger</button>
        <a href="/" class="btn btn-secondary">Cancel</a>
    </form:form>
</div>
