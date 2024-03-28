package com.ayufi.onlinefoodordering.model;


import com.ayufi.onlinefoodordering.dto.RestaurantDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data                                         // Helpful for getters and setters,Now we don't need to write getters/setters
@NoArgsConstructor                            // This is possible because of lombok
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;


    // We have created USER_ROLE enumeration
    private USER_ROLE role=USER_ROLE.ROLE_CUSTOMER;    // means three type of people can login i.e customer,owner,admin

    // This is list of orders made by customer
    @JsonIgnore       // If we got the user,then we don't need order, we can fetch them with separate api
    @OneToMany (cascade = CascadeType.ALL,mappedBy = "customer")       // User has one to many realtions with order
    private List<Order> orders=new ArrayList<>();

    // Here user can store his/her favorite restraunt
    @ElementCollection
    private List<RestaurantDto> favorites=new ArrayList<>();

    // address of user.Because one user can have many address. CascadeType.ALL shows that if user is deleted then
    // delete it's all addresses as well
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Address> addresses=new ArrayList<>();

}
