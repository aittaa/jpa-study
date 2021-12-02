package project.service;

import project.domain.Address;
import project.domain.GenreType;
import project.domain.Movie;
import project.domain.User;
import project.repository.MovieRepository;
import project.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class MovieService {

    MovieRepository movieRepository = new MovieRepository();

    public void createMovie(String name, LocalDate openingDate, GenreType genre, Long runningTime) {
        Movie movie = new Movie(name, openingDate, genre, runningTime);
        movieRepository.save(movie);
    }

    public Movie findOneWithID(Long movieID){
        return movieRepository.findOneWithID(movieID);
    }

    public List<Movie> findAllByPaging(int number){
        return movieRepository.findAllByPaging(number);
    }

    public List<Movie> movieSearch(String director, String actor, LocalDate openingDate){
        return movieRepository.movieSearch(director, actor, openingDate);
    }

}
