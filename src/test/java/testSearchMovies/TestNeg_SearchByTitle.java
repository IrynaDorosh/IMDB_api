package testSearchMovies;

import com.dorosh.omdbtest.TestData.TData;
import com.dorosh.omdbtest.controllers.MovieController;
import com.dorosh.omdbtest.models.Movie;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNeg_SearchByTitle {

    private MovieController movieController;

    @Before
    public void init() {
        movieController = new MovieController();
    }

    @Test
    public void searchWithIncorrectYear() {
        Movie movie = movieController.getMovieByTitleAndYear(TData.FULL_CORRECT_FILMNAME, TData.INCORRECT_YEAR);
        Assert.assertThat(movie.getResponse(), Matchers.equalTo("False"));
    }

    @Test
    public void searchByYearOnly() {
        Movie movie = movieController.getMovieByTitleAndYear("", TData.CORRECT_YEAR);
        Assert.assertThat(movie.getResponse(), Matchers.equalTo("False"));
    }

    @Test
    public void searchByFiguresInsteadOfName() {
        Movie movie = movieController.getMovieByTitle(TData.FIGURES_INSTEAD_NAME);
        Assert.assertThat(movie.getResponse(), Matchers.equalTo("False"));
    }


}
