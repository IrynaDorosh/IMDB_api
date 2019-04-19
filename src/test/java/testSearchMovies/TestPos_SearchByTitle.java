package testSearchMovies;

import com.dorosh.omdbtest.TestData.TData;
import com.dorosh.omdbtest.controllers.MovieController;
import com.dorosh.omdbtest.models.Movie;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPos_SearchByTitle {

    private MovieController movieController;

    @Before
    public void init() {
        movieController = new MovieController();
    }

    @Test
    public void searchByCorrectTitleName() {
        Movie movie = movieController.getMovieByTitle(TData.FULL_CORRECT_FILMNAME);
        Assert.assertThat(movie.getResponse(), Matchers.equalTo("True"));
        Assert.assertThat(movie.getTitle(), Matchers.equalTo(TData.FULL_CORRECT_FILMNAME));
    }

    @Test
    public void searchByCorrectTitleNameAndYear() {
        Movie movie = movieController.getMovieByTitleAndYear(TData.FULL_CORRECT_FILMNAME, TData.CORRECT_YEAR);
        Assert.assertThat(movie.getResponse(), Matchers.equalTo("True"));
        Assert.assertThat(movie.getTitle(), Matchers.equalTo(TData.FULL_CORRECT_FILMNAME));
        Assert.assertThat(Integer.parseInt(movie.getYear()), Matchers.equalTo(TData.CORRECT_YEAR));
    }

    @Test
    public void comparePlotLength() {
        Movie movieShort = movieController.getMovieByAllParams(TData.FULL_CORRECT_FILMNAME, TData.CORRECT_YEAR, "short", ContentType.JSON);
        Assert.assertThat(movieShort.getResponse(), Matchers.equalTo("True"));

        Movie movieFull = movieController.getMovieByAllParams(TData.FULL_CORRECT_FILMNAME, TData.CORRECT_YEAR, "full", ContentType.JSON);
        Assert.assertThat(movieFull.getResponse(), Matchers.equalTo("True"));

        Assert.assertEquals(movieShort.getImdbID(), movieFull.getImdbID());
        Assert.assertTrue(movieShort.getPlot().length() < movieFull.getPlot().length());
    }


}
