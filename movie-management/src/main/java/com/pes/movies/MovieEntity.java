package com.pes.movies;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Setter
@Getter

public class MovieEntity {
    // movie_id,movie_name,hero_Name,heroin_Name,language,release_date

    private int movieId;
    private String movieName;
    private String movieHero;
    private String movieHeroin;
    private String language;
    private LocalDate releaseDate;
}
