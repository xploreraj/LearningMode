package com.yodlee.zooinventory;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by rbiswas on 7/3/2014.
 */
public class FoodRecipe {
    public String name;
    public List<String> ingredient = new ArrayList<String>();

    @Override
    public String toString() {
        return name + ": " + ingredient.toString();
    }
}
