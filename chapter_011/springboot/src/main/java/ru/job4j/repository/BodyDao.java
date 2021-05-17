package ru.job4j.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.models.Body;


public interface BodyDao extends CrudRepository<Body, Integer> {

}
