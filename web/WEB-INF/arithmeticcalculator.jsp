
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" actions="arithmeticCalculator">
            
            <label>First:</label> <input type="text" name="first" value="${first}">
            <br>
            <label>Second:</label> <input type="text" name="second" value="${second}">
            <br>
            
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
            <br>
            
            <p name="message">Result: ${message}</p>
            
            <a href="ageCalculator">Age Calculator</a>
            
        </form>
    </body>
</html>
