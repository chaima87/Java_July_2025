<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Shelf</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<nav class="navbar navbar-dark bg-dark mb-4">
    <div class="container">
        <c:if test="${not empty currentUser}">
        <span class="navbar-brand">Welcome, ${currentUser.username}</span>
        </c:if>
        <a href="/logout" class="btn btn-danger btn-sm">Logout</a>
    </div>
</nav>

<div class="container">
    <h2>Books from everyone's shelves</h2>
    <a href="/books/create" class="btn btn-primary mb-3">+ Add a new book</a>
    <table class="table table-bordered table-striped">
        <thead>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author Name</th>
                <th>Posted By</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td>${book.id}</td>
                    <td>
                        <c:choose>
                            <c:when test="${book.id != null}">
                                <a href="/books/${book.id}">${book.title}</a>
                            </c:when>
                            <c:otherwise>
                                ${book.title}
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td>${book.author}</td>
                    <td>${book.uploadedBy.username}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
