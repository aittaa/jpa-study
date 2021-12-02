package project.repository;

import project.EMFSingleton;
import project.domain.MovieWorker;
import project.domain.ScreeningSeat;
import project.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class ScreeningSeatRepository{
    EntityManagerFactory emf = EMFSingleton.getInstance();

    public void save(ScreeningSeat ScreeningSeat) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            ////
            em.persist(ScreeningSeat);
            ////
            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            System.out.println("rollback");

        } finally {
            em.close();
        }

    }
}


