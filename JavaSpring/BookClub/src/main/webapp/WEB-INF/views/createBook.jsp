<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create Book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="bg-light">
<div class="container mt-5">
    <h2 class="mb-4">Add a Book to your shelf !</h2>

    <form:form action="/books/create" method="POST" modelAttribute="book" cssClass="row g-3">

        <div class="col-md-6">
            <form:label path="title" class="form-label">Title</form:label>
            <form:input path="title" class="form-control"/>
            <form:errors path="title" cssClass="text-danger"/>
        </div>

        <div class="col-md-6">
            <form:label path="author" class="form-label">Author</form:label>
            <form:input path="author" class="form-control"/>
            <form:errors path="author" cssClass="text-danger"/>
        </div>

        <div class="col-12">
            <form:label path="thoughts" class="form-label">Thoughts</form:label>
            <form:textarea path="thoughts" class="form-control" rows="3"/>
            <form:errors path="thoughts" cssClass="text-danger"/>
        </div>

        <div class="col-12">
            <button type="submit" class="btn btn-success">Submit</button>
            <a href="/books" class="btn btn-secondary ms-2">Back to List</a>
        </div>

    </form:form>
</div>
</body>
</html>
