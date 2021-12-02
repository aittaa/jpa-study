package project.service;

import project.domain.Theater;
import project.domain.User;
import project.repository.TheaterRepository;

import javax.persistence.Column;
import java.util.List;

public class TheaterService {

    TheaterRepository theaterRepository = new TheaterRepository();

    public void createTheater(String name, Long floor) {
        Theater theater = new Theater(name, floor);

        theaterRepository.save(theater);
    }
    public Theater findOneWithID(Long userID){
        return theaterRepository.findOneWithID(userID);
    }
//
//
//    public List<User> findAllUser(){
//        return userRepository.findAll();
//    }


}
