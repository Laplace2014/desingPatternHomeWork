package com.laplace.homework.factory.simple;

import com.laplace.homework.factory.entity.BMW;
import com.laplace.homework.factory.entity.Benz;
import com.laplace.homework.factory.entity.Car;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();

        Car benz = simpleFactory.getCar(Benz.class);
        benz.printName();

        System.out.println("-----------------------------");

        Car bmw = simpleFactory.getCar(BMW.class);
        bmw.printName();

    }
}
