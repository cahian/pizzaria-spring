package com.pizzariaproject.pizzaria.repository;

import com.pizzariaproject.pizzaria.entity.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepository extends CrudRepository<Pizza, Integer> {
}
