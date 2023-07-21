package com.example.utils;

import com.example.Repository.DAOIpl.CustomerDAO;
import com.example.Repository.DAOIpl.ProductDAO;
import com.example.entity.Cart;
import com.example.entity.Customer;
import com.example.entity.Product;
import com.example.DTO.CartModel;

public class MapsModel {
    public Cart changeToCartEntity(CartModel cartModel){
        Cart cart=new Cart();
        cart.setProduct(new ProductDAO().getObjectById(cartModel.getProductId()+""));
        cart.setCustomer(new CustomerDAO().getObjectById(cartModel.getCustomerId()+""));
        cart.setQuantity(cartModel.getQuantity());
        return cart;
    }

    public Cart changeToCartEntity(Product product, Customer customer){
        Cart cart=new Cart();
        cart.setProduct(product);
        cart.setCustomer(customer);
        cart.setQuantity(product.getQuantity());
        return cart;
    }
    public CartModel changeToCartModel(Cart cart){
        CartModel cartModel=new CartModel();
        Product product=new ProductDAO().getObjectById(cart.getProduct().getProductId()+"");
        cartModel.setProductId(product.getProductId());
        cartModel.setNameProduct(product.getProductName());
        cartModel.setPathImg(product.getPathImg());
        cartModel.setPrice(product.getPrice());

        return cartModel;
    }
}
