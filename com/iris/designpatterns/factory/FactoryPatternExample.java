package com.iris.designpatterns.factory;

public class FactoryPatternExample {
/*    Animal is the interface representing the product.
    Dog and Cat are concrete implementations of the Animal interface.
    AnimalFactory is the interface representing the factory.
    DogFactory and CatFactory are concrete implementations of the AnimalFactory interface, responsible for creating instances of Dog and Cat, respectively.
    In the main method, we use the factories to create instances of Dog and Cat without explicitly calling their constructors.*/

    public static void main(String[] args) {
        AnimalFactory dogfactory = new DogFactory();
        Animal dog = dogfactory.createAnimal();
        dog.makesound();

        //Making CatFactory
        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.makesound();


    }
}
