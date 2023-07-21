package com.example.Repository;

import java.util.List;

public interface IMethod<T>{
    public void addData(T t);
    public void updateData(T t,Object obj);
    public void deleteData(T t,Object obj);
    public List<T> getList();
    public T getObjectById(String Id);
    public List<T> getListbyCondition(String condition);
}
