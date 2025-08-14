<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Club - Login/Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="bg-light">

<div class="container mt-5">
    <h1 class="text-center mb-4">Book Club</h1>
    <p class="text-center text-muted">A place for friends to share thoughts on books</p>

    <div class="row">
        <!-- Register -->
        <div class="col-md-6">
            <h3>Register</h3>
            <form:form action="/register" method="post" 
                       modelAttribute="user" class="needs-validation" novalidate="novalidate">

                <div class="mb-3">
                    <label>Username</label>
                    <form:input path="username" cssClass="form-control"/>
                    <form:errors path="username" cssClass="text-danger"/>
                </div>

                <div class="mb-3">
                    <label>Email</label>
                    <form:input path="email" type="email" cssClass="form-control"/>
                    <form:errors path="email" cssClass="text-danger"/>
                </div>

                <div class="mb-3">
                    <label>Password</label>
                    <form:password path="password" cssClass="form-control"/>
                    <form:errors path="password" cssClass="text-danger"/>
                </div>

                <div class="mb-3">
                    <label>Confirm Password</label>
                    <form:password path="confirmPassword" cssClass="form-control"/>
                    <form:errors path="confirmPassword" cssClass="text-danger"/>
                </div>

                <button type="submit" class="btn btn-primary">Register</button>
            </form:form>
        </div>

        <!-- Login -->
        <div class="col-md-6">
            <h3>Log in</h3>
            <form:form action="/login" method="post" 
                       modelAttribute="loginUser" class="needs-validation" novalidate="novalidate">

                <div class="mb-3">
                    <label>Email</label>
                    <form:input path="email" type="email" cssClass="form-control"/>
                    <form:errors path="email" cssClass="text-danger"/>
                </div>

                <div class="mb-3">
                    <label>Password</label>
                    <form:password path="password" cssClass="form-control"/>
                    <form:errors path="password" cssClass="text-danger"/>
                </div>

                <button type="submit" class="btn btn-success">Login</button>
            </form:form>
        </div>
    </div>
</div>

</body>
</html>
