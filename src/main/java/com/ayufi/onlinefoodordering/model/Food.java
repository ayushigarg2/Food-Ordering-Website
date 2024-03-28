package com.ayufi.onlinefoodordering.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String food;                                           // name of food. Eg: pizza , burger

    private String description;

    private Long price;                                           // price of food

    @ManyToOne                                                   /// Many food items can be contained inside under 1 category
    private Category foodCategory;

    // images  of food
    @Column(length = 1000)
    @ElementCollection
    private List<String> images;

    private boolean available;

    // which restraunt provides this food
    @ManyToOne                                     // many food is available in one restaurant
    private Restaurant restaurant;

    private boolean isVegetarian;
    private boolean isSeasonal;

    @ManyToMany
    private List<IngredientsItem> ingredients=new ArrayList<>();

    private Date creationDate;
}
