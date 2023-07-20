package com.example.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;
import java.util.ResourceBundle;

import com.example.entity.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class hibernateConfig {
    private static final SessionFactory FACTORY;
    static {
        ResourceBundle rsb = ResourceBundle.getBundle("db");
        Configuration conf = new Configuration();
        Properties prop = new Properties();
        prop.put(Environment.DRIVER, rsb.getString("driver"));
        prop.put(Environment.DIALECT, rsb.getString("dialect"));
        prop.put(Environment.URL, rsb.getString("url"));
        prop.put(Environment.USER, rsb.getString("user"));
        prop.put(Environment.PASS, rsb.getString("pass"));
        prop.put(Environment.SHOW_SQL, rsb.getString("show_sql"));
        prop.put(Environment.HBM2DDL_AUTO, rsb.getString("db_method"));
        conf.setProperties(prop);
        conf.addAnnotatedClass(Bill.class);
        conf.addAnnotatedClass(BillDetails.class);
        conf.addAnnotatedClass(Cart.class);
        conf.addAnnotatedClass(Customer.class);
        conf.addAnnotatedClass(DeliveryAddress.class);
        conf.addAnnotatedClass(Position.class);
        conf.addAnnotatedClass(Producer.class);
        conf.addAnnotatedClass(Product.class);
        conf.addAnnotatedClass(ProductType.class);


        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);
    }

    public static SessionFactory getConnect() {
        if (FACTORY == null) {
            return hibernateConfig.FACTORY;
        }
        return FACTORY;
    }
}
