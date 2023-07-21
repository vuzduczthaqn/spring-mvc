package com.example.sevice;

import com.example.Repository.DAOIpl.CartDAO;
import com.example.entity.Cart;
import com.example.entity.Customer;
import com.example.entity.Product;
import com.example.DTO.CartModel;
import com.example.utils.MapsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartDAO cartDAO;
    private final MapsModel mapsModel=new MapsModel();
    public List<CartModel> getListCartModel(String id){
        List<CartModel> cartModelList=new ArrayList<>();
        List<Cart> listCart=cartDAO.getListbyCondition(id);
        if(listCart!=null)
        listCart.forEach(e->{
            cartModelList.add(mapsModel.changeToCartModel(e));
        });
        return cartModelList;
    }
    public void addProductToCart(Product product, Customer customer){
        cartDAO.addData(mapsModel.changeToCartEntity(product,customer));
    }
}
