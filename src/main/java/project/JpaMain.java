package project;

import project.domain.*;
import project.repository.UserRepository;
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


        four();


        five();

////
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
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡtwoㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

//
//        Thread.sleep(2000);

        User user = userService.findOneWithID(1L);

        userService.updateName(1L, "마우스");

        User user2 = userService.findOneWithID(1L);

        System.out.println(user2.getName());
        System.out.println("CreationDate : " + user2.getCreationDate()
                + "\nModification Date : " + user2.getModificationDate());

    }


    static private void three() {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡthreeㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        Movie newMovie = movieService.findOneWithID(3L);
        System.out.println(newMovie);

    }


    static private void four() {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡfourㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

//        movieService.createMovie("철수와 함께 사라지다.", LocalDate.of(2019, 1, 12)
//                , GenreType.ACTION, 120L);
//        movieService.createMovie("영수와 함께 사라지다.", LocalDate.of(2019, 1, 12)
//                , GenreType.ACTION, 120L);
//        movieService.createMovie("영회와 함께 사라지다.", LocalDate.of(2019, 1, 12)
//                , GenreType.ACTION, 120L);
//

        String director = null;
        String actor = null;
        LocalDate openingDate = LocalDate.of(2019, 11, 12);
        ;
        movieService.movieSearch(director, actor, openingDate);

    }

    static private void five() {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡfiveㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

    }

    static private void six() {

    }

    static private void seven() {

    }

    static private void eight() {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡeightㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        User user = userService.findOneWithID(1L);

        // Reservation User
        Reservation reservation = user.getReservations().get(0);

        // 해당 유저의 예매 삭제
        reservationService.removeReservation(user.getUserId());

        // 예매 내역 조회를 통해 내역이 삭제 되었음을 확인
        List<Reservation> reservationList = reservationService.findAllReservation();
        for (Reservation res : reservationList) {
            System.out.println(res);
        }

        // 상영 좌석 수정
        for (ReservationSeat reservationSeat : reservation.getReservationSeats()) {
            screeningSeatService.updateWithSeatIdAndScreeningId(reservationSeat.getSeat(), reservation.getScreening(), SeatStatusType.AVAILABLE);
        }

        // 예매 좌석 삭제


        // 예매 후, 상영정보 재조회를 통해 좌석이 반환되었음을 확인


    }

    static private void nine() {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡnineㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

    }

    static private void ten() {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡtenㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

    }

    static private void close() {
        EMFSingleton.close();
    }

}
