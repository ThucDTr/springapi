package com.example.thewebmovie.repo;

import com.example.thewebmovie.entity.Genres;
import com.example.thewebmovie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenresRepository extends JpaRepository<Genres,Integer> {

}
