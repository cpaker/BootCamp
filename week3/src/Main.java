import business.CategoryManager;
import business.CourseManager;
import core.logging.DBLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import core.logging.SmsLogger;
import dataAccess.category.HibernateCategoryDao;
import dataAccess.course.JdbcCourseDao;
import entities.Category;
import entities.Course;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DBLogger(),new SmsLogger(),new MailLogger()};

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),  Arrays.asList(loggers));
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),Arrays.asList(loggers));
        Course java1 = new Course("Yazılım Geliştirici - JAVA", 0, "2022");
        Course java2 = new Course("Sıfırdan C#", 0, "2020");

        courseManager.add(java1);
      //  courseManager.add(java2);
       // courseManager.getCourses();

        Category c1 = new Category("Programlama");
        categoryManager.add(c1);





    }
}
