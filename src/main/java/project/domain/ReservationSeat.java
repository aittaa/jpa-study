package project.domain;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor

@Entity
@Getter

@Table(name = "RESERVATION_SEAT")
public class ReservationSeat {

   public ReservationSeat(Reservation reservation, Seat seat) {
      this.reservation = reservation;
      this.seat = seat;
   }

   @Id @GeneratedValue
   @Column(name = "RESERVATION_SEAT_ID", nullable = false)
   private Long reservationSeatId;

   @JoinColumn(name = "RESERVATION_ID", nullable = false)
   @ManyToOne
   private Reservation reservation;

   @JoinColumn(name = "SEAT_ID", nullable = false)
   @ManyToOne
   private Seat seat;

}
