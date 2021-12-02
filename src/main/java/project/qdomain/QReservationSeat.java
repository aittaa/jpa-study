package project.qdomain;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import project.domain.ReservationSeat;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QReservationSeat is a Querydsl query type for ReservationSeat
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReservationSeat extends EntityPathBase<ReservationSeat> {

    private static final long serialVersionUID = 1205597468L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReservationSeat reservationSeat = new QReservationSeat("reservationSeat");

    public final QReservation reservation;

    public final NumberPath<Long> reservationSeatId = createNumber("reservationSeatId", Long.class);

    public final QSeat seat;

    public QReservationSeat(String variable) {
        this(ReservationSeat.class, forVariable(variable), INITS);
    }

    public QReservationSeat(Path<? extends ReservationSeat> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReservationSeat(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReservationSeat(PathMetadata metadata, PathInits inits) {
        this(ReservationSeat.class, metadata, inits);
    }

    public QReservationSeat(Class<? extends ReservationSeat> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.reservation = inits.isInitialized("reservation") ? new QReservation(forProperty("reservation"), inits.get("reservation")) : null;
        this.seat = inits.isInitialized("seat") ? new QSeat(forProperty("seat"), inits.get("seat")) : null;
    }

}

