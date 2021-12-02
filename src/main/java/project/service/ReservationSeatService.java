package project.service;

import project.domain.*;
import project.repository.ReservationSeatRepository;
import project.repository.UserRepository;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;

public class ReservationSeatService {

    ReservationSeatRepository reservationSeatRepository = new ReservationSeatRepository();

    public void createReservationSeat(Reservation reservation, Seat seat) {
        ReservationSeat reservationSeat = new ReservationSeat(reservation, seat);

        reservationSeatRepository.save(reservationSeat);
    }
//    public User findOneWithID(Long userID){
//        return reservationSeatRepository.findOneWithID(userID);
//    }


//    public List<User> findAllUser(){
//        return reservationSeatRepository.findAll();
//    }


}
