package com.shop.model;


import java.util.List;

public class Product {

    private Long id;
    private String name;
    private Integer price;
    private List<Pizza> pizzas;
    private List<Spaghetti> spaghetties;
    private List<Lasagna> lasagnas;
    private List<Salad> salads;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Spaghetti> getSpaghetties() {
        return spaghetties;
    }

    public void setSpaghetties(List<Spaghetti> spaghetties) {
        this.spaghetties = spaghetties;
    }

    public List<Lasagna> getLasagnas() {
        return lasagnas;
    }

    public void setLasagnas(List<Lasagna> lasagnas) {
        this.lasagnas = lasagnas;
    }

    public List<Salad> getSalads() {
        return salads;
    }

    public void setSalads(List<Salad> salads) {
        this.salads = salads;
    }
}
