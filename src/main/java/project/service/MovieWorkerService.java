package project.service;

import project.domain.*;
import project.repository.MovieRepository;
import project.repository.MovieWorkerRepository;

import java.time.LocalDateTime;

public class MovieWorkerService {
    MovieWorkerRepository movieWorkerRepository = new MovieWorkerRepository();
    public void createMovieWorker(Movie movie, Worker worker, RoleType roleType) {
        MovieWorker movieWorker = new MovieWorker(movie, worker, roleType);
        movieWorkerRepository.save(movieWorker);
    }

}
