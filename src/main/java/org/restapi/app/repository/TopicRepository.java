package org.restapi.app.repository;

import org.restapi.app.dto.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Integer> {

}
