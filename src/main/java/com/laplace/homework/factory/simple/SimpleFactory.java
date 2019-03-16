package com.laplace.homework.factory.simple;

import com.laplace.homework.factory.entity.Car;

/**
 * 简单工厂
 * 满足开闭原则（对扩展开放，对修改关闭）
 * 缺点：工厂类的职责相对过重，不易于扩展过于复杂的产品结构
 */
public class SimpleFactory {
    public Car getCar(Class <? extends Car> clazz){
        try {
            if (null == clazz) return null;
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
