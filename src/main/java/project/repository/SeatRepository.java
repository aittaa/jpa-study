package project.repository;

import project.EMFSingleton;
import project.domain.MovieWorker;
import project.domain.Seat;
import project.domain.Theater;
import project.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class SeatRepository{
    EntityManagerFactory emf = EMFSingleton.getInstance();

    public void save(Seat Seat) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            ////
            em.persist(Seat);
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

    public Seat findOneWithID(Long seatId){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Seat seat = null;

        try {
            tx.begin();
            ////

            seat = em.find(Seat.class, seatId);

            ////

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            System.out.println("rollback");

        } finally {
            em.close();
        }

        return seat;
    }
}


