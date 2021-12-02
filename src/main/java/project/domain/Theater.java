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

@Table(name = "THEATER")
public class Theater {

   public Theater(String name, Long floor) {
      this.name = name;
      this.floor = floor;
   }

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
