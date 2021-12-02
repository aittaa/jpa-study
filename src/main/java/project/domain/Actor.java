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

@Table(name = "ACTOR")
@DiscriminatorValue("A")
public class Actor extends Worker{

   @Column(name = "HEIGHT", nullable = true)
   private Long height;

   @Column(name = "INSTAGRAM", nullable = true)
   private String instagram;

   @Override
   public String toString() {
      return "{" + "name=" + super.getName() + '}';
   }
}
