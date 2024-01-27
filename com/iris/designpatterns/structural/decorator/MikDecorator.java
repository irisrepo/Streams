package com.iris.designpatterns.structural.decorator;

public class MikDecorator extends CoffeeDecorator{
    public MikDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"and Milk";
    }
}
