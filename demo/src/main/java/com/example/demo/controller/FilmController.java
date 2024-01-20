package com.example.demo.controller;

import com.example.demo.domain.Film;
import com.example.demo.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class FilmController {

@Autowired
    FilmService filmService;

    @GetMapping("/films")
    public List<Film> getAllFilm() {
        return filmService.getFilms();
    }
    @GetMapping("/fav/films")
    public List<Film> getFavFilm() {
        return filmService.getFavFilms();
    }
    @GetMapping("/{id}")
    public Optional<Film> getFilmById(@PathVariable Long id) {
        return filmService.getFilm(id);
    }

    @PostMapping("/add")
    public Boolean addFilm(@RequestBody Film film)  {
        try {
            filmService.addFilm(film);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @PostMapping("/update")
    public boolean updateFilm(@RequestBody Film film) {
        try {
            filmService.addFilm(film);
            return true;
        } catch (Exception e) {
            return false;
        }

    }



    @DeleteMapping("/{id}")
    public boolean deleteFilm(@PathVariable Long id) {

        try {
            filmService.deleteFilm(id);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
