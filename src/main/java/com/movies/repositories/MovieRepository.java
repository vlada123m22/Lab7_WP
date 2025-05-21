package com.movies.repositories;

import com.movies.entities.Movie;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
    @Query(value = "SELECT m FROM  Movie m")
    List<Movie> getAllMovies(Pageable pageable);
}
