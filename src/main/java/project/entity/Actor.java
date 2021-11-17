package project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor

@Entity
@Getter

@Table(name = "ACTOR")
@DiscriminatorValue("A")
public class Actor extends Worker{

   @Column(name = "HEIGHT", nullable = true)
   private Long height;

   @Column(name = "INSTAGRAM", nullable = true)
   private String instagram;

}
