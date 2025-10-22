package org.example.cinehub.repository;

import org.example.cinehub.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    // Recherche par nom de catégorie
    Category findByName(String name);

}
