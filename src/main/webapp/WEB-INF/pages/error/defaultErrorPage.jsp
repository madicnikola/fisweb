<%-- 
    Document   : defaultErrorPage
    Created on : Apr 3, 2020, 9:39:44 PM
    Author     : Nikola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        <div class="container">
            <%@include file="../template/header.jsp" %>
            <h1>This is default error page!</h1>
            <h2>${message}</h2>
            <%@include file="../template/footer.jsp" %>
        </div>
    </body>
</html>
