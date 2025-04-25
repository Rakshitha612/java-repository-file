package repo;
import com.pes.movies.MovieEntity;
import repo.MovieRepo;

import java.sql.*;

public class MovieRepoImpl implements MovieRepo {
    @Override
    public void saveMovie(MovieEntity entity) {
        String url = "jdbc:mysql://localhost:3306/moviedata";
        String userName = "root";
        String psw = "rakshitha@ab06";
        // movie_id,movie_name,hero_Name,heroin_Name,language,release_date

        String query = "insert into movie_info(movie_name,hero_Name,heroin_Name,language,rlease_date)" + "values(?,?,?,?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, userName, psw);
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, entity.getMovieName());
            statement.setString(2, entity.getMovieHero());
            statement.setString(3, entity.getMovieHeroin());
            statement.setString(4, entity.getLanguage());
            statement.setDate(5, Date.valueOf(entity.getReleaseDate()));

            statement.execute();
            System.out.println(entity.getMovieName() + ":Data is saved");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

    }

    @Override
    public void readMovies() {
        String url = "jdbc:mysql://localhost:3306/moviedata";
        String userName = "root";
        String psw = "rakshitha@ab06";
        // movie_id,movie_name,hero_Name,heroin_Name,language,release_date

        String query = "select * from movie_info";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, userName, psw);
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                System.out.print(set.getInt("movie_Id") + " "
                        + set.getString("movie_name") + " " + set.getDate("rlease_date"));
           System.out.println(" ");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
