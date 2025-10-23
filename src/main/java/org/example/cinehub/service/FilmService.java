package org.example.cinehub.service;

import org.example.cinehub.model.Film;
import java.util.List;

public interface FilmService {

    Film saveFilm(Film film);
    Film updateFilm(Film film);
    void deleteFilm(Long id);
    Film getFilmById(Long id);
    List<Film> getAllFilms();
}
