package com.laplace.homework.factory.abst;

import com.laplace.homework.factory.entity.BMW;
import com.laplace.homework.factory.entity.Benz;
import com.laplace.homework.factory.entity.Car;

public class CarFactory extends AbstractCarFactory {
    @Override
    public Car getBMW() {
        return new BMW();
    }

    @Override
    public Car getBenz() {
        return new Benz();
    }
}
