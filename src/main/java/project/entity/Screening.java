package project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter

@Table(name = "SCREENING")
public class Screening {

   @Id @GeneratedValue
   @Column(name = "SCREENING_ID", nullable = false)
   private Long screeningId;

   @JoinColumn(name = "THEATER_ID", nullable = false)
   @ManyToOne
   private Theater theater;

   @JoinColumn(name = "MOVIE_ID", nullable = false)
   @ManyToOne
   private Movie movie;

   @Column(name = "SCREENING_START_TIME", nullable = false)
   private LocalDateTime screeningStartTime;

   @Column(name = "SCREENING_END_TIME", nullable = false)
   private LocalDateTime screeningEndTime;

   @OneToMany(mappedBy = "screening")
   private final List<ScreeningSeat> screenSeats = new ArrayList<ScreeningSeat>();

   @OneToMany(mappedBy = "screening")
   private final List<Reservation> reservations = new ArrayList<Reservation>();



}
