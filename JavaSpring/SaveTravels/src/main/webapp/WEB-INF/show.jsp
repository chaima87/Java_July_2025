<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>View Expense</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <h2 class="mb-4">Expense Details</h2>

    <div class="card">
        <div class="card-header bg-info text-white">
            ${expense.name}
        </div>
        <div class="card-body">
            <p><strong>Vendor:</strong> ${expense.vendor}</p>
            <p><strong>Amount:</strong> $${expense.amount}</p>
            <p><strong>Description:</strong></p>
            <p>${expense.description}</p>
        </div>
    </div>

    <div class="mt-3">
        <a href="/" class="btn btn-secondary">Back to List</a>
    </div>
</div>
</body>
</html>
