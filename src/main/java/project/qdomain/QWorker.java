package project.qdomain;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.*;
import project.domain.MovieWorker;
import project.domain.Worker;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QWorker is a Querydsl query type for Worker
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWorker extends EntityPathBase<Worker> {

    private static final long serialVersionUID = -1688563213L;

    public static final QWorker worker = new QWorker("worker");

    public final NumberPath<Long> day = createNumber("day", Long.class);

    public final NumberPath<Long> month = createNumber("month", Long.class);

    public final ListPath<MovieWorker, QMovieWorker> movieWorkers = this.<MovieWorker, QMovieWorker>createList("movieWorkers", MovieWorker.class, QMovieWorker.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final NumberPath<Long> workerId = createNumber("workerId", Long.class);

    public final NumberPath<Long> year = createNumber("year", Long.class);

    public QWorker(String variable) {
        super(Worker.class, forVariable(variable));
    }

    public QWorker(Path<? extends Worker> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWorker(PathMetadata metadata) {
        super(Worker.class, metadata);
    }

}

