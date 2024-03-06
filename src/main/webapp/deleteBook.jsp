<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Book</title>
</head>
<body>
    <h1>Confirm Deletion</h1>
    <form action="deleteBook" method="post">
        <input type="text" name="id" />
        Are you sure you want to delete the book ?<br>
        <input type="submit" value="Delete">
    </form>
</body>
</html>
