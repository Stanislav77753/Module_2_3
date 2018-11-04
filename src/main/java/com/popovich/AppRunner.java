package com.popovich;

import com.popovich.model.Skill;
import com.popovich.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppRunner {
    public static void main(String[] args) {
        AppRunner appRunner = new AppRunner();
       /* appRunner.addSkill(new Skill("Java"));
        appRunner.addSkill(new Skill("Java1"));
        appRunner.addSkill(new Skill("Java2"));*/
    }

    public void addSkill(Skill skill){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(skill);
        transaction.commit();
        session.close();

    }
}
