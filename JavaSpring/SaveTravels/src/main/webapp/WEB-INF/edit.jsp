<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Expense</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <h2 class="mb-4">Edit Expense</h2>

    <form:form action="/update/${expense.id}" method="POST" modelAttribute="expense" cssClass="row g-3">
        <div class="col-md-6">
            <form:label path="name" class="form-label">Expense Name</form:label>
            <form:input path="name" class="form-control"/>
        </div>
        <div class="col-md-6">
            <form:label path="vendor" class="form-label">Vendor</form:label>
            <form:input path="vendor" class="form-control"/>
        </div>
        <div class="col-md-6">
            <form:label path="amount" class="form-label">Amount</form:label>
            <form:input path="amount" class="form-control"/>
        </div>
        <div class="col-12">
            <form:label path="description" class="form-label">Description</form:label>
            <form:textarea path="description" class="form-control" rows="3"/>
        </div>
        <div class="col-12">
            <button type="submit" class="btn btn-primary">Update Expense</button>
            <a href="/" class="btn btn-secondary ms-2">Back to List</a>
        </div>
    </form:form>
</div>
</body>
</html>
