package project.qdomain;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.ListPath;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;
import project.domain.Director;
import project.domain.MovieWorker;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QDirector is a Querydsl query type for Director
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDirector extends EntityPathBase<Director> {

    private static final long serialVersionUID = 999082177L;

    public static final QDirector director = new QDirector("director");

    public final QWorker _super = new QWorker(this);

    public final StringPath birthPlace = createString("birthPlace");

    //inherited
    public final NumberPath<Long> day = _super.day;

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

    public QDirector(String variable) {
        super(Director.class, forVariable(variable));
    }

    public QDirector(Path<? extends Director> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDirector(PathMetadata metadata) {
        super(Director.class, metadata);
    }

}

