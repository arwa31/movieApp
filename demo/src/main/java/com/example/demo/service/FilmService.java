package com.example.demo.service;

import com.example.demo.domain.Film;

import java.util.List;
import java.util.Optional;

public interface FilmService {
    List<Film> getFilms();

    List<Film> getFavFilms();

    void addFilm(Film f);

    void updateFilm(Film f);

    Optional<Film> getFilm(Long id);

    void deleteFilm(Long id) ;
}
