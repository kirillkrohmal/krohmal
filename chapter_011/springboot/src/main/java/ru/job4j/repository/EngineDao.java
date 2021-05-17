package ru.job4j.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.models.Body;
import ru.job4j.models.Engine;


public interface EngineDao extends CrudRepository<Engine, Integer> {

}
