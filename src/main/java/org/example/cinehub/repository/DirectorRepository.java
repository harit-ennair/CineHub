package org.example.cinehub.repository;

import org.example.cinehub.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {

    // Recherche par nom ou prénom
    Director findByFirstNameAndLastName(String firstName, String lastName);

}
