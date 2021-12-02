package project.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter

@Table(name = "USER")

public class User extends BaseEntity {

   public User() {
      super(null, null);
   }

   public User(String name, Long age, Address address) {
      super(LocalDateTime.now(), LocalDateTime.now());
      this.name = name;
      this.age = age;
      this.address = address;
   }

   @Id @GeneratedValue
   @Column(name = "USER_ID", nullable = false)
   private Long userId;

   @Column(name = "NAME", nullable = false)
   private String name;

   @Column(name = "AGE", nullable = false)
   private Long age;

   @Embedded
   private Address address;

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
