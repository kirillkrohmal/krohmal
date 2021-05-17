package ru.job4j.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.job4j.models.Orders;

@Repository
public interface Dao extends CrudRepository<Orders, Integer>{

}
