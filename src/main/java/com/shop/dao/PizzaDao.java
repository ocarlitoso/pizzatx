package com.shop.dao;

import com.shop.model.Pizza;
import com.shop.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class PizzaDao {

    //Initialize with some dummy values.
    private static List<Pizza> pizzas;

    {
        pizzas = new ArrayList<Pizza>();
        pizzas.add(new Pizza(new Long(1), "PizzaOne", "Hawaiian", "Roquefort", "Espagnole Sauce", "Thin", "Personal", "Mix flour", 1));
        pizzas.add(new Pizza(new Long(2), "PizzaTwo", "Brazilian", "Camembert", "Hollandaise Sauce", "Thick", "Small", "Refined flour", 2));
        pizzas.add(new Pizza(new Long(3), "PizzaThree", "Veggie", "Cotija", "Classic Tomate Sauce", "Filled", "Medium", "pepperoni", 3));
        pizzas.add(new Pizza(new Long(4), "PizzaFour", "Hawaiian", "Roquefort", "Veloute Sauce", "Thin", "Large", "multi-grain", 1));
        pizzas.add(new Pizza(new Long(5), "PizzaFive", "Brazilian", "Camembert", "Espagnole Sauce", "Thick", "Small", "oregano", 2));

    }

    public List list() {
        return pizzas;
    }

    public Product getProduct(Integer orderId) {
        Product product = new Product();
        product.setOrderNumber(orderId);
        product.setPrice(10);
        product.setPizzas(getListPizzas());

        return product;
    }

    private List<Pizza> getListPizzas() {
        Random generator = new Random();
        int index = generator.nextInt(pizzas.size());
        return Arrays.asList(pizzas.get(index));
    }
}
