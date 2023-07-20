package com.example.DAO;

import com.example.config.hibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class getConnect {
    private final Session session;
    protected getConnect( ) {
        this.session = hibernateConfig.getConnect().openSession();
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
