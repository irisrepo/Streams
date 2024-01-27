package com.iris.designpatterns.creational.factory;

public class DogFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
