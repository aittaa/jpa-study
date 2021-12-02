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

@Table(name = "SEAT")
public class Seat {

   public Seat(Theater theater, Long seatRow, Long seatCol, SeatType seatType, String note) {
      this.theater = theater;
      this.seatRow = seatRow;
      this.seatCol = seatCol;
      this.seatType = seatType;
      this.note = note;
   }

   @Id @GeneratedValue
   @Column(name = "SEAT_ID", nullable = false)
   private Long seatId;

   @JoinColumn(name = "THEATER_ID", nullable = false)
   @ManyToOne
   private Theater theater;

   @Column(name = "SEAT_ROW", nullable = false)
   private Long seatRow;

   @Column(name = "SEAT_COL", nullable = false)
   private Long seatCol;

   @Enumerated(EnumType.STRING)
   @Column(name = "SEAT_TYPE", nullable = false)
   private SeatType seatType;

   @Lob
   @Column(name = "NOTE", nullable = true)
   private String note;

   @OneToMany(mappedBy = "seat")
   private final List<ScreeningSeat> screeningSeats = new ArrayList<ScreeningSeat>();

   @OneToMany(mappedBy = "seat")
   private final List<ReservationSeat> reservationSeats = new ArrayList<ReservationSeat>();

}
