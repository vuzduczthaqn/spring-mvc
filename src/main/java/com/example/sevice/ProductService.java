package com.example.sevice;

import com.example.DAO.DAOIpl.ProductDAO;
import com.example.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProductService {
    @Autowired
    private ProductDAO productDAO;
    public List<Product> getListProduct(){
        return productDAO.getList();
    }
    public Product getProductById(String Id){
        return productDAO.getObjectById(Id);
    }
}
