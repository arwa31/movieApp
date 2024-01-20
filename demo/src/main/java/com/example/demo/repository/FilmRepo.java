package com.example.demo.repository;

import com.example.demo.domain.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface FilmRepo extends JpaRepository<Film,Long> {
    ArrayList<Film> findByFavorie(int favorite);
}