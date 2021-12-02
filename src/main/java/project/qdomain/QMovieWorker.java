package project.qdomain;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.EnumPath;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import project.domain.MovieWorker;
import project.domain.RoleType;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QMovieWorker is a Querydsl query type for MovieWorker
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMovieWorker extends EntityPathBase<MovieWorker> {

    private static final long serialVersionUID = 48291193L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMovieWorker movieWorker = new QMovieWorker("movieWorker");

    public final QMovie movie;

    public final NumberPath<Long> movieWorkerId = createNumber("movieWorkerId", Long.class);

    public final EnumPath<RoleType> roleType = createEnum("roleType", RoleType.class);

    public final QWorker worker;

    public QMovieWorker(String variable) {
        this(MovieWorker.class, forVariable(variable), INITS);
    }

    public QMovieWorker(Path<? extends MovieWorker> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMovieWorker(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMovieWorker(PathMetadata metadata, PathInits inits) {
        this(MovieWorker.class, metadata, inits);
    }

    public QMovieWorker(Class<? extends MovieWorker> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.movie = inits.isInitialized("movie") ? new QMovie(forProperty("movie")) : null;
        this.worker = inits.isInitialized("worker") ? new QWorker(forProperty("worker")) : null;
    }

}

