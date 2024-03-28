package com.ayufi.onlinefoodordering.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.List;

@Data
@Embeddable
public class RestaurantDto {
    // name of the restraunt
    private String title;

    // images of the restraunt
    @Column(length = 1000)                        // reason being length of url can be large
    private List<String> images;

    // description of restraunt
    private String description;

    private Long id;



}
