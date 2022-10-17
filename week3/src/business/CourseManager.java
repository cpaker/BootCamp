package business;

import core.logging.Logger;
import dataAccess.course.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;


public class CourseManager {
    private CourseDao courseDao;
    private List<Logger> loggers;
    ArrayList<Course> courses = new ArrayList<>();

    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        if (course.getPrice() < 0) {
            throw new Exception("Ürün fiyatı 0'dan küçük olamaz");
        }

        for (Course coursess : courses) {
            if(course.getCourseName().equals(coursess.getCourseName()) ) {
                throw new Exception("Kurs İsmi Aynı Olamaz");

            }
        }

        System.out.println("Yeni Kurs Eklendi");
        courses.add(course);
        courseDao.add(course);
        for (Logger logger : loggers) {
            logger.log(course.getCourseName());

        }

    }

    public void getCourses() {
        for (Course courses : courses) {
            System.out.println(courses.getCourseName());
        }

    }



}