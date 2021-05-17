package ru.job4j.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.models.Orders;


public interface Dao extends CrudRepository<Orders, Integer>{

}
