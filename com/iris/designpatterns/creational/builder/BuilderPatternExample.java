package com.iris.designpatterns.creational.builder;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("Intel i7", "16GB RAM").storage("512GB SSD").graphicsCard("NVIDIA GeForce RTX 3080").build();

    }

}
