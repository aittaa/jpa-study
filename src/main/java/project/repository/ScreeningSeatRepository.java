package project.repository;

import project.EMFSingleton;
import project.domain.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

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

    public ScreeningSeat findOneWithID(Long screeningSeatId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        ScreeningSeat screeningSeat = null;

        try {
            tx.begin();
            ////

            screeningSeat = em.find(ScreeningSeat.class, screeningSeatId);

            ////

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            System.out.println("rollback");

        } finally {
            em.close();
        }

        return screeningSeat;
    }

    public void updateWithSeatIdAndScreeningId(Seat seat, Screening screening, SeatStatusType seatStatusType) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();


        try {
            tx.begin();
            ////

            TypedQuery<ScreeningSeat> query = em.createQuery("SELECT ss FROM ScreeningSeat ss where ss.seat=:seatName and ss.screening=:screeningName"
                    , ScreeningSeat.class);

            query.setParameter("seatName", seat);
            query.setParameter("screeningName", screening);

            ScreeningSeat screeningSeat = query.getSingleResult();
            screeningSeat.setSeatStatus(seatStatusType);

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


