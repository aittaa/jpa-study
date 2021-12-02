package project.service;


import project.domain.Director;
import project.domain.Movie;
import project.repository.DirectorRepository;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class DirectorService {
    DirectorRepository directorRepository = new DirectorRepository();

    public void createDirector(String name, Long year, Long month, Long day, String birthPlace) {
        Director director = new Director();

        director.setName(name);
        director.setYear(year);
        director.setMonth(month);
        director.setDay(day);
        director.setBirthPlace(birthPlace);

        directorRepository.save(director);
    }


    public Director findOneWithID(Long id) {
        return directorRepository.findOneWithID(id);

    }
}
