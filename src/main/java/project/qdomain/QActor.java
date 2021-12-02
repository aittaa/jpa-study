package project.qdomain;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.ListPath;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;
import project.domain.Actor;
import project.domain.MovieWorker;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QActor is a Querydsl query type for Actor
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QActor extends EntityPathBase<Actor> {

    private static final long serialVersionUID = -352237344L;

    public static final QActor actor = new QActor("actor");

    public final QWorker _super = new QWorker(this);

    //inherited
    public final NumberPath<Long> day = _super.day;

    public final NumberPath<Long> height = createNumber("height", Long.class);

    public final StringPath instagram = createString("instagram");

    //inherited
    public final NumberPath<Long> month = _super.month;

    //inherited
    public final ListPath<MovieWorker, QMovieWorker> movieWorkers = _super.movieWorkers;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final NumberPath<Long> workerId = _super.workerId;

    //inherited
    public final NumberPath<Long> year = _super.year;

    public QActor(String variable) {
        super(Actor.class, forVariable(variable));
    }

    public QActor(Path<? extends Actor> path) {
        super(path.getType(), path.getMetadata());
    }

    public QActor(PathMetadata metadata) {
        super(Actor.class, metadata);
    }

}

