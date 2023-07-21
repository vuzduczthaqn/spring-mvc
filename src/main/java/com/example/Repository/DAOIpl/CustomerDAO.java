package com.example.Repository.DAOIpl;

import com.example.Repository.IMethod;
import com.example.Repository.getConnect;
import com.example.entity.Customer;

import java.util.List;

public class CustomerDAO extends getConnect implements IMethod<Customer> {
    @Override
    public void addData(Customer customer) {

    }

    @Override
    public void updateData(Customer customer, Object obj) {

    }

    @Override
    public void deleteData(Customer customer, Object obj) {

    }

    @Override
    public List<Customer> getList() {
        return null;
    }

    @Override
    public Customer getObjectById(String Id) {
        return null;
    }

    @Override
    public List<Customer> getListbyCondition(String condition) {
        return null;
    }
}
