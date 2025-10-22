package org.example.cinehub.repository;

import org.example.cinehub.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

    // Recherche par titre (partiel, insensible à la casse)
    List<Film> findByTitleContainingIgnoreCase(String title);

    // Recherche par année de sortie
    List<Film> findByReleaseYear(Integer releaseYear);

    // Recherche par catégorie (nom)
    List<Film> findByCategory_Name(String categoryName);

    // Recherche par réalisateur (id)
    List<Film> findByDirector_IdDirector(Long idDirector);
}
