package project.repository;

import project.EMFSingleton;
import project.domain.MovieWorker;
import project.domain.Theater;
import project.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class TheaterRepository{
    EntityManagerFactory emf = EMFSingleton.getInstance();

    public void save(Theater Theater) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            ////
            em.persist(Theater);
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


