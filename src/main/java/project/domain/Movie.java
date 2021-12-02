package project.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter

@Table(name = "MOVIE")
public class Movie extends BaseEntity{

   public Movie() {
      super(LocalDateTime.now(),LocalDateTime.now());
   }

   public Movie(String name, LocalDate openingDate, GenreType genre, Long runningTime) {
      super(LocalDateTime.now(), LocalDateTime.now());
      this.name = name;
      this.openingDate = openingDate;
      this.genre = genre;
      this.runningTime = runningTime;
   }

   @Id @GeneratedValue
   @Column(name = "MOVIE_ID", nullable = false)
   private Long movieId;

   @Column(name = "NAME", nullable = false)
   private String name;

   @Column(name = "OPENING_DATE", nullable = false)
   private LocalDate openingDate;

   @Enumerated(EnumType.STRING)
   @Column(name = "GENRE", nullable = false)
   private GenreType genre;

   @Column(name = "RUNNING_TIME", nullable = false)
   private Long runningTime;

   @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER)
   private final List<MovieWorker> movieWorkers = new ArrayList<MovieWorker>();

   @OneToMany(mappedBy = "movie")
   private final List<Screening> screenings = new ArrayList<Screening>();

   @Override
   public String toString() {

      StringBuilder baseInf = new StringBuilder("Movie{" +
              "movieId=" + movieId +
              ", name='" + name + '\'' +
              ", openingDate=" + openingDate +
              ", genre=" + genre +
              ", runningTime=" + runningTime + "}\n");


      baseInf.append("movieWorkers = [");

      for(MovieWorker movieWorker : movieWorkers){
         baseInf.append(movieWorker.getRoleType());
         baseInf.append(movieWorker.getWorker().toString());

      }

      baseInf.append("]");


      return baseInf.toString();


   }
}
