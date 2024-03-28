package com.ayufi.onlinefoodordering.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Food food;

    // quantity tells how much quantiity.Like 1 pizza,2 pizza or etc?
    private int quantity;

    private Long totalPrice;

    private List<String> ingredients;

}
