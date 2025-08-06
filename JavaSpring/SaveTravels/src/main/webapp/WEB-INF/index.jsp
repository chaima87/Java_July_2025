<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <title>Save Travels</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <h1 class="text-center mb-4">Save Travels - Expense Tracker</h1>

    <!-- Expense Form -->
    <div class="card mb-4">
        <div class="card-header bg-primary text-white">
            Add New Expense
        </div>
        <div class="card-body">
            <form:form action="/create" method="POST" modelAttribute="expense" cssClass="row g-3">
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
                    <form:textarea path="description" class="form-control" rows="2"/>
                </div>
                <div class="col-12">
                    <button type="submit" class="btn btn-success">Add Expense</button>
                </div>
            </form:form>
        </div>
    </div>

    <!-- Expenses Table -->
    <div class="card">
        <div class="card-header bg-secondary text-white">
            Expense List
        </div>
        <div class="card-body">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Vendor</th>
                    <th>Amount</th>
                    <th>Actions</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${expenses}" var="expense">
                    <tr>
                        <td>${expense.name}</td>
                        <td>${expense.vendor}</td>
                        <td>$${expense.amount}</td>
                        <td>
                            <a href="/expenses/${expense.id}">View</a>
                            <a href="/edit/${expense.id}">Edit</a>
                            <form action="/delete/${expense.id}" method="post" style="display:inline;">
                                <button class="btn btn-danger btn-sm">Delete</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
