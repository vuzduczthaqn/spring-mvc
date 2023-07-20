package Test;

import com.example.config.hibernateConfig;
import com.example.entity.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.TransactionException;

public class test {
    public static void main(String[] args) {
       try (Session session=hibernateConfig.getConnect().openSession()){
           Transaction transaction=session.getTransaction();
           try{
               transaction.begin();
//                Product product=new Product();
//                session.persist(product);

               transaction.commit();
           }catch (TransactionException te){
               transaction.rollback();
               te.printStackTrace();
           }
       }catch (HibernateException he){
           he.printStackTrace();
       }
    }
}
