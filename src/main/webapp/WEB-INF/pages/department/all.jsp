<%-- 
    Document   : all
    Created on : Mar 31, 2020, 9:10:09 PM
    Author     : Nikola
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">-->
        <!--<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>-->
        <!--<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>-->
        <title>Department: all</title>
    </head>
    <body>
        <div class="container">
            <%@include file="../template/header.jsp" %>
            <div class="row">
                <div class="span12">
                    <div class="head">
                        <div class="row-fluid">
                            <div class="span12">
                                <div class="span6">
                                    <h2>All departments</h2>
                                    <h3">${message}</h3>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Short name</th>
                        <th>Name</th>
                        <th>Delete</th>
                        <th>Edit</th>
                    </tr>
                </thead>
                <tbody >
                    <c:forEach var="department" items="${applicationScope.departments}">
                        <tr>
                            <td>${department.id}</td>
                            <td>${department.shortName}</td>
                            <td>${department.name}</td>
                            <td>
                                <a href="/fisweb/app/department/delete/${department.id}" class="btn btn-small btn-primary">Delete</a>
                            </td>
                            <td>
                                <a href="/fisweb/app/department/edit/${department.id}" class="btn btn-small btn-primary">Edit</a>
                            </td>
                        </tr>
                    </c:forEach>

                </tbody>
            </table>

            <%@include file="../template/footer.jsp" %>
        </div>
    </body>
</html>
