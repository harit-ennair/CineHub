package org.example.cinehub.service;

import org.example.cinehub.model.Director;
import java.util.List;

public interface DirectorService {
    Director saveDirector(Director director);
    Director updateDirector(Director director);
    void deleteDirector(Long id);
    Director getDirectorById(Long id);
    List<Director> getAllDirectors();
}
