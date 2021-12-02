package project.qdomain;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.*;
import project.domain.Reservation;
import project.domain.ReservationSeat;
import project.domain.ReservationStatusType;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QReservation is a Querydsl query type for Reservation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReservation extends EntityPathBase<Reservation> {

    private static final long serialVersionUID = -402995593L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReservation reservation = new QReservation("reservation");

    public final NumberPath<Long> reservationId = createNumber("reservationId", Long.class);

    public final ListPath<ReservationSeat, QReservationSeat> reservationSeats = this.<ReservationSeat, QReservationSeat>createList("reservationSeats", ReservationSeat.class, QReservationSeat.class, PathInits.DIRECT2);

    public final EnumPath<ReservationStatusType> reservationStatus = createEnum("reservationStatus", ReservationStatusType.class);

    public final QScreening screening;

    public final QUser user;

    public QReservation(String variable) {
        this(Reservation.class, forVariable(variable), INITS);
    }

    public QReservation(Path<? extends Reservation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReservation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReservation(PathMetadata metadata, PathInits inits) {
        this(Reservation.class, metadata, inits);
    }

    public QReservation(Class<? extends Reservation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.screening = inits.isInitialized("screening") ? new QScreening(forProperty("screening"), inits.get("screening")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user"), inits.get("user")) : null;
    }

}

