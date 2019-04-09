package com.laplace.homework.singleton.hungry;

/**
 * 饿汉式单例模式
 *
 * 先静态，后动态
 * 先属性，后方法
 *
 * 缺点：浪费内存空间
 */
public class HungrySingleton {
    /*
    // 方式1
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }*/

    // 方式2
    private static final HungrySingleton hungrySingleton;
    static{
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }


}
