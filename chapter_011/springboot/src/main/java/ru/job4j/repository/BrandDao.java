package ru.job4j.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.job4j.models.Brand;

public interface BrandDao extends CrudRepository<Brand, Integer> {
}
