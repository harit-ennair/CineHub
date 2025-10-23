package org.example.cinehub.service;

import org.example.cinehub.model.Director;
import org.example.cinehub.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class DirectorServiceImpl implements DirectorService {

    private final DirectorRepository directorRepository;

    @Autowired
    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    @Override
    public Director saveDirector(Director director) {
        return directorRepository.save(director);
    }

    @Override
    public Director updateDirector(Director director) {
        return directorRepository.save(director);
    }

    @Override
    public void deleteDirector(Long id) {
        directorRepository.deleteById(id);
    }

    @Override
    public Director getDirectorById(Long id) {
        return directorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }
}
