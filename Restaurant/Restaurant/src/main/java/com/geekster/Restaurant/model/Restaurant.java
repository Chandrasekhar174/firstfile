package com.geekster.Restaurant.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Restaurant {

    private Integer restaurantId;
    @NotBlank
    private String restaurantName;
    private String restaurantOwnerName;
    @Pattern(regexp = "\\d{10}")
    private String restaurantPh_Number;
    @NotBlank
    private String restaurantAddress;

    private String specialty;

    private Integer totalStaff;

}
