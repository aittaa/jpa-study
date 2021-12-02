package project.service;

import project.domain.*;
import project.repository.ScreeningSeatRepository;
import project.repository.UserRepository;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;

public class ScreeningSeatService {

    ScreeningSeatRepository screeningSeatRepository = new ScreeningSeatRepository();

    public void createScreeningSeat(Seat seat, Screening screening, SeatStatusType seatStatus) {
        ScreeningSeat screeningSeat = new ScreeningSeat(seat, screening, seatStatus);

        screeningSeatRepository.save(screeningSeat);
    }
    public ScreeningSeat findOneWithID(Long screeningSeatId){
        return screeningSeatRepository.findOneWithID(screeningSeatId);
    }

//    public void update(Long screeningSeatId, SeatStatusType seatStatusType){
//        screeningSeatRepository.update(screeningSeatId, seatStatusType);
//    }
    public void updateWithSeatIdAndScreeningId(Seat seat, Screening screening, SeatStatusType seatStatusType){
        screeningSeatRepository.updateWithSeatIdAndScreeningId(seat, screening, seatStatusType);
    }
//
//
//    public List<User> findAllUser(){
//        return userRepository.findAll();
//    }


}
