package project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter

@Table(name = "MOVIE")
public class Movie extends BaseEntity{

   @Id @GeneratedValue
   @Column(name = "MOVIE_ID", nullable = false)
   private Long movieId;

   @Column(name = "NAME", nullable = false)
   private String name;

   @Column(name = "OPENING_DATE", nullable = false)
   private LocalDateTime openingDate;

   @Enumerated(EnumType.STRING)
   @Column(name = "GENRE", nullable = false)
   private GenreType genre;

   @Column(name = "RUNNING_TIME", nullable = false)
   private Long runningTime;

   @OneToMany(mappedBy = "movie")
   private final List<MovieWorker> movieWorkers = new ArrayList<MovieWorker>();

   @OneToMany(mappedBy = "movie")
   private final List<Screening> screenings = new ArrayList<Screening>();

}
