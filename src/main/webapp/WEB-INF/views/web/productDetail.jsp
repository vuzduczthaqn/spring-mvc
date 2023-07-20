
<%@include file="/common/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<body>
<!-- Product Details Area Start -->
<div class="single-product-area section-padding-100 clearfix">
    <div class="container-fluid">

        <div class="row">
            <div class="col-12">
                <nav aria-label="breadcrumb">
                    <ol class="breadcrumb mt-50">
                        <li class="breadcrumb-item"><a href="#">Home</a></li>
                        <li class="breadcrumb-item"><a href="#">Furniture</a></li>
                        <li class="breadcrumb-item"><a href="#">Chairs</a></li>
                        <li class="breadcrumb-item active" aria-current="page">white modern chair</li>
                    </ol>
                </nav>
            </div>
        </div>

        <div class="row">
            <div class="col-12 col-lg-7">
                <div class="single_product_thumb">
                    <div id="product_details_slider" class="carousel slide" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li class="active" data-target="#product_details_slider" data-slide-to="0" style="background-image: url(img/product-img/pro-big-1.jpg);">
                            </li>
                            <li data-target="#product_details_slider" data-slide-to="1" style="background-image: url(img/product-img/pro-big-2.jpg);">
                            </li>
                            <li data-target="#product_details_slider" data-slide-to="2" style="background-image: url(img/product-img/pro-big-3.jpg);">
                            </li>
                            <li data-target="#product_details_slider" data-slide-to="3" style="background-image: url(img/product-img/pro-big-4.jpg);">
                            </li>
                        </ol>
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <a class="gallery_img" href="https://drive.google.com/uc?id=${product.pathImg}">
                                    <img class="d-block w-100" src="https://drive.google.com/uc?id=${product.pathImg}" alt="First slide">
                                </a>
                            </div>
                            <div class="carousel-item">
                                <a class="gallery_img" href="https://drive.google.com/uc?id=${product.pathImg}">
                                    <img class="d-block w-100" src="https://drive.google.com/uc?id=${product.pathImg}" alt="Second slide">
                                </a>
                            </div>
                            <div class="carousel-item">
                                <a class="gallery_img" href="https://drive.google.com/uc?id=${product.pathImg}">
                                    <img class="d-block w-100" src="https://drive.google.com/uc?id=${product.pathImg}" alt="Third slide">
                                </a>
                            </div>
                            <div class="carousel-item">
                                <a class="gallery_img" href="https://drive.google.com/uc?id=${product.pathImg}">
                                    <img class="d-block w-100" src="https://drive.google.com/uc?id=${product.pathImg}" alt="Fourth slide">
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-12 col-lg-5">
                <div class="single_product_desc">
                    <!-- Product Meta Data -->
                    <div class="product-meta-data">
                        <div class="line"></div>
                        <p class="product-price">${product.price} VNĐ</p>
                        <a href="<c:url value="/san-pham/${product.productName}-${product.productId}" />">
                            <h6>${product.productName}</h6>
                        </a>
                        <!-- Ratings & Review -->
                        <div class="ratings-review mb-15 d-flex align-items-center justify-content-between">
                            <div class="ratings">
                                <i class="fa fa-star" aria-hidden="true"></i>
                                <i class="fa fa-star" aria-hidden="true"></i>
                                <i class="fa fa-star" aria-hidden="true"></i>
                                <i class="fa fa-star" aria-hidden="true"></i>
                                <i class="fa fa-star" aria-hidden="true"></i>
                            </div>
                            <div class="review">
                                <a href="#">Write A Review</a>
                            </div>
                        </div>
                        <!-- Avaiable -->
                        <c:choose>
                            <c:when test="${product.quantity>0}">
                                <p class="avaibility"><i class="fa fa-circle"></i>Còn ${product.quantity} sản phẩm </p>
                            </c:when>
                            <c:otherwise>
                                <p class="avaibility"><i class="fa fa-circle" style="color: red;"></i> Hết hàng</p>
                            </c:otherwise>
                        </c:choose>

                    </div>

                    <div class="short_overview my-5">
                        <p>${product.describe}</p>
                    </div>

                    <!-- Add to Cart Form -->
                    <form class="cart clearfix" action="<c:url value="/san-pham/${product.productName}-${product.productId}" />" method="post">
                        <div class="cart-btn d-flex mb-50">
                            <p>Qty</p>
                            <div class="quantity">
                                <span class="qty-minus" onclick="var effect = document.getElementById('qty'); var qty = effect.value; if( !isNaN( qty ) &amp;&amp; qty &gt; 1 ) effect.value--;return false;"><i class="fa fa-caret-down" aria-hidden="true"></i></span>
                                <input type="number" class="qty-text" id="qty" step="1" min="1" max="300" name="quantity" value="1">
                                <span class="qty-plus" onclick="var effect = document.getElementById('qty'); var qty = effect.value; if( !isNaN( qty )) effect.value++;return false;"><i class="fa fa-caret-up" aria-hidden="true"></i></span>
                            </div>
                        </div>
                        <button type="submit" name="addtocart" value="5" class="btn amado-btn">Add to cart</button>
                    </form>

                </div>
            </div>
        </div>
    </div>
</div>
<!-- Product Details Area End -->
</body>
</html>
