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
@Table(name = "DIRECTOR")

@DiscriminatorValue("D")
public class Director extends Worker {

   @Column(name = "BIRTH_PLACE", nullable = true)
   private String birthPlace;

   @Override
   public String toString() {
      return "{" + "name=" + super.getName() + '}';
   }
}

