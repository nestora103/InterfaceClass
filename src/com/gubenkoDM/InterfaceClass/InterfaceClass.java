package com.gubenkoDM.InterfaceClass;

/**
 * Created by Nestor on 15.03.2017.
 */
public class InterfaceClass {
    public static void main(String[] args) {
        Man man=new Man();
        man.run();
        man.sleep();

        RunAble ra=new Man();
        ra.run();
        ra.sleep();


        RunAble rw=new Women();
        rw.run();
        rw.sleep();

        RunAble.jump(); //запуск статического метода интерфейса

        TestInterface ti=new Man();
        ti.equals(ti);

        // не очевидные преобразования интерфейса
        // ra это ни что иное как ссылка на объект Man(реализует интерфейсы RunAble,TestInterface,TestInterface2) расположеная в переменной его родителя
        //поэтомы мы можем привести явно тип переменной ссылки из RunAble к TestInterface2
        //от типа переменной интерфейса будут доступны только те методы которые объявления в интерфейсе текущей переменной
        TestInterface2 ti2=(TestInterface2) ra;
        ti2.print();//после преобразования типа можем запустить метод нужного типа

        //выполнение обратного преобразования
        TestInterface2 ti3=new Man();
        ra=(RunAble)ti3;
        ((TestInterface2) ra).print(); //приведение одного интерфейса к другому у
        ra.run();



    }
}
