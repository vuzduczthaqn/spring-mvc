package com.example.DAO;

import java.util.List;
import java.util.Objects;

public interface IMethod<T>{
    public void addData(T t);
    public void updateData(T t,Object obj);
    public void deleteData(T t,Object obj);
    public List<T> getList();
    public T getObjectById(String Id);
}
