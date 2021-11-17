package project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor

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

}
