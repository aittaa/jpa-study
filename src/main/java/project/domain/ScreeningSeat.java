package project.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor

@Entity
@Getter
@Setter

@Table(name = "SCREENING_SEAT")
public class ScreeningSeat {
   public ScreeningSeat(Seat seat, Screening screening, SeatStatusType seatStatus) {
      this.seat = seat;
      this.screening = screening;
      this.seatStatus = seatStatus;
   }

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
