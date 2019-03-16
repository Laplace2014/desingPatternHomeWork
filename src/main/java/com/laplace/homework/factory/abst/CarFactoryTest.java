package com.laplace.homework.factory.abst;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        carFactory.getBMW().printName();
        System.out.println("--------------------------------");
        carFactory.getBenz().printName();
    }
}
