package project.qdomain;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.*;
import project.domain.ReservationSeat;
import project.domain.ScreeningSeat;
import project.domain.Seat;
import project.domain.SeatType;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QSeat is a Querydsl query type for Seat
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSeat extends EntityPathBase<Seat> {

    private static final long serialVersionUID = 681911738L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSeat seat = new QSeat("seat");

    public final StringPath note = createString("note");

    public final ListPath<ReservationSeat, QReservationSeat> reservationSeats = this.<ReservationSeat, QReservationSeat>createList("reservationSeats", ReservationSeat.class, QReservationSeat.class, PathInits.DIRECT2);

    public final ListPath<ScreeningSeat, QScreeningSeat> screeningSeats = this.<ScreeningSeat, QScreeningSeat>createList("screeningSeats", ScreeningSeat.class, QScreeningSeat.class, PathInits.DIRECT2);

    public final NumberPath<Long> seatCol = createNumber("seatCol", Long.class);

    public final NumberPath<Long> seatId = createNumber("seatId", Long.class);

    public final NumberPath<Long> seatRow = createNumber("seatRow", Long.class);

    public final EnumPath<SeatType> seatType = createEnum("seatType", SeatType.class);

    public final QTheater theater;

    public QSeat(String variable) {
        this(Seat.class, forVariable(variable), INITS);
    }

    public QSeat(Path<? extends Seat> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSeat(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSeat(PathMetadata metadata, PathInits inits) {
        this(Seat.class, metadata, inits);
    }

    public QSeat(Class<? extends Seat> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.theater = inits.isInitialized("theater") ? new QTheater(forProperty("theater")) : null;
    }

}

