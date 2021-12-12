package project;

import project.domain.*;
import project.service.*;
import project.domain.RoleType;


import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


public class JpaMain {

    public static void main(String[] args) throws InterruptedException {

        initInsert();

        one();

        two();

        three();

        four();

        five();

        six();

        seven();

//        eight();

        ten();

        close();
    }

    static UserService userService = new UserService();
    static MovieService movieService = new MovieService();
    static DirectorService directorService = new DirectorService();
    static ActorService actorService = new ActorService();
    static MovieWorkerService movieWorkerService = new MovieWorkerService();
    static TheaterService theaterService = new TheaterService();
    static ScreeningService screeningService = new ScreeningService();
    static SeatService seatService = new SeatService();
    static ScreeningSeatService screeningSeatService = new ScreeningSeatService();
    static ReservationService reservationService = new ReservationService();
    static ReservationSeatService reservationSeatService = new ReservationSeatService();

    static private void initInsert() {
        // 1
        userService.createUser("박진우", 24L, "구미시", "대학로 61", "푸름1동 413호");
        userService.createUser("김승형", 26L, "구미시", "옥계", "푸름1동");

        // 3
        movieService.createMovie("바람과 함께 사라지다", LocalDate.of(2019, 11, 12)
                , GenreType.ACTION, 120L);

        directorService.createDirector("김승형", 1998L, 1L, 21L, "goomi");
        actorService.createActor("박진우", 1998L, 4L, 7L, 179L, "www.instagram.com");
        actorService.createActor("김철수", 1998L, 4L, 7L, 179L, "www.instagram.com/oto");

        Movie movie3 = movieService.findOneWithID(3L);

        Director directorObj3 = directorService.findOneWithID(4L);
        Actor actorObj3_1 = actorService.findOneWithID(5L);
        Actor actorObj3_2 = actorService.findOneWithID(6L);

        movieWorkerService.createMovieWorker(movie3, directorObj3, RoleType.DIRECTOR);
        movieWorkerService.createMovieWorker(movie3, actorObj3_1, RoleType.LEAD);
        movieWorkerService.createMovieWorker(movie3, actorObj3_2, RoleType.SUPPORTING);

        // 4
        movieService.createMovie("지옥", LocalDate.of(2019, 11, 12)
                , GenreType.ACTION, 120L);

        directorService.createDirector("유아인", 1998L, 4L, 7L, "goomi");
        actorService.createActor("김현주", 1998L, 4L, 7L, 179L, "www.instagram.com/oto");
        actorService.createActor("박정민", 1998L, 4L, 7L, 179L, "www.instagram.com/oto");

        movieService.createMovie("오징어 게임", LocalDate.of(2019, 11, 12)
                , GenreType.ACTION, 120L);
        actorService.createActor("이정재", 1998L, 4L, 7L, 179L, "www.instagram.com");
        actorService.createActor("박해수", 1998L, 4L, 7L, 179L, "www.instagram.com/oto");
        actorService.createActor("위하준", 1998L, 4L, 7L, 179L, "www.instagram.com/oto");

        movieService.createMovie("DP", LocalDate.of(2019, 11, 12)
                , GenreType.ACTION, 120L);

        actorService.createActor("정해인", 1998L, 4L, 7L, 179L, "www.instagram.com");
        actorService.createActor("구교환", 1998L, 4L, 7L, 179L, "www.instagram.com/oto");
        actorService.createActor("김성균", 1998L, 4L, 7L, 179L, "www.instagram.com/oto");

        movieService.createMovie("슬기로운 의사생활", LocalDate.of(2019, 11, 12)
                , GenreType.ACTION, 120L);
        actorService.createActor("조정석", 1998L, 4L, 7L, 179L, "www.instagram.com");
        actorService.createActor("유연석", 1998L, 4L, 7L, 179L, "www.instagram.com/oto");
        actorService.createActor("정경호", 1998L, 4L, 7L, 179L, "www.instagram.com/oto");


        Movie movie4_1 = movieService.findOneWithID(10L);

        Director actorObj4_1 = directorService.findOneWithID(11L);
        Actor actorObj4_2 = actorService.findOneWithID(12L);
        Actor actorObj4_3 = actorService.findOneWithID(13L);

        Movie movie4_2 = movieService.findOneWithID(14L);

        Actor actorObj4_4 = actorService.findOneWithID(15L);
        Actor actorObj4_5 = actorService.findOneWithID(16L);
        Actor actorObj4_6 = actorService.findOneWithID(17L);

        Movie movie4_3 = movieService.findOneWithID(18L);

        Actor actorObj4_7 = actorService.findOneWithID(19L);
        Actor actorObj4_8 = actorService.findOneWithID(20L);
        Actor actorObj4_9 = actorService.findOneWithID(21L);

        Movie movie4_4 = movieService.findOneWithID(22L);

        Actor actorObj4_10 = actorService.findOneWithID(23L);
        Actor actorObj4_11 = actorService.findOneWithID(24L);
        Actor actorObj4_12 = actorService.findOneWithID(25L);

        movieWorkerService.createMovieWorker(movie4_1, actorObj4_1, RoleType.DIRECTOR);
        movieWorkerService.createMovieWorker(movie4_1, actorObj4_2, RoleType.LEAD);
        movieWorkerService.createMovieWorker(movie4_1, actorObj4_3, RoleType.SUPPORTING);

        movieWorkerService.createMovieWorker(movie4_2, actorObj4_4, RoleType.LEAD);
        movieWorkerService.createMovieWorker(movie4_2, actorObj4_5, RoleType.LEAD);
        movieWorkerService.createMovieWorker(movie4_2, actorObj4_6, RoleType.SUPPORTING);

        movieWorkerService.createMovieWorker(movie4_3, actorObj4_7, RoleType.LEAD);
        movieWorkerService.createMovieWorker(movie4_3, actorObj4_8, RoleType.LEAD);
        movieWorkerService.createMovieWorker(movie4_3, actorObj4_9, RoleType.SUPPORTING);

        movieWorkerService.createMovieWorker(movie4_4, actorObj4_10, RoleType.LEAD);
        movieWorkerService.createMovieWorker(movie4_4, actorObj4_11, RoleType.LEAD);
        movieWorkerService.createMovieWorker(movie4_4, actorObj4_12, RoleType.SUPPORTING);

        // 6
        theaterService.createTheater("1상영관", 1L);
        theaterService.createTheater("2상영관", 2L);

        // 수정 필요
        Theater theater1 = theaterService.findOneWithID(38L);
        Theater theater2 = theaterService.findOneWithID(39L);

        Movie movie = movieService.findOneWithID(3L);

        // Seat
        seatService.createSeat(theater1, 1L, 1L, SeatType.NORMAL, null);
        seatService.createSeat(theater1, 1L, 2L, SeatType.NORMAL, null);
        seatService.createSeat(theater1, 1L, 3L, SeatType.NORMAL, null);
        seatService.createSeat(theater1, 2L, 1L, SeatType.NORMAL, null);
        seatService.createSeat(theater1, 2L, 2L, SeatType.NORMAL, null);
        seatService.createSeat(theater1, 2L, 3L, SeatType.NORMAL, null);

        seatService.createSeat(theater2, 1L, 1L, SeatType.NORMAL, null);
        seatService.createSeat(theater2, 1L, 2L, SeatType.NORMAL, null);
        seatService.createSeat(theater2, 1L, 3L, SeatType.NORMAL, null);
        seatService.createSeat(theater2, 2L, 1L, SeatType.NORMAL, null);
        seatService.createSeat(theater2, 2L, 2L, SeatType.NORMAL, null);
        seatService.createSeat(theater2, 2L, 3L, SeatType.NORMAL, null);

        // seats
        Seat theater1_seat1 = seatService.findOneWithID(40L);
        Seat theater1_seat2 = seatService.findOneWithID(41L);
        Seat theater1_seat3 = seatService.findOneWithID(42L);
        Seat theater1_seat4 = seatService.findOneWithID(43L);
        Seat theater1_seat5 = seatService.findOneWithID(44L);
        Seat theater1_seat6 = seatService.findOneWithID(45L);

        Seat theater2_seat1 = seatService.findOneWithID(46L);
        Seat theater2_seat2 = seatService.findOneWithID(47L);
        Seat theater2_seat3 = seatService.findOneWithID(48L);
        Seat theater2_seat4 = seatService.findOneWithID(49L);
        Seat theater2_seat5 = seatService.findOneWithID(50L);
        Seat theater2_seat6 = seatService.findOneWithID(51L);

        // Screening
        screeningService.createScreening(theater1, movie
                , LocalDateTime.of(2021, 12, 12, 12, 32, 22, 3333)
                , LocalDateTime.of(2021, 12, 12, 12, 32, 22, 3333));

        // id 수정 필요
        Screening screening = screeningService.findOneWithID(52L);

        screeningSeatService.createScreeningSeat(theater1_seat1, screening, SeatStatusType.AVAILABLE);
        screeningSeatService.createScreeningSeat(theater1_seat2, screening, SeatStatusType.AVAILABLE);
        screeningSeatService.createScreeningSeat(theater1_seat3, screening, SeatStatusType.AVAILABLE);
        screeningSeatService.createScreeningSeat(theater1_seat4, screening, SeatStatusType.AVAILABLE);
        screeningSeatService.createScreeningSeat(theater1_seat5, screening, SeatStatusType.AVAILABLE);
        screeningSeatService.createScreeningSeat(theater1_seat6, screening, SeatStatusType.AVAILABLE);
    }

    static private void one() {

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡoneㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        userService.createUser("박a진우", 94L, "구미시", "대학로 61", "푸름1동 443호");

        List<User> users = userService.findAllUser();

        for (User user : users) {
            System.out.println(user);
        }
    }

    static private void two() throws InterruptedException {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡtwoㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

//
        Thread.sleep(500);
        User user = userService.findOneWithID(1L);

        System.out.println(user);

        userService.updateName(1L, "마우스");

        User user2 = userService.findOneWithID(1L);

        System.out.println(user2);
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

        String director = "김승형";
//        String director = null;
        String actor = "박진우";
//        String actor = null;
        LocalDate openingDate = null;
//        LocalDate openingDate = LocalDate.of(2019, 11, 12);

        System.out.println(movieService.movieSearch(director, actor, openingDate));

    }

    static private void five() {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡfiveㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        List<Movie> movies = movieService.findAllByPaging(2);

        System.out.println("Page");
        for (Movie movie : movies) {
            System.out.println(movie);
        }


    }

    static private void six() {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡsixㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        Screening screening = screeningService.findOneWithID(52L);
    }

    static private void seven() {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡsevenㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        reservationService.reservate();
    }

    static private void eight() {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡeightㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        reservationService.cancleReservation();
    }

    static private void ten() {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡtenㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        final Long DELETE_USER_ID = 1L;
        userService.deleteUser(DELETE_USER_ID);


    }

    static private void close() {
        EMFSingleton.close();
    }

}
