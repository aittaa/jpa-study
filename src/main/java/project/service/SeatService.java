package project.service;

import project.domain.*;
import project.repository.SeatRepository;
import project.repository.UserRepository;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import java.util.List;

public class SeatService {
    SeatRepository seatRepository = new SeatRepository();

    public void createSeat(Theater theater, Long seatRow, Long seatCol, SeatType seatType, String note) {
        Seat seat = new Seat(theater, seatRow, seatCol, seatType, note);

        seatRepository.save(seat);
    }
    public Seat findOneWithID(Long userID){
        return seatRepository.findOneWithID(userID);
    }


//    public List<User> findAllUser(){
//        return userRepository.findAll();
//    }


}
