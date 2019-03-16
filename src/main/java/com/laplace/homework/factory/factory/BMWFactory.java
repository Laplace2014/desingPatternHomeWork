package com.laplace.homework.factory.factory;

import com.laplace.homework.factory.entity.BMW;
import com.laplace.homework.factory.entity.Car;

/**
 * BMW工厂只生产BMW汽车
 */
public class BMWFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new BMW();
    }
}
