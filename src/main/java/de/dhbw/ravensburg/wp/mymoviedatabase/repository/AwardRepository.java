package de.dhbw.ravensburg.wp.mymoviedatabase.repository;

import de.dhbw.ravensburg.wp.mymoviedatabase.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AwardRepository extends JpaRepository<Movie, Long> {

        @Query("SELECT m FROM Movie m WHERE m.title like %:param1%")
        List<Movie> findAllMoviesBelongingToSeries(
                @Param("param1") String series);

        //b)
        List<Movie> findByAwardAcademy(String academy);

}
