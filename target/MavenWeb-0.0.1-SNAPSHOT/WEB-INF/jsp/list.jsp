<%-- 
    Document   : list.jsp
    Created on : Feb 11, 2013, 5:40:39 PM
    Author     : w00x
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mis posts</title>
    </head>
    <body>
        <h1>Hello !!</h1>
        ${posts}
    </body>
</html>
