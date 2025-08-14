<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>${book.title}</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container mt-4">
    <h2>${book.title} by ${book.author}</h2>
    <p><strong>${book.uploadedBy.username}</strong> read <em>${book.title}</em> by <strong>${book.author}</strong>.</p>
    <h4>Here are ${book.uploadedBy.username}'s thoughts:</h4>
    <p>${book.thoughts}</p>

    <a href="/books" class="btn btn-secondary">Back to the shelves</a>

    <c:if test="${book.id != null and book.uploadedBy.id == user.id}">
        <a href="/books/${book.id}/edit" class="btn btn-warning">Edit</a>
    </c:if>
    <a href="/books/delete/${book.id}" class="btn btn-danger ms-2"
       onclick="return confirm('Are you sure you want to delete this book?');">
       Delete Book 
   </a>
</div>
</body>
</html>
