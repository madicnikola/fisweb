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
        <title>Department: Edit</title>
        <style>
            .inputBoxSizing{
                box-sizing: content-box ;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <%@include file="../../../template/header.jsp" %>
            <div class="well">
                <div id="myTabContent" class="tab-content">
                    <div class="tab-pane active in" id="home">
                        <h4 class="offset-md-4">Edit department:</h4>
                        <form action="/fisweb/app/department/update/${id}" method="POST">    
                            <h6 class="offset-md-4">${message}</h6>
                            <div class="form-group">
                                <div class="input-group">
                                    <label class="col-md-4 col-form-label text-md-right">ID:</label>
                                    <input type="text" name="shortname" value="${id}" class="inputBoxSizing input-xlarge" disabled="true" style="padding-top: 7px;padding-bottom: 7px;"  />     
                                </div>
                                <div class="input-group">
                                    <label class="col-md-4 col-form-label text-md-right">Short name:</label>
                                    <input type="text" name="shortname" value="${shortname}" class="inputBoxSizing input-xlarge" placeholder="Short name" style="padding-top: 7px;padding-bottom: 7px;" />     
                                </div>
                                <div class="input-group">
                                    <label class="col-md-4 col-form-label text-md-right">Name:</label>
                                    <input type="text" name="name" value="${name}" class="inputBoxSizing input-xlarge" placeholder="Name" style="padding-top: 7px;padding-bottom: 7px;" /> 
                                </div>
                                <input type="submit" value="Update" class="btn btn-primary offset-md-4" style="margin-top: 10px"/>
                            </div>
                        </form>
                    </div>
                </div>
            </div>


            <%@include file="../../../template/footer.jsp" %>
        </div>
    </body>
</html>
