package servlet;


import com.pes.movies.MovieEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repo.MovieRepo;
import repo.MovieRepoImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(urlPatterns="/save")

public class MobileSaveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        MovieEntity entity = new MovieEntity();

        entity.setMovieName(req.getParameter("movieName"));
        entity.setMovieHero(req.getParameter("heroName"));
        entity.setMovieHeroin(req.getParameter("heroinName"));
        entity.setLanguage(req.getParameter("Language"));
        entity.setReleaseDate(LocalDate.parse(req.getParameter("rleaseDate")));

        MovieRepo repo=new MovieRepoImpl();
        repo.saveMovie(entity);

        PrintWriter respWriter=resp.getWriter();
        respWriter.print(entity.getMovieName() +": Movie saved ..!");


    }
}
