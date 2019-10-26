package com.thinkingInJava.chapter10;

public interface InterfaceWithDefault {
    void firstMethod();
    void secondMethod();

    default void third(){
        System.out.println("thirdMethod");
    }
}

class Implementation implements InterfaceWithDefault{

    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        InterfaceWithDefault i = new Implementation();
        i.firstMethod();
        i.secondMethod();
        i.third();
    }
}
