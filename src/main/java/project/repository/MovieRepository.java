package project.repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import project.EMFSingleton;
import project.domain.Movie;
import project.domain.RoleType;
import project.domain.User;
import project.qdomain.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class MovieRepository {
    EntityManagerFactory emf = EMFSingleton.getInstance();

    public void save(Movie movie) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            ////

            em.persist(movie);

            ////
            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            System.out.println("rollback");

        } finally {
            em.close();
        }
    }

    public Movie findOneWithID(Long movieID) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Movie movie = null;

        try {
            tx.begin();
            ////

            movie = em.find(Movie.class, movieID);

            ////

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            System.out.println("rollback");

        } finally {
            em.close();
        }

        return movie;
    }


    public List<Movie> movieSearch(String director, String actor, LocalDate openingDate) {

        EntityManager em = emf.createEntityManager();

        JPAQueryFactory queryFactory = new JPAQueryFactory(em);

        QMovieWorker qMovieWorker = new QMovieWorker("mw");

        QMovie qMovie = new QMovie("m");
        QWorker qWorker = new QWorker("w");


        BooleanBuilder builder = new BooleanBuilder();
        BooleanBuilder builder2 = new BooleanBuilder();

        if (director != null)
            builder.and(qWorker.name.eq(director).and(qMovieWorker.roleType.eq(RoleType.DIRECTOR)));

        if (actor != null)
            builder2.and(qWorker.name.eq(actor).and(qMovieWorker.roleType.eq(RoleType.LEAD).or(qMovieWorker.roleType.eq(RoleType.SUPPORTING))));

        if (openingDate != null)
            builder.and(qMovie.openingDate.eq(openingDate));


        List<Movie> movies = queryFactory.selectFrom(qMovie)
                .leftJoin(qMovie.movieWorkers, qMovieWorker)
                .leftJoin(qMovieWorker.worker, qWorker)
                .where(builder).distinct().where(builder2).fetch();


        return movies;
    }


    public List<Movie> findAllByPaging(int number) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        List<Movie> resultList = null;

        try {
            tx.begin();
            ////
            int startPage, endPage;
            final int PAGING_SIZE = 2;
            // 1 - 0, 2 - 2, 3 - 4, 4 - 6
            // 1 - 2, 2 - 4, 3 - 6, 4 - 8
            startPage = PAGING_SIZE * number - PAGING_SIZE;
            endPage = PAGING_SIZE * number;

//          TypedQuery<Movie> query = em.createQuery("SELECT distinct m FROM Movie m", Movie.class);
//          TypedQuery<Movie> query = em.createQuery("SELECT distinct m FROM Movie m left join MovieWorker mw left join mw.worker ", Movie.class);
//            TypedQuery<Movie> query = em.createQuery("SELECT distinct m FROM Movie m join fetch m.movieWorkers", Movie.class);
            //            TypedQuery<Movie> query = em.createQuery("SELECT distinct mw FROM MovieWorker mw join fetch mw.worker", Movie.class);

            TypedQuery<Movie> query = em.createQuery("SELECT distinct m FROM Movie m join fetch m.movieWorkers mw join fetch mw.worker", Movie.class);


            resultList = query.setFirstResult(startPage).setMaxResults(endPage).getResultList();


            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            System.out.println("rollback");

        } finally {
            em.close();
        }
        return resultList;
    }


}