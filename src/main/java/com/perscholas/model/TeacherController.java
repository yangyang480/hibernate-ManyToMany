package com.perscholas.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class TeacherController {

    //this method is create table
    public void createtable(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.close();
    }

    public void insertinfo()
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Cohort cohort1 = new Cohort(1, "Yangyang's Cohort", "Java");
        Cohort cohort2 = new Cohort(2, "Twantwan's Cohort", ".net");
        Cohort cohort3 = new Cohort(3, "Haseeb's Cohort", "FullStack");

        session.save(cohort1);
        session.save(cohort2);
        session.save(cohort3);

        Set<Cohort> cohortSet1 = new HashSet<Cohort>();
        cohortSet1.add(cohort1);
        cohortSet1.add(cohort2);
        cohortSet1.add(cohort3);

        Set<Cohort> cohortSet2 = new HashSet<Cohort>();
        cohortSet2.add(cohort3);
        cohortSet2.add(cohort2);
        cohortSet2.add(cohort1);

        Set<Cohort> cohortSet3 = new HashSet<Cohort>();
        cohortSet3.add(cohort2);
        cohortSet3.add(cohort3);
        cohortSet3.add(cohort1);

        Teacher teacher1 = new Teacher(1, "Yangyang", 29, 60000, cohortSet1);
        Teacher teacher2 = new Teacher(2, "Twantwan", 29, 70000, cohortSet2);
        Teacher teacher3 = new Teacher(3, "Haseeb", 35, 75000, cohortSet3);

        session.save(teacher1);
        session.save(teacher2);
        session.save(teacher3);
        transaction.commit();
    }


}
