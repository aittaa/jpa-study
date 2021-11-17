package project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter

@Table(name = "THEATER")
public class Theater {

   @Id @GeneratedValue
   @Column(name = "THEATER_ID", nullable = false)
   private Long theaterId;

   @Column(name = "NAME", nullable = false)
   private String name;

   @Column(name = "FLOOR", nullable = false)
   private Long floor;

   @OneToMany(mappedBy = "theater")
   private final List<Screening> screenings = new ArrayList<Screening>();

   @OneToMany(mappedBy = "theater")
   private final List<Seat> seats = new ArrayList<Seat>();

}
