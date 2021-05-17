package ru.job4j.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.models.Models;


public interface ModelDao extends CrudRepository<Models, Integer> {

}
