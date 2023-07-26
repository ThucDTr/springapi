package com.example.thewebmovie.repo;

import com.example.thewebmovie.entity.MovieGenres;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieGenresRepository extends JpaRepository<MovieGenres, Integer> {
    List<MovieGenres> findByMovie(int id);
}
