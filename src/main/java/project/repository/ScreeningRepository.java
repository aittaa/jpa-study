package project.repository;

import project.EMFSingleton;
import project.domain.MovieWorker;
import project.domain.Screening;
import project.domain.Theater;
import project.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class ScreeningRepository {
    EntityManagerFactory emf = EMFSingleton.getInstance();

    public void save(Screening Screening) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            ////
            em.persist(Screening);
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

    public Screening findOneWithID(Long screeningId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Screening screening = null;

        try {
            tx.begin();
            ////

            screening = em.find(Screening.class, screeningId);
            System.out.println(screening);

            ////

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            System.out.println("rollback");

        } finally {
            em.close();
        }

        return screening;
    }
}


