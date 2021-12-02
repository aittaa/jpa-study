package project.repository;

import project.EMFSingleton;
import project.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

public class UserRepository {
    EntityManagerFactory emf = EMFSingleton.getInstance();

    public void save(User user) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            ////

            em.persist(user);

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

    public List<User> findAll() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        List<User> users = null;

        try {
            tx.begin();
            ////

            users = em.createQuery("select u from User u", User.class).getResultList();

            ////

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            System.out.println("rollback");

        } finally {
            em.close();
        }

        return users;
    }

    public User findOneWithID(Long userID ){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        User user = null;

        try {
            tx.begin();
            ////

            user = em.find(User.class, userID);

            ////

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            System.out.println("rollback");

        } finally {
            em.close();
        }

        return user;
    }

    public void updateName(Long userId, String name) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            ////

            User user = em.find(User.class, userId);
            user.setName(name);

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
