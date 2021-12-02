package project.qdomain;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.*;
import project.domain.Reservation;
import project.domain.Screening;
import project.domain.ScreeningSeat;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QScreening is a Querydsl query type for Screening
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QScreening extends EntityPathBase<Screening> {

    private static final long serialVersionUID = 1994465633L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QScreening screening = new QScreening("screening");

    public final QMovie movie;

    public final ListPath<Reservation, QReservation> reservations = this.<Reservation, QReservation>createList("reservations", Reservation.class, QReservation.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> screeningEndTime = createDateTime("screeningEndTime", java.time.LocalDateTime.class);

    public final NumberPath<Long> screeningId = createNumber("screeningId", Long.class);

    public final DateTimePath<java.time.LocalDateTime> screeningStartTime = createDateTime("screeningStartTime", java.time.LocalDateTime.class);

    public final ListPath<ScreeningSeat, QScreeningSeat> screenSeats = this.<ScreeningSeat, QScreeningSeat>createList("screenSeats", ScreeningSeat.class, QScreeningSeat.class, PathInits.DIRECT2);

    public final QTheater theater;

    public QScreening(String variable) {
        this(Screening.class, forVariable(variable), INITS);
    }

    public QScreening(Path<? extends Screening> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QScreening(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QScreening(PathMetadata metadata, PathInits inits) {
        this(Screening.class, metadata, inits);
    }

    public QScreening(Class<? extends Screening> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.movie = inits.isInitialized("movie") ? new QMovie(forProperty("movie")) : null;
        this.theater = inits.isInitialized("theater") ? new QTheater(forProperty("theater")) : null;
    }

}

