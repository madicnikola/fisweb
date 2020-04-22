<%-- 
    Document   : all
    Created on : Mar 31, 2020, 9:10:09 PM
    Author     : Nikola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">-->
        <!--<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>-->
        <!--<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>-->
        <title>Department: add</title>
        <style>
            .inputBoxSizing{
                box-sizing: content-box ;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <%@include file="../template/header.jsp" %>
            <div class="well">
                <div id="myTabContent" class="tab-content">
                    <div class="tab-pane active in" id="home">
                        <h4 class="offset-md-4">New department:</h4>
                        <form action="/fisweb/app/department/save" method="POST">    
                            <h6 class="offset-md-4">${message}</h6>
                            <div class="form-group offset-md-4">
                                <div class="input-group">
                                    <input type="text" name="shortname" value="${shortname}" class="inputBoxSizing input-xlarge" placeholder="Short name" />     
                                </div>
                                <div class="input-group">
                                    <input type="text" name="name" value="${name}" class="inputBoxSizing input-xlarge" placeholder="Name" /> 
                                </div>
                                <input type="submit" value="Save" class="btn btn-primary" style="margin-top: 10px"/>
                            </div>
                        </form>
                    </div>
                </div>
            </div>


            <%@include file="../template/footer.jsp" %>
        </div>
    </body>
</html>
