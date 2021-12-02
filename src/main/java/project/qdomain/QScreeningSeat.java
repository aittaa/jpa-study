package project.qdomain;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.EnumPath;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import project.domain.ScreeningSeat;
import project.domain.SeatStatusType;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QScreeningSeat is a Querydsl query type for ScreeningSeat
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QScreeningSeat extends EntityPathBase<ScreeningSeat> {

    private static final long serialVersionUID = -186201338L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QScreeningSeat screeningSeat = new QScreeningSeat("screeningSeat");

    public final QScreening screening;

    public final NumberPath<Long> screeningSeatId = createNumber("screeningSeatId", Long.class);

    public final QSeat seat;

    public final EnumPath<SeatStatusType> seatStatus = createEnum("seatStatus", SeatStatusType.class);

    public QScreeningSeat(String variable) {
        this(ScreeningSeat.class, forVariable(variable), INITS);
    }

    public QScreeningSeat(Path<? extends ScreeningSeat> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QScreeningSeat(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QScreeningSeat(PathMetadata metadata, PathInits inits) {
        this(ScreeningSeat.class, metadata, inits);
    }

    public QScreeningSeat(Class<? extends ScreeningSeat> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.screening = inits.isInitialized("screening") ? new QScreening(forProperty("screening"), inits.get("screening")) : null;
        this.seat = inits.isInitialized("seat") ? new QSeat(forProperty("seat"), inits.get("seat")) : null;
    }

}

