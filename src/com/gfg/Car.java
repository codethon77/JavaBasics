package com.gfg;

public class Car {
 private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        System.out.println("car is starting with engine "+engine.getName());
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
