package project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor

@Entity
@Getter
@Table(name = "RESERVATION")
public class Reservation {

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
