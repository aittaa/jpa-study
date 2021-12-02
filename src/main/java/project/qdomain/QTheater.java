package project.qdomain;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.*;
import project.domain.Screening;
import project.domain.Seat;
import project.domain.Theater;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QTheater is a Querydsl query type for Theater
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTheater extends EntityPathBase<Theater> {

    private static final long serialVersionUID = 613910588L;

    public static final QTheater theater = new QTheater("theater");

    public final NumberPath<Long> floor = createNumber("floor", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<Screening, QScreening> screenings = this.<Screening, QScreening>createList("screenings", Screening.class, QScreening.class, PathInits.DIRECT2);

    public final ListPath<Seat, QSeat> seats = this.<Seat, QSeat>createList("seats", Seat.class, QSeat.class, PathInits.DIRECT2);

    public final NumberPath<Long> theaterId = createNumber("theaterId", Long.class);

    public QTheater(String variable) {
        super(Theater.class, forVariable(variable));
    }

    public QTheater(Path<? extends Theater> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTheater(PathMetadata metadata) {
        super(Theater.class, metadata);
    }

}

