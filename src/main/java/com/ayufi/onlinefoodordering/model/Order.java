package com.ayufi.onlinefoodordering.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne                                      // means many order can have same user
    private User customer;

    // Now we will define from which restraunt user has made the order
    @JsonIgnore
    @ManyToOne                    // means many order can have same restraunt
    private Restaurant restaurant;

    private Long totalAmount;

    private String orderStatus;

    private Date createdAt;
    @ManyToOne                                          // many order can be delivered at same address
    private Address deliveryAddress;

    // Number of items ordered by user
    // One order can contain multiple items ordered by user
    @OneToMany
    private List<OrderItem> items=new ArrayList<>();

    // private Payment payment;
    private int totalItems;

    private int totalPrice;
}
