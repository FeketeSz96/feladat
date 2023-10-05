package hu.feladat.service;

import hu.feladat.dao.entity.Category;

import java.util.List;

public interface CategoryService {

    Category addCategory(Category category);
    Category getCategory(Long categoryId);
    List<Category> getAllCategories();
    Category updateCategory(Long categoryId, Category newCategory);
    void deleteCategory(Long categoryId);
}
