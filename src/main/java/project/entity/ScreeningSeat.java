package project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor

@Entity
@Getter

@Table(name = "SCREENING_SEAT")
public class ScreeningSeat {


   @Id @GeneratedValue
   @Column(name = "SCREENING_SEAT_ID", nullable = false)
   private Long screeningSeatId;

   @JoinColumn(name = "SEAT_ID", nullable = false)
   @ManyToOne
   private Seat seat;

   @JoinColumn(name = "SCREENING_ID", nullable = false)
   @ManyToOne
   private Screening screening;

   @Enumerated(EnumType.STRING)
   @Column(name = "SEAT_STATUS", nullable = false)
   private SeatStatusType seatStatus;
}
