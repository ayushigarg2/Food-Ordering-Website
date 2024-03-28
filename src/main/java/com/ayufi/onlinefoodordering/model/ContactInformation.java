package com.ayufi.onlinefoodordering.model;


import lombok.Data;


@Data
public class ContactInformation {

    private String email;                                 // email of restaurant so that user can contact it
    private String mobile;                                // mobile number of restaurant
    private String twitter;                              // twitter page of restaurant
    private String instagram;                            // instagram page
}
