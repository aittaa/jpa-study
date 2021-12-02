package project.service;

import project.domain.*;
import project.repository.ReservationRepository;

import java.util.List;

public class ReservationService {

    ReservationRepository reservationRepository = new ReservationRepository();

    public void createReservation(User user, Screening screening, ReservationStatusType reservationStatus) {
        Reservation reservation = new Reservation(user, screening, reservationStatus);

        reservationRepository.save(reservation);
    }
    public Reservation findOneWithID(Long reservationId){
        return reservationRepository.findOneWithID(reservationId);
    }

    public List<Reservation> findAllReservation(){
        return reservationRepository.findAll();
    }

    public List<Reservation> findById(Long userId){
        return reservationRepository.findById(userId);
    }

    public void removeReservation(Long userId){
        reservationRepository.removeReservation(userId);
    }

    public void reservate(){
        reservationRepository.reservate();
    }

    public void cancleReservation(){
        reservationRepository.cancleReservation();
    }

}
