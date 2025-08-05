<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Books</title>
</head>
<body>
    <h1>All Books</h1>
    <table border="1" cellpadding="10">
        <thead>
            <tr>
                <th>Title</th>
                <th>Description</th>
                <th>Language</th>
                <th>Pages</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td>
                        <a href="/books/${book.id}">${book.title}</a> <!--Link to detail -->
                    </td>
                    <td>${book.description}</td>
                    <td>${book.language}</td>
                    <td>${book.numberOfPages}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
