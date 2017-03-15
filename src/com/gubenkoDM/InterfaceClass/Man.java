package com.gubenkoDM.InterfaceClass;

/**
 * Created by Nestor on 15.03.2017.
 */
public class Man implements RunAble,TestInterface,TestInterface2 {
    @Override
    public void run() {
        System.out.println("Я бегу!");
    }
}
