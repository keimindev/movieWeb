package dev.min.movies;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies")
public class Movie {
    private Object id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> generes;
    private List<String> backdrops;


}
