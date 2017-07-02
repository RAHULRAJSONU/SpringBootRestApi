package org.restapi.app.service;

import java.util.ArrayList;
import java.util.List;

import org.restapi.app.dto.Topic;
import org.restapi.app.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;	
	
	public List<Topic> getAllTopic(){
		List<Topic> topicList=new ArrayList<>(); 
		topicRepository.findAll().forEach(topicList::add);
		return topicList;
	}
	
	public Topic getTopicById(int id){
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(int id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTop(int id) {
		topicRepository.delete(id);;
	}
}
