package repo;

import com.pes.movies.MovieEntity;

public interface MovieRepo {
    void saveMovie(MovieEntity entity);
    void readMovies();


    }


