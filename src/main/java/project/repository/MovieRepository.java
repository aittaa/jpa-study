package project.repository;

import project.EMFSingleton;
import project.domain.Movie;
import project.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class MovieRepository
{
    EntityManagerFactory emf = EMFSingleton.getInstance();

    public void save(Movie movie) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            ////

            em.persist(movie);

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

    public Movie findOneWithID(Long movieID){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Movie movie = null;

        try {
            tx.begin();
            ////

            movie = em.find(Movie.class, movieID);

            ////

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            System.out.println("rollback");

        } finally {
            em.close();
        }

        return movie;
    }

}

