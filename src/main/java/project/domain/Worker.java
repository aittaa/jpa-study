package project.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor

@Entity
@Getter
@Setter
@Table(name = "WORKER")

@Inheritance(strategy = InheritanceType.JOINED) //부모 클래스에 사용, 전략 지정
@DiscriminatorColumn(name="DTYPE")

public abstract class Worker {

   @Id @GeneratedValue
   @Column(name = "WORKER_ID", nullable = false)
   private Long workerId;

   @Column(name = "NAME", nullable = false)
   private String name;

   @Column(name = "YEAR", nullable = true)
   private Long year;

   @Column(name = "MONTH", nullable = true)
   private Long month;

   @Column(name = "DAY", nullable = true)
   private Long day;

   @OneToMany(mappedBy = "worker")
   private final List<MovieWorker> movieWorkers = new ArrayList<MovieWorker>();

}
