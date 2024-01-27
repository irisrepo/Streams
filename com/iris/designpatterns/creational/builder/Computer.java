package com.iris.designpatterns.creational.builder;

public class Computer {
    private String processor;
    private String memory;
    private String storage;
    private String graphicsCard;

    // Private constructor to enforce the use of the builder
    Computer(String processor, String memory, String storage, String graphicsCard) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }

    static class ComputerBuilder {
        private String processor;
        private String memory;
        private String storage;
        private String graphicsCard;

        //Mandatory parameters
        public ComputerBuilder(String processor, String memory) {
            this.processor = processor;
            this.memory = memory;
        }

        //Optional parameters
        public ComputerBuilder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(processor, memory, graphicsCard, storage);
        }

    }
}
