package com.pes.movies;

import repo.MovieRepo;
import repo.MovieRepoImpl;

import java.time.LocalDate;

public class MovieRunner {
    public static void main(String[] args){
        MovieEntity movieEntity=new MovieEntity();
        movieEntity.setMovieId(1);
        movieEntity.setMovieName("KGF 1");
        movieEntity.setMovieHero("yash");
        movieEntity.setMovieHeroin("radhika");
        movieEntity.setLanguage("kannada");
        movieEntity.setReleaseDate(LocalDate.of(2020,12,15));
        MovieRepo repo=new MovieRepoImpl();
        repo.saveMovie(movieEntity);
        repo.readMovies();

    }
}
