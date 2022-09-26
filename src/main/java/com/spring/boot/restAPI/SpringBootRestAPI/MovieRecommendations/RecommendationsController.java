package com.spring.boot.restAPI.SpringBootRestAPI.MovieRecommendations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController  // try to tell spring what this classes means here
public class RecommendationsController
{
    @GetMapping("/movies")
    public List<Movie> getAllMovies()
    {
        return Arrays.asList(new Movie(1,"Harry Potter", 9.9),
                            new Movie(2,"KGF 2", 5.6),
                            new Movie(3,"KGF 1", 5.9),
                            new Movie(5,"Vikram",6.9),
                            new Movie(5,"RRR",8.9),
                            new Movie(5,"OMG",8.9)
        );
    }
}
