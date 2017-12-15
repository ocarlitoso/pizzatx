package com.shop.model;

public class Pizza extends Product {

    private Long id;
    private String name;
    private String typePizza;
    private String typeCheese;
    private String typeSauce;
    private String typeCrust;
    private String size;
    private String ingredient;
    private Integer preparationTime;

    public Pizza(Long id, String name, String typePizza, String typeCheese, String typeSauce, String typeCrust,
                 String size, String ingredient, Integer preparationTime) {

        this.id = id;
        this.name = name;
        this.typePizza = typePizza;
        this.typeCheese = typeCheese;
        this.typeSauce = typeSauce;
        this.typeCrust = typeCrust;
        this.size = size;
        this.ingredient = ingredient;
        this.preparationTime = preparationTime;
    }

    public Pizza() {
    }


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypePizza() {
        return typePizza;
    }

    public void setTypePizza(String typePizza) {
        this.typePizza = typePizza;
    }

    public String getTypeCheese() {
        return typeCheese;
    }

    public void setTypeCheese(String typeCheese) {
        this.typeCheese = typeCheese;
    }

    public String getTypeSauce() {
        return typeSauce;
    }

    public void setTypeSauce(String typeSauce) {
        this.typeSauce = typeSauce;
    }

    public String getTypeCrust() {
        return typeCrust;
    }

    public void setTypeCrust(String typeCrust) {
        this.typeCrust = typeCrust;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public Integer getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(Integer preparationTime) {
        this.preparationTime = preparationTime;
    }
}
