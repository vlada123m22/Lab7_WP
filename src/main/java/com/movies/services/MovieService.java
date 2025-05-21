package com.movies.services;

import com.movies.entities.Movie;
import com.movies.repositories.MovieRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllProducts(Pageable pageable) {

        return movieRepository.getAllMovies(pageable);
    }
}
