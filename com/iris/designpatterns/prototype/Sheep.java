package com.iris.designpatterns.prototype;

public class Sheep implements Animal {
    private String name;

    public Sheep(String name) {
        this.name = name;
        System.out.println("Sheep is created with name: " + name);
    }

    // Copy constructor
    private Sheep(Sheep source) {
        this.name = source.name;
        System.out.println("Sheep is created by copying: " + name);
    }


    @Override
    public Animal makecopy() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}