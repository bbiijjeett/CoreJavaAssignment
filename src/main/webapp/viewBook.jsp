<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>view Books</title>
</head>
<body>
    <h1>View Books</h1>
    <table border="1">
        <tr>
        	<th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Price</th>
        </tr>
        <c:forEach var="book" items="${books}">
            <tr>
            	<td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.price}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
