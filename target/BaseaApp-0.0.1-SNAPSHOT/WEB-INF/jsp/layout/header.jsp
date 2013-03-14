<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
    <div class="container-fluid">
        <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        </a>
        <a class="brand" href="#">Project name</a>
        <div class="nav-collapse collapse">
            <ul class="nav pull-right">
                <li class="dropdown">
                  <a href="javascript:void()" class="dropdown-toggle" data-toggle="dropdown">User name<b class="caret"></b></a>
                  <ul class="dropdown-menu">
                      <li><a href="/config"><b class="icon-wrench"></b> Configurar</a></li>
                      <li class="divider"></li>
                      <li><a href="<c:url value='j_spring_security_logout' />"><b class="icon-off"></b> Salir</a></li>
                  </ul>
                </li>
            </ul>
            <ul class="nav pull-left">
                <li class=""><a href="#">Menu 1</a></li>
                <li class=""><a href="#">Menu 2</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
    </div>
</div>