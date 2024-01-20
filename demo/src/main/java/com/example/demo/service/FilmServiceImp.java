package com.example.demo.service;

import com.example.demo.domain.Film;
import com.example.demo.repository.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImp implements FilmService {

    @Autowired
    FilmRepo filmRepo;

     @Override
    public List<Film> getFilms(){
      return   filmRepo.findAll();
     }

    @Override
    public List<Film> getFavFilms(){
        return   filmRepo.findByFavorie(1);
    }
    @Override
     public void addFilm(Film f){
         filmRepo.save(f);
     }
    @Override
    public void updateFilm(Film f){
        filmRepo.save(f);
    }

    @Override
    public Optional<Film> getFilm(Long id) {
        return filmRepo.findById(id);
    }

    @Override
    public void deleteFilm(Long id){
      filmRepo.deleteById(id);
    }





}
