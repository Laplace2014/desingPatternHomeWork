package com.laplace.homework.factory.abst;

import com.laplace.homework.factory.entity.Car;
/**
 * 抽象工厂是用户的主入口
 */
public abstract class AbstractCarFactory {
    public abstract Car getBMW();
    public abstract Car getBenz();
}
