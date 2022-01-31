package day02;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private int length;
    private List<String> cast = new ArrayList<>();

    public Movie(String title, int length, List<String> cast) {
        this.title = title;
        this.length = length;
        this.cast = cast;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public List<String> getCast() {
        return cast;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", length=" + length +
                ", cast=" + cast +
                '}';
    }
}
