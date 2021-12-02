package project;

import project.domain.*;
import project.service.*;
import project.domain.RoleType;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


public class JpaMain {

    public static void main(String[] args) throws InterruptedException {

        one();


        two();


        three();
//
//
//        four();
//
//
//        five();
//
//
//        six();
//
//
//        seven();
//
//
//        eight();
//
//
//        nine();
//
//
//        ten();
//


        close();
    }

    static UserService userService = new UserService();
    static MovieService movieService = new MovieService();
    static DirectorService directorService = new DirectorService();
    static ActorService actorService = new ActorService();
    static MovieWorkerService movieWorkerService = new MovieWorkerService();

    static private void one() {
        userService.createUser("박진우", 24L, "구미시", "대학로 61", "푸름1동 413호");
        userService.createUser("김승형", 26L, "구미시", "옥계", "푸름1동");

        List<User> users = userService.findAllUser();

        for (User user : users) {
            System.out.println(user);
        }
    }

    static private void two() throws InterruptedException {
//
//        Thread.sleep(2000);

        User user = userService.findOneWithID(1L);

        user.setName("마우스");
        user.setModificationDate(LocalDateTime.now());

        System.out.println(user);
        System.out.println("CreationDate : " + user.getCreationDate()
                + "\nModification Date : " + user.getModificationDate());

    }


    static private void three() {

        //insert dummy data
        movieService.createMovie("바람과 함께 사라지다", LocalDateTime.of(2019, 11, 12, 12, 32, 22, 3333)
                , GenreType.ACTION, 120L);

        directorService.createDirector("김승형", 1998L, 1L, 21L, "goomi");
        actorService.createWorker("박진우", 1998L, 4L, 7L, 179L, "www.instagram.com");
        actorService.createWorker("김철수", 1998L, 4L, 7L, 179L, "www.instagram.com/oto");


        Movie movie = movieService.findOneWithID(3L);

        Director directorObj = directorService.findOneWithID(4L);
        Actor actorObj1 = actorService.findOneWithID(5L);
        Actor actorObj2 = actorService.findOneWithID(6L);

        System.out.println(movie);
        System.out.println(directorObj);
        System.out.println(actorObj1);
        System.out.println(actorObj2);

        movieWorkerService.createMovieWorker(movie, directorObj, RoleType.DIRECTOR);
        movieWorkerService.createMovieWorker(movie, actorObj1, RoleType.LEAD);
        movieWorkerService.createMovieWorker(movie, actorObj2, RoleType.SUPPORTING);


        Movie newMovie = movieService.findOneWithID(3L);
        System.out.println(newMovie);

    }


    static private void four() {


    }

    static private void five() {

    }

    static private void six() {

    }

    static private void seven() {

    }

    static private void eight() {

    }

    static private void nine() {

    }

    static private void ten() {

    }

    static private void close() {
        EMFSingleton.close();
    }

}
