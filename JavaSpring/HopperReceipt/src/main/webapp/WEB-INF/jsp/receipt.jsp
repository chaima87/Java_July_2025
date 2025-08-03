<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
    <title>Hopper's Receipt</title>
</head>
<body>
    <h1>Customer Name: ${name}</h1>
    <p>Item: ${itemName}</p>
    <p>Price: $${price}</p>
    <p>Description: ${description}</p>
    <p>Vendor: ${vendor}</p>
</body>
</html>
