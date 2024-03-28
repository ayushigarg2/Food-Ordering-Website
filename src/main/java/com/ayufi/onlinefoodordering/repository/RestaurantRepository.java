package com.ayufi.onlinefoodordering.repository;

import com.ayufi.onlinefoodordering.model.Restaurant;
import org.antlr.v4.runtime.atn.SemanticContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
    @Query("SELECT r from Restaurant r where lower(r.name) LIKE lower(concat('%',:query,'%')) or lower(r.cusineType)" +
            " like lower(concat('%',:query,'%')) ")
    List<Restaurant> findBySearchQuery(String query);
    Restaurant findByOwnerId(Long userId);




}
