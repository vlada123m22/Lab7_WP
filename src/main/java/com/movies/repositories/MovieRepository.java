package com.movies.repositories;

import com.movies.entities.Movie;
import com.movies.entities.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
    @Query(value = "SELECT m FROM  Movie m")
    List<Movie> getAllProducts(Pageable pageable);
}
