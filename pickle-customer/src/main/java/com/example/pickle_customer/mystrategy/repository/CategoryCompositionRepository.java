package com.example.pickle_customer.mystrategy.repository;

import com.example.pickle_customer.mystrategy.entity.MyStrategy;
import com.example.pickle_customer.mystrategy.entity.MyStrategyCategoryComposition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryCompositionRepository extends JpaRepository<MyStrategyCategoryComposition, Integer> {

    List<MyStrategyCategoryComposition> findAllByMyStrategy(Optional<MyStrategy> myStrategy);

}
