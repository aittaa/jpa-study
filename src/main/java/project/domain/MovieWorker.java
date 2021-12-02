package project.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor

@Entity
@Getter

@Table(name = "MOVIE_WORKER")
public class MovieWorker {

   public MovieWorker(Movie movie, Worker worker, RoleType roleType) {
      this.movie = movie;
      this.worker = worker;
      this.roleType = roleType;
   }

   @Id @GeneratedValue
   @Column(name = "MOVIE_WORKER_ID", nullable = false)
   private Long movieWorkerId;

   @JoinColumn(name = "MOVIE_ID", nullable = false)
   @ManyToOne
   private Movie movie;

   @JoinColumn(name = "WORKER_ID", nullable = false)
   @ManyToOne
   private Worker worker;

   @Enumerated(EnumType.STRING)
   @Column(name = "ROLE_TYPE", nullable = false)
   private RoleType roleType;

}
