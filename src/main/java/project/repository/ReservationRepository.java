package project.repository;

import project.EMFSingleton;
import project.domain.*;
import project.service.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class ReservationRepository{
    EntityManagerFactory emf = EMFSingleton.getInstance();

    public void save(Reservation Reservation) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            ////
            em.persist(Reservation);
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


    public Reservation findOneWithID(Long reservationId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Reservation reservation = null;

        try {
            tx.begin();
            ////

            reservation = em.find(Reservation.class, reservationId);

            ////

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            System.out.println("rollback");

        } finally {
            em.close();
        }

        return reservation;
    }


    public List<Reservation> findById(Long id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        List<Reservation> reservations = null;

        try {
            tx.begin();
            ////

            TypedQuery<Reservation> query = em.createQuery("SELECT r FROM Reservation r", Reservation.class);
            reservations = query.getResultList();

            ////

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            System.out.println("rollback");

        } finally {
            em.close();
        }

        return reservations;

    }


    public void removeReservation(Long userId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            ////

            Reservation reservation = findOneWithID(userId);
            em.remove(reservation);

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

    public List<Reservation> findAll() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        List<Reservation> reservations = null;

        try {
            tx.begin();
            ////

            reservations = em.createQuery("select r from Reservation r", Reservation.class).getResultList();

            ////

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            System.out.println("rollback");

        } finally {
            em.close();
        }

        return reservations;
    }
}


