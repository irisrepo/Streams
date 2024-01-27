package com.iris.designpatterns.structural.decorator;

public class DecoratorPatternClient {
    public static void main(String[] args) {
        Coffee latte = new Espresso();

        latte = new SugarDecorator(latte);
        latte= new MikDecorator(latte);
        System.out.println(latte.getDescription());
    }

}
