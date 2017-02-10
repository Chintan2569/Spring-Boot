package io.java.springbootstarter.repository;

import org.springframework.data.repository.CrudRepository;

import io.java.springbootstarter.DAO.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
