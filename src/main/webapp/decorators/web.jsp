<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 05/07/2023
  Time: 10:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/common/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title  -->
    <title>Amado - Furniture Ecommerce Template | Home</title>

    <!-- Favicon  -->
    <link rel="icon" href="<c:url value="/template/web/img/core-img/favicon.ico"/>">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="<c:url value="/template/web/css/core-style.css"/>">
    <link rel="stylesheet" href="<c:url value="/template/web/css/style.css"/>">

</head>

<body>
<!-- Search Wrapper Area Start -->
<div class="search-wrapper section-padding-100">
    <div class="search-close">
        <i class="fa fa-close" aria-hidden="true"></i>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="search-content">
                    <form action="#" method="get">
                        <input type="search" name="search" id="search" placeholder="Type your keyword...">
                        <button type="submit"><img src="<c:url value="/template/web/img/core-img/search.png"/>"> alt=""></button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Search Wrapper Area End -->

<!-- ##### Main Content Wrapper Start ##### -->
<div class="main-content-wrapper d-flex clearfix">

    <!-- Mobile Nav (max width 767px)-->
    <div class="mobile-nav">
        <!-- Navbar Brand -->
        <div class="amado-navbar-brand">
            <a href="index.html"><img src="<c:url value="/template/web/img/core-img/logo.png"/>" alt=""></a>
        </div>
        <!-- Navbar Toggler -->
        <div class="amado-navbar-toggler">
            <span></span><span></span><span></span>
        </div>
    </div>

    <!-- Header Area Start -->
    <%@include file="/common/web/header.jsp"%>
    <!-- Header Area End -->

    <!-- Product Catagories Area Start -->
    <dec:body/>
    <!-- Product Catagories Area End -->
<%--</div>--%>
<!-- ##### Main Content Wrapper End ##### -->

<!-- ##### Footer Area Start ##### -->
<%@include file="/common/web/footer.jsp"%>
<!-- ##### Footer Area End ##### -->

<!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
<script src="<c:url value="/template/web/js/jquery/jquery-2.2.4.min.js"/>"></script>
<!-- Popper js -->
<script src="<c:url value="/template/web/js/popper.min.js"/>"></script>
<!-- Bootstrap js -->
<script src="<c:url value="/template/web/js/bootstrap.min.js"/>"></script>
<!-- Plugins js -->
<script src="<c:url value="/template/web/js/plugins.js"/>"></script>
<!-- Active js -->
<script src="<c:url value="/template/web/js/active.js"/>"></script>

</body>

</html>