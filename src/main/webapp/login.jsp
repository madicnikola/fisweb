<%-- 
    Document   : login.jsp
    Created on : Mar 31, 2020, 8:21:45 PM
    Author     : Nikola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <title>Login</title>
    </head>

    <body>
        <div class="container" style="margin-top:2%;">
            <div class="row ">
                <div class="col-md-4 offset-md-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="muted">${logoutmessage}</h3>
                            <h4 class="panel-title">Login</h4>
                        </div>
                        <span style="color:red;">${message}</span>
                        <div class="panel-body">
                            <form action="/fisweb/app/login" method="post">
                                <fieldset>
                                    <div class="form-group">
                                        <input class="form-control" id="email" placeholder="email" name="email" type="text" value="${email}">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form-control" id="password" placeholder="Password" name="password" value="${password}"/>
                                    </div>
                                    <div class="checkbox" style="display: none;">
                                        <label>
                                            <input name="remember" type="checkbox" value="Remember Me"> Remember Me </label>
                                    </div>
                                    <input type="submit" class="btn btn-lg btn-success btn-block" id="Login" value="Login"/>
                                </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <%@include file="/WEB-INF/pages/template/footer.jsp" %>
        </div>
    </body>
</html>
