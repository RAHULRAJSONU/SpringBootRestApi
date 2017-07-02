package org.restapi.app.controller;

import java.util.List;

import org.restapi.app.dto.Course;
import org.restapi.app.dto.Topic;
import org.restapi.app.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService CourseService;
	
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllTopic(@PathVariable int topicId){		
		return CourseService.getAllCourse(topicId);
	}
	
	@RequestMapping("/topics/{topicId}/courses/{courseId}")
	public Course getTopicById(@PathVariable int courseId){
		return CourseService.getCourseById(courseId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable int topicId){
		course.setTopic(new Topic(topicId, "", ""));
		CourseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{courseId}")
	public void updateCourse(@RequestBody Course course, @PathVariable int topicId, @PathVariable int courseId){
		course.setTopic(new Topic(topicId, "", ""));
		CourseService.updateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicId}/courses/{courseId}")
	public void deleteCourse(@PathVariable int courseId){
		CourseService.deleteCourse(courseId);
	}
}
