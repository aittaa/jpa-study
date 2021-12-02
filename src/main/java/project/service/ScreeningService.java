package project.service;

import project.domain.*;
import project.repository.ScreeningRepository;
import project.repository.UserRepository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

public class ScreeningService {

    ScreeningRepository screeningRepository = new ScreeningRepository();

    public void createScreening(Theater theater, Movie movie, LocalDateTime screeningStartTime, LocalDateTime screeningEndTime) {
        Screening screening = new Screening(theater, movie, screeningStartTime, screeningEndTime);
        screeningRepository.save(screening);
    }

    public Screening findOneWithID(Long screeningId){
        return screeningRepository.findOneWithID(screeningId);
    }
//
//
//    public List<User> findAllUser(){
//        return userRepository.findAll();
//    }


}
