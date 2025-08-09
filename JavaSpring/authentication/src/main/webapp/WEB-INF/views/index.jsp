<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login & Registration</title>
    <style>
        .error { color: red; }
        .form-container {
            display: flex;
            justify-content: space-around;
            margin-top: 50px;
        }
        .form-box {
            border: 1px solid #ccc;
            padding: 20px;
            width: 350px;
            border-radius: 8px;
        }
        label, input {
            display: block;
            margin: 8px 0;
            width: 100%;
        }
        input[type="submit"] {
            width: auto;
            padding: 8px 16px;
            margin-top: 12px;
        }
    </style>
</head>
<body>

    <h2 style="text-align:center;">Welcome! Please Register or Login</h2>
    
    <div class="form-container">
    
        <!-- Registration Form -->
        <div class="form-box">
            <h3>Register</h3>
            <form:form modelAttribute="newUser" method="post" action="/register">
                
                <label>Username</label>
                <form:input path="userName" />
                <form:errors path="userName" cssClass="error" />
                
                <label>Email</label>
                <form:input path="email" />
                <form:errors path="email" cssClass="error" />
                
                <label>Password</label>
                <form:password path="password" />
                <form:errors path="password" cssClass="error" />
                
                <label>Confirm Password</label>
                <form:password path="confirm" />
                <form:errors path="confirm" cssClass="error" />
                
                <input type="submit" value="Register" />
            </form:form>
        </div>
    
        <!-- Login Form -->
        <div class="form-box">
            <h3>Login</h3>
            <form:form modelAttribute="newLogin" method="post" action="/login">
                
                <label>Email</label>
                <form:input path="email" />
                <form:errors path="email" cssClass="error" />
                
                <label>Password</label>
                <form:password path="password" />
                <form:errors path="password" cssClass="error" />
                
                <input type="submit" value="Login" />
            </form:form>
        </div>
    
    </div>

</body>
</html>
