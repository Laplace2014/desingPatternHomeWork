package com.laplace.homework.factory.factory;

import com.laplace.homework.factory.entity.Car;

/**
 * 定义一个创建对象的接口，但是让实现这个接口的类来决定具体去实例化哪个类
 */
public interface CarFactory {
    Car getCar();
}
