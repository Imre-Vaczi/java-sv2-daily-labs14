package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void testAdd() {
        MovieService movieService = new MovieService();
        movieService.addMovie(new Movie("Pi", 98, Arrays.asList("xy", "hj")));
        movieService.addMovie(new Movie("Omen", 108, Arrays.asList("io", "uz")));

        assertEquals(2, movieService.getMovies().size());
    }

    @Test
    void testGetMoviesByActor() {
        MovieService movieService = new MovieService();
        Movie pi = new Movie("Pi", 98, Arrays.asList("xy", "hj"));
        Movie omen = new Movie("Omen", 108, Arrays.asList("uz"));
        movieService.addMovie(pi);
        movieService.addMovie(omen);

        assertEquals(Arrays.asList(omen), movieService.getMoviesByActor("uz"));
    }

    @Test
    void testGetLongestRunTime() {
        MovieService movieService = new MovieService();
        Movie pi = new Movie("Pi", 98, Arrays.asList("xy", "hj"));
        Movie omen = new Movie("Omen", 108, Arrays.asList("uz"));
        movieService.addMovie(pi);
        movieService.addMovie(omen);

        assertEquals(108, movieService.getLongestRunTime());
    }

}