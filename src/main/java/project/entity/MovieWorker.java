package project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor

@Entity
@Getter

@Table(name = "MOVIE_WORKER")
public class MovieWorker {

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
