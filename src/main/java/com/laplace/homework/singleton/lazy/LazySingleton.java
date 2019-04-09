package com.laplace.homework.singleton.lazy;

/**
 * 懒汉式单例设计模式
 *
 *
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;
    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(null == lazySingleton){
            synchronized (LazySingleton.class){
                if (null == lazySingleton){
                    lazySingleton = new LazySingleton();
                }
            }
        }

        return lazySingleton;
    }
}
