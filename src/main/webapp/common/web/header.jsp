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

<body>
<!-- Header Area Start -->
<header class="header-area clearfix">
    <!-- Close Icon -->
    <div class="nav-close">
        <i class="fa fa-close" aria-hidden="true"></i>
    </div>
    <!-- Logo -->
    <div class="logo">
        <a href="<c:url value="/trang-chu"/> "><img src="<c:url value="/template/web/img/core-img/logo.png"/>" alt=""></a>
    </div>
    <!-- Amado Nav -->
    <nav class="amado-nav">
        <ul>
            <li class="active"><a href="<c:url value="/trang-chu"/>">Trang chủ</a></li>
            <li><a href="<c:url value="/cua-hang"/>">Cửa hàng</a></li>
            <li><a href="<c:url value="/chi-tiet-san-pham"/>">Sản phẩm</a></li>
            <li><a href="<c:url value="/gio-hang"/> ">Giỏ hàng</a></li>
            <li><a href="<c:url value="/giao-hang"/>">Giao hàng</a></li>
        </ul>
    </nav>
    <!-- Button Group -->
    <div class="amado-btn-group mt-30 mb-100">
        <a href="#" class="btn amado-btn mb-15">%Discount%</a>
        <a href="#" class="btn amado-btn active">New this week</a>
    </div>
    <!-- Cart Menu -->
    <div class="cart-fav-search mb-100">
        <a href="<c:url value="/gio-hang"/>" class="cart-nav"><img src="<c:url value="/template/web/img/core-img/cart.png"/>" alt=""> Cart <span>(0)</span></a>
        <a href="#" class="fav-nav"><img src="<c:url value="/template/web/img/core-img/favorites.png"/>" alt=""> Favourite</a>
        <a href="#" class="search-nav"><img src="<c:url value="/template/web/img/core-img/search.png"/>" alt=""> Search</a>
    </div>
    <!-- Social Button -->
    <div class="social-info d-flex justify-content-between">
        <a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
        <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
        <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
        <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
    </div>
</header>
<!-- Header Area End -->
</body>
</html>
