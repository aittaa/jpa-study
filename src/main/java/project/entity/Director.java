package project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.jdbc.Work;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Table(name = "DIRECTOR")

@DiscriminatorValue("D")
public class Director extends Worker {

   @Column(name = "BIRTH_PLACE", nullable = true)
   private String birthPlace;

}
