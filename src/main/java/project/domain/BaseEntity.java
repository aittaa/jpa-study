package project.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;


@MappedSuperclass

public abstract class BaseEntity {
    private LocalDateTime creationDate;
    @Setter
    private LocalDateTime modificationDate;
}
