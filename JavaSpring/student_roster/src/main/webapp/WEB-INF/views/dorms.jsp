<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dorms List</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1 class="mb-4">All Dorms</h1>
    <table class="table table-striped table-bordered">
        <thead class="table-dark">
            <tr>
                <th>Dorm Name</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="dorm" items="${dorms}">
                <tr>
                    <td>${dorm.name}</td>
                    <td><a href="/dorms/${dorm.id}" class="btn btn-primary btn-sm">See Students</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <a href="/dorms/new" class="btn btn-success me-2">Add Dorm</a>
    <a href="/students/new" class="btn btn-secondary">Add a new student</a>
</div>
</body>
</html>
