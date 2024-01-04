package com.restapidemo.courseApp.services;

import com.restapidemo.courseApp.dao.CourseDao;
import com.restapidemo.courseApp.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    CourseDao courseDao;
    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        return courseDao.findById(courseId).get();
    }

    @Override
    public Course addCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public void deleteCourse(long courseId) {
        Course c = courseDao.getReferenceById(courseId);
        courseDao.delete(c);
    }
}
