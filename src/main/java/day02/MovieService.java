package day02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Movie> getMoviesByActor(String actor) {
        return movies.stream()
                .filter(movie -> movie.getCast().
                        stream().anyMatch(s -> s.contains(actor)))
                .collect(Collectors.toList());
        //movies.stream().filter(m -> m.getCast().contains(actor)).toList();
    }

    public long getLongestRunTime() {
        return movies.stream()
                .map(m -> m.getLength())
                .max(Integer::compare)
                .get();
        // movies.stream().mapToInt(m -> m.getLength()).max().orElseThrow(()-> new IllegalStateException("no movies"));
    }
}
