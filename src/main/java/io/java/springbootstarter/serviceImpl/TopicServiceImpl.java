package io.java.springbootstarter.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.java.springbootstarter.DAO.Topic;
import io.java.springbootstarter.repository.TopicRepository;
import io.java.springbootstarter.service.TopicService;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id, Topic topic) {
		topicRepository.delete(id);
	}

}
