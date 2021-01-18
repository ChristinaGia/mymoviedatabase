package de.dhbw.ravensburg.wp.mymoviedatabase.service;

import java.util.List;

public interface AwardService {
    void addAwardAcademy(String awardAcademy);
    void removeMovieTitle(String movieTitle);
    List<String> getMovieTitles(String subString);
    List<String> getCastOfMovie(String movieTitle);
}
