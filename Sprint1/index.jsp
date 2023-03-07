<%-- 
    Document   : index
    Created on : 3 mars 2023, 10:57:38
    Author     : ITU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="http://localhost:8080/FrontServlet/test" method="get">
            <p>Nom: <input type="text" name="name"></p>
            <p><input type="submit" value="send"></p>
        </form>
        
    </body>
</html>
