package project.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter

@Table(name = "USER")

public class User extends BaseEntity {

   @Id @GeneratedValue
   @Column(name = "USER_ID", nullable = false)
   private Long userId;

   @Column(name = "NAME", nullable = false)
   private String name;

   @Column(name = "AGE", nullable = false)
   private Long age;

   @Column(name = "CITY", nullable = false)
   private String city;

   @Column(name = "STREET", nullable = false)
   private String street;

   @Column(name = "ZIPCODE", nullable = false)
   private Long zipcode;

   @OneToMany(mappedBy = "user")
   private final List<Reservation> reservations = new ArrayList<Reservation>();

   @Override
   public String toString() {
      return "User{" +
              "userId=" + userId +
              ", name='" + name + '\'' +
              ", age=" + age +
              ", address=" + address +
              '}';
   }

}
