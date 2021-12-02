package project.repository;

import project.EMFSingleton;
import project.domain.Actor;
import project.domain.Director;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class ActorRepository {
    EntityManagerFactory emf = EMFSingleton.getInstance();

    public void save(Actor actor) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            ////

            em.persist(actor);

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

    public Actor findOneWithID(Long id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Actor actor = null;

        try {
            tx.begin();
            ////

            actor = em.find(Actor.class, id);

            ////

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            System.out.println("rollback");

        } finally {
            em.close();
        }

        return actor;

    }
}
