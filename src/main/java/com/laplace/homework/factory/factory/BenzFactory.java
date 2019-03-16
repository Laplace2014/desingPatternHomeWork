package com.laplace.homework.factory.factory;

import com.laplace.homework.factory.entity.Benz;
import com.laplace.homework.factory.entity.Car;

/**
 * Benz工厂只生产Benz汽车
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
