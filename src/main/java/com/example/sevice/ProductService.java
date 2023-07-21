package com.example.sevice;

import com.example.Repository.DAOIpl.ProductDAO;
import com.example.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDAO productDAO;
    public List<Product> getListProduct(){
        return productDAO.getList();
    }
    public Product getProductById(List<Product> productList,String Id){
        return productList.stream().filter(product -> (product.getProductId() + "").equalsIgnoreCase(Id)).findFirst().get();
    }
}
