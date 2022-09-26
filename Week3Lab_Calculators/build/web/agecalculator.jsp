<%-- 
    Document   : agecalculator
    Created on : 25-Sep-2022, 2:06:46 AM
    Author     : Sukhpal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            Enter your age: <input type="number" name="Age" value="${Age}"><br>
            <input type="submit" value="Age next birthday">
        </form>
        <p>${nextAge}</p>
        <p><a href="arithmetic">Arithmetic Calculator</a></p>
    </body>
</html>
