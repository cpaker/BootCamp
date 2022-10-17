package business;

import core.logging.Logger;
import dataAccess.category.CategoryDao;
import entities.Category;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Logger> loggers;
    ArrayList<Category> categories = new ArrayList<>();

    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) throws Exception {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

        public void add(Category category) throws Exception {

            for (Category c1 : categories) {
                if (c1.getName().equals(category.getName())) {
                    throw new Exception("Kategori İsmi Aynı Olamaz");
            }
        }
            System.out.println("Yeni Kategori Eklendi : " + category.getName());

            categories.add(category);
            categoryDao.add(category);
            for (Logger logger : loggers) {
                logger.log(category.getName());
    }
}}






