<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Student</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1 class="mb-4">Add New Student</h1>
    <form action="/students" method="post">
    <div class="mb-3">
        <label for="name" class="form-label">Student Name</label>
        <input type="text" name="name" id="name" class="form-control" placeholder="Enter student name" required>
    </div>

    <div class="mb-3">
        <label for="dorm" class="form-label">Assign to Dorm</label>
        <select name="dorm.id" id="dorm" class="form-select" required>
            <option value="" selected disabled>Select dorm</option>
            <c:forEach var="dorm" items="${dorms}">
                <option value="${dorm.id}">${dorm.name}</option>
            </c:forEach>
        </select>
    </div>

    <button type="submit" class="btn btn-success">Create Student</button>
    <a href="/dorms" class="btn btn-secondary ms-2">Dashboard</a>
    
</form>

</div>
</body>
</html>
