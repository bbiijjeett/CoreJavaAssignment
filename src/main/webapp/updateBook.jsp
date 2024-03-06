<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Book</title>
</head>
<body>
    <h1>Update Book Details</h1>
    <form action="updateBook" method="post">
        ID: <input type="text" name="id"><br>
        Title: <input type="text" name="title"><br>
        Author: <input type="text" name="author" ><br>
        Price: <input type="text" name="price" ><br>
        <input type="submit" value="Update Book">
    </form>
</body>
</html>
