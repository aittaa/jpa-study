package project.qdomain;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.*;
import project.domain.GenreType;
import project.domain.Movie;
import project.domain.MovieWorker;
import project.domain.Screening;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QMovie is a Querydsl query type for Movie
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMovie extends EntityPathBase<Movie> {

    private static final long serialVersionUID = -340795877L;

    public static final QMovie movie = new QMovie("movie");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> creationDate = _super.creationDate;

    public final EnumPath<GenreType> genre = createEnum("genre", GenreType.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modificationDate = _super.modificationDate;

    public final NumberPath<Long> movieId = createNumber("movieId", Long.class);

    public final ListPath<MovieWorker, QMovieWorker> movieWorkers = this.<MovieWorker, QMovieWorker>createList("movieWorkers", MovieWorker.class, QMovieWorker.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final DatePath<java.time.LocalDate> openingDate = createDate("openingDate", java.time.LocalDate.class);

    public final NumberPath<Long> runningTime = createNumber("runningTime", Long.class);

    public final ListPath<Screening, QScreening> screenings = this.<Screening, QScreening>createList("screenings", Screening.class, QScreening.class, PathInits.DIRECT2);

    public QMovie(String variable) {
        super(Movie.class, forVariable(variable));
    }

    public QMovie(Path<? extends Movie> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMovie(PathMetadata metadata) {
        super(Movie.class, metadata);
    }

}

