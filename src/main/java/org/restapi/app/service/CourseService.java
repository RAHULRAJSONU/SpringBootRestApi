package org.restapi.app.service;

import java.util.ArrayList;
import java.util.List;

import org.restapi.app.dto.Course;
import org.restapi.app.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository CourseRepository;	
	
	public List<Course> getAllCourse(int topicId){
		List<Course> courseList=new ArrayList<>(); 
		CourseRepository.findByTopicId(topicId).forEach(courseList::add);		
		return courseList;
	}
	
	public Course getCourseById(int id){
		return CourseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		CourseRepository.save(course);
	}

	public void updateCourse(Course course) {
		CourseRepository.save(course);
	}

	public void deleteCourse(int id) {
		CourseRepository.delete(id);;
	}
}
