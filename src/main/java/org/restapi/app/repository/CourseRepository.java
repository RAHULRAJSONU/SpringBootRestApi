package org.restapi.app.repository;

import java.util.List;

import org.restapi.app.dto.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
	public List<Course> findByTopicId(int topicId);
}
