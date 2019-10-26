package com.thinkingInJava.chapter10;

abstract class Uninstantiable {
    abstract void f();
    abstract void g();
}
public class Instantiable extends Uninstantiable{
    @Override
    void f() {
        System.out.println("f()");
    }

    @Override
    void g() {
        System.out.println("g()");
    }

    public static void main(String[] args) {
        //Uninstantiable ui = new Instantiable();
    }
}
