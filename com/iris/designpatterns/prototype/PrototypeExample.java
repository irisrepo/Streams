package com.iris.designpatterns.prototype;

public class PrototypeExample {
    public static void main(String[] args) {
        Sheep originalsheep= new Sheep("Baba black sheep");
        Sheep clonesheep= (Sheep) originalsheep.makecopy();
        System.out.println("Original sheep"+originalsheep);
        System.out.println("Cloneshered "+clonesheep);
    }
}
