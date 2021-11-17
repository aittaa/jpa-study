package project.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;


@MappedSuperclass
public class BaseEntity {

    private LocalDateTime creationDate;

    private LocalDateTime modificationDate;

}
