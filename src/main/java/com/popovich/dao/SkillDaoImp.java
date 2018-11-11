package com.popovich.dao;

import com.popovich.model.Developer;
import com.popovich.model.Skill;
import com.popovich.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class SkillDaoImp implements SkillDao {

    @Override
    public List<Skill> getAll() {
        List<Skill> skills;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        skills = session.createQuery("FROM Skill").list();
        transaction.commit();
        session.close();
        return skills;
    }


}
