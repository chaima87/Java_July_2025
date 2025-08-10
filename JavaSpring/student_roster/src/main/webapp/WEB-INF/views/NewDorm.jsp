<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Dorm</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1 class="mb-4">Add New Dorm</h1>
    <form action="/dorms" method="post">
        <div class="mb-3">
            <label for="name" class="form-label">Dorm Name</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Enter dorm name" required>
        </div>
        <button type="submit" class="btn btn-success">Create Dorm</button>
        <a href="/dorms" class="btn btn-secondary ms-2">dashboared</a>
    </form>
</div>
</body>
</html>
