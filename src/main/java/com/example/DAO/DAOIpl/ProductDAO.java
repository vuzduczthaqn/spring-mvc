package com.example.DAO.DAOIpl;

import com.example.DAO.IMethod;
import com.example.DAO.getConnect;
import com.example.entity.Product;
import jakarta.persistence.Query;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Repository
public class ProductDAO implements IMethod <Product>{
    @Autowired
    private getConnect method;

    @Override
    public void addData(Product product) {

    }

    @Override
    public void updateData(Product product, Object obj) {

    }

    @Override
    public void deleteData(Product product, Object obj) {

    }

    @Override
    public List<Product> getList() {
        List<Product> productList=new ArrayList<>();
        try {
            Query query=method.getSession().createQuery("from Product");
            productList=query.getResultList();
        }catch (HibernateException he){
            he.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public Product getObjectById(String id) {
        try {
            Query query=method.getSession().createQuery("from Product where productId=:productIdIn");
            query.setParameter("productIdIn",id);
            if((Product) query.getSingleResult()!=null)
                 return (Product) query.getSingleResult();
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Product();
    }
}
