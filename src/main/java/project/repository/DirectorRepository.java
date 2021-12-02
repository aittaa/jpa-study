package project.repository;

import project.EMFSingleton;
import project.domain.Director;
import project.domain.Movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class DirectorRepository {
    EntityManagerFactory emf = EMFSingleton.getInstance();

    public void save(Director director) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            ////

            em.persist(director);

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

    public Director findOneWithID(Long id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Director director = null;

        try {
            tx.begin();
            ////

            director = em.find(Director.class, id);

            ////

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            System.out.println("rollback");

        } finally {
            em.close();
        }

        return director;

    }

}

