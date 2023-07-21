package com.example.Repository.DAOIpl;

import com.example.Repository.IMethod;
import com.example.Repository.getConnect;
import com.example.entity.Cart;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CartDAO implements IMethod<Cart> {
    @Autowired
    private getConnect repository;

    @Override
    public void addData(Cart cart) {
        try {
            repository.beginTransaction();
            repository.getSession().persist(cart);
            repository.commitTransaction(repository.getTransaction());
        } catch (Exception e) {
            repository.rollbackTransaction(repository.getTransaction());
        }
    }

    @Override
    public void updateData(Cart cart, Object obj) {

    }

    @Override
    public void deleteData(Cart cart, Object obj) {

    }

    @Override
    public List<Cart> getList() {
        return null;
    }

    @Override
    public Cart getObjectById(String Id) {
        return null;
    }

    @Override
    public List<Cart> getListbyCondition(String condition) {
        try{
            Query query=repository.getSession().createQuery("from Cart where customer=:customerId");
            query.setParameter("customer",condition);
            return query.getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
