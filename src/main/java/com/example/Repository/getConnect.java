package com.example.Repository;

import com.example.config.hibernateConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class getConnect {
    private final Session session;
    @Autowired
    private hibernateConfig config;
    public getConnect() {
        this.session = config.getConnect().openSession();
    }
    public Session getSession(){
        return session;
    }
    public Transaction beginTransaction() {
        return session.beginTransaction();
    }
    public Transaction getTransaction(){
        return session.getTransaction();
    }
    public void commitTransaction(Transaction transaction) {
        transaction.commit();
    }

    public void rollbackTransaction(Transaction transaction) {
        transaction.rollback();
    }

}
