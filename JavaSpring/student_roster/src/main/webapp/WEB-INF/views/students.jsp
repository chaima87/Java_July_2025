<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>West Wing Students</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script>
        function confirmDelete(form) {
            if(confirm('Are you sure you want to delete this student?')) {
                form.submit();
            }
        }
    </script>
</head>
<body>
<div class="container mt-5">
    <h1 class="mb-4">West Wing Students</h1>

    <table class="table table-striped table-bordered">
        <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Dorm</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>
                        <c:choose>
                            <c:when test="${student.dorm != null}">
                                ${student.dorm.name}
                            </c:when>
                            <c:otherwise>
                                <span class="text-muted">No Dorm Assigned</span>
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td>
                        <form action="/students/${student.id}/delete" method="post" style="display:inline;" onsubmit="event.preventDefault(); confirmDelete(this);">
                            <button type="submit" class="btn btn-danger btn-sm">Delete</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <div class="mt-3">
        <a href="/students/new" class="btn btn-success">Add New Student</a>
        <a href="/dorms" class="btn btn-secondary">Back to Dorms</a>
    </div>
</div>
</body>
</html>
