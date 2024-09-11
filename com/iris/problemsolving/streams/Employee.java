package com.iris.problemsolving.streams;

import java.io.IOException;

public class Employee {

    public int getAge()throws IOException {
        return 2;
    }
}

class Fulltime extends Employee {

    public int getAge(){
        return 0;
    }
}