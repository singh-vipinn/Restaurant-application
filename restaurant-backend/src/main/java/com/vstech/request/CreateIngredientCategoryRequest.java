package com.vstech.request;

import lombok.Data;

@Data
public class CreateIngredientCategoryRequest {

    private Long restaurantId;
    private String name;
}
