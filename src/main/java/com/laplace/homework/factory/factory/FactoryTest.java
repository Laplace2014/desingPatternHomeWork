package com.laplace.homework.factory.factory;

public class FactoryTest {
    public static void main(String[] args) {
        CarFactory benzFactory = new BenzFactory();
        benzFactory.getCar().printName();

        System.out.println("---------------------------------");

        CarFactory bmwFactory = new BMWFactory();
        bmwFactory.getCar().printName();
    }
}
