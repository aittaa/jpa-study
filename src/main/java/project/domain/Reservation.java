package project.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor

@Entity
@Getter
@Table(name = "RESERVATION")
public class Reservation {

   public Reservation(User user, Screening screening, ReservationStatusType reservationStatus) {
      this.user = user;
      this.screening = screening;
      this.reservationStatus = reservationStatus;
   }

   @Id @GeneratedValue
   @Column(name = "RESERVATION_ID", nullable = false)
   private Long reservationId;

   @JoinColumn(name = "USER_ID", nullable = false)
   @ManyToOne
   private User user;

   @JoinColumn(name = "SCREENING_ID", nullable = false)
   @ManyToOne
   private Screening screening;

   @Enumerated(EnumType.STRING)
   @Column(name = "RESERVATION_STATUS", nullable = false)
   private ReservationStatusType reservationStatus;

   @OneToMany(mappedBy = "reservation")
   private final List<ReservationSeat> reservationSeats = new ArrayList<ReservationSeat>();
}
