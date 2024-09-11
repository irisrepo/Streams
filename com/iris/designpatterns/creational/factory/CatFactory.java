package com.iris.designpatterns.creational.factory;

public class CatFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
