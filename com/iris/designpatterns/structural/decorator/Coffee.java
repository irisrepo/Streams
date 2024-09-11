package com.iris.designpatterns.structural.decorator;

public abstract class Coffee {
    private String type;
    private boolean sugar;
    private boolean milk;

    public Coffee(String type, boolean sugar, boolean milk) {
        this.type = type;
        this.sugar = sugar;
        this.milk = milk;
    }

    public Coffee() {

    }

    public String getDescription() {
        String description =type ;
        if(sugar) {
            description=" "+"with sugar";
        }
        if(milk) {
            description=" "+"with milk";
        }
        return description;
    }
}
