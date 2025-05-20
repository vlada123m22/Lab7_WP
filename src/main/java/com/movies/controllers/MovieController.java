package com.movies.controllers;

import com.movies.entities.Movie;
import com.movies.services.MovieService;
import com.movies.services.UserService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController{
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping("/movies/{pageNr}/{elementsPerPage}")
    List<Movie> getProducts(@PathVariable Integer pageNr, @PathVariable Integer elementsPerPage){

        Pageable pageable = PageRequest.of(pageNr,elementsPerPage);
        return movieService.getAllProducts(pageable);
    }
}


