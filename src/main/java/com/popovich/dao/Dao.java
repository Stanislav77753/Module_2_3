package com.popovich.dao;

import com.popovich.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public interface Dao<E> {
    default void save(E e){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(e);
        transaction.commit();
        session.close();
    }
    void delete(E e);
    default void update(E e){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(e);
        transaction.commit();
        session.close();
    }

    
}
