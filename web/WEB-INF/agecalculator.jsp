<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" actions="age">
            <label>Enter your age:</label>
            <input type="text" name="ageInput" value="${currentAge}">
            <br>
            <input type="submit" value="Age next birthday">   
            <br/>
            ${message}
            <br/>
            <a href="arithmetic" name="arithmeticCalculator">Arithmetic Calculator</a>
        </form>
            

    </body>
</html>
