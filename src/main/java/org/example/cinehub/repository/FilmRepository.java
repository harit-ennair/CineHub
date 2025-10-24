package org.example.cinehub.repository;

import org.example.cinehub.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

        @Repository
        public interface FilmRepository extends JpaRepository<Film, Long> {

            // SELE * FROM films WHERE title LIKE %:title%
            List<Film> findByTitleContainingIgnoreCase(String title);

            // SELE * FROM films WHERE release_year = :releaseYear
            List<Film> findByReleaseYear(Integer releaseYear);

            // SELE * FROM films WHERE category.name = :categoryName
            List<Film> findByCategory_Name(String categoryName);

            // SELE * FROM films WHERE director.id_director = :idDirector
            List<Film> findByDirector_IdDirector(Long idDirector);
        }





