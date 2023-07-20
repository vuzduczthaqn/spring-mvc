<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
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
    <!-- Product Catagories Area Start -->
    <div class="products-catagories-area clearfix">
        <div class="amado-pro-catagory clearfix">
            <!-- Single Catagory -->
            <c:forEach var="product" items="${listProduct}" begin="0" end="8">
                <div class="single-products-catagory clearfix">
                    <a href="<c:url value="/san-pham/${product.productName}-${product.productId}" />">
                        <img src="https://drive.google.com/uc?id=${product.pathImg}" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>From ${product.price}</p>
                            <h4>${product.productName}</h4>
                        </div>
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>
</body>

</html>