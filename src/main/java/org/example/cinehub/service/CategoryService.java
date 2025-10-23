package org.example.cinehub.service;

import org.example.cinehub.model.Category;
import java.util.List;

public interface CategoryService {
    Category saveCategory(Category category);
    Category updateCategory(Category category);
    void deleteCategory(Long id);
    Category getCategoryById(Long id);
    List<Category> getAllCategories();
}
